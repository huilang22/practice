#!/opt/nokia/oss/perl/bin/perl -w

#** @file lteBatchExecuter.pl
# This file is the interface to execute lock/unlock/shutdown/reset for 
# batches of eNBs. <br/>
# This file is used by blocklncelmx2.pl and LTEStatusActions.py, One is 
# triggered from TLUI, the other is from Status Report.
# <pre>
# Change History:
#       2012/10/31 Chris (OSS54CD3) : Add file and method comments 
# </pre>
# @author BobYan
# @version oss5.3cd1
#*

push (@INC, '/opt/nokia/oss/bin/');
use lteEMCommandHelper;
use lteEMCommandHandler;
use lteEMlockCommand;
use lteEMOutageCommand;
use lteEMBatchCommand;
use lteEMDBAccess;
use lteEMGUI;

# assign the werlog process id! , to fix PR: 43227ESPE03
$main::PROCESSID = "AA51";


sub Usage
{
    print "Usage: $0 <em_command_type> -gid gid1 (... <gidn>).";
    print "e.g. : $0 reset -gid gid1";
    print "       $0 reset -gid gid1 gid2 gid3";
}

#** @method getUName(action)
# Generate a unique name for the plan.
# @param action
#       the action name
# @retval name
#       the unique plan name
#*
sub getUName{
   my($action) = @_;
   my $timestamp=`date +%Y%m%d%H%M%S`;
   my $name = "TopLevelUI_".uc($action)."_temp_plan_".$timestamp;
   chomp($name); #get rid of the last '\n' char
   return $name; 
}  

sub executePlan{
    my($actionname, $logfile, $gids) = @_;
    print("give gid ".$gids."\n");
    $cmd = lteEMBatchCommand->new($gids);
    $cmd->setAction($actionname);
    $cmd->setLogFile($logfile);
    $cmd->Run();
    return 0;

}

#** @method showConfirmDialog(action, gid)
# Show the confirm dialog before do the operation.
# @param action 
#       the action name
# @param gid
#       the global id of eNB
# @retval N/A
#*
sub showConfirmDialog{
   my($action, @gid) = @_;
   my $total = @gid;
   my $gui = lteEMGUI->new();
   my $dbAccess = lteEMDBAccess->new();
   if($total <= 0){
      $gui->showDialog("Error","There is no objects fetched!","0");
      return 1;
   }
   if($total > 10){
     @gid = @gid[0..10];
   }
   my $gid_seq = join(",", @gid);
   my $sql = "select co_dn from utp_common_objects where co_gid in ($gid_seq)";
   my @data = $dbAccess->sql($sql);
   my $dns = "";
   foreach $rowValue (@data){
      $dns .= $rowValue->[0]."\n";
   }
   my $confirm = $gui->showConfirmDialog("Confirm...","Do you want to ".uc($action)." the following object(s)?",$dns);
}

#** @method validateObjects(action, gids)
# To check whether the action on the eNB is valid, like if LNBTS's version 
# is LN1.0, it cannot support reset, etc.
# @param action 
#       the action name
# @param gids
#       the array that stores the eNB's global ids
# @retval 1/0 (0 means valid, 1 means invalid)
#*
sub validateObjects
{
    my($action, @gids) = @_;
    my $dbAccess = lteEMDBAccess->new();
    my $gui = lteEMGUI->new();
    my $gid_seq = join(",", @gids);
    my $sql = "select CO_OCV_SYS_VERSION,CO_DN,CO_ADMIN_STATE,CO_OC_ID from utp_common_objects 
    			where (CO_OC_ID = 3130 or CO_OC_ID=3129) AND CO_STATE != 9 AND CO_STATE!=3 
    			AND (co_gid in ($gid_seq) or co_parent_gid in ($gid_seq))";
    my @data = $dbAccess->sql($sql);
    my $error = "";
    foreach $objInfo (@data)
    {
        my $version = $objInfo->[0];
        my $dn = $objInfo->[1];
        my $adminState = $objInfo->[2];
        my $co_clasid = $objInfo->[3];
        my $adminValue = getCellAdmin($adminState, $co_clasid);
        my $validated = validateSingleObject($action, $version, $dn, $adminValue);
        if($validated != 0)
        {
           my $actionName = getActionName($action);
           if($validated == 1 or $validated == 2){
              $error.= "$dn($version) can't support $actionName.\n";
           }
           if($validated == 1){
              $error.= "Please do it via Site Manager.\n";
           }
           if($validated == 3){
              $error.= "$dn($adminValue) can't do $actionName.\n";   
           }
        } 
    }
    if($error ne ""){
       $gui->showDialog("Error",$error,1);
       return 1;
    }
    return 0;
}

