#!/opt/nokia/oss/perl/bin/perl -w

package lteEMCellresetCommand;

push (@INC, '/opt/nokia/oss/bin/');

use warnings;
no warnings qw(redefine);

use lteEMCommandHelper;
use lteEMCommandBase;

@ISA = ('lteEMCommandBase');

sub new
{
    my $class = shift;
    my $gids = shift;
    my $this = lteEMCommandBase->new($gids); ## derived from lteEMCommandBase
##print "$class, m_gids=$this->{'m_gids'}\n";

    bless($this, $class);
    $this->Initialize();
    return $this;
}

sub Initialize
{
    my ($this) = @_;

    my $gid = $this->{'m_gid'}[0];
##print "gid=$gid\n\n";
    my $pgid;
    emicom::getparentgid($gid, \$pgid);
    $this->{'parent_gid'} = $pgid;

    # for lncel, should use parent(lnbts)'s gid to replace passwords
    $this->setGIDToReplacePassword($this->{'parent_gid'});
}

# for cell-reset, pass the intid of it's parent to emilaumx.sh
sub ComposeCommand1
{
    my ($this) = @_;

    my $intid;
    # because in .emi file, the rule is:
    #    -context "CELLRESET_START" -emplatform "WIN32" -neclass "LNBTS" \
    # so, at here , we should use parent(lnbts)'s gid,
    emicom::gidtointid ($this->{'parent_gid'}, \$intid);
    $this->{'m_command1'} = "emilaumx.sh -context CELLRESET_START -noexecute -intid $intid";

    # TODO: comment out this debug message
    #print "$this, ComposeCommand1, cmd1=[$this->{'m_command1'}]\n";
}

sub ReplaceCommand2String
{
    my ($this) = @_;

    my $moid = $this->CalcMOIDs();

    # do the replacement here
    $this->{'m_command2'} =~ s/CELLID/$moid/;

    # TODO: comment out this debug message
    #print "\n$this, ReplaceCommand2String, cmd2=[$this->{'m_command2'}]";
# something like this:
# emiicamx.pl -server mult.itlab71.netact.noklab.net  -domain itlab71 -user applau -passwd 000a01026f02731361132310 -app "c:\Apps\Nokia\NokiaOSS\SiteManager\BTSSiteManager.bat -resetCell -ne 12.32.12.34 -cellid 1,2 -priority normal -pw Nemuadmin:nemuuser " -defaults  -execdir c:/Apps/Nokia/NokiaOSS/SiteManager >/dev/null 2>&1
}

1;  # perl class/package must be end with with the required '1;'
