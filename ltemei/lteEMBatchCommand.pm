#!/opt/nokia/oss/perl/bin/perl -w

#** @file lteEMBatchCommand.pm
# This file defines the common used functions and class lteEMBatchCommand for executing lock/ 
# unlock/shutdown/reset of eNBs, and it's imported by lteBatchExecuter.pl.
# <pre>
# Change History:
#       2012/10/31 Chris (OSS54CD3): Add file and method comments 
# </pre>
# @author BobYan
# @version oss5.3cd1
#*
package lteEMBatchCommand;

push (@INC, '/opt/nokia/oss/bin/');

use warnings;
no warnings qw(redefine);

use emicom;
use DBI;
use Exporter;
use Tk;
use Tk::Widget;
use English;
use lteEMGUI;
use lteEMDBAccess;
require Exporter;
@ISA = qw (Exporter);

sub CreateDialog
{
        my $xe;
        my $title_string = shift;
        my $information_string = shift;
        my $window_status = shift;
        my $gui = lteEMGUI->new();
        $gui->showDialog($title_string, $information_string, $window_status);
}

my $starttime=time();
sub createHintDialog{
    my($this,$logfile, $action) = @_;
    my $gui = lteEMGUI->new();
    $gui->showSynLogDialog($logfile,$action);
 }

#** @method new(class, gids)
# Initialize the class lteEMBatchCommand.
# @param class
#       the reference to the class
# @param gids
#       the eNB's global ids
# @retval this
#       the reference to the class
#*
sub new
{
    my $class = shift;
    my $this = {};
    my $gids = shift;
    $this->{'m_gids'} = $gids;
    bless($this, $class);

    my @gid_arr = split(/ /, $this->{'m_gids'});
    $this->{'m_gid'} = \@gid_arr;
    $this->Initialize();
    return $this;
}

sub Initialize
{
    my ($this) = @_;

    $this->{'planDir'} = "/var/opt/nokia/oss/global/racops/import";
    $this->{'cellClass'} = "LNCEL";
    $this->{'action'} = "locked"; 
}


sub setAction{
   my($this,$actionname) = @_;
   $this->{"action"} = $actionname;
  
}

#** @method getActionText(this, action)
# This function separates the graceful lock and immediate lock.
# @param this
#       the reference to the class
# @param action
#       the action name
# @retval text
#       the parsed action text
#*
sub getActionText{
   my($this,$action) = @_;
   $text = $action;
   if($action =~ /graceful_lock/){
      $text = "shutdown";
   }
   if($action =~ /immediate_lock/){
      $text = "lock";
   }
   if($action =~ /unlock/){
      $text = "unlock";
   }
   if($action =~ /reset/){
      $text = "reset";
   }
   return $text;
}

