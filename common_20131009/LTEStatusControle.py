#!/usr/bin/python
import pygtk
pygtk.require('2.0')
import gtk,gobject
import sys,os
import time
import threading
import re
sys.path.append("/opt/nokia/oss/bin");
import LTEStatusGUI as LTEStatusGUI
import LTEStatusData as LTEStatusData;
from LTEStatusData import *
from LTEStatusGUI import *;

class AppConfig:
    # application type
    SETTING_RFS   = "rfs_";
    SETTING_LTE   = "lte_";
    SETTING_WCDMA = "wcdma_";
    # SI == SettingItem
    SI_AUTOREFRESH_INTERVAL = "autorefresh_interval";
    # the above constants CAN NOT be changed!!!
    # if change, MUST ALSO CHANGE:
    #    1) existing config file /etc/opt/nokia/oss/custom/conf/lte_report.cf
    #    2) string in _writeConfig() method

    def __init__(self, app_type):
        self._conf_file = '/etc/opt/nokia/oss/custom/conf/lte_report.cf';
        self._app_type = app_type;

        self._cfgItems = [ AppConfig.SETTING_RFS+AppConfig.SI_AUTOREFRESH_INTERVAL, 
                           AppConfig.SETTING_LTE+AppConfig.SI_AUTOREFRESH_INTERVAL,
                           AppConfig.SETTING_WCDMA+AppConfig.SI_AUTOREFRESH_INTERVAL
                         ];

        self._itemHash = {};
        self._hasRead = {};
        for key in self._cfgItems:
            self._itemHash[key] = "";
            self._hasRead[key] = False;

        # loading app setting from config file
        self._readConfig();

    def setConfigItem(self, item, value):
        # currently, we only has one config item: SI_AUTOREFRESH_INTERVAL
        if ( AppConfig.SI_AUTOREFRESH_INTERVAL == item ):
            self._itemHash[self._app_type+item] = str(value);

        # no other config item now.

        self._writeConfig();

    def getConfigItem(self, item):
        if ( AppConfig.SI_AUTOREFRESH_INTERVAL == item ):
            return self._itemHash[self._app_type+item];

        # no other config item now.

        return None;
        
    def _writeConfig(self):
        lines = [
                 "#######################################################################",
                 "# WCDMA/LTE Status Display Report & RF Sharing Report config file",
                 "#",
                 "",
                 "# Autorefresh Interval for LTE Status Display Report. In Seconds",
                 "# default to 20 seconds",
                 "lte_autorefresh_interval=" + self._itemHash['lte_autorefresh_interval'],
                 "",
                 "# Autorefresh Interval for RF Sharing Report. In Seconds",
                 "# default to 20 seconds",
                 "rfs_autorefresh_interval=" + self._itemHash['rfs_autorefresh_interval'],
                 "",
                 "# Autorefresh Interval for WCDMA Status Display Report. In Seconds",
                 "# default to 20 seconds",
                 "wcdma_autorefresh_interval=" + self._itemHash['wcdma_autorefresh_interval'],
                 ""
                ];
        fp=open(self._conf_file, 'w');  # If the file cannot be opened, an IOError is raised.
        for line in lines:
           fp.write(line + '\n');
        fp.close();

    def _readConfig(self):
#        print "readConfig, TODO: in CC adding a base /etc/opt/nokia/oss/custom/conf/lte_report.cf";

        fp=open(self._conf_file);  # If the file cannot be opened, an IOError is raised.
        while(True):
            line = fp.readline();
            if ( 0 == len(line) ):
                #reach EOF
                break;
            # get rid of the last newline char '\n'
            line = line[0:len(line)-1];  
            # get rid of all comments(start with a '#')
            p = re.compile('#.*');
            line = re.sub(p, "", line);
            # get rid of all spaces
            p = re.compile('\s+');
            line = re.sub(p, "", line);

            # skip 'empty' line
            if ( 0 == len(line) ):
                continue;

            for key in self._cfgItems:
                if ( not self._hasRead[key] ):
                    # read lte_autorefresh_interval
                    p = re.compile(key+'=(\d+)');
                    m = re.match(p, line);
                    if ( m ):
                        self._itemHash[key] = m.group(1);
                        self._hasRead[key] = True;
                        break;
        fp.close();

