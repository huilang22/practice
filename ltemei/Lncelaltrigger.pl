#!/opt/nokia/oss/perl/bin/perl


use emicom;

# assign the werlog process id! , to fix PR: 43227ESPE03
$main::PROCESSID = "AA51";

sub main()
{
  my $intid;
  if($#ARGV >= 0)
  {
    $intid = $ARGV[0];
  }
  else
  {
    return;
  }
  
  my ($gid,$system_id) = emicom::intidtogid($intid);
  my ($LNBTS_gid, $LNBTS_intid);
  emicom::getparentgid($gid, \$LNBTS_gid);
  emicom::gidtointid ($LNBTS_gid,\$LNBTS_intid);

  chomp($LNBTS_intid);
  system("aduinimx -uploadType CNTRL " . $LNBTS_intid);
  return;
}

main();