#** @method Run(this)
# This function creates the execution plan according to the action and invokes CM  
# interface to import and execute it to do the lock etc operation.
# @param this
#       the reference to the class
#*
sub Run{
   my ($this) = @_; 
   my $action = $this->{'action'};
   if( $action eq ""){
       CreateDialog("ERROR...", "Missing the action , please check the script.", 1);
       return;
   }
   my @gid_arr = @{$this->{'m_gid'}};
   my $iscellgid = $this->{'operation_on_cell'};
   my @objectinfo;
   my $plancontent;
   if($this->{'action'} =~ /lock/ or $this->{'action'} =~ /shutdown/){
      @objectinfo = $this->GetCELINFO(@gid_arr);
      $plancontent = $this->createLockPlan($action,@objectinfo);
   }
   if($this->{'action'} =~ /lnbts_reset/){
      @objectinfo = $this->GetLNBTSINFO(@gid_arr);
      $count = @objectinfo;
      print("lnbts count: $count\n");
      $plancontent = $this->createResetLNBTSPlan($action,@objectinfo);
   }
   if($this->{'action'} =~ /lncel_reset/){
      @objectinfo = $this->GetCELINFO(@gid_arr);
      $plancontent = $this->createResetLNCELPlan($action,@objectinfo);
   }
   my $planname = $this->getUName($action);
   $this->writeXML($planname, $plancontent);

   my $import = $this->importPlan($planname); 


   my $rep_times=0;
   while($rep_times<3)
   {
###################################################################
=head
[omc@goocer perllib]$ import=Status received: Started
Feedback received:  Type: Information
Plan Import started
Fileformat: XML
Feedback received:  Type: Error
Operation planImport failed
com.nokia.oss.configurator.rac.common.exceptions.DuplicatePlanException: name: TopLevelUI_LOCK_temp_plan_20101104081501
...
=cut
###################################################################        
       if ( $import =~ m/DuplicatePlanException/g )
       {
print "DuplicatePlan exists, sleep one second and import the plan again.\n";              
           sleep(1);
           
           #retry with new planname
           my $old_name = $planname;
           $planname = $this->getUName($action);
           $this->renameExistPlanfile($old_name, $planname);
#print "planname=$planname\n";
           $import = $this->importPlan($planname);
#print("import=$import\n");
           $rep_times ++;

           if ( $rep_times >= 3 )
           {
               CreateDialog("ERROR...", "Can't import your plan into CM(duplicated Plan)!", 1);
               $this->removeFiles($planname);
               exit(-1);
           }

           next;
       }

       # if it's other error, terminate.
       if(!($import =~ m/Status received: Finished/)){
          CreateDialog("ERROR...", "Can't import your plan into CM! please check the lab status.", 1);
          $this->postHanlder($planname);
          exit(-1);
       } 

       # ok, import succ.
       last;
   }
   my $output = $this->executePlan($planname);
    if($action=~/(unlock)/ or $action=~/(lock)/ or $action=~/(shutdown)/){
       $this->checker($1);
    }
    else{
      $this->checkBTS();
    }
  # $this->postHanlder($planname);
}

sub showWindow{
   my($this) = @_;
   $logfile = $this->{'logfile'};
   $actionname = $this->{'action'}; 
   $this->createHintDialog($logfile,$actionname);
}

sub setLogFile{
    my($this, $logfile) = @_;
    $this->{'logfile'} = $logfile;
}

sub printArray{
   my($this,@arr) = @_;
   my $index=0;
   foreach $gid(@arr){
      print("[$index]:$gid\n");
      $index += 1;
   }

}

#** @method postHanlder(this, planname)
# Remove the plan from CM and our storage path. 
# @param this
#       the reference to the class
# @param planname
#       the name of the plan
# @retval N/A
#*
sub postHanlder{
   my($this, $planname) = @_;
   $this->removePlan($planname);
   $this->removeFiles($planname);
 #  $this->killTailprocess($$);
  
}

#** @method GetCELINFO(this, m_gids)
# This function will get the LNCEL's version, dn, global id and administrative 
# state via LNCEL or it's parent's gid array.
# @param this
#       the reference to the class
# @param m_gids
#       the global id of the eNB
# @retval moidLst
#       an array that each element stores "$CELLCLASS,$COVERSION,$COMOID,$COGID"
#* 
sub GetCELINFO
{
  my($this, @m_gids) = @_;
  my $gids = join(",", @m_gids);
  #`echo  "gids".$gids >> /tmp/display.log`;
#print("dbGId:$gids\n");
#  print("isCell:$this->{'operation_on_cell'}\n");
  my $sql = "SELECT CO_OCV_SYS_VERSION,CO_DN,to_char(CO_GID),CO_STATE  FROM N3T_NWI3_MO WHERE CO_OC_ID = 3130 AND CO_STATE != 9 AND ( (CO_PARENT_GID IN ($gids)) OR (CO_GID IN ($gids)) )";
  my $sqlAccess = lteEMDBAccess->new();
  my @data = $sqlAccess->sql($sql);

  my @moidLst;
  my @cellgids;
  my $lncells;

  my $lncells_to_hint;
  #my $MAX_HINT_CNT = 2;
#print "MAX_HINT_CNT=$MAX_HINT_CNT, for debug only, please change to bigger value.\n";
  my $MAX_HINT_CNT = 10;
  my $cells_cnt=0;
  my $objectdns;
  foreach $child (@data)
  {

          my @child_moid = @$child;
          my $CELLCLASS = $this->{'cellClass'};
          my $COVERSION = $child_moid[0];
          my $COMOID = $child_moid[1];
          my $COGID = $child_moid[2];
          my $COSTATE = $child_moid[3];
          my $CELLID = $COMOID;
          $objectsdns->{$CELLID} = "FAILED";
          $CELLID =~ /LNCEL\-(\d+)/;
          $CELLID = $1;
          push(@cellgids,$COGID);
          $lncells .= "$COMOID\n";
          if ($cells_cnt < $MAX_HINT_CNT)
          {
              $lncells_to_hint.= "$COMOID\n";
          }
          $cells_cnt ++;
          if($COSTATE == 3){
             #if($COMOID =~ /LNBTS-703/){
               next;
             #}
          }
          if ($CELLID =~ /[\d]+/)
          {
                  my $tmp_moid = $child_moid[1];
                  if(!(defined $COVERSION)){
                    # CreateDialog("ERROR...", "Can't get the version of $COMOID", 1);
                    # exit(-1);
                    $COVERSION = "";
                  }
                  push(@moidLst, "$CELLCLASS,$COVERSION,$COMOID,$COGID");
          }
  }
  $this->{'cell_gids'} = \@cellgids;
  $this->{'lncell_expect'} = $lncells;

  if ($cells_cnt > $MAX_HINT_CNT )
  {
    $lncells_to_hint.="...\n(Total $cells_cnt LNCELs)\n";
  }
  $this->{'cells_prompt_str'} = $lncells_to_hint;
  $this->{'object_dns'} = $objectsdns;
  return @moidLst;
}

