#!/opt/nokia/oss/perl/bin/perl -w

package lteEMCommandHelper;

use DBI;
use emicom;
use Tk;
use Tk::Widget;
use English ;
use Getopt::Long;
use ldclibmx;
use Env;

#*****************************************************************************************
# This sub module is used to get domain to the element manager launch command for NB/RSxxx. 
#*****************************************************************************************
sub getDomain
{
    my $value ;
    my $msg;

    my $temp = `ldapacmx.pl -standard -directQuery "(objectclass=ossHost)"` ;
    if ($temp=~ /.*ossHostLogDom: ([\w\.]*)/i)
    {
        $value = $1;
    }

    if ($value eq "")
    {
        print "Error: Domain could not be replaced. Reason: ossHostLogDom entry is not populated in LDAP";
        #$msg = "ReplaceToken: Error, token $token could not be replaced.\nREASON : ossHostLogDom entry
        #is not populated in LDAP.\nVerify your /etc/ClusterConfig.xml file for this entry.\n "  ;
    }
    return $value;
}

#*****************************************************************************************
# This sub module is used to get appserver to the element manager launch command for NB/RSxxx.
#*****************************************************************************************
sub getAppServer
{
    my $role = "GUIS";
    my $appserver = "NA";

    my $appservers  =  ldclibmx::get_ossServerRole($role);

    #get the number of appservers available
    my @app = split(/\n/,$appservers);
    my $numappservers = scalar @app;
    if ($numappservers >1 )
    {
        my $flag=0;
        my $i;
        # If more than one appserver exists, perform a load
        #  balancing. This is just a random chmyose of one server
        srand ;

        while ( ( $flag == 0 ) && ( $numappservers > 0 ) )
        {
            my $index = int( rand($numappservers) ) ;

            `ping $app[$index] -c 1 -w 1`;
            my $ping_status = $?;
            if ( $ping_status == 0 )
            {
                $appserver = $app[$index];
                $flag=1;
            }
            else
            {

                for ( $i=$index;$i<=$#app;$i++)
                {
                    $app[$i]=$app[$i+1];
                }
                $numappservers=$#app--;
            }
        }

    }
    else
    {
        # Just take the first application server
        $appserver = $app[0];
    }
    return $appserver;
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
        $main->bind('<Configure>' => sub
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

##########################################################
#
# trim invalid chars from the cellid stirng
# e.g., 1,2,DN:NULL-0,3
#   ==> 1,2,3
##########################################################
sub RemoveInvalidCellId
{
    my $cellid_str = shift;
##print "--$cellid_str\n";

    my @cellIDs = split(/,/, $cellid_str);

    my $final_str = "";
    foreach( @cellIDs )
    {
        if ( $_ =~ m/[^\d]/ )
        {
            # skip the invlaid id
            print "The invalid cellID($_) is ignored.\n";
        }else
        {
            $final_str = "$final_str"."$_".',';
        }
    }

    # if the string is end with ','
    # remove the last ','
    $final_str =~ s/,$//g;
##print "$final_str\n";
    return $final_str;
}

#****************************************************
# Sub module will return the LNCEL's local moid
# for the passed parent LNBTS gid array
#****************************************************
sub GetLNCELMOID
{
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

  my $gids = join(",", @_);
  my $sth = $dbh->prepare("SELECT N3_LOCAL_MOID,CO_DN FROM N3T_NWI3_MO WHERE CO_OC_ID = 3130 AND CO_STATE != 9 AND ( CO_PARENT_GID IN ($gids) )");

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

  my $moidLst = "";
  while(my @child_moid  = $sth->fetchrow_array)
  {
   	  if ($child_moid[1] =~ /PLMN-PLMN\/LNBTS-/ig)
	  {
		  my $tmp_moid = $child_moid[1];
		  $tmp_moid =~ s/PLMN-PLMN\//DN:NE-/g;
                  if ( $moidLst eq "" )
                  {
		         $moidLst = $tmp_moid ;
                  }
                  else
                  {
		         $moidLst = "$moidLst" .','. "$tmp_moid" ;
                  }
	  }
	  else
	  {
                  if ( $moidLst eq "" )
                  {
		         $moidLst = $child_moid[0] ;
                  }
                  else
                  {
		         $moidLst = "$moidLst" .','. "$child_moid[0]" ;
                  }
	  }
  }

  $sth->finish();
  $dbh->disconnect();
 
   
  return $moidLst;
}

#****************************************************
# Sub module will return the local moid for
# the passed GID .
#****************************************************
sub GetMOID($)
{
  my $gid = shift;
  my $system_id;
  my ($basemoid, $localmoid) ;

  if($gid != 0 && $gid != -1)
  {
    if(!emicom::getmoid( $gid, \$basemoid, \$localmoid ))
    {
      CreateDialog("ERROR...", "Get MOID from Databasae failed. please check lab Environment.", 1);
      exit(-1);
    }
  }
  else
  {
      CreateDialog("ERROR...", "Invalid GID.", 1);
      exit(-1);
  }
  if ($basemoid=~/MRBTS/ig)
  {
      $basemoid =~ s/NE-//g;
      $localmoid =~ s/DN:NE-//g;
      $localmoid = "DN:NE-".$basemoid."/".$localmoid;
  }
  return $localmoid;
}

#****************************************************
# Sub module will return the Mediator IP  for
# the passed intid .
#****************************************************
sub GetMEIP($)
{
  my $gid = shift;
  my $system_id;
  my $me_ip;

#TODO: only for debug
#  return "11.21.23.1";

  if($gid != 0 && $gid != -1)
  {
##print " GetMEIP: gid=$gid\n";
    if(!emicom::getmediatorip( $gid, \$me_ip ))
    {
##print " GetMEIP: failed\n";
      return undef;
    }
##print " GetMEIP: gid=$gid, meip=$me_ip\n";
  }
  else
  {
##print " GetMEIP: no gid\n";
      return undef;
  }
  return $me_ip;
}


1;  # perl class/package must be end with with the required '1;'
