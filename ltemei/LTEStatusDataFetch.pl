#!/opt/nokia/oss/perl/bin/perl

push (@INC, '/opt/nokia/oss/bin/');


use emicom;
use DBI;
use Tk;
use Tk::Widget;
use Net::DNS;

if (scalar(@ARGV) < 3 )
{
    die  "Usage: $0 -t mr <lnbts_gid_1> <lnbts_gid_2> ...\n"
        ."or     $0 -t mrname <lnbts_gid_1> <lnbts_gid_2> ...\n"
        ."or     $0 -t lnbts <lnbts_gid_1> <lnbts_gid_2> ...\n"
        ."or     $0 -t launchAM <gid> ...\n";
}

my $launch_alarm_monitor = 0;
if ($ARGV[1] eq "launchAM")
{
    $launch_alarm_monitor = 1;
}


my $show_mr = 0;
if ($ARGV[1] eq "mr")
{
#print "show mr.\n";
    $show_mr = 1;
}

my $get_mrname = 0;
if ($ARGV[1] eq "mrname")
{
#print "get mr name.\n";
    $get_mrname = 1;
}

my @gid_arr;
for(my $i=2; $i < scalar(@ARGV); ++$i)
{
    $gid_arr[$i-2] = $ARGV[$i];
}

sub ExecSQL{
  my($sqlStr) = @_;
#print "to exec:$sqlStr\n";
  my $dbconnect = "dbi:Oracle:";
  my $user      = "omc";
  my $password  = emicom::getDBPassword() ;

  if( $password eq "" )
  {
    die "ErRor: getDBPassword\n"; 
  }

  my $dbh = DBI->connect($dbconnect,$user,$password);

  unless( $dbh )
  {
    die "ErRor: connect failed.\n"; 
  }

  my $sth = $dbh->prepare($sqlStr);

  unless( $sth )
  {
    die "ErRor: execute sql failed (1)\n"; 
  }

  unless($sth->execute)
  {
    die "ErRor: execute sql failed(2)\n"; 
  }
  my @data;
  my $index=0;
  #while(my @child = $sth->fetchrow_array){
  while(my $child = $sth->fetchrow_arrayref){
    $data[$index]=[@{$child}];
    $index += 1;
  }
  $sth->finish();
  $dbh->disconnect();
  return \@data;
}

my %alarm_summary_hash;
my %gid_dn_map;

# 2011.03.23(also adding alarm summary for LNBTS)
sub AppendAlarmSummary
{ 
  my ($hash_ref) = @_;
  //从取出的总结果里面，遍历每一个，判断ＭＲＢＴＳ上的alarm汇总，
  　按照ＭＲＢＴＳ为ｋｅｙ 取出 alrm,
  while (($gid, $item_hash_ref) = each %$hash_ref)
  {
    if ( $item_hash_ref->{'dn'} =~ m/(.*)\/LNBTS-\d+$/ )
    {
      my $mrbts_dn = $1;
      if (exists($alarm_summary_hash{$mrbts_dn}))
      {
        my $as_item_hashref;
        $as_item_hashref = $alarm_summary_hash{$mrbts_dn};
        if ( exists($as_item_hashref->{'a_1'}) )
        {
          $item_hash_ref->{'a_1'} = $as_item_hashref->{'a_1'};
        }
        if ( exists($as_item_hashref->{'a_2'}) )
        {
          $item_hash_ref->{'a_2'} = $as_item_hashref->{'a_2'};
        }
        if ( exists($as_item_hashref->{'a_3'}) )
        {
          $item_hash_ref->{'a_3'} = $as_item_hashref->{'a_3'};
        }
      }
      $hash_ref->{$gid} = $item_hash_ref;
    }
  }
}