#** @method GetLNBTSINFO(this, m_gids)
# This function will get the LNBTS's version, dn, global id and administrative.
# @param this
#       the reference to the class
# @param m_gids
#       the global id of the eNB
# @retval moidLst
#       an array that each element stores $LNBTSCLASS,$COVERSION,$COMOID,$CO_GID
#* 
sub GetLNBTSINFO
{
  my($this, @m_gids) = @_;
  my $gids = join(",", @m_gids);
  my $sql = "SELECT CO_OCV_SYS_VERSION,CO_DN,to_char(CO_GID),CO_STATE FROM N3T_NWI3_MO WHERE CO_OC_ID = 3129 AND CO_STATE != 9 AND CO_GID in ($gids) ";
  my $sqlAccess = lteEMDBAccess->new();
  my @data = $sqlAccess->sql($sql);
  my @moidLst;
  my $objectsDN;
  foreach $child (@data)
  {

          my @child_moid = @$child;
          my $LNBTSCLASS = 'LNBTS';
          my $COVERSION = $child_moid[0];
          my $COMOID = $child_moid[1];
          my $CO_GID = $child_moid[2];
          my $COSTATE = $child_moid[3];
          $objectsDN->{$COMOID} = "Failed";
          if($COSTATE == 3){
               next;
          }
        push(@moidLst, "$LNBTSCLASS,$COVERSION,$COMOID,$CO_GID");
        print( "$LNBTSCLASS,$COVERSION,$COMOID\n")
  }
  $this->{'object_dns'} = $objectsDN;
  return @moidLst;
}

