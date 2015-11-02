#!/opt/nokia/oss/perl/bin/perl -w

package lteCORResetPlan;

push (@INC, '/opt/nokia/oss/bin/');

use warnings;
use lteCORLog;
use emicom;
use DBI;
use Exporter;
use Tk;
use Tk::Widget;
use English;
require Exporter;
@ISA = qw (Exporter);
@EXPORT = qw(RunReset);

sub new
{
    my $class = shift;
    my $this = {};
    my %hash = ();
    $this->{'lnbts_dn'} = \%hash;
    $this->{'planDir'} = "/var/opt/nokia/oss/global/racops/import";
    $this->{'lnbtsClass'} = "LNBTS";
    $this->{'action'} = "CELLOUTAGERESET";

    $this->{'result_hash'}={};
    $this->{'flag'} = 1;#1 means activate failed,0 means activate successful
    bless($this, $class);
    return $this;
}

sub AddLNBTS
{
    my ($this, $dn) = @_;
    my $hash_ref = $this->{'lnbts_dn'};
    $hash_ref->{$dn} = "1";
}

sub is_supported_ver
{
  my ($ver) = @_;
        my @unsupported_ver = (   ""  # no version info
                                , 'LN1.0');
        foreach my $nver (@unsupported_ver)
        {
            if ( $nver eq $ver )
            {
                 return 0;
            }
        }

    return 1;
}

sub RunReset
{
    my ($this) = @_;
    my $action = $this->{'action'};
    my $plancontent = $this->createPlanHeader($this->{'action'});
    my $hash_ref = $this->{'lnbts_dn'};
    foreach my $dn(keys %$hash_ref)
    {
        my @lnbtsinfo;
        $this->GetBTSINFO($dn,\@lnbtsinfo);
        if(!$lnbtsinfo[1])
        {
            $this->{'result_hash'}{$dn} = "Failed: No data in DB.";
            delete $hash_ref->{$dn};
            next;
        }
        if ( not is_supported_ver($lnbtsinfo[1]) )
        {
            $this->{'result_hash'}{$dn} = "Failed: LNBTS version($lnbtsinfo[1]) not supported.";
            delete $hash_ref->{$dn};
            next;
        }
        if("$lnbtsinfo[3]" eq "3")
        {
            $this->{'result_hash'}{$dn} = "Failed: CO_STATE is NON-OPERATIONAL.";
            delete $hash_ref->{$dn};
            next;
        }

        $plancontent .= $this->createPlanContent(\@lnbtsinfo);
    }
    $plancontent .= $this->createPlanTailer();
    
#    print "\nplease remove this DEBUG info:\n$plancontent\n";

    my $planname = $this->getUName($action);
##    print "$planname\n";
    $this->writeXML($planname, $plancontent);

    my $import = $this->importPlan($planname);
    if ($import == 1)
    {
        $this->postHanlder($planname);
        return $this->{'result_hash'};
    }

    $this->executePlan($planname);
    $this->postHanlder($planname);
    return $this->{'result_hash'};
}

sub postHanlder{
    my($this, $planname) = @_;
    $this->removePlan($planname);
    $this->removeFiles($planname);
    $this->killTailprocess($$);

}

##
#To get the LNBTS info for writing plan.
#The LNBTS info like:
#    CO_OCV_SYS_VERSION,CO_STATE
#
#
sub GetBTSINFO
{
    my ($this, $lnbtsdn, $lnbtsinfo_ref) = @_;
    my $sql = "SELECT CO_OCV_SYS_VERSION,CO_STATE"
             ." FROM N3T_NWI3_MO"
             ." WHERE CO_OC_ID = 3129 AND CO_STATE != 9 AND CO_DN='$lnbtsdn' ";
    my @data = $this->sql($sql);
    foreach my $child (@data)
    {
        my @child_moid = @$child;
        my $COVERSION = $child_moid[0];
        my $COSTATE = $child_moid[1];
        my $LNBTSCLASS = $this->{'lnbtsClass'};
        push(@$lnbtsinfo_ref, $LNBTSCLASS, $COVERSION, $lnbtsdn, $COSTATE);
    }
}

sub sql
{
    my($this, $sqlStr) = @_;
    my $dbconnect = "dbi:Oracle:";
    my $user      = "omc";
    my $password  = emicom::getDBPassword();

    if( $password eq "" )
    {
        lteCORLog::WriteLog("Get Database Password failed.\n");
        exit 1;
    }

    my $dbh = DBI->connect($dbconnect,$user,$password);
    unless( $dbh )
    {
        lteCORLog::WriteLog("Connect to Database failed(1).\n");
        exit 1;
    }

    my $sth = $dbh->prepare($sqlStr);
    unless( $sth )
    {
        lteCORLog::WriteLog("Connect to Database failed(2).\n");
        exit 1;
    }

    unless($sth->execute)
    {
        lteCORLog::WriteLog("Connect to Database failed(3).\n");
        exit 1;
    }

    my @data;
    my $index=0;
    while(my @child = $sth->fetchrow_array){
        $data[$index]=[@child];
        $index += 1;
    }
    $sth->finish();
    $dbh->disconnect();
    return @data;
}