#** @method validateSingleObject(action, version, dn, adminState)
# To check if the eNB can execute the action, like LNBTS cannot support LN1.0, etc. 
# @param action
#       the action name
# @param version
#       the version of eNB
# @param dn
#       the dn of eNB(currently it's useless)
# @param adminState
#       the administrative state of eNB
# @retval validated
#       the number value indicates the check state
#*
sub validateSingleObject{
   my($action, $version, $dn, $adminState) = @_;
   my $validated = 0;
   $version = uc($version);
   if($action =~ /reset/){
      if($version =~ /LN1/){
         $validated = 1;
      }
   }
   if($action =~ /shutdown/){
      if($version =~ /LN[T]?1/){
         $validated = 2;
      }
      if($adminState eq "locked"){
         $validated = 3;
      }
   }
   return $validated;
}

#** @method getCellAdmin(adminStateInDB, co_clasid)
# Get the administrative state of LNCEL.
# @param adminStateInDB 
#       the string that contains the number value of administrative state
# @param co_clasid
#       the number that contains the class id of eNB
# @retval state
#       the string value of administrative state
#*
sub getCellAdmin{
    my($adminStateInDB, $co_clasid) = @_;
    my $state = "unknown";
    if($co_clasid == 3130 and defined($adminStateInDB) and $adminStateInDB =~ /^\d+$/){
       if($adminStateInDB eq "1"){
          $state = "unlocked`";
       }
       if($adminStateInDB eq "3"){
          $state = "locked";
       }
       if($adminStateInDB eq "2"){
          $state = "shutdown";
       }
    }
    return $state;
}

#** @method getActionName(actionname)
# Get the action name from given name in command, like get LNBTS_RESET from 
# gui_lnbts_reset, etc.
# @param actionname 
#       the action name given from command line
# @retval uc(newName)
#       the uppercase of new name

sub getActionName{
    my($actionname) = @_;
    my $newName = $actionname;
    if($actionname =~ /gui_(.+)$/){
       $newName = $1;
   }
   return uc($newName);

}

#** @method MainFun(ARGV)
# This function is the main method.
# @param ARGV
#       the system variable that stores the arguments from command line
# @retval N/A
#*
sub MainFun
{
    my $command = lc($ARGV[0]);
    if(($command =~ /lock/) or ($command =~ /shutdown/)
       or ($command =~ /unlock/) or ($command =~ /reset/))
    {
        my $action = $1;
        my $argSize = @ARGV;
        my @gids_array = @ARGV[1..($argSize - 1)];
        my $rlt = validateObjects($command, @gids_array);
        if($rlt != 0)
        {
           exit -1;
        }
        if(!($command=~/nogui/)){
           $command =~ /([^_]+)$/;
           my $action = $1;
           my $argSize = @ARGV;
           my $confirm = showConfirmDialog($action, @gids_array);
           if($confirm != 0 ){
               exit -1;
           }
        }
        #validateObjects($command, @gids_array);
        my $gids = "";
        for( my $i=1; $i < @ARGV; ++$i) 
        {
            if($gids eq "") 
            {
               $gids = $ARGV[$i];
            }
            else 
            {
               $gids .=" ".$ARGV[$i];
            }
        }

        my $logfile_name = &getUName($command);
        my $logfile = "/tmp/$logfile_name.log";
        `rm -f $logfile`;
        `echo "" > $logfile`;
        my $cmd = "lteBatchExecuter.pl executeplan $command $logfile $gids";
        system($cmd." &");
        my $gui = lteEMGUI->new();
        my $actionName = getActionName($command);
        $gui->showSynLogDialog($logfile,$actionName);
    }
   elsif($command eq "executeplan"){
      $action = $ARGV[1];
      $logfile = $ARGV[2];
      $gids = "";
      for( $i=3; $i < @ARGV; ++$i) {
            if($gids eq "") {
               $gids = $ARGV[$i];
            }
            else {
               $gids .=" ".$ARGV[$i];
            }
        }
#       print('gidxxxxxxxxx:$gids\n');
       &executePlan($action,$logfile,$gids);
       
   }

}
#Main();
MainFun();

