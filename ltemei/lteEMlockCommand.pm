#!/opt/nokia/oss/perl/bin/perl -w

package lteEMlockCommand;

push (@INC, '/opt/nokia/oss/bin/');

use warnings;
no warnings qw(redefine);

use emicom;
use DBI;
use Exporter;
use Tk;
use Tk::Widget;
use English;
require Exporter;
@ISA = qw (Exporter);

@EXPORT = qw(Run);
sub CreateDialog
{
        my $xe;
        my $title_string = shift;
        my $information_string = shift;
                my $window_status = shift;
                my $button;
                my $main = new MainWindow(-title => $title_string);
        $main->bind('<Configure>' => sub
               {
                       $xe = $main->XEvent;
                       $main->maxsize($xe->w,$xe->h);
                       $main->maxsize($xe->w,$xe->h);
               }
       );
       $main->bind('<Return>' => sub{exit 0;});
       my $Labelframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both');
       my $buttonframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both');
       my $textlabel = $Labelframe->Label(-text => $information_string,-takefocus => 0,-justify=>'left',-padx=>10,-relief=>'groove');
       if ($window_status=~/1/ig)
       {
       $button = $buttonframe->Button(-text => "OK", -takefocus => 1, -command => sub{$main->destroy });
       }
       else
       {
       $button = $buttonframe->Button(-text => "OK", -takefocus => 1, -command => sub{exit 0;});
       }
       $textlabel->pack(-pady => 20);
       $button->pack(-pady =>5);
       $button->focus;
        MainLoop;

}

sub CreateConfirmDialog
{
        my $xe;
        my $title_string = shift;
        my $isConfirmed = 1; 
        my $information_string = shift;
        my $content = shift;
                my $window_status = shift;
                my $button;
                my $main = new MainWindow(-title => $title_string);
        $main->bind('<Configure>' => sub
               {
                       $xe = $main->XEvent;
                       $main->maxsize($xe->w,$xe->h);
                       $main->maxsize($xe->w,$xe->h);
               }
       );
       $main->bind('<Return>' => sub{exit 0;});
       my $Labelframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both',-anchor=>'center');
       my $buttonframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both');
       my $textlabel = $Labelframe->Label(-text => $information_string,-takefocus => 0,-justify=>'left',-padx=>5,-font=>'18');
       my $contentlabel = $Labelframe->Label(-text => $content,-takefocus => 0,-justify=>'left',-padx=>5,-font=>'18');
       my $blanktext = $buttonframe->Label(-text => "",-takefocus => 0,-padx=>42);
       $button1 = $buttonframe->Button(-text => "OK", -takefocus => 1, -command => sub{$main->destroy; $isConfirmed = 0; });
       $button2 = $buttonframe->Button(-text => "Cancel", -takefocus => 1, -command => sub{$main->destroy; exit 0; });
       $textlabel->pack(-pady => 10,-side=>'top');
       $contentlabel->pack(-pady => 1,-side=>'bottom');
 #      $button1->pack(-pady =>5,-padx=>50,-side=>'left');
       $blanktext->pack(-side=>'left');
       $button1->pack(-pady =>5,-side=>'left');
       $button2->pack(-pady =>5,-side=>'left'); 
       $button1->focus;
#       $button2->pack(-pady =>5,-padx=>50,-side=>'right');
        MainLoop;
       return $isConfirmed;
}

sub createHintDialog{
    my($this,$logfile, $action) = @_;
    open(H, "tail -f -n 25 $logfile|") or die "Nope: $OS_ERROR";
#    $mw = MainWindow->new;
    $actiontext = $this->getActionText($action);
    $mw = new MainWindow(-title => $actiontext);
#    my $s1 = $mw->Scrollbar(-orient => 'horizontal');
    my $s2 = $mw->Scrollbar(-orient => 'vertical');
    $t = $mw->Text(-background => 'white',-width => 80, -height => 25,, -wrap => 'word',-yscrollcommand =>  sub{$s2->set(@_)});
#    $s1->pack(-side => 'left', -fill => 'y');
    $s2->pack(-side => 'right', -fill => 'y');
#    $s1->configure(-command => [$t => 'yview']);
    $s2->configure(-command => [$t => 'yview']);
#    $action=$this->changeActionValue($action);
    $t->pack(-fill=>'both',-expand => 'True');
    $t->insert('end',"Please wait...\n");
    $t->yview('end');
    $mw->fileevent(H, 'readable', [\&fill_text_widget,$this,$mw, $t, $action,$logfile]);
    MainLoop;


 }

sub fill_text_widget {
    
        my($this,$window,$widget, $action, $logfile) = @_;
        $ARG = <H>;
        chomp($ARG);
        if($ARG eq "LNCEL:kill the dialog"){
           &killTailprocess($logfile);
           $window->destroy;
           return ;
        }
        $widget->insert('end', $ARG."\n");
        $widget->yview('end');
        if(($ARG =~ /Operation execution/) or ($ARG =~ /Status received: Finished/)){
          close(H);
           $this->killTailprocess($logfile);
           my $output = $this->checker($action);
           $widget->insert('end', "\n-----------RESULT REPORT---------------\n\n$output\n----------Press any key to exit--------\n"); 
           $widget->yview('end');
           $widget->bind( '<Any-KeyPress>' => sub{$window->destroy;});
           return ;
        }
}

