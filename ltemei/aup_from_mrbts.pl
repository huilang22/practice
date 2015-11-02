#!/opt/nokia/oss/perl/bin/perl -w

use emicom;
#TODO: use strict;

#****************************************************
# Get the  parent intid from the passed int id using
# existing emicom functions.
#****************************************************
use vars qw($PROCESSID);

$PROCESSID = "AA51"; 

my ($gid,$system_id) = emicom::intidtogid($ARGV[0]);

my $pgid;
emicom::getparentgid($gid, \$pgid);
my $pintid;
emicom::gidtointid ($pgid,\$pintid);

#****************************************************

$cmd = "aduinimx.sh -uploadType CNTRL $pintid";
`$cmd`;