################################################################
#
# fetch Conn Status according to whether MRBTS has active 71058 alarm
# if has -- conn is NOK
#    no  -- conn is OK
#
################################################################
sub AppendConnStatus
{
  my ($gids, $show_mr, $hash_ref) = @_;
  my $sql;
  if($show_mr == 1)
  {
     $sql = "SELECT CO_DN, CO_OCV_SYS_VERSION" #CO_OCV_SYS_VERSION: NE version such as LN3.0
           ." FROM N3T_NWI3_MO left outer join FX_ALARM on(CO_GID=NE_GID)"
           ." WHERE (CO_OC_ID = 3128) "
                    ."AND CO_STATE != 9 "#CO_STATE=9: To be deleted. Entries are not shown in the TLUI object view.
                    ."AND ( (ALARM_NUMBER=71058) AND (ALARM_STATUS=1) )"#ALARM_STATUS=1: The alarm is active.
                    ."AND ( CO_GID IN ( SELECT CO_PARENT_GID "
                                       ."FROM utp_common_objects "
                                       ."WHERE CO_MR_GID IN (SELECT CO_MR_GID from utp_common_objects where CO_GID IN ($gids))))";
  }
  else
  {
    my $one_gid = $gids;
    $one_gid =~ s/,.*//;
    if ( $hash_ref->{$one_gid}->{'dn'} =~ m/LNCEL/ ) ## for LNCEL
    {
      $sql = "SELECT CO_DN, CO_OCV_SYS_VERSION"
            ." FROM N3T_NWI3_MO left outer join FX_ALARM on(CO_GID=NE_GID) "
            ." WHERE  (CO_OC_ID = 3128) "
                     ."AND CO_STATE != 9 "
                     ."AND ( (ALARM_NUMBER=71058) AND (ALARM_STATUS=1) ) "
                     ."AND ( CO_GID IN ( SELECT CO_PARENT_GID FROM utp_common_objects "
                                        ."WHERE CO_GID IN ( SELECT CO_PARENT_GID FROM utp_common_objects "
                                                          ."WHERE CO_GID IN ($gids))))";
    }
    else ## for LNBTS
    {
      $sql = "SELECT CO_DN, CO_OCV_SYS_VERSION"
                ." FROM N3T_NWI3_MO left outer join FX_ALARM on(CO_GID=NE_GID) "
                ." WHERE  (CO_OC_ID = 3128) "
                         ."AND CO_STATE != 9 "
                         ."AND ( (ALARM_NUMBER=71058) AND (ALARM_STATUS=1) ) "
                         ."AND ( CO_GID IN (SELECT CO_PARENT_GID FROM utp_common_objects WHERE CO_GID IN ($gids)) )";
    }
  }
#print "$sql\n";
  my $data_ref = ExecSQL($sql);

  # fill result according the DN  MRBTS-1 ==> fill LNBTS-1 and LNBTS-1/LCECL-xxx
  #
  # and also fill lncell version, if the cell has no version.
  #
  foreach $child (@$data_ref)
  {
    my @one = @$child;
#print "alarm: @one\n";
    if ( exists($gid_dn_map{$one[0]}) )
    {
      my $arr_ref = $gid_dn_map{$one[0]};
      foreach my $gid (@$arr_ref)
      {
        if( exists($hash_ref->{$gid}) )
        {
          $hash_ref->{$gid}->{'cs'} = "true";
           
          # fill the lncel version
          if ( defined($one[1]) and (length($one[1]) > 0) and ($hash_ref->{$gid}->{'dn'} =~ m/LNCEL/) )
          {
            $hash_ref->{$gid}->{'ver'} = $one[1];
          }
        }
      }
    }
  }
  ## the above loop only can append version for the MRBTS's children LNCEL, in which MRBTS itself has 71058
  # so, need also adding version for those donot has 71058.
  foreach my $mrbts_dn (keys %gid_dn_map)
  {
      my $arr_ref = $gid_dn_map{$mrbts_dn};
      my $lnbts_ver = "";
      foreach my $gid (@$arr_ref)
      {
          if ( ($lnbts_ver eq "") and ($hash_ref->{$gid}->{'dn'} =~ m/(.*)\/LNBTS-\d+$/) )
          {
              $lnbts_ver = $hash_ref->{$gid}->{'ver'};
              last;
          }
      }
      foreach my $gid (@$arr_ref)
      {
          if ( (length($hash_ref->{$gid}->{'ver'})==0) and ($hash_ref->{$gid}->{'dn'} =~ m/LNCEL/) )
          {
              $hash_ref->{$gid}->{'ver'} = $lnbts_ver;
          }
      }
  }
}
################################################################
##
## Get parent_gid of one LNCEL, so LNCEL and LNBTS can show same
## INFO in status display report
## input :GID of LNCEL
## output:GID of LNBTS
#################################################################
sub get_lncel_parent_gid
{
    my ($gids) = @_;
    my $sql = "SELECT co_dn,co_parent_gid FROM utp_common_objects WHERE ( CO_GID IN ($gids) AND (CO_OC_ID=3130))";
    #my $ltedb_access_tmp = lteEMDBAccess->new();
    my $data_ref_lncel =  ExecSQL($sql);
    foreach $child (@$data_ref_lncel)
    {
        my @child_moid = @$child;
        my $DN = $child_moid[0];
        if ($DN =~ m/LNCEL/)
        {
            if ($child_moid[1] ne "NULL")
            {
                $gids = $child_moid[1];
            }
        }
    }
    return $gids;
}