sub killTailprocess{
    my ($this,$logfile) = @_;
    my $tailpid = `ps -ef | grep tail | grep -v grep | grep $logfile | awk '{print \$2}'`;
    chomp($tailpid);
    if($tailpid ne ""){
        `kill -9 $tailpid`;
    }

}

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

sub Run{
   my ($this) = @_; 
   my $action = $this->{'action'};
   if( $action eq ""){
       CreateDialog("ERROR...", "Missing the action , please check the script.", 1);
       return;
   }

   my @gid_arr = @{$this->{'m_gid'}};
   my $iscellgid = $this->{'operation_on_cell'};
   my @cellinfo = $this->GetCELINFO($iscellgid, @gid_arr);
   #my $lncells = $this->{'lncell_expect'};
   my $lncells_prompt_str = $this->{'cells_prompt_str'};
   my $plancontent = $this->createPlan($action,@cellinfo);
   my $planname = $this->getUName($action);    
#print($planname.":\n".$plancontent);
#   print($plancontent);
   $this->writeXML($planname, $plancontent);

   # do not need to remove the plan before import
   # Instead, if import faile, retry 3 times
   # if still failed, pupop dialog and terminate.
   # 
   #$this->removePlan($planname);
   $actiontext = $this->getActionText($action);
   my $confirm = CreateConfirmDialog("Confirm...","Do you want to ".uc($actiontext)." the following LNCELs?",$lncells_prompt_str,1);

   if($confirm != 0 ){
      $this->postHanlder($planname);
      exit 0;
   }
#   print("-------------------------IMPORT PLAN--------------------------------\n");
   my $import = $this->importPlan($planname); 
#print("import=$import\n");

# the below 2 lines used to test duplicate name
#   my $import = $this->importPlan($planname); 
#print("import=$import\n");

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
#   print("-------------------------ACRIVATE PLAN -----------------------------\n");
   my $output = $this->executePlan($planname);
   my $logfile = "/tmp/$planname"."_activate.log";
   $this->createHintDialog($logfile,$action);
#   print("$output\n");
#   my $checkStatus = $this->checker($action);
#   print($checkStatus."\n");
#   CreateDialog("INFO...", "FEEDBACK:\n$checkStatus", 1);
   $this->postHanlder($planname);
}

sub printArray{
   my($this,@arr) = @_;
   my $index=0;
   foreach $gid(@arr){
      print("[$index]:$gid\n");
      $index += 1;
   }

}

sub postHanlder{
   my($this, $planname) = @_;
   $this->removePlan($planname);
   $this->removeFiles($planname);
   $this->killTailprocess($$);
  
}