#** @method checker
# This function is used to check the LNCEL state in database and the execution 
# log after lock/unlock/shutdown operation, and store the execution result to logfile.
# @param this
#       the reference to the class
# @param action
#       the action name
# @retval output
#       the string that store the execution result
#*
sub checker{
    my($this, $action)=@_;
    my @gidsArr = @{$this->{'cell_gids'}};
    my $gids = join(",", @gidsArr);
    #$action = $this->changeActionValue($action);
    my $sql = "SELECT CO_DN,CO_ADMIN_STATE,CO_STATE FROM N3T_NWI3_MO WHERE CO_GID IN ($gids)";
    my $sqlAccess = lteEMDBAccess->new();
    my @data = $sqlAccess->sql($sql);

    my @moidLst;
    my $output;
    my $logfile = $this->{'logfile'};
    my $rlt = `cat $logfile`;
    chomp($rlt);
    $output = "-----------RESULT REPORT---------------\n";
    foreach $child (@data)
    {

          my @child_moid = @$child;
          my $COMOID = $child_moid[0];
          my $ADMINSTATE = $child_moid[1];
          my $COSTATE = $child_moid[2];
          my $CELLID = $COMOID;
          $CELLID =~ /(PLMN\-PLMN\/MRBTS\-\d+)/;
          my $BTS_DN = $1;
          #$output.="\n CELL DN is $CELLID bts dn is $BTS_DN\n";
          $CELLID =~ /LNCEL\-(\d+)/;
          $CELLID = $1;
          if($COSTATE == 3){
             $output.="$COMOID:  FAILED [NON-OPERATIONAL]\n";
             next;
          }
          if (!($CELLID =~ /[\d]+/))
          {
             $output.="$COMOID:  FAILED [BAD DN]\n";
             next;
          }
         
          if  ($rlt =~ m/Feedback received: DN: $BTS_DN Type: OK\nPLANTYPE_LTEBTS plan download successfully complete/s)
          {
              $output.="$COMOID:\n\U$action OPERATION PROVISIONING IS SUCCESSFUL\n";
          }
          else
          {
              $output.="$COMOID:\n\U$action OPERATION PROVISIONING IS FAILED\n";
          }
    }
    my $timestamp2=`date +%Y-%m-%d/%H:%M:%S`;
    chomp($timestamp2);
    my $endtime=time();
    my $usedsecs= ($endtime-$starttime)%60;
    my $usedmins=int(($endtime-$starttime)/60);
    $output .= "------ALL Finished At $timestamp2,$usedmins minutes $usedsecs seconds used ------";
    $this->printToLog($output);
    return $output;
}

#** @method checkBTS
# This function is used to check the LNBTS state in database and the execution 
# log after the reset operation, and store the execution result to logfile.
# @param this
#       the reference to the class
# @retval output
#       the string that store the execution result
#*
sub checkBTS{
    my($this) = @_;
     my $logfile = $this->{'logfile'};
     my $rlt = `cat $logfile`;
     my $output = "-----------RESULT REPORT---------------\n";
     my $dns = $this->{'object_dns'};
     chomp($rlt);
 #die "for debug, activate($logfile) rlt = \n$rlt\n";
     while ($rlt =~ m/Feedback received: DN: (PLMN-PLMN\/MRBTS-(\d+)) Type: OK\nPLANTYPE_LTEBTS plan activation successfully complete/sg)
     {
         my $dn = $1."/LNBTS-".$2;
         #$output .= "$dn Successful.\n";
         #$dns->{$dn} = "Successful";
         $this->setStateOfObject($dns, $dn, "Successful");
     }
     foreach $dn (keys%$dns){
        $output .= "$dn ".$dns->{$dn}. "\n";
    }
    my $timestamp2=`date +%Y-%m-%d/%H:%M:%S`;
    chomp($timestamp2);
    my $endtime=time();
    my $usedsecs= ($endtime-$starttime)%60;
    my $usedmins=int(($endtime-$starttime)/60);
    $output .= "------ALL Finished At $timestamp2,$usedmins minutes $usedsecs seconds used ------";
    $this->printToLog($output);
    return $output;

}

sub setStateOfObject{
    my($this, $dns, $parentDn, $value) = @_;
    foreach $dn (keys%$dns){
       if($dn =~ /$parentDn/){
          $dns->{$dn} = $value;
       }
    }
}

sub printToLog{
   my($this, $msg) = @_;
   $logfile = $this->{'logfile'};
   `echo "$msg" >> $logfile`;
   
}

#** @method createLockPlan(this, action, cellInfos)
# This function creates the lock plan xml.
# @param this
#       the reference to the class
# @param action
#       the action name
# @param cellInfos
#       the array stores LNCEL information like below: 
#       <pre>
#       ("LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-32,333333000001481989",
#       "LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-31,333333000001481988");
#       </pre>
# @retval xmlStr
#       the string that store the content of plan xml
#*
sub createLockPlan{
  my($this, $action, @cellInfos) = @_;
  $action = $this->changeActionValue($action);
  my $node_def = "\t\t\t<p name=\"administrativeState\">$action</p>\n";
  $xmlStr .= $this->createPlan($node_def, @cellInfos);
  return $xmlStr;
}

