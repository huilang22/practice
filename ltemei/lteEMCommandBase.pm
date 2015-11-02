#!/opt/nokia/oss/perl/bin/perl -w

package lteEMCommandBase;

push (@INC, '/opt/nokia/oss/bin/');
use lteEMCommandHelper;
use Exporter;

require Exporter;
@ISA = qw (Exporter);
@EXPORT = qw(Run ComposeCommand1 ReplaceCommand2String setGIDToReplacePassword);

sub new
{
    my $class = shift;
    my $this = {};
    $this->{'m_gids'} = shift;      # gid(s) of the target NE
                                    # if only one target NE, this is the NE's gid;
                                    # if more than one target NE, this is the NE's gid, separated by ' '
                                    #     (e.g., "gid1 gid2 gid3"
    $this->{'m_command1'} = "";     # phase one command line string 
    $this->{'m_command2'} = "";     # phase two command line string
    $this->{'m_gidToReplace'} = ""; # gid used to replace user/pswd in command2 string
    $this->{'m_btstype'} = "LNBTS";

##print "$class, m_gids=$this->{'m_gids'}\n";

    bless($this, $class);

    my @gid_arr = split(/ /, $this->{'m_gids'});
    $this->{'m_gid'} = \@gid_arr;

    # by default, use self's gid to get password
    $this->setGIDToReplacePassword($gid_arr[0]);

    return $this;
}                       


# main method to execute the commamd
sub Run
{
    my ($this) = @_;

##print "lteEMCommandBase, $this, Run, enter.\n";

    $this->ComposeCommand1();
##print "\ncomamnd1=$this->{'m_command1'}\n";
    my $output = $this->RunCommand($this->{'m_command1'});
    #  command is executed and get such kind of command:
    #    emiicamx.pl -server $appserv                         # commandline prefix (4 lines)
    #                -domain $domain                          
    #                -hres \"1024\" 
    #                -vres \"768\" 
    #                -user applau -passwd <HIDDEN>            # from here to end is the command template
    #                -app \"c:/opt/Nokia/ALClient_2/em.bat    #  we wrote in xxxemi/SCNAME-SSNAME.emi
    #                -pw Nemuadmin:<HIDDEN> 
    #                -ne MEDIATOR_RNC_IP 
    #                -re \\\"RNC RNW Object Browser\\\" 
    #                -fe unblock 
    #                -moid \\\"MOID\\\" \" 
    #                -execdir c:/opt/Nokia/ALClient_2
    #
    # CAUTION! 
    #
    # in the command prefix, there is '$appserv' and '$domain'
    # in perl context, it's variable and these two var will be replaced immediatily when
    # we use var $output
    # So, we must define a var named $appserv and $domain,
    # and give them the right value, before we use $output
    #                                ~~~~~~~~~~~~~~~~~~~~~
    # CAUTION 2! 
    #    Normally, thie $output should as the following:
    #    (in single line; we split it in mulit lines just for easier read.)
    #    --------------------------------------------------------------------
    #    This command line will be executed:
    #    [ emiicamx.pl -server mult.itlab71.netact.noklab.net  
    #                  -domain itlab71 
    #                  -user applau -passwd <HIDDEN> 
    #                  -app "c:\Apps\Nokia\NokiaOSS\SiteManager\BTSSiteManager.bat 
    #                  -reset -ne 12.32.12.34 
    #                  -pw Nemuadmin:<HIDDEN> 
    #                  -resetCoverage site " 
    #                  -hres "1024" -vres "768"  
    #                  -execdir c:/Apps/Nokia/NokiaOSS/SiteManager]
    #    If you add debug print msg to /opt/nokia/oss/bin/emilaumx.pl,
    #    --------------------------------------------------------------------
    #    THE MSG WILL BE CAUGHT INTO $output!!! , and thus cause ComposeCommand2 parse failed.

    #my $domain  = lteEMCommandHelper::getDomain;
    #my $appserv = lteEMCommandHelper::getAppServer;
##print "\ncmd1output=$output\n";
    $this->ComposeCommand2($output);  # $appserv and $domain will be replaced here
    $this->ReplaceCommand2String();
##print "\ncomamnd2=$this->{'m_command2'}\n";
#    $this->{'m_command2'} = "$this->{'m_command2'}".'&'; # the same as pronto NA04690853
                                                         # adding '&' to let the process backgournd-running
                                                         # so that end user will not see BTS user/password.
##print "\ncomamnd2=$this->{'m_command2'}\n";
    $this->RunCommand($this->{'m_command2'});
}

# derived class SHOULD override this method
sub ComposeCommand1
{
    my ($this) = @_;

    print "This method do nothing in base calss,\n";
    print "    derived calss should override this method.\n";
}

