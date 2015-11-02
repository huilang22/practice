#!/opt/nokia/oss/perl/bin/perl -w

package lteCORBlocklist;

push (@INC, '/opt/nokia/oss/bin/');
use Exporter;

require Exporter;
@ISA = qw (Exporter);
@EXPORT = qw(Initialize IsBlockedLNBTS);

use warnings;
no warnings qw(redefine);
use lteCORLog;

sub new
{
    my $class = shift;
    my $this = {};
    $this->{'blocklist_file'} = shift;
    $this->{'blocked_lnbts'} = {};
    $this->{'init_done'} = 0;
    bless($this, $class);
    return $this;
}

sub Initialize
{
    my ($this) = @_;
    if(open(FH, "<", $this->{'blocklist_file'}))
    {
        my $i = 0;
        while(<FH>)
        {
            $i++;
            my $line=$_;
            chomp($line);
            $line =~ s/#.*//;
            if ( length($line) > 0 )
            {
                if ( $line =~ m/^LNBTS-\d+$/ )
                {
                    $this->{'blocked_lnbts'}{$line} = 1;
                }
                else
                {
                    lteCORLog::WriteLog( "invalid line find in BLOCKLIST file:\n"
                                        ."\tline:$i,content[$line]");
                }
            }
        }
        close FH;

        return 1;
    }
    else
    {
        lteCORLog::WriteLog( "open BLOCKLIST file[$this->{'blocklist_file'}] failed, the BLOCKLIST functionality will be disabled for this running.\n");
    }

    return 0;
}

sub IsBlockedLNBTS
{
    my ($this,$lnbts) = @_;

    if (!$this->{'init_done'})
    {
        $this->Initialize();
    }

    return exists($this->{'blocked_lnbts'}{$lnbts});
}


1; # perl class/package must be end with with the required '1;'
