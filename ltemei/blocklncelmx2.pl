#!/opt/nokia/oss/perl/bin/perl -w

#** @file blocklncelmx2x.pl
# This file acts as an action interface that get the argument from blocklncelmx.pl 
# and trigger lock/unlock/reset/shutdown/Status Report/RFSharing Report for eNBs. 
# <pre>
# Change History:
#       2012/10/31 Chris (OSS54CD3): Add file and method comments 
# </pre>
# @author BobYan
# @version 5.2d1

push (@INC, '/opt/nokia/oss/bin/');
use lteEMCommandHelper;
use lteEMCommandHandler;
use lteEMlockCommand;
use lteEMOutageCommand;

# assign the werlog process id! , to fix PR: 43227ESPE03
$main::PROCESSID = "AA51";

#** @method Main(ARGV)
# This function is the main method.
# @param ARGV
#       the system variable that stores the arguments from command line
# @retval N/A
#*
sub Main
{
    if ( @ARGV < 2 )
    {
        Usage();
        return -1;
    }


    my $command = $ARGV[0];
    if(($command eq "lock") or ($command eq "shutdown") or ($command eq "unlock")
       or ($command eq "lnbts_reset") or ($command eq "lncel_reset") 
       or ($command eq "immediate_lock") or ($command eq "graceful_lock") )
    {
        if($command eq "immediate_lock"){
           $command = "lock";
        }
        if($command eq "graceful_lock"){
           $command = "shutdown";
        }
        my $gids = "";
        for( my $i=2; $i < @ARGV; ++$i) {
            if($gids eq "") {
               $gids = $ARGV[$i];
            }
            else {
               $gids .=" ".$ARGV[$i];
            }
        }
      #  $cmd = lteEMlockCommand->new($gids);
      #  $cmd->setAction($command);
      #  $cmd->Run();
        `lteBatchExecuter.pl gui_$command $gids`;
        return 0;
    }

    if(($command eq "showme") or ($command eq "showcluster")){
        my $gids = "";
        for( my $i=2; $i < @ARGV; ++$i) {
            if($gids eq "") {
               $gids = $ARGV[$i];
            }
            else {
               $gids .=" ".$ARGV[$i];
            }
        }
       `LTEStatusControle.py $command subcontrol=LTEStatusSubControl $gids`;
        return 0;
    }

    my $MedIPMo; # hash gids by meditor ip
    # group same operation by meditor ip
    # e.g., if we block more than 1 cell under the same lnbts,
    #       we can gourp the cell gids first.
    #       (note: in old code,for I-HSPA, it groups the cell moids, not gids,
    #              but this is not suit for LTE; for LTE, we should group gids)
    #       and then, send one command to meditor is enough
    for(my $i = 2; $i < @ARGV; ++$i)
    {
        my $meip = lteEMCommandHelper::GetMEIP($ARGV[$i]);
#print "meip($meip) for gid($ARGV[$i])\n";
        if(defined($MedIPMo{$meip}))
        {
            $MedIPMo{$meip} = $MedIPMo{$meip} . " " . $ARGV[$i];
        }
        else
        {
            $MedIPMo{$meip} = $ARGV[$i];
        }
    }

    foreach my $medip(keys %MedIPMo)
    {
        my $handler = lteEMCommandHandler->new($ARGV[0], $MedIPMo{$medip});
        $handler->InvokeCommand();
    }

    return 0;
}

sub Usage
{
    print "Usage: $0 <em_command_type> -gid gid1 (... <gidn>).";
    print "e.g. : $0 reset -gid gid1";
    print "       $0 reset -gid gid1 gid2 gid3";
}

Main();