class LTEStatusControl:
    """Status report control module
    @version:1.2
    @author:bobyan
    @modify:
         (bobyan)2011.4.11 add a factory to create fetcher to support RFS subcontrol
                           add a controlaccess to enable subcontrol transfering settings to guiaccess
    """
    def __init__(self, paras):
        """Control construct:
           1. Set the values to instance variable ( gid, action, fetcherCls);
           2. Construct the dataControl and hand it in subcontrol.
           3. initiate the subcontrol.
        @param:paras an object including information inputed from out module.e.g. action/fetcherCls/gid etc.
        @type:CMDParameter
        @exception:It raise an exception if no fetcher found.
        """
        self.gids = paras.get_property('gid');
#        print "param gids=", self.gids;
        self.action = paras.get_property('action');
#        print "param action=", self.action;
        self.fetcherCls = paras.get_property('fetcherCls');
#        print "param fetcherCls=", self.fetcherCls;

    def setAction(self, action):
        """set special action for out module
        @param:action specify the special actionname
        """
        self.action = action;

    def getAutoRefreshInterval(self):
        return self._settings.getConfigItem(AppConfig.SI_AUTOREFRESH_INTERVAL);

    def saveAutorefreshInterval(self, new_interval):
        return self._settings.setConfigItem(AppConfig.SI_AUTOREFRESH_INTERVAL, new_interval);

    def run(self):
        """start the process of control, it capsulates the following process:
            1. Start DataFetcherThread to get data from DB.
            2. Get the initial values in controlaccess from subcontrol
            3. Invoke guiaccess to create window and assign the data to guiaccess instance.
            4. Fill data in GUI
        """
        # First, call gobject.threads_init
        # this MUST prior to any GUI operation code.
        gobject.threads_init();

        factory = FetcherFactory();
        
        self.fecher = factory.getFetcher(self.fetcherCls);
        if(isinstance(self.fecher, str)):
            self.showDialog("Error", self.fecher);
            raise Exception(self.fecher);

        # !!! the self.fecher is SubContrl for RFS
        #                     but LTEStatusDataFetch for SD
        if(self.fecher.__class__.__name__ == "SubControl"):
            # we are launched for RF Sharing
            self._settings = AppConfig(AppConfig.SETTING_RFS);
        elif(self.fecher.__class__.__name__ == "LTEStatusSubControl"):
            # we are launched for LTE Status Display
            self._settings = AppConfig(AppConfig.SETTING_LTE);
        elif(self.fecher.__class__.__name__ == "LTEStatusDataFetch"):
            self._settings = AppConfig(AppConfig.SETTING_LTE);
        elif(self.fecher.__class__.__name__ == "NewWCDMAStatusSubControl"):
            # we are launched for WCDMA Status Display
            self._settings = AppConfig(AppConfig.SETTING_WCDMA);
        else:
            raise Exception("SubControl class unknown!");
        #################################################################################
        #this hash just use to simple the code construct ,here definetion a function hash
        #in the following "for" loop,to call every function
        #################################################################################
        func_hash = {'columnDef':DataControl.getInstance().setColumnDef,
                     'main_menu':DataControl.getInstance().setMainMenu,
                     'toolitems':DataControl.getInstance().setToolbar,
                     'tableRightMenu':DataControl.getInstance().setTableMenu,
                     'filters':DataControl.getInstance().setDataFilters,
                     'dataActions':DataControl.getInstance().registerDataActions,
                     'windowActions':DataControl.getInstance().registerWindowActions
                     };
        for attr in func_hash:
            if (not hasattr(self.fecher,attr)):
                raise Exception("SubControl should has attribute:", attr);
            else:
                func_hash[attr](eval("self.fecher."+attr));
        #self.dataControl.setColumnDef(self.fecher.columnDef);
        #self.dataControl.setMainMenu(self.fecher.main_menu);
        #self.dataControl.setToolbar(self.fecher.toolitems);
        #self.dataControl.setTableMenu(self.fecher.tableRightMenu);
        #self.dataControl.setDataFilters(self.fecher.filters); 
        #self.dataControl.registerDataActions(self.fecher.dataActions);
        #self.dataControl.registerWindowActions(self.fecher.windowActions);
        # set LTEStatusData static variables
        #LTEStatusData.setStaticMainMenu(self.dataControl.getMainMenu());
        #LTEStatusData.setStaticToolbar(self.dataControl.getToolbar());
        #LTEStatusData.setStaticColumnDef(self.dataControl.getColumnDef());
        #LTEStatusData.setStaticTableMenu(self.dataControl.getTableMenu());
        #LTEStatusData.registerStaticDataMethod(self.dataControl.getDataActions());

        data = LTEStatusData();  # construct an empty data for GUI to use
        #################################################################
        #Added below 2 line to bind cpRawvalue function with datacontrol
        #################################################################
        col_list = ColumnDef.getInstance().getVisibleColumns();
        DataControl.getInstance().mergeColwithMethod(self.fecher,col_list);

        self._gui = LTEStatusGUI(self, data); 
            # at here we will set the ViewHandlerBase.colIndexMap
            # but subcontrol is constructed early that LTEStatusGUI constructed!
            # ==>
            # must call sub-control's setColumnsInfo after LTEStatusGUI constructed
        if ( hasattr(self.fecher, "setGUIObj") ):
            self.fecher.setGUIObj(self._gui);
        if ( hasattr(self.fecher, "setColumnsInfo") ):