sub createPlanHeader
{
    my($this, $action) = @_;
    my $mydate = `date -u +%Y-%m-%dT%I:%M:%S`;
    chomp($mydate);
    my $xmlStr="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
    $xmlStr .= "<!DOCTYPE raml SYSTEM 'raml21.dtd'>\n";
    $xmlStr .= "<raml version=\"2.1\" xmlns=\"raml21.xsd\">\n";
    $xmlStr .= "\t<cmData type=\"plan\" scope=\"all\" name=\"LNBTS_OUTAGE_RESET\" id=\"PlanConfiguration( 3407 )\">\n";
    $xmlStr .= "\t\t<header>\n";
    $xmlStr .= "\t\t\t<log dateTime=\"$mydate\" action=\"created\" appInfo=\"PlanExporter\"/>\n";
    $xmlStr .= "\t\t</header>\n";
    $mydate =~ s/[-:]//g;
    $mydate =~ s/T/ /;
    $this->{'current_time'} = $mydate;
    return $xmlStr;
}

sub createPlanContent
{
    my($this, $lnbtsInfo_ref) = @_;
    my $xmlStr = "\t\t<managedObject class=\"$lnbtsInfo_ref->[0]\" version=\"$lnbtsInfo_ref->[1]\" distName=\"$lnbtsInfo_ref->[2]\" operation=\"update\">\n";
    $xmlStr .= "\t\t\t<extension name=\"SONcontext\">\n";
	$xmlStr .= "\t\t\t\t<p name=\"changeOrigin\">Central -  Cell Outage based Reset (COR)</p>\n";
	$xmlStr .= "\t\t\t</extension>\n";
	$xmlStr .= "\t\t\t<p name=\"btsResetRequest\">$this->{'current_time'}</p>\n";
    $xmlStr .= "\t\t</managedObject>\n";
    return $xmlStr;
}

sub createPlanTailer
{
    my($this) = @_;
    my $xmlStr = "\t</cmData>\n";
    $xmlStr .= "</raml>\n";
    return $xmlStr;
}

sub getUName{
    my($this,$action) = @_;
    my $timestamp=`date +%Y%m%d%H%M%S`;
    chomp($timestamp);
    my $name = "TopLevelUI_".uc($action)."_temp_plan_".$timestamp."_".$$;
    chomp($name);
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
    my $logfile = "/tmp/$planname"."_import.log";
    my $rlt = $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op Import_Export -fileFormat RAML2 -importExportOperation planImport -fileName $planname.xml -planName $planname -v", $logfile,1);
#    print "rlt = $rlt\n";
    if($rlt =~ m/Status received: Finished/){
#print "please remove ($logfile) after debug\n";
        `rm -f $logfile`;
        return 0;
    }
    else {
        my $detail_err_filename = "$planname"."_import.log";
        foreach my $dn(keys %{$this->{'lnbts_dn'}})
        {
            $this->{'result_hash'}{$dn} = "Failed: During importing plan(please see detail error log in /var/opt/nokia/oss/global/ltemei/log/$detail_err_filename).";
        }
        #lteCORLog::AppendDetailError($log_file);
        lteCORLog::AppendDetailError($detail_err_filename);
#print "please remove ($logfile) after debug\n";
        `rm -f $logfile`;
        return 1;
    }
}

sub executePlan{
    my($this,$planname) = @_;
    my $logfile = "/tmp/$planname"."_activate.log";
    my $rlt = $this->runCMD("/opt/nokia/oss/bin/racclimx.sh -op Provision -planName $planname -lteContentInUse true -provisioningOperation activate -v", $logfile,1);
    chomp($rlt);
#die "for debug, activate($logfile) rlt = \n$rlt\n";
    while ($rlt =~ m/Feedback received: DN: (PLMN-PLMN\/MRBTS-(\d+)) Type: OK\nPLANTYPE_LTEBTS plan activation successfully complete/sg)
    {
        my $dn = $1."/LNBTS-".$2;
        $this->{'result_hash'}{$dn} = "Successful.";
        $this->{'lnbts_dn'}{$dn} = 0;#0 means successful,1 means failed.
        $this->{'flag'} = 0;
    }

    my $detail_err_filename = "$planname"."_activate.log";
    foreach my $dn(keys %{$this->{'lnbts_dn'}})
    {
        if ($this->{'lnbts_dn'}{$dn})
        {
            $this->{'result_hash'}{$dn} = "Failed: During activating plan(see detail error log in /var/opt/nokia/oss/global/ltemei/log/$detail_err_filename).";
            $this->{'flag'} = 1;
        }
    }
    # To do more log if activate has some error
    if ($this->{'flag'})
    {
        #lteCORLog::AppendDetailError($log_file);
        lteCORLog::AppendDetailError($detail_err_filename);
    }

    `rm -f $logfile`;
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

sub killTailprocess{
    my ($this,$logfile) = @_;
    my $tailpid = `ps -ef | grep tail | grep -v grep | grep $logfile | awk '{print \$2}'`;
    chomp($tailpid);
    if($tailpid ne ""){
        `kill -9 $tailpid`;
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

1;# perl class/package must be end with with the required '1;'

