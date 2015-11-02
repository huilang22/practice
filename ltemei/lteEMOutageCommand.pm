#!/opt/nokia/oss/perl/bin/perl -w

package lteEMOutageCommand;

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

@EXPORT = qw(RunOutage);

sub createHintDialog{
    my($this,$logfile, $action) = @_;
    open(H, "tail -f -n 25 $logfile|") or die "Nope: $OS_ERROR";
    $mw = MainWindow->new;
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
###           my $output = $this->checker($action);
###           $widget->insert('end', "\n-----------RESULT REPORT---------------\n\n$output\n----------Press any key to exit--------\n");
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
    $this->{'cell_gids'} = $gids;
    emicom::getparentgid($this->{'cell_gids'}, \$this->{'lnbts_gids'});
    bless($this, $class);

#    my @gid_arr = split(/ /, $this->{'m_gids'});
#    $this->{'m_gid'} = \@gid_arr;
    $this->Initialize();
    return $this;
}

sub Initialize
{
    my ($this) = @_;

    $this->{'planDir'} = "/var/opt/nokia/oss/global/racops/import";
    $this->{'lnbtsClass'} = "LNBTS";
    $this->{'action'} = "CELLOUTAGERESET";
#    $this->{'current_time'} = `date -u +%Y%m%d%I%M%S`;
#    chomp $this->{'current_time'};
#        print "this->{'cell_gids'} = $this->{'cell_gids'}\n";
#        print "this->{'lnbts_gids'} = $this->{'lnbts_gids'}\n";
#        print "this->{'action'} = $this->{'action'}\n";
##       print "this->{'current_time'} = $this->{'current_time'}\n";
#        print "this->{'planDir'} = $this->{'planDir'}\n";
#        print "this->{'lnbtsClass'} = $this->{'lnbtsClass'}\n";
}

sub setAlarmNumber
{
    my($this,$alarmnum) = @_;
    $this->{'alarm_num'} = $alarmnum;
#        print "this->{'alarm_num'} = $this->{'alarm_num'}\n";
}

sub RunOutage
{
#        print "Start Run\n";
    my ($this) = @_;
    my $action = $this->{'action'};
    if( $action eq ""){
       CreateDialog("ERROR...", "Missing the action , please check the script.", 1);
       return;
    }
    my $lnbtsgid = $this->{'lnbts_gids'};
#        print "Run GetCELINFO lnbtsgid = $lnbtsgid\n";
    my @lnbtsinfo = $this->GetCELINFO($lnbtsgid);
#        print "@lnbtsinfo\n";
    my $plancontent = $this->createPlan($action,@lnbtsinfo);
#        print "$plancontent\n";
    my $planname = $this->getUName($action);
#        print "$planname\n";
    $this->writeXML($planname, $plancontent);
############################################################
# need to judge whether should perform outage reset
############################################################
#        print("-------------------------IMPORT PLAN--------------------------------\n");
    my $import = $this->importPlan($planname);
#        print "import....... = $import\n";
############################################################
# need to judge whether import the same Plan
############################################################
#        print("-------------------------ACRIVATE PLAN -----------------------------\n");
    my $output = $this->executePlan($planname);
    my $logfile = "/tmp/$planname"."_activate.log";
###    $this->createHintDialog($logfile,$action);
###    $this->postHanlder($planname);
}

sub postHanlder{
   my($this, $planname) = @_;
   $this->removePlan($planname);
   $this->removeFiles($planname);
   $this->killTailprocess($$);

}


