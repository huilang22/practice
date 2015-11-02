#!/opt/nokia/oss/perl/bin/perl -w

package lteEMCommandHandler;

push (@INC, '/opt/nokia/oss/bin/');
use lteEMResetCommand;
use lteEMBlockCommand;
use lteEMUnblockCommand;
use lteEMCellresetCommand;

sub new
{
    my $class = shift;
    my $this = {};
    $this->{'m_cmdtype'} = shift;
    $this->{'m_gids'} = shift;

##print "$class, m_cmdtype=$this->{'m_cmdtype'}, gids=$this->{'m_gids'}\n";

    bless($this, $class);
    return $this;
}

sub InvokeCommand
{
    my $this = shift;
    my $cmd;

    my %hash;
    my @gid_arr = split(/ /, $this->{'m_gids'});
    my $gid_num = @gid_arr;
##print 'gid_num='.$gid_num."\n";
    my $gid;
    for(my $i = 0; $i < $gid_num; ++ $i)
    {
        $gid = $gid_arr[$i];
        my $moid = lteEMCommandHelper::GetMOID($gid);
        if ( $moid =~ /LNCEL/ )
        {
            my $pgid;
            emicom::getparentgid($gid, \$pgid);
            $gid = $pgid;
        }

        my $ipaddr = "";
        &emicom::gettcpipaddress($gid, \$ipaddr);
##print 'ip of gid='.$gid.' is:'.$ipaddr."\n";
     
        if(defined($hash{$ipaddr}))
        {
            $hash{$ipaddr} = $hash{$ipaddr} . " " . $gid_arr[$i];
        }
        else
        {
            $hash{$ipaddr} = $gid_arr[$i];
        }
    }

    foreach my $gids(keys %hash)
    {
##print $gids."\n";
        if ( $this->{'m_cmdtype'} eq "reset" )
        {
##print "is reset command.\n";
            $cmd = lteEMResetCommand->new($hash{$gids});
            $cmd->Run();
        }
        elsif ( $this->{'m_cmdtype'} eq "cellreset" )
        {
##print "is cellreset command.\n";
            $cmd = lteEMCellresetCommand->new($hash{$gids});
            $cmd->Run();
        }
        elsif ( $this->{'m_cmdtype'} eq "block" )
        {
##print "is block command.\n";
            $cmd = lteEMBlockCommand->new($hash{$gids});
            $cmd->Run();
        }
        elsif ( $this->{'m_cmdtype'} eq "unblock" )
        {
##print "is unblock command.\n";
            $cmd = lteEMUnblockCommand->new($hash{$gids});
            $cmd->Run();
        }
        else
        {
            print "UnKnown command type=".$this->{'m_cmdtype'};
        }
    }
}

1;  # perl class/package must be end with with the required '1;'