#            print "setColumnsInfo for sub-control";
            self.fecher.setColumnsInfo();

        # 2) start the worker thread
#        print "[LTEStatusControle] start DataFetchThread, time=" , time.time()
        self._guard = ThreadGuard(self);
        fetchType = self.action;
        #  --------------------- only for status report
        if(cmp(self.action, "showme") == 0 or cmp(self.action, "showcluster") == 0):
            fetchType = "mr";
            if(cmp(self.action, "showme") == 0):
                fetchType = "lnbts";
        #  end --------------------- only for status report
        self._worker = DataFetcherThread(self._guard, self.fecher, fetchType, self.gids);
        self._worker.start();
        # worker can start fetch data now.
        self.notifyDataUpdated = None;

        filters = {"DN":{"MRBTS":False,"FTM":False, "LNBTS":True,"LNCEL":True},
                   "COSTATE":{"Non operational":False,"Operational":True}};
        sub_filters = DataControl.getInstance().getDataFilters();
        if(sub_filters != None):
           filters = sub_filters;
        self._gui.setFilters(filters);

        ## for lazy-loading
        if( hasattr(self.fecher, "guiActionsObj") ):
            #print "subcontrol has guiActionsObj, re-init basic actions";
            self._gui.action_invoker = self.fecher.guiActionsObj;
            self._gui.reg_actions = {};
            self._gui.mergeActions(self._gui.action_invoker.getActions());
        self.mergeActionToGUI(self._gui);
        self._gui.setWindowTitle(self.getCurTitle());

        # for disable table right-click-menu
        if(hasattr(self.fecher, "onInitTableRightMenu")):
            self._gui.fp_onInitTableRightMenu = self.fecher.onInitTableRightMenu;
        # for default-view.
        # Every subcontrol MUST set it's own default-view.
        if(hasattr(self.fecher, "setDefaultView")):
            self.fecher.setDefaultView(self._gui, data);
        else:
            # TODO:
            # each application must has a default view
            # raise Exception("sub-control does not has setDefaultView method!");
            #
            # currently hardcoded for Status Display!!!
            #ViewHandlerBase.currentActivatedView = ViewHandlerBase.viewType_DN;
            self._gui.action_invoker.refreshOnce(None, self._gui);
        self._gui.show();

        # at last, (after GUI destroy) notify DataFetchThread to exit
        self.exitWorker();

    def exitWorker(self):
        self._worker.ShouldQuit = True;
        self._guard.wakeupWorkerBeforeExit();

    def setDataNotifyMethod(self, method):
        self.notifyDataUpdated = method;

    def fetchDataFromDB(self):
        if (self._guard.canStartFetchData()):
