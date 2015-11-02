#!/opt/nokia/oss/perl/bin/perl

#** @file blocklncelmx.pl
# This file acts as an interface to trigger lock/unlock/shutdown/reset/Status 
# Report/RFSharing Report form TLUI. It checks the host and passes the 
# arguments given from TLUI to blocklncel2mx.pl.  
# <pre>
# Change History:
#       2012/10/31 Chris (OSS54CD3) : Add file and method comments 
# </pre>
# @author BobYan
# @version 5.2cd1
#*

use strict;
require  DBI;
use DBI;
use emicom;
use Tk;
use Tk::Widget;

# assign the werlog process id! , to fix PR: 43227ESPE03
$main::PROCESSID = "AA51";

my @RNC_older_versions = qw(RN152, 152.1, 152.2, RN1.5);
my @FIL_INT_ID ;
my @FIL_GID;

#** @method CreateDialog(title_string, information_string, window_status)
# This function create a dialog.
# @param title_string
#       the title of the dialog
# @param information_string
#       the information that the dialog shows
# @window_status
#       the value that indicates whether exit the program or just close the dialog
# @retval N/A
#*
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
    my $textlabel = $Labelframe->Label(-text => $information_string,-takefocus => 0);
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

#** @method setGID(ARGV)
# This function get the eNB's global id via it's given int id, and store 
# the int id and global id to  FIL_INT_ID and FIL_GID separately.
# @param ARGV 
#       the system variable that stores the arguments from command line
# @retval N/A 
#*
sub SetGID() 
{
    my ($gid,$system_id);
    my $no=@ARGV;
    for(my $cnt=2;$cnt < @ARGV;$cnt++)
    {
	my ($NEClass,$NESubType,$NEVersion,$parentGid,$context); #useless code
	my $indElem=$ARGV[$cnt];
	my ($gid,$system_id) = emicom::intidtogid($indElem);
	push ( @FIL_INT_ID,$indElem);
	push ( @FIL_GID ,$gid);
	
    }
}

SetGID();

#** @method CheckHosts(system_id)
# This function checks whether the cluster host can be found in LDAP.
# @param system_id
# @retval host
#*
sub CheckHosts
{
    my $system_id = shift;
    my $domain="";
    my $host = "";
    
    ##print STDERR "DEBUG: Ldap query: ", 'ldapacmx.pl -directQuery "(&(cn=osscore2)(ou:dn:=region-', $system_id ,'))" -referals', "\n";
    $domain = `ldapacmx.pl -directQuery "(&(cn=osscore2)(ou:dn:=region-$system_id))" -referals`;

    if ($domain =~ /.*ossSGPkgFQDN=([\w\.]*)/)
    {
        $host = $1;
        ##print STDERR "DEBUG: host=", $host, "\n";
    }
    else
    {
	CreateDialog("ERROR...","Host for cluster $system_id not found in LDAP!",0);
    }
    return ($host);
}

my %RCIntIdMapping;
my $hostname;


my $cluster_type = `ldapacmx.pl -clusterType`; 

if ($cluster_type=~/regional/ig)
{
    if(scalar(@FIL_GID) > 0)
    {
        my $finCmd = "blocklncelmx2.pl   $ARGV[0]   -gid @FIL_GID";
	    system("$finCmd") ;
    }
    
    exit(0);
    
}


for(my $i = 0; $i < @FIL_INT_ID; $i++)
{
    my ($gid,$system_id) = emicom::intidtogid($FIL_INT_ID[$i]);
    $hostname = CheckHosts($system_id);	
    #$hostname = emicom::CreateHosts($system_id);
    if ( $hostname eq "" )
    {
        CreateDialog("ERROR...","blocklncelmx.pl: Cannot resolve Hostname for Cluster $system_id ", 0);
	exit(1);
    }
    if (defined($RCIntIdMapping{$hostname}))
    {
        $RCIntIdMapping{$hostname} = $RCIntIdMapping{$hostname} ."  " . $gid;
    }
    else
    {
        $RCIntIdMapping{$hostname} = $gid;
    }
}

foreach $hostname(keys %RCIntIdMapping)
{
    my $check = 0;
    my $lockCmd = "";
    my $system_id = emicom::getsysid($RCIntIdMapping{$hostname});
    my ($hostname_tmp,$version) = emicom::CreateHosts($system_id);

    if($version < 5.0)	{
	$lockCmd = 'ssh -CY ' . $hostname 
	    . ' /opt/nokiaoss/uma/umaran/nw3mei/bin/blocklncelmx2.pl  '  . "  $ARGV[0]  -gid "
	    . $RCIntIdMapping{$hostname} . ' > /dev/null 2>&1 &';
    }
    else    {
	$lockCmd = 'ssh -CY ' . $hostname 
	    . ' blocklncelmx2.pl  '  . "  $ARGV[0]  -gid "
	    . $RCIntIdMapping{$hostname} . ' > /dev/null 2>&1 &';
    }
    ##print STDERR "DEBUG: ", $lockCmd, "\n";
    $check = system("$lockCmd");
    if ($check)
    {
	CreateDialog("ERROR:",
		     "blocklncelmx.pl: Cannot execute command for locking lncels on host '"
		     . $hostname . " for user '" . $ENV{USER} . "'. Please check ssh configuration."
	    );
    }
}