#****************************************************
# Sub module will return the LNBTS's local moid
# for the passed parent LNBTS gid
#****************************************************
sub GetCELINFO
{
  my($this, $gids) = @_;
  my $sql = "SELECT CO_OCV_SYS_VERSION,CO_DN,CO_STATE FROM N3T_NWI3_MO WHERE CO_OC_ID = 3129 AND CO_STATE != 9 AND CO_GID=($gids) ";
  my @data = $this->sql($sql);
  my @moidLst;

#  my $lncells_to_hint;
  #my $MAX_HINT_CNT = 2;
#print "MAX_HINT_CNT=$MAX_HINT_CNT, for debug only, please change to bigger value.\n";
#  my $MAX_HINT_CNT = 10;
#  my $cells_cnt=0;
  foreach $child (@data)
  {

          my @child_moid = @$child;
          my $LNBTSCLASS = $this->{'lnbtsClass'};
          my $COVERSION = $child_moid[0];
          my $COMOID = $child_moid[1];
          my $COSTATE = $child_moid[2];
#         my $TIME = $this->{'current_time'};
#          my $CELLID = $COMOID;
#          $CELLID =~ /LNCEL\-(\d+)/;
#          $CELLID = $1;
#          $lncells .= "$COMOID\n";
#          if ($cells_cnt < $MAX_HINT_CNT)
#          {
#              $lncells_to_hint.= "$COMOID\n";
#          }
#          $cells_cnt ++;
          if($COSTATE == 3){
             #if($COMOID =~ /LNBTS-703/){
               next;
             #}
          }
#          if ($CELLID =~ /[\d]+/)
#          {
#                  my $tmp_moid = $child_moid[1];
#                  push(@moidLst, "$LNBTSCLASS,$COVERSION,$COMOID,$TIME");
        push(@moidLst, "$LNBTSCLASS,$COVERSION,$COMOID");
#          }
  }
#  $this->{'cell_gids'} = \@cellgids;
#  $this->{'lncell_expect'} = $lncells;

#  if ($cells_cnt > $MAX_HINT_CNT )
#  {
#    $lncells_to_hint.="...\n(Total $cells_cnt LNCELs)\n";
#  }
#  $this->{'cells_prompt_str'} = $lncells_to_hint;

  return @moidLst;
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
# ("update,LNBTS,LN2.0,PLMN-PLMN/MRBTS-6689/LNBTS-6690,20101117032018");
#****************************************************
sub createPlan{
  my($this, $action, @lnbtsInfos) = @_;
#print "In creatPlan action = $action, lnbtsInfos = @lnbtsInfos\n";
#  $action = $this->changeActionValue($action);
  my $mydate = `date -u +%Y-%m-%dT%I:%M:%S`;
  chomp($mydate);
  my $xmlStr="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
  $xmlStr .= "<!DOCTYPE raml SYSTEM 'raml20.dtd'>\n";
  $xmlStr .= "<raml version=\"2.0\" xmlns=\"raml20.xsd\">\n";
  $xmlStr .= "\t<cmData type=\"plan\" scope=\"all\" name=\"LNBTS_OUTAGE_RESET\" id=\"PlanConfiguration( 3407 )\">\n";
  $xmlStr .= "\t\t<header>\n";
  $xmlStr .= "\t\t\t<log dateTime=\"$mydate\" action=\"created\" appInfo=\"PlanExporter\"/>\n";
  $xmlStr .= "\t\t</header>\n";
  $mydate =~ s/[-:]//g;
  $mydate =~ s/T/ /;
  $this->{'current_time'} = $mydate;
  foreach $lnbtsinfo (@lnbtsInfos){
     my @lnbtsvalues = split (/,/, $lnbtsinfo);
     $xmlStr .= "\t\t<managedObject class=\"$lnbtsvalues[0]\" version=\"$lnbtsvalues[1]\" distName=\"$lnbtsvalues[2]\" operation=\"update\">\n";
     $xmlStr .= "\t\t\t<p name=\"btsResetRequest\">$this->{'current_time'}</p>\n";
     $xmlStr .= "\t\t</managedObject>\n";
  }
  $xmlStr .= "\t</cmData>\n";
  $xmlStr .= "</raml>\n";
  return $xmlStr;
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

sub importPlan{
   my($this,$planname) = @_;
#        print("import:/opt/nokia/oss/bin/racclimx.sh -op Import_Export -fileFormat RAML2 -importExportOperation planImport -fileName $planname.xml -planName $planname -v\n");
################################################
#   my $logfile = "/tmp/$planname"."_import.log";
##################################################
   my $logfile = "/tmp/$planname"."_import.log";
#        print "lg_file=$logfile\n";
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
##   my $logfile = "/tmp/$planname"."_activate.log";
   my $logfile = "/tmp/$planname"."_activate.log";
#        print "logfile = $logfile\n";
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

sub removePlan{
   my($this,$planname) = @_;
   $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op  planDeletion -planName $planname","remove",1);
}

sub removeFiles{
    my($this,$planname) = @_;
    my $dir = $this->{'planDir'};
    my $xmlfile = $dir."/".$planname.".xml";
    if(-f $xmlfile){
       `rm -f $xmlfile`;
    }

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
1;