#            print "[in thread:", threading.currentThread().getName(), "] DataFetch is ongoing, do nothing.";
            pass
        else:
#            print "[in thread:", threading.currentThread().getName(), "] tell DataFetcherThread thread to fetch data from DB.";
            status_text = "Loading data, please wait...";
            self._gui.showStatus(self._gui.STATUS_DYNAMIC, status_text);
            self._guard.notifyWorkerStartFetchData();

    def copyDataFromWorkerThread(self, worker_data):
#        print "[in thread:", threading.currentThread().getName(), "] now copy data from worker.";
        self._gui.data = worker_data;
#        print "data row=", len(self._gui.data.getRealNodes());
        if(isinstance(self._gui.data,str)):
            self._gui.data = self._gui.data.replace("ErRor", "Error");
            self.showDialog("Error", self._gui.data);
            #self._gui.data = None;
            #self._gui.delete_event(None, None);  # in such case, exit. 
            #self._gui.action_invoker.doActions(None,GUIActions.WINDOW_QUIT);
            # we can not direct call doActions here
            # otherwise, we will got error like:
            #  (LTEStatusControle.py:3659): Gdk-CRITICAL **: file gdkdraw.c: line 370 (gdk_draw_line): assertion `gc != NULL' failed
            # instead, call it from timer(in error_quit)
            self._gui.error_quit();
        else:
            # copyed from old getTopologyData
            # TODO: it's very strange that we need to change the mainmenu, toolbar, etc
            #       each time when we fetched data from DB!
            data = self._gui.data;
            # copyed from old getTopologyData

#            print "[in thread:", threading.currentThread().getName(), "] Done(copy data from worker).";
            if ( None != self.notifyDataUpdated ):
#		a = time.time()
#                print "[in thread:", threading.currentThread().getName(), "] now update view. start time = ",a;
                self.notifyDataUpdated(self._gui);
#                print "[in thread:", threading.currentThread().getName(), "]  Done(update view). end time = ",time.time()," cost = ",time.time()-a;
            else:
                raise Exception("Fatal: setDataNotifyMethod should be called before call fetchDataFromDB");
            #
            self._gui.setWindowTitle(self.getCurTitle());
            self._guard.notifyWorkerDataProcessed();

    def mergeActionToGUI(self, gui):
        """Merge actions from controlaccess into guiaccess
        @param:dataControl the control instance from subcontrol
        @param:gui guiaccess instance , it can access all components in GUI
        """
        actions = DataControl.getInstance().getWindowActions();
        gui.mergeActions(actions);        

    def getCurTitle(self):
        """Get window title, the old value is set in the method, but if there is subcontrol,
        it just get the value according to getWindowTitle in subcontrol class.
        @param:widget the component which trigger the action.
        @param:guiacces LTEStatusGUI instance
        @return:the window title name.
        """
        title = "";
        if(cmp(self.action,'showme') == 0):
            self.title_name = "Status Report";
            title = self.title_name;
            curtime = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time()));
            title += "_" + str(curtime);
        elif(cmp(self.action,'showcluster') == 0):
            mrname = self.getMRName();
            self.title_name = "Status of " + mrname + " Report";
            title = self.title_name;
            curtime = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time()));
            title += "_" + str(curtime);
        else:
            if(hasattr(self.fecher,"getWindowTitle")):
               title = self.fecher.getWindowTitle(self.action,self.gids);
        return title;


    def getUname(self):
        """Expired method (not in use)
        """
        pid = os.getpid();
        
    def getMRName(self):
        """Especially for LTE subsystem.
        """
        mrName_list = self.fecher.getMrname(self.gids);
        if(isinstance(mrName_list,str)):
            self.showDialog("Error", mrName_list);
            mrName_list = [];
        mrname = "";
        for MR_Name in mrName_list:
            mrname += " " + MR_Name;
        return mrname;
    
    def showDialog(self,title,information):
        """To show the dialog including some error information before show status window.
        @param:title the window title of message dialog
        @param:information the content in the window.
        """
        window = gtk.Dialog(title,
                   None,
                   gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                   ("OK", gtk.RESPONSE_ACCEPT))

        label = gtk.Label("\n" + information+"\n");
        label.set_justify(gtk.JUSTIFY_LEFT)

        window.vbox.pack_start(label,False, False,0)
        label.show();
        window.set_has_separator(False);
        window.set_resizable(False);
        window.run();
        window.destroy();
