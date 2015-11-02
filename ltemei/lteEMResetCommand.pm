#!/opt/nokia/oss/perl/bin/perl -w

package lteEMResetCommand;

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
##print "$class, m_gids=$this->{'m_gids'}\n";

    bless($this, $class);
    return $this;
}

# derived class SHOULD override this method
sub ComposeCommand1
{
    my ($this) = @_;

    # for reset, m_gids only contains one gid. so, we can directly use it as a gid.
    my $intid;
    emicom::gidtointid ($this->{'m_gid'}[0],\$intid);
    
    $this->{'m_command1'} = "emilaumx.sh -context RESET_START -noexecute -intid $intid";

    # TODO: comment out this debug message
##print "$this, ComposeCommand1, cmd1=[$this->{'m_command1'}]\n";
}

sub ReplaceCommand2String
{
    my ($this) = @_;
    # for bts reset, no extra string need to be replaced. So, do nothing extra.
    # TODO: comment out this debug message
##print "$this, ReplaceCommand2String, cmd2=[$this->{'m_command2'}]\n";
# something like this:
# emiicamx.pl -server mult.itlab71.netact.noklab.net  -domain itlab71 -user applau -passwd 000add9e2f9e338f218f638c -app "c:\Apps\Nokia\NokiaOSS\SiteManager\BTSSiteManager.bat -reset -ne 12.32.12.34 -pw Nemuadmin:nemuuser -resetCoverage site " -defaults  -execdir c:/Apps/Nokia/NokiaOSS/SiteManager >/dev/null 2>&1
}

1;  # perl class/package must be end with with the required '1;'
