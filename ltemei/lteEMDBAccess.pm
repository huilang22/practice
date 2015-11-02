#!/opt/nokia/oss/perl/bin/perl -w
package lteEMDBAccess;
push (@INC, '/opt/nokia/oss/bin/');
use emicom;
use DBI;
use lteEMGUI;
require Exporter;
@ISA = qw (Exporter);

sub new
{
    my $class = shift;
    my $this = {};
    bless($this, $class);
    return $this;
}

sub sql{
  my($this, $sqlStr) = @_;
  my $dbconnect = "dbi:Oracle:";
  my $user      = "omc";
  my $password  = emicom::getDBPassword() ;

  if( $password eq "" )
  {
    CreateDialog("ERROR...", "Get Database Password failed. please check lab Environment.", 1);
    exit(-1);
  }

  my $dbh = DBI->connect($dbconnect,$user,$password);

  unless( $dbh )
  {
    CreateDialog("ERROR...", "Connect to Database failed(1). please check lab Environment.", 1);
    exit(-1);
  }

  my $sth = $dbh->prepare($sqlStr);

  unless( $sth )
  {
    CreateDialog("ERROR...", "Connect to Database failed(2). please check lab Environment.", 1);
    exit(-1);
  }

  unless($sth->execute)
  {
    CreateDialog("ERROR...", "Connect to Database failed(3). please check lab Environment.", 1);
    exit(-1);
  }
  my @data;
  my $index=0;
  while(my @child  = $sth->fetchrow_array){
   #  push(@data, [@child]);
      $data[$index]=[@child];
#     $this->printArray($data[$index]);
     $index += 1;
  }
  $sth->finish();
  $dbh->disconnect();
  return @data;

}

sub CreateDialog{
    my($title, $content, $state) = @_;
    my $gui = lteEMGUI->new();
    lteEMGUI->showDialog($title,$content,$state);

}
1;
