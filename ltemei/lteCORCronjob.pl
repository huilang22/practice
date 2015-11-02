#!/opt/nokia/oss/perl/bin/perl

sub Usage
{
    print "Usage:\n";
    print "    $0 -d                     # To deactivate the COR cronjob\n";
    print "    $0 -l                     # To list the COR cronjob\n";
    print "    $0 -a \"* * * * *\"         # To activate the COR cronjob with specified interval \n";
    print "        where \"* * * * *\" should be replaced by a valid  cronjob time format.\n";
    print "    for example: $0 -a \"0 3 * * *\"\n"; 
    print "        means the COR will be running once per day, at 03:00 in the mid-night.\n";
}

my $COR_CRON_ID = "NWI3_LTEMEI_COR_CRON";

sub AddCORCron
{
    my ($host, $interval) = @_;
    my $cmd = "ssh -q omc@".$host." \"/usr/bin/nokia/ManageCron.pl --task add --id $COR_CRON_ID --job '".$interval." /bin/bash -lc \\\"/opt/nokia/oss/bin/lte_cor.pl\\\" > /dev/null 2>&1' --role NWI3_MEDIATION_DEFAULT\"";
    print "To add cronjob for COR...";
    my $adding_result = `$cmd`;
    # something like:
    #   Adding crontask with ID NWI3_LTEMEI_COR_CRON to role NWI3_MEDIATION_DEFAULT and user omc
    #   Done.
    sleep(1);
    if ($adding_result =~ m/Done./g)
    {
        print "Done.\n";
        # everything is ok!
        return 0;
    }
    #else
    print "$adding_result\n";
    return -1;
}

sub DelCorCron
{
    my ($host, $job) = @_;
    my $cmd = "ssh -q omc@".$host." \"/usr/bin/nokia/ManageCron.pl --task del --id $COR_CRON_ID --job \\\"$job\\\"  --role NWI3_MEDIATION_DEFAULT\"";
#print "del cmd=[$cmd]\n";
    print "To Delete cronjob for COR...";

    my $result = `$cmd`;
    # something like:
    #   Deleting crontask with ID NWI3_LTEMEI_COR_CRON to role NWI3_MEDIATION_DEFAULT and user omc
    #   Done.
    if ($result =~ m/Done./g)
    {
        # everything is ok!
        print "Done.\n";
        return 0;
    }
    #else
    print "$result\n";
    return -1;
}

sub ListCORCron
{
    my ($host) = @_;
    my $cmd = "ssh -q omc@".$host." \"/usr/bin/nokia/ManageCron.pl --task list --host $host | grep $COR_CRON_ID\"";
    my $result = `$cmd`;
    if (! length($result) > 0 )
    {
        print "(None)\n";
    }
    else
    {
        print "$result";
    }
}

sub IsCorCronExists
{
    my ($host) = @_;
    my $cmd = "ssh -q omc@".$host." \"/usr/bin/nokia/ManageCron.pl --task list --host $host | grep $COR_CRON_ID\"";
    my $result = `$cmd`;
    # something like:
    # 0 0 3 * * /bin/bash -lc "/opt/nokia/oss/perl/bin/perl /opt/nokia/oss/bin/lte_cor.pl" > /dev/null 2>&1 # HOST=itlab71core2 ID=NWI3_LTEMEI_COR_CRON
    if ( $result =~ m/(.*)# HOST=\S+\s+ID=$COR_CRON_ID/ )
    {
        return $1;
    }

    return undef;
}

sub ActivateOrDeactivateCORCron
{
    my ($host,$activate) = @_;
    my $cmd = "";
    if ( $activate == 1)
    {
        print "To Activate cronjob ...";
        $cmd = "ssh -q omc@".$host." \"/usr/bin/nokia/ManageCron.pl --task activate --host $host\"";
    }
    else
    {
        print "To Deactivate cronjob ...";
        $cmd = "ssh -q omc@".$host." \"/usr/bin/nokia/ManageCron.pl --task deactivate --host $host\"";
    }

    my $result = `$cmd`;
    # something like:
    #   Activating crontasks for hostname xxxxxx and user omc
    #   Done.
    sleep(1);
    if ($result =~ m/Done./)
    {
        # everything is ok!
        print "Done.\n";
        return 0;
    }
    #else
    print "$result\n";
    return -1;
}

sub GetHostname
{
    my $host = `ldapacmx.pl -sgPkgHost osscore2`;
    chomp($host);
    
    if( ! (length($host) > 0) )
    {
        # error handing...
        my $err_msg = "your lab environment has some problem, cannot get the hostname that running osscore2."
                      ."please fix it first.";
        print $err_msg;
        exit(-1);
    }
    return $host;
}

# return 0 -- NOK
#        1 -- OK
sub VerifyCronInterval
{
    my ($interval) = @_;
print $cron_interval."\n";
    if ( ! length($interval) > 0 )
    {
        return 0;
    }

##my $interval = " *1  *2 *3   *4 *5  ";
##if ($interval =~ m/\s+(\S+)\s+(\S+)\s+(\S+)\s+(\S+)\s+(\S+)\s*/ )
##{
##    print "match, $1, $2, $3, $4, $5";
##}
##else
##{
##    print "NOT";
##}
## output:
##  match, *1, *2, *3, *4, *5

    if ($interval =~ m/\s*(\S+)\s+(\S+)\s+(\S+)\s+(\S+)\s+(\S+)\s*/ )
    {
        return 1;
    }

    return 0;
}


sub CheckUser
{
    my $Sys_name = $^O;
    my $valid_user = 0;
    if($Sys_name =~ /linux/){
        my $user = $ENV{'USER'};
        if ( ($user eq "root") or ($user eq "omc") )
        {
            $valid_user = 1;
        }
    }

    if (!$valid_user)
    {
        die "This script only can be run by root or omc.\n";
    }
}

sub Main
{
    CheckUser();

    if ( (scalar(@ARGV) == 1) and ($ARGV[0] eq "-d") )
    {
	my $host = GetHostname();
        my $job = IsCorCronExists($host);
        if ( defined($job) )
        {
            # delete
            DelCorCron($host, $job);
 
            # deactivate 
            ActivateOrDeactivateCORCron($host, 0);
            # activate
            ActivateOrDeactivateCORCron($host, 1);
        } else
        {
            print "LTE COR cronjob is not activated now. Do nothing.\n";
        }
    } elsif ( (scalar(@ARGV) == 1) and ($ARGV[0] eq "-l") )
    {
	my $host = GetHostname();
        ListCORCron($host);
    } elsif ( (scalar(@ARGV) == 2) and ($ARGV[0] eq "-a") )
    {
        my $cron_interval = $ARGV[1];
        if ( ! VerifyCronInterval($cron_interval) )
        {
            print "Your input cron interval($cron_interval) is not valid cronjob time format.\n";
            exit(-1);
        }

	my $host = GetHostname();

        my $job = IsCorCronExists($host);
        if ( defined($job) )
        {
            # delete
            DelCorCron($host, $job);
 
            # deactivate 
            ActivateOrDeactivateCORCron($host, 0);
        }

   
        # add
        AddCORCron($host, $cron_interval);

        # activate
        ActivateOrDeactivateCORCron($host, 1);
    }
    else
    {
        Usage();
    }
}

Main();