#** @method createResetLNCELPlan(this, action, cellInfos)
# This function creates the LNCEL reset plan xml.
# @param this
#       the reference to the class
# @param action
#       the action name
# @param cellInfos
#       the array stores LNCEL information like below: 
#       <pre>
#       ("LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-32,333333000001481989",
#       "LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-31,333333000001481988");
#       </pre>
# @retval xmlStr
#       the string that store the content of plan xml
#*
sub createResetLNCELPlan{
  my($this, $action, @lncelInfos) = @_;
  my $mydate = `date -u +"%Y%m%d %I%M%S"`;
  chomp($mydate);
  my $node_def = "\t\t\t<p name=\"cellResetRequest\">$mydate</p>\n";
  $xmlStr .= $this->createPlan($node_def, @lncelInfos);
  return $xmlStr;
}

#** @method createResetLNBTSPlan(this, action, cellInfos)
# This function creates the LNBTS reset plan xml.
# @param this
#       the reference to the class
# @param action
#       the action name
# @param cellInfos
#       the array stores LNCEL information like below: 
#       <pre>
#       ("LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-32,333333000001481989",
#       "LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-31,333333000001481988");
#       </pre>
# @retval xmlStr
#       the string that store the content of plan xml
#*
sub createResetLNBTSPlan{
  my($this, $action, @lnbtsInfos) = @_;
  my $mydate = `date -u +"%Y%m%d %I%M%S"`;
  chomp($mydate);
  my $node_def = "\t\t\t<p name=\"btsResetRequest\">$mydate</p>\n";
  $xmlStr .= $this->createPlan($node_def, @lnbtsInfos);
  return $xmlStr;
}

#** @method createPlan(this, node_def, objects)
# Create the action plan xml.
# @param this
#       the reference to the class
# @param node_def
#       the xml node that stores action request and time 
# @param objects
#       the array that stores the eNB version etc info
# @retval xmlStr
#       the string that stores the plan content
#*
sub createPlan{
  my($this, $node_def, @objects)=@_;
  my $logdate = `date -u +"%Y-%m-%dT%I:%M:%S"`;
  chomp($logdate);
  my $xmlStr="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
  $xmlStr .= "<!DOCTYPE raml SYSTEM 'raml20.dtd'>\n";
  $xmlStr .= "<raml version=\"2.0\" xmlns=\"raml20.xsd\">\n";
  $xmlStr .= "\t<cmData type=\"plan\" scope=\"all\" name=\"LTE_TEMP_Action\" id=\"PlanConfiguration( 3407 )\">\n";
  $xmlStr .= "\t\t<header>\n";
  $xmlStr .= "\t\t\t<log dateTime=\"$logdate\" action=\"created\" appInfo=\"PlanExporter\"/>\n";
  $xmlStr .= "\t\t</header>\n";
  foreach $object (@objects){
     my @objectvalues = split (/,/, $object);
     $xmlStr .= "\t\t<managedObject class=\"$objectvalues[0]\" version=\"$objectvalues[1]\" distName=\"$objectvalues[2]\" id=\"$objectvalues[3]\" operation=\"update\" >\n";
     $xmlStr .= $node_def;
     $xmlStr .= "\t\t</managedObject>\n";
  }
  $xmlStr .= "\t</cmData>\n";
  $xmlStr .= "</raml>\n";
  return $xmlStr;

}

sub writeXML{
   my($this,$planname,$xmlcontent) = @_;
   my $dir = $this->{'planDir'};
   if(!(-d $dir)) {
      system("mkdir $dir");
   }
   my $xmlfile = $dir."/".$planname.".xml";
   open(OUTFILE, ">$xmlfile");
   print OUTFILE ($xmlcontent);
   close OUTFILE;
}

