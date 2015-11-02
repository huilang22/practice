#!/opt/nokia/oss/perl/bin/perl -w

push (@INC, '/opt/nokia/oss/bin/');
use lteCORLog;
use lteCORBlocklist;
use lteCORResetPlan;
use lteCORDB;
use lteCORAck;

sub FetchAlarmsFromDB
{
    my ($alarm_array_ref) = @_;
    my $sql =  "select ALARM_NUMBER,DN"
              ." from fx_alarm"
              ." where (ALARM_NUMBER=69301 or ALARM_NUMBER=69302 or ALARM_NUMBER=69303)"
              ." and ALARM_STATUS=1 and ACK_STATUS=1";
    my $c1 = lteCORDB->new($sql);
    my $index = 0;
    foreach $count (@{$c1->FetchData()})
    {
        $alarm_array_ref->[$index] = $count;
#        print "$alarm_array_ref->[$index]->{'alarm_num'},$alarm_array_ref->[$index]->{'dn'}\n";
        $index++;
    }

## #test data
##     my %tmp;
##     $tmp{'alarm_num'} = 69302;
##     $tmp{'dn'} = "PLMN-PLMN/MRBTS-111/LNBTS-111/LNCEL-1";
##     $alarm_array_ref->[0] = \%tmp;
##     my %tmp2;
##     $tmp2{'alarm_num'} = 69301;
##     $tmp2{'dn'} = "PLMN-PLMN/MRBTS-112/LNBTS-112/LNCEL-1";
##     $alarm_array_ref->[1] = \%tmp2;
##     my %tmp3;
##     $tmp3{'alarm_num'} = 69303;
##     $tmp3{'dn'} = "PLMN-PLMN/MRBTS-112/LNBTS-112/LNCEL-2";
##     $alarm_array_ref->[2] = \%tmp3;
##     $tmp4{'alarm_num'} = 69303;
##     $tmp4{'dn'} = "PLMN-PLMN/MRBTS-1111/LNBTS-1111/LNCEL-2";
##     $alarm_array_ref->[3] = \%tmp4;
## #test data end

    ## TODO: get real data from db
}

sub ExtractLnbtsByAlarms
{
    my ($alarm_array_ref, $lnbts_hash_ref) = @_;
    my $alarm_cnt = scalar(@$alarm_array_ref);
    foreach my $alarm_ref (@$alarm_array_ref)
    {
        my $dn = $alarm_ref->{'dn'};
        $dn =~ s/\/LNCEL-\d+//;
        $lnbts_hash_ref->{$dn} = 1;
    }
}

sub ApplyBlocklist
{
    my ($lnbts_hash_ref, $raw_alarm_arrayref) = @_;
    # TODO: change the file location
    my $bl = lteCORBlocklist->new('/etc/opt/nokia/oss/custom/conf/LTE_COR_BLOCKLIST');
    foreach my $full_dn (keys %$lnbts_hash_ref)
    {
        if($full_dn =~ m/(LNBTS-\d+)/)
        {
            my $dn = $1;
            if($bl->IsBlockedLNBTS($dn))
            {
                my @arr = getAlarmAndFullDN($dn, $raw_alarm_arrayref);
                foreach my $alarm (@arr)
                {
                    lteCORLog::WriteLog( "$alarm->{'dn'}, Alarm:$alarm->{'alarm_num'}, "
                                        ."Action:Reset - Ignored, since $dn in BLOCKLIST.\n");
                }

                delete($lnbts_hash_ref->{$full_dn});
            }
        }
    }
}

sub getAlarmAndFullDN
{
    my ($lnbts_dn, $raw_alarm_arrayref) = @_;
    my @arr = ();
#print "getAlarmAndFullDN for $lnbts_dn\n";
    foreach my $alarm (@$raw_alarm_arrayref)
    {
        my $full_dn = $alarm->{'dn'};
        if ( $full_dn =~ m/(LNBTS-\d+)/ )
        {
            my $lnbtspart = $1;
#print "$full_dn, $lnbts_dn, $lnbtspart\n";
            if ( $lnbts_dn eq $lnbtspart )
            {
#print "push $alarm\n";
                push(@arr, $alarm);
            }
        }
    }

#print "alarms for $lnbts_dn: @arr\n";
    return @arr;
}

sub Main
{
    my $now = `date +"%Y-%m-%d %H:%M:%S"`;
    chomp($now);
    lteCORLog::WriteLog("LTE COR cronjob running at $now(YYYY-MM-DD hh:mm:ss)\n");

    #step 1: fetch alarms from DB
    my @raw_alarms;
    FetchAlarmsFromDB(\@raw_alarms);
    if ( scalar(@raw_alarms) == 0 )
    {
        lteCORLog::WriteLog("no alarms fetched, do nothing.\n");
        exit(0);
    }

    #step 2: extract all lnbts dn, which may need to do COR
    my %to_reset_lnbts;
    ExtractLnbtsByAlarms(\@raw_alarms, \%to_reset_lnbts);

    #step 3: ignore lnbts which in block-list
    ApplyBlocklist(\%to_reset_lnbts, \@raw_alarms);

    #step 4: Plan relevant: include write, import, activate
    my $cmdPlan = lteCORResetPlan->new();
    foreach my $dn (keys %to_reset_lnbts)
    {
        $cmdPlan->AddLNBTS($dn);
    }

    my $result_set = $cmdPlan->RunReset();
    foreach my $dn (keys %to_reset_lnbts)
    {
        my $reset_ret = $result_set->{$dn};
        ## TODO: parse the result....
        my $lnbts_dn = "";
        if ($dn =~ m/(LNBTS-\d+)/)
        {
            $lnbts_dn = $1;
            my @arr = getAlarmAndFullDN($lnbts_dn, \@raw_alarms);
            foreach my $alarm (@arr)
            {
                lteCORLog::WriteLog("$alarm->{'dn'}, Alarm:$alarm->{'alarm_num'}, Action:Reset - $reset_ret\n");
                if ($reset_ret eq "Successful.")
                {
                #step 5: Ack the alarm which did COR successfully
                    my $ack_fail = lteCORAck::AckAlarm($alarm->{'alarm_num'}, $alarm->{'dn'});

## please see comments in lteCORAck.pm
##                    if ( $ack_fail )
##                    {
##                        lteCORLog::WriteLog("$alarm->{'dn'}, Alarm:$alarm->{'alarm_num'}, "
##                                            ."Action:Reset Successful but ACK alarm in DB failed.\n");
##                    }
                }
            }
        }
    }
}
Main();