sub findDNfromDB{
  my ($gids, $show_mr, $hash_ref) = @_;
  $gids = get_lncel_parent_gid($gids);
#print "findDNfromDB:$gids, $show_mr, $hash_ref\n";
  my @need_fields = ('CO_DN',
                     'CO_OCV_SYS_VERSION',
                     'CO_NAME',
                     'CO_MAIN_HOST',
                     'CO_GID',
                     'CO_ADMIN_STATE',
                     'CO_USER_DEF_ID',   # CM store "operational status" in this field
                     'CO_OC_ID',
                     'ALARM_STATUS',
                     'SEVERITY',
                     'CO_STATE',
                     'N3_SYSTEM_ID',       
                     'count(SEVERITY)'
                     );

  my $select_str = join(',', @need_fields);
  pop(@need_fields);
  my $groupby_str = join(',', @need_fields);
	#CO_OC_ID: 3128 - MRBTS, 3129 - LNBTS, 3130 - LNCEL, 1793 - FTM, 2347 - OMS
  my $sql = "SELECT $select_str
                 FROM N3T_NWI3_MO left outer join FX_ALARM on (CO_GID=NE_GID)
                 WHERE ((CO_OC_ID in (3128,3129,3130,1793))
                        AND ( CO_STATE != 9)
                        AND ( (CO_GID IN ($gids))
                              OR (CO_PARENT_GID IN ($gids))
                              OR (CO_GID IN ( select CO_PARENT_GID From N3T_NWI3_MO where ((CO_GID IN ($gids)) AND (CO_OC_ID=3129))))
                            )
                        OR ( CO_OC_ID = 2347 and co_mf_gid in (select unique co_mf_gid from N3T_NWI3_MO where co_gid in ($gids)))
                       )
                 GROUP BY $groupby_str";
   ############################################################################################################################
   #added for check the oms unknown status by alarm 9047
   ############################################################################################################################
   my $getoms_unknown_sql = "select N3_SYSTEM_ID,CO_DN,co_GID,alarm_number
                             FROM N3T_NWI3_MO left outer join FX_ALARM  on (CO_GID=NE_GID)
                             where  CO_STATE != 9 
                                   AND ( ( ALARM_NUMBER=71058 or alarm_number = 9047) AND (ALARM_STATUS=1) )
                                   AND (CO_OC_ID = 2347 or CO_OC_ID =3128) 
                                   and co_mf_gid in (select unique co_mf_gid from N3T_NWI3_MO where co_gid in ($gids))
                             group by N3_SYSTEM_ID,CO_DN,co_GID,alarm_number";
  if($show_mr == 1)
  {
    $sql = "SELECT $select_str FROM N3T_NWI3_MO left outer join  FX_ALARM on (CO_GID=NE_GID)
            WHERE (
                     CO_OC_ID in (3128,3129,3130,1793)
                     AND ( CO_STATE != 9)
                     AND ( 
                             CO_MR_GID IN ( SELECT CO_MR_GID FROM utp_common_objects where CO_GID IN ($gids))
                         )
                     OR (CO_OC_ID = 2347
                         AND co_mf_gid in ( select unique co_mf_gid from N3T_NWI3_MO where co_oc_id = 3129 and CO_MR_GID in
                                             ( SELECT CO_MR_GID FROM utp_common_objects where CO_GID IN ($gids))
                                          )
                        )
                   )
             GROUP BY $groupby_str";
    $getoms_unknown_sql = "select N3_SYSTEM_ID,CO_DN,co_GID,alarm_number
                                FROM N3T_NWI3_MO left outer join  FX_ALARM on (CO_GID=NE_GID)
                                where CO_STATE != 9
                                AND (( ALARM_NUMBER=71058 or  alarm_number = 9047) AND (ALARM_STATUS=1) )
                                AND (CO_OC_ID = 2347 or CO_OC_ID =3128)
                                and co_mf_gid in ( select unique co_mf_gid from N3T_NWI3_MO where  CO_MR_GID in
                                                 ( SELECT CO_MR_GID FROM utp_common_objects where CO_GID IN ($gids)))
                                group by N3_SYSTEM_ID,CO_DN,co_GID,alarm_number";

  }
  #print $sql."\n";
  my $data_ref = ExecSQL($sql);
  my $data_ref_oms  = ExecSQL($getoms_unknown_sql);
  my %dns_cache;
  foreach $child (@$data_ref)
  {
     #print "child --- @$child\n";
     #next;
     (           'CO_DN',
                     'CO_OCV_SYS_VERSION',
                     'CO_NAME',
                     'CO_MAIN_HOST',
                     'CO_GID',
                     'CO_ADMIN_STATE',
                     'CO_USER_DEF_ID',   # CM store "operational status" in this field
                     'CO_OC_ID',
                     'ALARM_STATUS',
                     'SEVERITY',
                     'CO_STATE',
                     'N3_SYSTEM_ID',       
                     'count(SEVERITY)'
                     );
    my @ne_info = @$child;
   
    my %item_hash;
    my $item_hash_ref;
    my $dn = $ne_info[0];

    if ( $dn =~ m/FTM/ )
    {
      if ( ! ($dn =~ m/LNBTS/) )
      {
        ## ignore FTMs that NOT udner LNBTS
        ##     e.g. 3G FTM <RNC/WBTS/FTM>
        next;
      }
    }
    if ( $dn =~ m/MRBTS/ )
    {
      #if ( ! ($dn =~ m/.*MRBTS[^\/]+\/LNBTS.*/) ) # ERROR this will filter our LTE MRBTS itself
      if ( ! ($dn =~ m/^PLMN-[^\/]+\/MRBTS/) )
      {
        ## ignore MRBTSs that NOT contains LNBTS
        ##     e.g. 2G CM MRBTS object
        next;
      }
    }
    my $gid = $ne_info[4];
    if ( exists($hash_ref->{$gid}))
    {
        $item_hash_ref = $hash_ref->{$gid};  
    }
    else
    {
        $item_hash_ref = \%item_hash; ##this will run for 1st time
    }
    $item_hash_ref->{'dn'} = $dn;
    $item_hash_ref->{'ver'} = $ne_info[1];
    $item_hash_ref->{'name'} = $ne_info[2];
    $item_hash_ref->{'costate'} = $ne_info[10];
    $item_hash_ref->{'ocid'} = $ne_info[7];
    $item_hash_ref->{'ip'} = defined($ne_info[3])? $ne_info[3]: "";
    ## to fix PR NA05257046
    ## In case LNBTS is added to DNS, CO_MAIN_HOST may contain a hostname.
    ## Therefore we need to make a DNS lookup for the IP address.
    ## We also play nice and avoid duplicate lookups.
    my $ip2 = $item_hash_ref->{'ip'};
    if (length($ip2) && ($ip2 !~ /\d+\.\d+\.\d+.\d+/) )
    {
       if ( exists($dns_cache{$ip2}) )
       {
         # avoid duplicate lookups
         $item_hash_ref->{'ip'} = $dns_cache{$ip2};
       }
       else
       {
         # do real dns lookup
         my $res = Net::DNS::Resolver->new;
         my $query = $res->search($ip2);
         if ($query) 
         {
           foreach my $rr ($query->answer)
           {
             next unless $rr->type eq "A";
             $item_hash_ref->{'ip'} = $rr->address;
             $dns_cache{$ip2} = $rr->address;
             last;
           }
         }
       }
    }
    if ( $item_hash_ref->{'dn'} =~ m/LNCEL/ )
    { # LNBTS does not have admini status, so only fill lncel
        $item_hash_ref->{'ad'} = $ne_info[5];
    }
    $item_hash_ref->{'op'} = $ne_info[6];
    $item_hash_ref->{'cs'} = "false";
    for $oms_row (@$data_ref_oms)
    {
        #print "DEBUG oms_row3&row0:   @$oms_row[3],@$oms_row[0]"."\n";
        #print "DEBUG:data_row12&row11:$ne_info[12],$ne_info[11]"."\n";
        if ($ne_info[11] eq  @$oms_row[0]) #judgement if belongs to the same system_id(same OMS)
        {
            if(@$oms_row[3] == 9047 )#judgement if the has alarm 9047,then change the unknown status vauleof MRBTS,LNBTS,LNCEL,FTM to oms's value
            {
                $item_hash_ref->{'cs'} = "true";#give the unknown value of OMS to the column unknown of current item
            }
            if(@$oms_row[3] == 71058 )#judgement if has alarm 71058,then change the unknown status vauleofLNBTS,LNCEL,FTM to MRBTS's value,omit OMS
            {
                if ( $dn =~ m/@$oms_row[1]/) #judgement if belongs to the same BTS
                {
                     $item_hash_ref->{'cs'} = "true";#give the unknown value of OMS to the column unknown of current item
                }
            }
        }
    }

    $item_hash_ref->{'system_id'} = $ne_info[11];
    #$item_hash_ref->{'unknown'} = $ne_info[12];
    
    my $ALARMSTATE = defined $ne_info[8] ? $ne_info[8] : 0;
    my $SEVERITY = $ne_info[9];
    my $COUNT = defined $ne_info[12] ? $ne_info[12] : 0;

    if($COUNT!=0 and $SEVERITY==1 and $ALARMSTATE==1)
    {
      $item_hash_ref->{'a_1'} = $COUNT;
    }
    if($COUNT!=0 and $SEVERITY==2 and $ALARMSTATE==1)
    {
      $item_hash_ref->{'a_2'} = $COUNT;
    }
    if($COUNT!=0 and $SEVERITY==3 and $ALARMSTATE==1)
    {
      $item_hash_ref->{'a_3'} = $COUNT;
    }
    $hash_ref->{$gid} = $item_hash_ref;

    my $mrbts_dn = $ne_info[0];
    if ( $mrbts_dn =~ m/(.*MRBTS-\d+).*/ )
    {
      $mrbts_dn = $1;
      if( exists($gid_dn_map{$mrbts_dn}) )
      {
        my $children_ref = $gid_dn_map{$mrbts_dn};
        push(@$children_ref, $gid);
        $gid_dn_map{$mrbts_dn} = $children_ref;
      }
      else
      {
        my @children=($gid);
        $gid_dn_map{$mrbts_dn} = \@children;
      }
#      my $arr_ref = $gid_dn_map{$mrbts_dn};
#      print "@$arr_ref\n";

      ## for alarm summary
      my $as_item_hashref;
      if (exists($alarm_summary_hash{$mrbts_dn}))
      {
        $as_item_hashref = $alarm_summary_hash{$mrbts_dn};
      }
      else
      {
        my %as_item_hash;
        $as_item_hashref = \%as_item_hash; 
      }
      if($COUNT!=0 and $SEVERITY==1 and $ALARMSTATE==1)
      {
        my $cnt = exists($as_item_hashref->{'a_1'})? $as_item_hashref->{'a_1'}: 0;
        $cnt += $COUNT;
        $as_item_hashref->{'a_1'} = $cnt;
      }
      if($COUNT!=0 and $SEVERITY==2 and $ALARMSTATE==1)
      {
        my $cnt = exists($as_item_hashref->{'a_2'})? $as_item_hashref->{'a_2'}: 0;
        $cnt += $COUNT;
        $as_item_hashref->{'a_2'} = $cnt;
      }
      if($COUNT!=0 and $SEVERITY==3 and $ALARMSTATE==1)
      {
        my $cnt = exists($as_item_hashref->{'a_3'})? $as_item_hashref->{'a_3'}: 0;
        $cnt += $COUNT;
        $as_item_hashref->{'a_3'} = $cnt;
      }
      $alarm_summary_hash{$mrbts_dn} = $as_item_hashref;
#print "$mrbts_dn, a_1=$alarm_summary_hash{$mrbts_dn}->{'a_1'}, a_2=$alarm_summary_hash{$mrbts_dn}->{'a_2'},a_3=$alarm_summary_hash{$mrbts_dn}->{'a_3'}\n";
      ## end for alarm summary
    }
  }
}

