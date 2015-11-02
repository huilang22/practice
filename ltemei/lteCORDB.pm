#!/opt/nokia/oss/perl/bin/perl -w

package lteCORDB;

push (@INC, '/opt/nokia/oss/bin/');
use Exporter;
@ISA = qw (Exporter);
@EXPORT = qw(FetchData);

use lteCORLog;
use warnings;
use emicom;
use DBI;
no warnings qw(redefine);

sub new
{
    my $class = shift;
    my $this = {};
    $this->{'sql'} = shift;
    $this->{'data'} = [];
    bless($this, $class);
    return $this;
}

sub FetchData
{
    my ($this) = @_;
    my $alarm_data = $this->getdata($this->{'sql'});
    my $index = 0;
    foreach my $child (@$alarm_data)
    {
        my @child_data = @$child;
        # $this->{'data'}[$index]{'alarm_num'} = $child_data[0];
        # $this->{'data'}[$index]{'dn'} =  $child_data[1];
        #####
        # the member stored in array element should be hash ref, NOT hash!
        my %tmp = ();
        $tmp{'alarm_num'} = $child_data[0];
        $tmp{'dn'} =  $child_data[1];
        $this->{'data'}[$index] = \%tmp;

        $index++;
    }
    return $this->{'data'};
}

sub getdata
{
    my($this, $sqlStr) = @_;
    my $dbconnect = "dbi:Oracle:";
    my $user      = "omc";
    my $password  = emicom::getDBPassword();

    if( $password eq "" )
    {
        lteCORLog::WriteLog("Get Database Password failed.\n");
        exit 1;
    }
    my $dbh = DBI->connect($dbconnect,$user,$password);
    unless( $dbh )
    {
        lteCORLog::WriteLog("Connect to Database failed(1).\n");
        exit 1;
    }

    my $sth = $dbh->prepare($sqlStr);
    unless( $sth )
    {
        lteCORLog::WriteLog("Connect to Database failed(2).\n");
        exit 1;
    }

    unless($sth->execute)
    {
        lteCORLog::WriteLog("Connect to Database failed(3).\n");
        exit 1;
    }

    my @data;
    my $index=0;
    while(my @child = $sth->fetchrow_array){
        $data[$index]=[@child];
        $index += 1;
    }
    $sth->finish();
    $dbh->disconnect();
# return the data reference
    return \@data;
}

1;

