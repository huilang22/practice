#!/opt/nokia/oss/perl/bin/perl -w

package lteEMGUI;

push (@INC, '/opt/nokia/oss/bin/');

use warnings;
no warnings qw(redefine);

use Tk;
use Tk::Widget;

sub new{
    my $class = shift;
    my $this = {};
    bless($this, $class);
    return $this;
}
sub showDialog{
        my $xe;
        my $this=shift;
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
       my $textlabel = $Labelframe->Label(-text => $information_string,-takefocus => 0,-justify=>'left',-padx=>10,-relief=>'groove');
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

sub showConfirmDialog
{
        my($this,$title_string, $information_string, $content) = @_;
        my $xe;
        my $isConfirmed = 1; 
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
       my $Labelframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both',-anchor=>'center');
       my $buttonframe = $main->Frame(-height => 40, -width => 220)->pack(-fill => 'both');
       my $textlabel = $Labelframe->Label(-text => $information_string,-takefocus => 0,-justify=>'left',-padx=>5,-font=>'18');
       my $contentlabel = $Labelframe->Label(-text => $content,-takefocus => 0,-justify=>'left',-padx=>5,-font=>'18');
       my $blanktext = $buttonframe->Label(-text => "",-takefocus => 0,-padx=>42);
       $button1 = $buttonframe->Button(-text => "OK", -takefocus => 1, -command => sub{$main->destroy; $isConfirmed = 0; });
       $button2 = $buttonframe->Button(-text => "Cancel", -takefocus => 1, -command => sub{$main->destroy; exit 0; });
       $textlabel->pack(-pady => 10,-side=>'top');
       $contentlabel->pack(-pady => 1,-side=>'bottom');
 #      $button1->pack(-pady =>5,-padx=>50,-side=>'left');
       $blanktext->pack(-side=>'left');
       $button1->pack(-pady =>5,-side=>'left');
       $button2->pack(-pady =>5,-side=>'left'); 
       $button1->focus;
#       $button2->pack(-pady =>5,-padx=>50,-side=>'right');
        MainLoop;
       return $isConfirmed;
}

#########################
#End with "All Finished"
#in that log
########################
sub showSynLogDialog{
    my($this,$logfile, $title) = @_;
    my $timestamp1=`date +%Y-%m-%d/%H:%M:%S`;
    open(H, "tail -f -n 25 $logfile|") or die "Nope: Can't tail the $logfile";
    $mw = new MainWindow(-title => $title);
    my $s2 = $mw->Scrollbar(-orient => 'vertical');
    $t = $mw->Text(-background => 'white',-width => 80, -height => 25,, -wrap => 'word',-yscrollcommand =>  sub{$s2->set(@_)});
    $s2->pack(-side => 'right', -fill => 'y');
    $s2->configure(-command => [$t => 'yview']);
    $t->pack(-fill=>'both',-expand => 'True');
    #$my $timestamp= `date +%Y-%m-%d/%H:%M:%S`;
    $t->insert('end',"Please Wait...Start At $timestamp1\n");
    $t->yview('end');
    $mw->fileevent(H, 'readable', [\&fill_text_widget,$this,$mw, $t, $action,$logfile]);
    MainLoop;


 }

sub fill_text_widget {
    
        my($this,$window,$widget, $action, $logfile) = @_;
        $ARG = <H>;
        chomp($ARG);
        if($ARG eq "LNCEL:kill the dialog"){
           &killTailprocess($logfile);
           $window->destroy;
           return ;
        }
        $widget->insert('end', $ARG."\n");
        $widget->yview('end');
        if(($ARG =~ /ALL Finished/)){
          close(H);
          $this->killTailprocess($logfile);
          $widget->insert('end', "\n--------Press any key to exit--------\n"); 
          $widget->yview('end');
          $widget->bind( '<Any-KeyPress>' => sub{$window->destroy;});
          return ;
        }
}
sub killTailprocess{
    my ($this,$logfile) = @_;
    my $tailpid = `ps -ef | grep tail | grep -v grep | grep $logfile | awk '{print \$2}'`;
    chomp($tailpid);
    if($tailpid ne ""){
        `kill -9 $tailpid`;
    }

}
1;
