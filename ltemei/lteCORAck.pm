#!/opt/nokia/oss/perl/bin/perl -w

package lteCORAck;

push (@INC, '/opt/nokia/oss/bin/');
use Exporter;
@ISA = qw (Exporter);
@EXPORT = qw(FetchData);

#use lteCORLog;
use warnings;
no warnings qw(redefine);

use emicom;
use DBI;
use lteCORDB;


##  SEVERITY_INDETERMINATE  = 0
##  SEVERITY_CRITICAL       = 1
##  SEVERITY_MAJOR          = 2
##  SEVERITY_MINOR          = 3 
##  SEVERITY_WARNING        = 4
##  SEVERITY_CLEARED        = 5
sub SeverityToString
{
    my ($sev) = @_;
    if ( 0 == $sev ) { return "\"INDETERMINATE\""; }
    if ( 1 == $sev ) { return "\"CRITICAL\""; }
    if ( 2 == $sev ) { return "\"MAJOR\""; }
    if ( 3 == $sev ) { return "\"MINOR\""; }
    if ( 4 == $sev ) { return "\"WARNING\""; }
    if ( 5 == $sev ) { return "\"CLEARED\""; }

    return "Unknown";
}

##############################################################
##
## to ack an alarm :
##
##   [omc@rakocia jamwen]$ cat a_ack
##   alarm a;
##   a.alarmNumber = 2000;
##   a.notificationId = 931117;
##   a.distinguishedName = "PLMN-100/BSC-200";
##   a.severity = "CRITICAL";
##   a.flags.used = true;
##   a.alarmTime = date("2010-11-24 12:01:11");
##   a.Ack();
##
##   [omc@rakocia jamwen]$ arcasimx a_ack
##
##############################################################
# return non-zero if ack successfully
sub AckAlarm
{
    my ($alarm_num, $dn) = @_;
    my $timestamp=`date +%Y%m%d%H%M%S`;
    chomp($timestamp);
    my $ackfile = "/tmp/lte_cor_acktmpfile_".$timestamp."_".$$;

    my $ack_fail = 1; # 0 means ack successful
    my $sql =  "select ALARM_NUMBER,NOTIFICATION_ID,DN,SEVERITY,to_char(ALARM_TIME,\'YYYY-MM-DD HH24:MI:SS\')"
              ." from fx_alarm"
              ." where ALARM_NUMBER=$alarm_num and DN=\'$dn\' and ALARM_STATUS=1 and ACK_STATUS=1";
    my $alarms=lteCORDB->getdata($sql);
#    my @alarms=lteCORDB->getdata($sql);
    # if more that one alarm fetched...
#    foreach my $alarm(@alarms)
    foreach my $alarm(@$alarms)
    {
        if (open(FH, ">", $ackfile))
        {
            print FH "alarm a;\n";
            print FH "a.alarmNumber = ".$alarm->[0].";\n";
            print FH "a.notificationId = ".@$alarm[1].";\n";
            print FH "a.distinguishedName = \"".@$alarm[2]."\";\n";
            print FH "a.severity = ".SeverityToString(@$alarm[3]).";\n";
            print FH "a.flags.used = true;\n";
            print FH "a.ackedBy = \"COR\";\n";
            print FH "a.alarmTime = date(\"".@$alarm[4]."\");\n";
            # TODO : is it possable to fill the ACKED_BY field in DB?
            print FH "a.Ack();\n";
            close FH;

            # ACK it
            #`arcasimx $ackfile &`;               # not working
            #`arcasimx $ackfile 2>&1 >/dev/null`; # not working -- syntax error!
            `arcasimx $ackfile >/dev/null 2>&1`; 

            # remove the tmp file
            `rm -f $ackfile`;
#print "TODO, remove debug info here ($ackfile)!\n";

            sleep(10);

            # check whether the ack is succ
            my $sql =  "select ACK_STATUS from fx_alarm"
                      ." where ALARM_NUMBER=$alarm_num and DN=\'$dn\' and NOTIFICATION_ID=".@$alarm[1];
#print "ack_sql=$sql\n";
            my $arms=lteCORDB->getdata($sql);
            if (length(@$arms)>0)
            {
                my $arm_ref = @$arms[0];
                if (0 == @$arm_ref[0]) ## ACK_STATUS==0 means ACK success
                {
                    $ack_fail = 0;
#print "acked.\n";
                }
                else
                {
                    $ack_fail = 1;
#print "ack failed(ACK_STATUS in db=@$arm_ref[0]).\n";
                }
            }
            else
            {
#print "NO acked alarm found.\n";
                $ack_fail = 1;
            }
        }
        else
        {
            $ack_fail = 1;
        }
    }

    # if ack any of the alarms failed
    # take as ack failed.
    return ($ack_fail == 0);
}

1;