class FetcherFactory:
    """The factory is for creating subcontrol class. The default fetcher is LTEStatusFetcher
    @version:1.0
    @author:bobyan
    @modify:
    """
    def __init__(self):
        """Construct the factory instance
        @param:dataControl it's the controlaccess, subcontrol can use it to control the GUI
        """
        pass;
    def getFetcher(self, fetcherCls):
        """Get the subcontrol instance
        @param:fetcherCls It's the name of subcontrol class. If subcontrol has the "setControlHome"
        method, it set the controlaccess into subcontrol.
        @return:fetcher subcontrol instance.
        @exception: It will report error if no subcontrol class found in /opt/nokia/oss/bin folder.
        """       
        fetcher = None;
        try:
            mod = __import__(fetcherCls, globals(), locals(), [fetcherCls])
            klass = getattr(mod, fetcherCls)
            fetcher = klass();
            #below 2lines is useless any more, datacontrol is singleton now
            #if(hasattr(fetcher, "setControlHome")):
            #    fetcher.setControlHome(self.dataControl);
        except:
            fetcher = "Can't import " + str(fetcherCls) + "\n" + str(sys.exc_info()[1]);
        return fetcher;



## I am using a separate thread to run my code, but the application (or the UI) hangs.
## http://faq.pygtk.org/index.py?file=faq20.006.htp&req=show
## There are a couple of hitches you can run into when trying to use threading and PyGTK together. 
## For starters, if you are using threads, no matter if you are doing PyGTK calls from a separate thread or not, 
## you must compile PyGTK with --enable-threads. 
## 1) call gobject.threads_init() at applicaiton initialization.
## 2) make sure the threads never do any GUI tasks directly. 
##    Instead, you use gobject.idle_add to schedule GUI task to executed in the main thread.
class DataFetcherThread(threading.Thread):
    def __init__(self, guard, fecher, fetchType, gids):
        #threading.Thread.__init__(self);
        # got error  :assert group is None, "group argument must be None for now"
        #
        # class threading.Thread(group=None, target=None, name=None, args=(), kwargs={}) 
        # If the subclass overrides the constructor, 
        # it must make sure to invoke the base class constructor (Thread.__init__()) 
        # before doing anything else to the thread.
        threading.Thread.__init__(self);

        # save param for later use
        self._guard = guard;
        self._fecher = fecher;
        self._fetchType = fetchType;
        self._gids = gids;

        self._data = [];            # the data copy in worker thread
                                    # after fetched from DB, GUI thread will copy it to GUI thread for later use.
        self.ShouldQuit = False;
        self.needFetchData = False;

    def run(self):
        while( not self.ShouldQuit ):
            self._guard.waitUntilCanStartFetchData();
            # because waitUntilCanStartFetchData is blocking
            # so, at here, ShouldQuit may has been changed to true
            if ( self.ShouldQuit ):
                break;
            self.doDataFetch();
            # because doDataFetch is time-consuming
            # so, at here, ShouldQuit may bas been changed to true
            if ( self.ShouldQuit ):
                break;
            self._guard.notifyGUI_DataReady(self._data);
        
    def doDataFetch(self):
#        a = time.time()
#        print "[in thread:", threading.currentThread().getName(), "] data-fetching... start time = ",a;
        if ( not self._fecher ):
#            print "Fatal: fecher class is none.";
            raise Exception(self._fecher);
        if ( not hasattr(self._fecher, "getTopyInfo") ):