#****************************************************
# Sub module will return the LNCEL's local moid
# for the passed parent LNBTS gid array
#****************************************************
sub GetCELINFO
{
  my($this,$isCELLGID, @m_gids) = @_;
  my $gids = join(",", @m_gids);
#print("dbGId:$gids\n");
#  print("isCell:$this->{'operation_on_cell'}\n");
  my $sql = "SELECT CO_OCV_SYS_VERSION,CO_DN,to_char(CO_GID),CO_STATE  FROM N3T_NWI3_MO WHERE CO_OC_ID = 3130 AND CO_STATE != 9 AND ( (CO_PARENT_GID IN ($gids)) OR (CO_GID IN ($gids)) )";
  my @data = $this->sql($sql);

  my @moidLst;
  my @cellgids;
  my $lncells;

  my $lncells_to_hint;
  #my $MAX_HINT_CNT = 2;
#print "MAX_HINT_CNT=$MAX_HINT_CNT, for debug only, please change to bigger value.\n";
  my $MAX_HINT_CNT = 10;
  my $cells_cnt=0;
  my $action = $this->{'action'};
  foreach $child (@data)
  {

          my @child_moid = @$child;
          my $CELLCLASS = $this->{'cellClass'};
          my $COVERSION = $child_moid[0];
          my $COMOID = $child_moid[1];
          my $COGID = $child_moid[2];
          my $COSTATE = $child_moid[3];
          my $CELLID = $COMOID;
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
                  if(    ($action =~ /graceful_lock/)
                      && (   ($COVERSION eq "LN1.0")
                          || ($COVERSION eq "LNT1.0")
                          || ($COVERSION eq "")
                         )
                    ){
                     CreateDialog("ERROR...", "$COMOID can't support graceful lock. Because its version is ($COVERSION)", 1);
                     exit(-1);
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

  return @moidLst;
}

sub checker{
    my($this, $action)=@_;
    my @gidsArr = @{$this->{'cell_gids'}};
    my $gids = join(",", @gidsArr);
    $action = $this->changeActionValue($action);
    my $sql = "SELECT CO_DN,CO_ADMIN_STATE,CO_STATE FROM N3T_NWI3_MO WHERE CO_GID IN ($gids)";
    my @data = $this->sql($sql);

    my @moidLst;
    my $output;
    foreach $child (@data)
    {

          my @child_moid = @$child;
          my $COMOID = $child_moid[0];
          my $ADMINSTATE = $child_moid[1];
          my $COSTATE = $child_moid[2];
          my $CELLID = $COMOID;
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
          if($ADMINSTATE != $action){
             ## for graceful shutdown, if return locked, trate as successful.
             if ( $action == 2 && $ADMINSTATE == 3)
             {
                 $output.="$COMOID:  SUCCESSFUL\n";
             }
             else
             {
                 $output.="$COMOID:  FAILED \n";
             }
          }
          else{
             $output.="$COMOID:  SUCCESSFUL\n";
          }
    }
    return $output;
}


sub sql{
  my($this, $sqlStr) = @_;
  my $dbconnect = "dbi:Oracle:";
  my $user      = "omc";
  my $password  = emicom::getDBPassword() ;

  if( $password eq "" )
  {
    CreateDialog("ERROR...", "Get Database Password failed. please check lab Environment.", 1);
    exit(-1);
  }

  my $dbh = DBI->connect($dbconnect,$user,$password);

  unless( $dbh )
  {
    CreateDialog("ERROR...", "Connect to Database failed(1). please check lab Environment.", 1);
    exit(-1);
  }

  my $sth = $dbh->prepare($sqlStr);

  unless( $sth )
  {
    CreateDialog("ERROR...", "Connect to Database failed(2). please check lab Environment.", 1);
    exit(-1);
  }

  unless($sth->execute)
  {
    CreateDialog("ERROR...", "Connect to Database failed(3). please check lab Environment.", 1);
    exit(-1);
  }
  my @data;
  my $index=0;
  while(my @child  = $sth->fetchrow_array){
   #  push(@data, [@child]);
      $data[$index]=[@child];
#     $this->printArray($data[$index]);
     $index += 1;
  }
  $sth->finish();
  $dbh->disconnect();
  return @data;

}

#****************************************************
# Sub module will create the xml according to array
# array shall be like
# ("LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-32,333333000001481989"
#  ,"LNCEL,LN1.0,PLMN-PLMN/MRBTS-703/LNBTS-703/LNCEL-31,333333000001481988");
#****************************************************
sub createPlan{
  my($this, $action, @cellInfos) = @_;

  $action = $this->changeActionValue($action);
  my $mydate = `date -u +%Y-%m-%dT%I:%M:%S`;
  chomp($mydate);
  my $xmlStr="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
  $xmlStr .= "<!DOCTYPE raml SYSTEM 'raml20.dtd'>\n";
  $xmlStr .= "<raml version=\"2.0\" xmlns=\"raml20.xsd\">\n";  
  $xmlStr .= "\t<cmData type=\"plan\" scope=\"all\" name=\"LNCEL_LOCK_UNLOCK\" id=\"PlanConfiguration( 3407 )\">\n";
  $xmlStr .= "\t\t<header>\n";
  $xmlStr .= "\t\t\t<log dateTime=\"$mydate\" action=\"created\" appInfo=\"PlanExporter\"/>\n";
  $xmlStr .= "\t\t</header>\n";
  foreach $cellinfo (@cellInfos){
     my @cellvalues = split (/,/, $cellinfo);
     $xmlStr .= "\t\t<managedObject class=\"$cellvalues[0]\" version=\"$cellvalues[1]\" distName=\"$cellvalues[2]\" id=\"$cellvalues[3]\" operation=\"update\">\n";
     $xmlStr .= "\t\t\t<p name=\"administrativeState\">$action</p>\n";
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

sub removeFiles{
    my($this,$planname) = @_;
    my $dir = $this->{'planDir'};
    my $xmlfile = $dir."/".$planname.".xml";
    if(-f $xmlfile){
       `rm -f $xmlfile`;
    }

}

#****************************************************
# change the "locked/unlocked" to the actual value
# locked --- 3; unlocked ---- 1;
# default is 3;
#****************************************************
sub changeActionValue{
   my($this,$action) = @_;
   my $result = "3";
   if($action =~ /unlock/) {
      $result = "1";
   }
   if($action =~ /graceful_lock/){
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

sub removePlan{
   my($this,$planname) = @_;
   $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op  planDeletion -planName $planname","remove",1);
}

sub importPlan{
   my($this,$planname) = @_;
#   print("import:/opt/nokia/oss/bin/racclimx.sh -op Import_Export -fileFormat RAML2 -importExportOperation planImport -fileName $planname.xml -planName $planname -v\n");
   my $logfile = "/tmp/$planname"."_import.log";
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
   my $logfile = "/tmp/$planname"."_activate.log";
   my $rlt = $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op Provision -planName $planname -lteContentInUse true -provisioningOperation activate -MRBTSUploadAfterActivate false -v", $logfile,0);
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
sub runCMD{
   my($this,$cmd, $logfile, $isBackGround) = @_;
   if(-f $logfile){
      `rm -f $logfile`;
   }
   my $output = "";
   if($isBackGround eq "0"){
      `$cmd > $logfile &`;
   }
   else{
      $output = `$cmd | tee $logfile`;
   }
   chomp($output);
   return $output;

}
