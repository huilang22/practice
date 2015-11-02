#!/opt/nokia/oss/perl/bin/perl -w

package lteEMUnblockCommand;

push (@INC, '/opt/nokia/oss/bin/');

use warnings;
no warnings qw(redefine);

use lteEMCommandHelper;
use lteEMBlockCommand;

@ISA = ('lteEMBlockCommand');

sub new
{
    my $class = shift;
    my $gids = shift;
    my $this = lteEMBlockCommand->new($gids); ## derived from lteEMBlockCommand

    $this->{'action'} = 'UNBLOCK_START'; # the only difference

    bless($this, $class);
    return $this;
}

1;  # perl class/package must be end with with the required '1;'