# normally, derived class no need to override this method
sub ComposeCommand2
{
    my ($this, $output_of_command1) = @_;
#print "output_of_command1={". $output_of_command1 ."}";
    ($this->{'m_command2'}) = $output_of_command1 =~ /\[(.+)\]/;
#print "m_command2=[$this->{'m_command2'}]\n\n";
    $this->ReplaceW2KPassword();
    $this->ReplaceNWI3Password();

    $this->{'m_command2'} = "$this->{'m_command2'} >/dev/null 2>&1";
    $this->{'m_command2'}=~ s/-hres \"1024\" -vres \"768\"/-defaults/g;

    # TODO: comment out this debug message
##print "$this, ComposeCommand2, cmd2=[$this->{'m_command2'}]\n";
}

# derived class SHOULD override this method
sub ReplaceCommand2String
{
    # TODO: comment out this debug message

    print "This method do nothing in base calss,\n";
    print "    derived calss should override this method.\n";
}

# normally, derived class no need to override this method
sub RunCommand
{
    my ($this, $cmd) = @_;
#print "$this, RunCommand, cmd=[$cmd]\n";
    my $output = `$cmd`;
##print 'the return value of running the command:$?='."$?\n";
    return $output;
}

# normally, derived class just need to call this method,
#   not need to override this method
sub setGIDToReplacePassword
{
    my ($this, $gid) = @_;
    die "setGIDToReplacePassword should take 1 param <gid>" unless defined($gid);
    $this->{'m_gidToReplace'} = $gid;
}

sub ReplaceW2KPassword
{
    my ($this) = @_;
    my $service = "PROGRAMMATIC_PC_ACCESS";
    my $gid = $this->{'m_gidToReplace'};
    my ($w2k_user, $w2k_pwd) = $this->_ReplacePswdByServiceAndGID($service, $gid);
    die "get w2k user failed." unless defined($w2k_user);
    die "get w2k pswd failed." unless defined($w2k_pwd);
    if( defined($this->{'m_command2'}) and ($this->{'m_command2'} ne "") )
    {
        $this->{'m_command2'} =~ s/user (\S+)/user $w2k_user/;
        $this->{'m_command2'} =~ s/passwd (\S+)/passwd $w2k_pwd/;
    }
}

sub ReplaceNWI3Password
{
    my ($this) = @_;
    my $service = "NWI3_ACCESS";
    my $gid = $this->{'m_gidToReplace'};
    my ($nwi3_user, $nwi3_pwd) = $this->_ReplacePswdByServiceAndGID($service, $gid);

    die "get nwi3 user failed." unless defined($nwi3_user);
    die "get nwi3 pswd failed." unless defined($nwi3_pwd);

    if (defined($this->{'m_command2'}) and $this->{'m_command2'} ne "") 
    {
        $this->{'m_command2'} =~s/pw (\S+)/pw $nwi3_user:$nwi3_pwd/;
    }
}

sub _ReplacePswdByServiceAndGID
{
    my ($this,$service,$gid) = @_;
    
    my ($user, $pswd);
    my $cmd_output = `emiuacmx -service $service -gid $gid -opid $service.Query`;
    if ( $cmd_output =~ /(.*)\:(.*)\;/ )
    {
        $user = $1;
        $pswd = $2;
    }
#print "_ReplacePswdByServiceAndGID, user=[$user], pswd=[$pswd]\n";
# _ReplacePswdByServiceAndGID, user=[applau], pswd=[000a898a6f8a739b619b2398]
# _ReplacePswdByServiceAndGID, user=[Nemuadmin], pswd=[nemuuser]

    return ($user, $pswd);
}

sub CalcMOIDs
{
##print "enter CalcMOIDs\n";
    my ($this) = @_;

    my $moid;
    my @gid_arr = @{$this->{'m_gid'}};
    my $gid_num = @gid_arr;
##print "gid_num=$gid_num\n\n";
    for(my $i = 0; $i < $gid_num; ++ $i)
    {
##print "gid_arr[$i]=$gid_arr[$i]\n";
        my $tmp = lteEMCommandHelper::GetMOID($gid_arr[$i]);
        $tmp =~ s/DN:.*LNCEL-//g;
        if ( $moid eq "" )
        {
            $moid = $tmp;
        }
        else
        {
             $moid .= ",$tmp";
        }
    }
    chomp($moid);
    $moid = lteEMCommandHelper::RemoveInvalidCellId($moid);
##print "$this, CalcMOIDs, moid=[$moid]\n";
    
    if ( $moid eq "" )
    {
        # error
        my $warnMsg = "LNCEL DN invalid. The operation will not be executed.)";
        lteEMCommandHelper::CreateDialog("ERROR...", $warnMsg, 1);
        exit(-1);
    }

    return $moid;
}

1;    # perl class/package must be end with with the required '1;'