sub getMrName
{
  my ($gids) = @_;
  my $sql =  "SELECT 'MR_' || CO_Name "
            ."FROM UTP_COMMON_OBJECTS "
            ."WHERE  (CO_GID IN (SELECT CO_MR_GID from utp_common_objects where CO_GID IN ($gids)))";
  my $data_ref = ExecSQL($sql);
  foreach $child (@$data_ref)
  {
    my @child_moid = @$child;
    my $NAME = $child_moid[0];
    if ($NAME =~ m/([^\/]+)$/)
    {
      $NAME = "$1";
      print "$NAME,";  ## print to stdout, so python conterpart can parse it.
    }
    else
    {
        die "ErRor: fetch MR name failed.\n";
    }
  }
}

#****************************************************
# this sub module is used to create a dialog window
#****************************************************
sub CreateDialog
{
  my $xe;
  my $title_string = shift;
  my $information_string = shift;
  my $window_status = shift;
  my $button;
  my $main = new MainWindow(-title => $title_string);
  $main->bind( '<Configure>' => sub
               {
                 $xe = $main->XEvent;
                 $main->maxsize($xe->w,$xe->h);
                 $main->maxsize($xe->w,$xe->h);
               }
             );
  $main->bind('<Return>' => sub{exit 0;});
  my $Labelframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both');
  my $buttonframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both');
  my $textlabel = $Labelframe->Label(-text => $information_string,-takefocus => 0);
  if ($window_status=~/1/ig)
  {
  $button = $buttonframe->Button(-text => "OK", -takefocus => 1, -command => sub{$main->destroy });
  }
  else
  {
  $button = $buttonframe->Button(-text => "OK", -takefocus => 1, -command => sub{exit 0;});
  }
  $textlabel->pack(-pady => 20);
  $button->pack(-pady =>5);
  $button->focus;
  MainLoop;
}

