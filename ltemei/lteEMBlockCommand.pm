#!/opt/nokia/oss/perl/bin/perl -w

package lteEMBlockCommand;

push (@INC, '/opt/nokia/oss/bin/');

use warnings;
no warnings qw(redefine);

use lteEMCommandHelper;
use Exporter;
use lteEMCommandBase;

@ISA = ('lteEMCommandBase');

sub new
{
    my $class = shift;
    my $gids = shift;
    my $this = lteEMCommandBase->new($gids); ## derived from lteEMCommandBase

    bless($this, $class);
    $this->Initialize();
    return $this;
}

sub Initialize
{
    my ($this) = @_;

    $this->{'action'} = 'BLOCK_START';

    my $gid = $this->{'m_gid'}[0];
    my $moid = lteEMCommandHelper::GetMOID($gid);
    $this->{'moid'} = $moid;

    if ( $moid =~ /LNCEL/ )
    {
        $this->{'operation_on_cell'} = 1;
##print "operation_on_cell\n";
        my $pgid;
        emicom::getparentgid($gid, \$pgid);
        $this->{'parent_gid'} = $pgid;
    	$this->setGIDToReplacePassword($this->{'parent_gid'});
    }
    else
    {
##print "operation_on_lnbts\n";
        $this->{'operation_on_cell'} = 0;
    }
}

# derived class SHOULD override this method
sub ComposeCommand1
{
    my ($this) = @_;

    my $intid;
    if ( $this->{'operation_on_cell'} == 1 )
    {
        # if user invoke command on lncel, use it's parent's intid to 
        # compose the command.
        emicom::gidtointid ($this->{'parent_gid'},\$intid);
##print "parent intid=$intid\n";
    }
    else
    {
        # if user invoke command on lnbts, use itself's intid to 
        # compose the command.
        my $gid = $this->{'m_gid'}[0];
##print "self gid=$gid\n";
        emicom::gidtointid ($gid,\$intid);
##print "self intid=$intid\n";
    }
    $this->{'m_command1'} = "emilaumx.sh -context ".$this->{'action'}." -noexecute -intid $intid";

    # TODO: comment out this debug message
    #print "$this, ComposeCommand1, cmd1=[$this->{'m_command1'}]\n";
}

sub ReplaceCommand2String
{
    my ($this) = @_;

    my $moid = $this->CalcMOIDs();

    # when reset lncel1 and lncel2:
    # before replace:
    #    DN:NE-LNBTS-1/LNCEL-1,DN:NE-LNBTS-1/LNCEL-2
    # after replace:
    #    1,2
    $moid =~ s/DN:[^,]*LNCEL-//g;

    # in .emi, we use MOID as the token to be replaced.
    # do the replacement here
    $this->{'m_command2'} =~ s/CELLID/$moid/;

    # TODO: comment out this debug message
    #print "$this, ReplaceCommand2String, cmd2=$this->{'m_command2'}"; 
#something like this:
#emiicamx.pl -server mult.itlab71.netact.noklab.net  -domain itlab71 -user applau -passwd 000a40022e02321320136210 -app "c:\Apps\Nokia\NokiaOSS\SiteManager\BTSSiteManager.bat -blockCell -ne 12.32.12.34 -cellid 1,2 -priority normal -pw Nemuadmin:nemuuser " -defaults  -execdir c:/Apps/Nokia/NokiaOSS/SiteManager >/dev/null 2>&1
}

sub CalcMOIDs
{
##print "enter CalcMOIDs\n";
    my ($this) = @_;

    my $moid = "";
    my @gid_arr = @{$this->{'m_gid'}};
    my $gid_num = @gid_arr;
##print "gid_num=$gid_num\n\n";

    if ( $this->{'operation_on_cell'} == 1 )
    {
        for(my $i = 0; $i < $gid_num; ++ $i)
        {
##print "gid_arr[$i]=$gid_arr[$i]\n";
            my $tmp = lteEMCommandHelper::GetMOID($gid_arr[$i]);
    
            $tmp =~ s/DN:[^,]*LNCEL-//g;
            if ( $moid eq "" )
            {
                $moid = $tmp;
            }
            else
            {
                $moid .= ",$tmp";
            }
        }
    }
    else
    {
        $moid = lteEMCommandHelper::GetLNCELMOID(@gid_arr);
        $moid =~ s/DN:[^,]*LNCEL-//g;
    }
    chomp($moid);
    $moid = lteEMCommandHelper::RemoveInvalidCellId($moid);
##print "$this, CalcMOIDs, moid=[$moid]\n";
    
    if ( $moid eq "" )
    {
        # error
        my $warnMsg = "No valid LNCEL DN found under the chosen LNBTS. The operation will not be executed.";

        if ( $this->{'operation_on_cell'} == 1 )
        {
            $warnMsg = "LNCEL DN invalid. The operation will not be executed.";
        }

        lteEMCommandHelper::CreateDialog("ERROR...", $warnMsg, 1);
        exit(-1);
    }

    return $moid;
}
1;  # perl class/package must be end with with the required '1;'