#            print "Fatal: fecher class does not has getTopyInfo method.";
            raise Exception(self._fecher);
        self._data = self._fecher.getTopyInfo(self._fetchType, self._gids);
#	if(not isinstance(self._data,str)):
#            print "[in thread:", threading.currentThread().getName(), "] data-fetching...(rows:",len(self._data.getRawData()),") end time = ",time.time(), " cost = ",time.time()-a;

class ThreadGuard:
    def __init__(self, gui):
        self.evt  = threading.Event();   # event to indicate whether can fetch data from DB
        self.evt2 = threading.Event();   # event to indicate whether GUI has processed worker's latest data.
        self._guiThread = gui;
        self.needFetchData = False;
        self._workerData = None;
        #self._guiData = None;

    def isDataReady(self):
        return self.evt.isSet();

    def canStartFetchData(self):
        return ( self.evt.isSet() and (not self.evt2.isSet()) );

    def notifyWorkerStartFetchData(self):
        self.evt.set();

    def notifyWorkerDataProcessed(self):
        self.evt2.clear();

    def waitUntilCanStartFetchData(self):
#        print "[in thread:", threading.currentThread().getName(), "] waitUntilCanStartFetchData.";
        self.evt.wait();
#        print "[in thread:", threading.currentThread().getName(), "] can start needFetchData now! ";

    def notifyGUI_DataReady(self, worker_data):
#        print "[in thread:", threading.currentThread().getName(), "] notifyGUI_DataReady.";
        self.needFetchData = False;
#        print "[in thread:", threading.currentThread().getName(), "] clear evt.";
        self.evt.clear();   # clear the event, so worker thread will not do data fetch
                            # until GUI notifyWorkerStartFetchData again.
#        print "[in thread:", threading.currentThread().getName(), "] set evt2.";
        self.evt2.set();  # set the event, so worker thread will not do data fetch
                          # until GUI notifyWorkerDataProcessed again.
        self._workerData = worker_data;
        gobject.idle_add(self._guiThread.copyDataFromWorkerThread, self._workerData, priority=gobject.PRIORITY_HIGH_IDLE);

    def wakeupWorkerBeforeExit(self):
        if ( not self.evt.isSet() ):
            self.evt.set();
        if ( self.evt2.isSet() ):
            self.evt.clear();

    def getLatestData(self):
        return self._workerData;

class CMDParameter:
    """CMDParameter is the class for initializing args from commandline
    @version:1.0
    @author:bobyan
    @modify:
    """    
    def __init__(self):
        """Initiate the parameter dict.
        """
        self.parameters = {};
        pass;
    def set_property(self,key,value):
        """Input the (key,value) into the parameter dict.
        @param:key
        @param:value
        """        
        self.parameters[key] = value;
    def get_property(self, key):
        """get value from parameter dict. If no such key, return None.
        @param:key 
        @return:value
        """     
        value = None;
        if(self.parameters.has_key(key)):
            value = self.parameters[key];
        return value;
    
def parseCommands(args):
    '''Change the commandline to CMDParameter instance.
    @param:args str the command line from other process.
    '''
    gids = [];
    action = args[1];
    fetcherCls = "LTEStatusDataFetch";             
    args = args[1:];
    for arg in args:
        pos = arg.find("=");
        if(pos > 0 and cmp(arg[0:pos].lower(),'action') == 0):
            action = arg[pos+1:];
        elif(pos > 0 and cmp(arg[0:pos].lower(),'subcontrol') == 0):
            fetcherCls = arg[pos+1:];
        else:   
            if(cmp(action, arg) == 0):
               continue;
            gids.append(arg);
        
    paras = CMDParameter();
    paras.set_property('gid',gids);
    paras.set_property('action',action);
    paras.set_property('fetcherCls',fetcherCls);
    return paras;
# end def parseCommands(args):

if __name__ == "__main__":
##    print "args=", sys.argv;
    cmd_paras = parseCommands(sys.argv);
    control = LTEStatusControl(cmd_paras);
    control.run();