sub launchAlarmMonitor_mrbts
{
  my ($dbh, $mrbts_gid)=@_;
  my @intIDs;

  # get intID for LNCEL, FTM and LNBTS
  my $get_lnbts_gid = "select CO_GID 
                       from utp_common_objects 
                       where (CO_PARENT_GID in ($mrbts_gid)) and (CO_OC_ID=3129)";
  my $get_lncel_ftm_gid = "select CO_GID 
                           from utp_common_objects 
                           where(    CO_PARENT_GID in ( $get_lnbts_gid )
                                 and (CO_OC_ID=3130 or CO_OC_ID=1793) 
                                )";
  my $sql3 =  "select CO_INT_ID 
               from utp_common_objects 
               where (    (CO_GID IN ($get_lnbts_gid))
                       OR (CO_GID IN ($get_lncel_ftm_gid))
                     )";
  my $sth3 = $dbh->prepare($sql3);
  unless( $sth3 )
  {
    #die "ErRor: execute sql failed (3)\n";
    CreateDialog("Error", "Open Alarm Monitor Failed(3): please check you lab DB satus.\n");
  } 
  unless($sth3->execute)
  {
    #die "ErRor: execute sql failed(3-2)\n"; 
    CreateDialog("Error", "Open Alarm Monitor Failed(3-2): please check you lab DB satus.\n");
  }
  while(my @arr3 = $sth3->fetchrow_array){
    $intIDs[++$#intIDs] = $arr3[0];
  }
  $sth3->finish();

  # get intID for MRBTS
  my $sql4 =  "select CO_INT_ID 
               from utp_common_objects
               where CO_GID IN ($mrbts_gid)";
  my $sth4 = $dbh->prepare($sql4);
  unless( $sth4 )
  {
    #die "ErRor: execute sql failed (4)\n";
    CreateDialog("Error", "Open Alarm Monitor Failed(4): please check you lab DB satus.\n");
  } 
  unless($sth4->execute)
  {
    #die "ErRor: execute sql failed(4-2)\n"; 
    CreateDialog("Error", "Open Alarm Monitor Failed(4-2): please check you lab DB satus.\n");
  }
  my @arr4 = $sth4->fetchrow_array;
  $intIDs[++$#intIDs] = $arr4[0];
  $sth4->finish();

  # invoke the Alarm Monitor with multi intIDs
  my $args = join(' ', @intIDs);
  # to fix PR 84346ESPE02, the alarmMonitor must be running background
  system("amoebamx $args &");
}

sub launchAlarmMonitor_lnbts
{
  my ($dbh, $lnbts_gid)=@_;
  my @intIDs;


  # get intID for LNCEL, FTM and LNBTS
  my $sql3 =  "select CO_INT_ID from utp_common_objects "
             ."where (   ((CO_PARENT_GID=$lnbts_gid) AND (CO_OC_ID=3130 OR CO_OC_ID=1793))"
                 . "  OR (CO_GID=$lnbts_gid) )";
  my $sth3 = $dbh->prepare($sql3);
  unless( $sth3 )
  {
    #die "ErRor: execute sql failed (3)\n";
    CreateDialog("Error", "Open Alarm Monitor Failed(3): please check you lab DB satus.\n");
  } 
  unless($sth3->execute)
  {
    #die "ErRor: execute sql failed(3-2)\n"; 
    CreateDialog("Error", "Open Alarm Monitor Failed(3-2): please check you lab DB satus.\n");
  }
  while(my @arr3 = $sth3->fetchrow_array){
    $intIDs[++$#intIDs] = $arr3[0];
  }
  $sth3->finish();

  # get intID for MRBTS
  my $sql4 =  "select CO_INT_ID from utp_common_objects "
             ."where CO_GID IN ( select CO_PARENT_GID from utp_common_objects "
                               ."where CO_GID=$lnbts_gid)";
  my $sth4 = $dbh->prepare($sql4);
  unless( $sth4 )
  {
    #die "ErRor: execute sql failed (4)\n";
    CreateDialog("Error", "Open Alarm Monitor Failed(4): please check you lab DB satus.\n");
  } 
  unless($sth4->execute)
  {
    #die "ErRor: execute sql failed(4-2)\n"; 
    CreateDialog("Error", "Open Alarm Monitor Failed(4-2): please check you lab DB satus.\n");
  }
  my @arr4 = $sth4->fetchrow_array;
  $intIDs[++$#intIDs] = $arr4[0];
  $sth4->finish();

  # invoke the Alarm Monitor with multi intIDs
  my $args = join(' ', @intIDs);
#print "amoebamx $args\n";
  # to fix PR 84346ESPE02, the alarmMonitor must be running background
  system("amoebamx $args &");
}

###################################################################
sub launchAlarmMonitor_oms
{
  my ($dbh, $oms_gid)=@_;
  my @intIDs;

  # get intID for OMS
  my $sql4 =  "select CO_INT_ID from utp_common_objects where CO_GID=$oms_gid";
  my $sth4 = $dbh->prepare($sql4);
  unless( $sth4 )
  {
    #die "ErRor: execute sql failed (4)\n";
    CreateDialog("Error", "Open Alarm Monitor Failed(4): please check you lab DB satus.\n");
  }
  unless($sth4->execute)
  {
    #die "ErRor: execute sql failed(4-2)\n";
    CreateDialog("Error", "Open Alarm Monitor Failed(4-2): please check you lab DB satus.\n");
  }
  my @arr4 = $sth4->fetchrow_array;
  $intIDs[++$#intIDs] = $arr4[0];
  $sth4->finish();

  my $args = join(' ', @intIDs);
  system("amoebamx $args &");
}

sub launchAlarmMonitor
{
  my ($gid) = @_;

  my $dbconnect = "dbi:Oracle:";
  my $user      = "omc";
  my $password  = emicom::getDBPassword() ;
  if( $password eq "" )
  {
    #die "ErRor: getDBPassword\n"; 
    CreateDialog("Error", "Open Alarm Monitor Failed(0-1): please check you lab DB satus.\n");
  }
  my $dbh = DBI->connect($dbconnect,$user,$password);
  unless( $dbh )
  {
    #die "ErRor: connect failed.\n"; 
    CreateDialog("Error", "Open Alarm Monitor Failed(0-2): please check you lab DB satus.\n");
  }

  my $sql1 = "select CO_OC_ID from utp_common_objects where CO_GID=$gid";
  my $sth1 = $dbh->prepare($sql1);
  unless( $sth1 )
  {
    #die "ErRor: execute sql failed (1)\n";
    CreateDialog("Error", "Open Alarm Monitor Failed(1): please check you lab DB satus.\n");
  } 
  unless($sth1->execute)
  {
    #die "ErRor: execute sql failed(1-2)\n"; 
    CreateDialog("Error", "Open Alarm Monitor Failed(1-2): please check you lab DB satus.\n");
  }
  my @ne = $sth1->fetchrow_array;
#print "ne".@ne."\n";
  $sth1->finish();
  my $ne_class=$ne[0];
  if ( $ne_class eq "3130" || $ne_class eq "1793") # the gid is LNCEL/FTM gid
  {
    my $sql2 = "select CO_PARENT_GID from utp_common_objects where CO_GID=$gid";
    my $sth2 = $dbh->prepare($sql2);
    unless( $sth2 )
    {
      #die "ErRor: execute sql failed (2)\n";
      CreateDialog("Error", "Open Alarm Monitor Failed(2): please check you lab DB satus.\n");
    }  
    unless($sth2->execute)
    {
      #die "ErRor: execute sql failed(2-2)\n"; 
      CreateDialog("Error", "Open Alarm Monitor Failed(2-2): please check you lab DB satus.\n");
    }
    my @arr = $sth2->fetchrow_array ;
    $sth2->finish();
    my $lnbts_gid = $arr[0];
    launchAlarmMonitor_lnbts($dbh, $lnbts_gid);
  } 
  elsif ( $ne_class eq "3128" ) # the gid is MRBTS gid
  {
    launchAlarmMonitor_mrbts($dbh, $gid);
  } 
  elsif ( $ne_class eq "3129" ) # the gid is LNBTS gid
  {
    launchAlarmMonitor_lnbts($dbh, $gid);
  } 
   elsif ( $ne_class eq "2347" ) # the gid is oms gid
  {
    launchAlarmMonitor_oms($dbh, $gid);
  }
  else
  { 
    #die "ErRor: the gid passed in($ne_class) is not LNBTS or LNCEL.";
    CreateDialog("Error", "the gid passed in($ne_class) is not LNBTS or LNCEL.");
  }

  $dbh->disconnect();
}


# sort dn by the rule 'both'(see python columnDef)
sub sort_dn($$)
{
  my ($dn1, $dn2)=@_;
  #print "------:\n".$dn1."\n".$dn2."\n";
  my @dn1 = ($dn1 =~ m/\d+|\D+/g);
  #foreach (@dn1) {print $_."   ";} print "\n";
  my @dn2 = ($dn2 =~ m/\d+|\D+/g);
  my $min = scalar(@dn1);
  my $len2 = scalar(@dn2);
  if ($len2 < $min)
  {
    $min = $len2;
  }

  if ($min > 0)
  {
    for(my $i=0; $i<$min; $i++)
    {
      my $ret=0;
      if ( ($dn1[$i] =~ m/^\d+$/) and $dn2[$i] =~ m/^\d+$/ )
      {
        $ret = int($dn1[$i]) - int($dn2[$i]);
        if ($ret)
        {
          return $ret;
        }
      }
      else {
        $ret = $dn1[$i] cmp $dn2[$i];
        if ($ret)
        {
          return $ret;
        }
      }
    }
  }
 
  # $min == 0
  return $dn1 cmp $dn2;
}

my $gids = join(",", @gid_arr);
if ( $get_mrname )
{
  getMrName($gids);
  exit(0);
}
elsif ( $launch_alarm_monitor )
{
  # currently in this case, there should only one gid passed in.
  launchAlarmMonitor($gid_arr[0]);
}
else
{
  my %result;
  findDNfromDB($gids, $show_mr, \%result);
  AppendConnStatus($gids, $show_mr, \%result);
  AppendAlarmSummary(\%result);
  
  # print the result to stdout, one object in one line
  # SO, python conuterpart can parse it.
  # format gid,dn,name,ver,operational_state,admini_state,conn_state,alarm_count_critial,alarm_count_maijor,ip_addr
##  while (my ($gid, $item_hash_ref) = each %result) 
##  {
##      print  "$gid,"
##            ."$item_hash_ref->{'dn'},"
##            ."$item_hash_ref->{'name'},"
##            ."$item_hash_ref->{'ver'},"
##            ."$item_hash_ref->{'op'},"
##            ."$item_hash_ref->{'ad'},"
##            ."$item_hash_ref->{'cs'},"
##            ."$item_hash_ref->{'a_1'},"
##            ."$item_hash_ref->{'a_2'},"
##            ."$item_hash_ref->{'a_3'},"
##            ."$item_hash_ref->{'ip'},"
##            ."$item_hash_ref->{'costate'},"
##            ."$item_hash_ref->{'ocid'},"
##            ."\n";
##  }
  # sort the output by dn, so the view content is default sorted by DN
  my %result_sorted;
  while (my ($gid, $item_hash_ref) = each %result) 
  {
    $item_hash_ref->{'gid'} = $gid;
    $result_sorted{$item_hash_ref->{'dn'}} = $item_hash_ref;
  }
  #foreach (sort keys(%result_sorted))
  foreach (sort sort_dn(keys(%result_sorted)))
  {
    my $item_hash_ref = $result_sorted{$_};
    print  "$item_hash_ref->{'gid'},"
          ."$item_hash_ref->{'dn'},"
          ."$item_hash_ref->{'name'},"
          ."$item_hash_ref->{'ver'},"
          ."$item_hash_ref->{'op'},"
          ."$item_hash_ref->{'ad'},"
          ."$item_hash_ref->{'cs'},"
          ."$item_hash_ref->{'a_1'},"
          ."$item_hash_ref->{'a_2'},"
          ."$item_hash_ref->{'a_3'},"
          ."$item_hash_ref->{'ip'},"
          ."$item_hash_ref->{'costate'},"
          ."$item_hash_ref->{'ocid'},"
          ."$item_hash_ref->{'system_id'},"
          ."\n";
  } 
}

