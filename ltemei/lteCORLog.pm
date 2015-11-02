#!/opt/nokia/oss/perl/bin/perl -w

package lteCORLog;

push (@INC, '/opt/nokia/oss/bin/');
use Exporter;

require Exporter;
@ISA = qw (Exporter);
@EXPORT = qw(Write);

use warnings;
no warnings qw(redefine);

my $log_dir = "/var/opt/nokia/oss/global/ltemei/log";

sub CheckSize
{
    my $MAX_LOG_SIZE = 10; # unit MB
    my $size = `du -shm /var/opt/nokia/oss/global/ltemei/log`;
    chomp($size);
    if ($size =~ m/(\d\+)\s*/)
    {
        $size = $1;
        if ( $1 > $MAX_LOG_SIZE )
        {
            `mv $log_dir/lte_cor.log $log_dir/lte_cor.log.1`;
        }
    }
}

sub CheckDetailSize
{
    my $MAX_LOG_SIZE = 500; # unit MB
    my $size = `du -shm /var/opt/nokia/oss/global/ltemei/log`;
    chomp($size);
    # something like:
    #   1       /var/opt/nokia/oss/global/ltemei/log
    if ($size =~ m/(\d\+)\s*/)
    {
        $size = $1;
        if ( $1 > $MAX_LOG_SIZE )
        {
            #cleanup the old log
            my $rlt = `ls -t $log_dir`;
            chomp($rlt);
            my @arr = ($rlt); # the oldest and the end of @arr
            if(scalar(@arr)>0)
            {
                for (my $i=scalar(@arr)-1; $i>scalar(@arr)/2; $i--)
                {
                   # remove the oldest 
		   `rm -fr $log_dir/$arr[$i]`;
                }
            }
        }
    }
}

sub WriteLog
{
    CheckSize();

    # TODO:change the file location.
    if (open(FH, ">>$log_dir/lte_cor.log"))
    {
    	print FH @_;
        close FH;
    }
    else
    {
        # write to log file failed.
    }
}

sub AppendDetailError
{
    CheckDetailSize();

    my ($error_log) = @_;
    my $file = "$log_dir/$error_log";
    `cp /tmp/$error_log $file`;
}

1; # perl class/package must be end with with the required '1;'