#** @method renameExistPlanfile(this, oldname, newname)
# This function replace the old plan name with new name when the the old plan 
# was already imported and cannot be imported again.
# @param this
#       the reference to the class
# @param oldname
#       the old plan name
# @param newname
#       the new plan name
# @retval N/A
#*
sub renameExistPlanfile
{
    my ($this, $oldname, $newname) = @_;
    my $old_fullname = "$this->{'planDir'}".'/'.$oldname.'.xml';
    my $new_fullname = "$this->{'planDir'}".'/'.$newname.'.xml';
    if ( -f $old_fullname )
    {
        `mv $old_fullname $new_fullname`;
    }
}

#** @method removeFiles(this, planname)
# Remove the generated plan file.
# @param this
#       the reference to the class
# @param planname
#       the name of the plan
# @retval N/A
#*
sub removeFiles{
    my($this,$planname) = @_;
    my $dir = $this->{'planDir'};
    my $xmlfile = $dir."/".$planname.".xml";
    if(-f $xmlfile){
       `rm -f $xmlfile`;
    }

}

#** @method changeActionValue(this, action)
# This function changes the action string to number value:<br/>
# locked -- 3; unlocked -- 1; default is 3.
# @param this
#       the reference to the class
# @param action
#       the string stores action name
# @retval result
#       the string stores action number value
#*
sub changeActionValue{
   my($this,$action) = @_;
   my $result = "3";
   if($action =~ /unlock/) {
      $result = "1";
   }

  if($action =~ /shutdown/) {
      $result = "2";
   }
 return $result;
}

############################################################3
#
#  According to Kaarre, Maija (NSN - FI/Tampere)'s suggestion
#  change the plan name format to:
#
#      TopLevelUI_LockUnlock_temp_plan_<timestamp>
#
############################################################3
sub getUName{
   my($this,$action) = @_;
   my $timestamp=`date +%Y%m%d%H%M%S`;
   my $name = "TopLevelUI_".uc($action)."_temp_plan_".$timestamp;
   chomp($name); #get rid of the last '\n' char
   return $name; 
}

#** @method removePlan(this, planname)
# Remove the plan from CM.
# @param this
#       the reference to the class
# @param planname
#       the name of the plan
# @retval N/A
#*
sub removePlan{
   my($this,$planname) = @_;
   $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op  planDeletion -planName $planname","",1);
}

sub importPlan{
   my($this,$planname) = @_;
#   print("import:/opt/nokia/oss/bin/racclimx.sh -op Import_Export -fileFormat RAML2 -importExportOperation planImport -fileName $planname.xml -planName $planname -v\n");
   my $logfile = $this->{'logfile'};
#print "lg_file=$logfile\n";
   my $rlt = $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op Import_Export -fileFormat RAML2 -importExportOperation planImport -fileName $planname.xml -planName $planname -v", $logfile,1);
#   if($rlt =~ m/Status received: Finished/){
#     return "SUCCESSFUL";
#   }
#   else {
#     return "FAILED";
#   }
   return $rlt;
}

sub executePlan{
   my($this,$planname) = @_;
#      print("/opt/nokia/oss/bin/racclimx.sh -op Provision -planName $planname -lteContentInUse true -provisioningOperation activate -MRBTSUploadAfterActivate true -v\n");
   my $logfile = $this->{'logfile'};
   my $rlt = $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op Provision -planName $planname -lteContentInUse true -provisioningOperation activate  -v", $logfile,1);
   #chomp($rlt);
#   if($rlt =~ m/Status received: Finished/){
#     return "SUCCESSFUL";
#   }
#   else {
#     return "FAILED";
#   }
   return $rlt;
}

sub parseOutput{
   my($output) = @_;
}

#** @method runCMD
# This function execute given command and write the log.
# @param this
#       the reference to the class
# @param cmd
#       the command to execute
# @param logfile
#       the log file path 
# @param isBackGround
#       the string that indicates whether run the command in background
# @retval output
#       the execution returned value
#*
sub runCMD{
   my($this,$cmd, $logfile, $isBackGround) = @_;
 #  if(-f $logfile){
 #     `rm -f $logfile`;
 #  }
   my $output = "";
   if($isBackGround eq "0"){
      `$cmd > $logfile &`;
   }
   else{
      if($logfile ne ""){
        $output = `$cmd |tee -a $logfile`;
      }
      else{
         $output = `$cmd `;
      }
   }
   chomp($output);
   return $output;

}
1;
