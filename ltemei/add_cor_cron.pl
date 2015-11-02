#!/opt/nokia/oss/perl/bin/perl

my $host = `ldapacmx.pl -sgPkgHost osscore2`;
chomp($host);

my $COR_CRON_ID = "NWI3_LTEMEI_COR_CRON";

sub AddCORCron
{
    my $cmd = "su - omc -c \"/usr/bin/nokia/ManageCron.pl --task add --id $COR_CRON_ID --job '0 0 3 * * /bin/bash -lc \\\"/opt/nokia/oss/perl/bin/perl /opt/nokia/oss/bin/lte_cor.pl\\\" > /dev/null 2>&1' --role NWI3_MEDIATION_DEFAULT\"";
    my $adding_result = `$cmd`;
    # something like:
    #   Adding crontask with ID NWI3_LTEMEI_COR_CRON to role NWI3_MEDIATION_DEFAULT and user omc
    #   Done.
    if ($adding_result =~ m/Done./)
    {
        # everything is ok!
        return 0;
    }
    #else
    print "$adding_result\n";
    return -1;
}

if( ! (length($host) > 0) )
{
    # error handing...
    my $err_msg = "your lab environment has some problem, cannot get the hostname that running osscore2."
                  ."please fix it first.";
    print $err_msg;
    exit(-1);
}

#my $cmd_listcron = "/usr/bin/nokia/ManageCron.pl --task list --host $host";
my $cmd_listcron = "ssh -q omc@".$host." \"/usr/bin/nokia/ManageCron.pl --task list --host $host | grep $COR_CRON_ID\"";
my $installed_crons = `$cmd_listcron`;
if ( length($installed_crons) > 0 )
{
    if ( $installed_crons =~ m/$COR_CRON_ID/s )
    {
        # the cron has installed before, do nothing
        print "the LTE COR cron exists. do nothing";
        exit(0);
    }
}

my $ok = AddCORCron();
exit($ok);
