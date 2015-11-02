import sys;
import time
import LTEStatusDataFetch as LTEStatusDataFetch;
from LTEStatusDataFetch import *;
import LTEStatusGUI as LTEStatusGUI
from LTEStatusGUI import ViewHandlerBase
import LTEStatusActions

class LTEStatusSubControl:
    def __init__(self):
    
        self.dataFetch = LTEStatusDataFetch();
        
        self.actionCls_list = ["LTEStatusActions"];
        #####################################################################################
        #moved the columnDef and mainmenu and ... definition here ,when LTEStatusControl call
        #LTEStatusSubControl, columnDef e.g. will be initialize automaticly.
        #####################################################################################
        self.columnDef = ( ":ID=check;widget=checkbutton;sort=true;pos=0;action=UPDATEACTIONSTATE"
                           ",GID:visible=false"
                           ",DN:expander=true;sorttype=both[SYSTEM_ID];filter=NEType"
                           #",DN:expander=true;sorttype=both;filter=NEType"
                           ",Name"
                           ",Operational state:ID=Operational"
                           ",Administrative state:ID=Administrative"
                           ",Alarm status:ID=Alarms"
                           ",Unknown Status:ID=Connection"
                           ",IP Address:ID=IP"
                           ",Version:visible=false"
                           ",NetAct Object State:ID=COSTATE;filter=true;visible=false"
                           ",System ID:ID=SYSTEM_ID;values=notchanged;visible=false"
			   ",RowColor:visible=false"
                         );
        self.main_menu = [ {'File':{'submenu':[ {'Export':{'action':"FILEEXPORT"}}
                                               ,{'Exit':{'action':'WINDOWQUIT'}}
                                              ]
                                   }
                           }
                          ,{'Edit':{'submenu':[ {'Copy Selected Rows':{'action':'EDITCOPYSELECTED'}}
                                               ,{'Copy All':{'action':'EDITCOPYALL'}}
                                               ,{'Select All':{'action':'EDITSELECTALL'}}
                                               ,{'Unselect All':{'action':'EDITSUNELECTALL'}}
                                               ,'space'
                                               ,{'Collapse All':{'action':'EDITSCOLLAPSEALL'
                                                                 ,'default':'disabled'
                                                                 ,'ID':'EIDTSCOLLAPSEALL'
                                                                }
                                                }
                                               ,{'Expand All':{ 'action':'EDITSEXPANDALL'
                                                               ,'default':'disabled'
                                                               ,'ID':'EIDTSEXPANDALL'
                                                              }
                                                }
                                              ]
                                   }
                           }
                          ,{'Operation':{'submenu':[ {'Lock':{'action':'LOCKIMMEDIATE','ID':'MENU_LOCK'}}
                                                    ,{'Shutdown':{'action':'LOCKGRACEFUL','ID':'MENU_SHUTDOWN'}}
                                                    ,{'Unlock':{'action':'UNLOCKLNCEL','ID':'MENU_UNLOCK'}}
                                                    ,{'Reset':{'action':'RESETLNBTS','ID':'MENU_RESET'}}
                                                    ,'space'
                                                    ,{'Refresh':{'action':'ACTIONREFRESHONCE','ID':'MENU_REFRESH'}}
                                                   ,{'Automatic Refresh':{ 'type':'check'
                                                                          ,'ID':'MENU_AUTOREFRESH'
                                                                          ,'action':'ACTIONAUTOREFRESH'
                                                                         }
                                                    }
                                                   ]
                                        }
                           }
                          ,{'Settings':{'submenu':[ {'Show Listview':{ 'action':'SHOWLISTVIEW'
                                                                      ,'ID':'TREEVIEW'
                                                                      ,'type':'radio'
                                                                     }
                                                    }
                                                   ,{'Show Treeview':{ 'action':'SHOWTREEVIEW'
                                                                      ,'group':'TREEVIEW'
                                                                      ,'default':'active'
                                                                      ,'type':'radio'
                                                                     }
                                                    }
                                                   ,{'Filters':{'action':'DATAFILTER'}}
                                                   ,{'Autorefresh Interval':{'action':'AUTO_REFRESH_INTERVAL'}}
                                                  ]
                                       }
                           }
                         ];
        self.toolitems = [ {'Refresh':{'hint': 'Fetch data manually'
                                       ,'ID':'TOOLBAR_REFRESH'
                                       ,'action':'ACTIONREFRESHONCE'
                                      }
                           }
                          ,'space'
                          ,{'Autorefresh':{ 'hint':'Enable automatic refresh|Disable automatic refresh'
                                           ,'ID':'TOOLBAR_AUTOREFRESH'
                                           ,'type':'toggle'
                                           ,'action':'ACTIONAUTOREFRESH'
                                          }
                           }
                          ,'space'
                          ,{'Shutdown':{ 'hint':'Lock selected LNCELs by using graceful shutdown'
                                        ,'action':'LOCKGRACEFUL'
                                        ,'ID':'TOOLBAR_SHUTDOWN'
                                       }
                           }
                          ,'space'
                          ,{'Lock':{'hint':'Lock selected LNCELs immediately','action':'LOCKIMMEDIATE','ID':'TOOLBAR_LOCK'}}
                          ,'space'
                          ,{'Unlock':{'hint':'Unlock selected LNCELs','action':'UNLOCKLNCEL','ID':'TOOLBAR_UNLOCK'}}
                          ,'space'
                          ,{'Reset':{'hint':'Reset selected LNBTSs','action':'RESETLNBTS','ID':'TOOLBAR_RESET'}}
                          ,'space'
                          ,{'Find :':{'type':'label'}}
                          ,{'searchEntry':{'type':'entry','ID':'TOOLBAR_FINDENTRY'}}
                          ,{'Previous':{'hint':'Find previous match', 'action':'FINDPREVIOUS'}}
                          ,{'Next':{'hint':'Find next match','action':'FINDNEXT'}}
                         ];
     
        self.tableRightMenu = [ {'Copy Selected Rows':{'action':'EDITCOPYSELECTED'}}
                               ,{'Copy ALL':{'action':'EDITCOPYALL'}}
                               ,'space'
                               ,{'Alarm Monitor':{'action':'ALARMLINK'}}
                              ];
     
             # TODO
        self.filters = {"DN":{ "OMS":True 
                              ,"FTM":False
                              ,"LNBTS":True
                              ,"LNCEL":True
                              ,"MRBTS":False
                             }
                        ,"COSTATE":{ "Non operational":False
                                    ,"Operational":True
                                    ,"Created from the network":True
                                   }
                       };
        self.dataActions = {};
        self.windowActions = {};
        #mergeAction() will be called when LTEStatusSubControl is imported
        self.mergeAction();
        pass;
    def getWindowTitle(self, action, gids):
        """
        Get Report Window Title for LTE Status Display.
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
        return title;

    def getTopyInfo(self, action, gids):
        #print("action:" + action + ";gid=" + gids[0]);
        data = self.dataFetch.getTopyInfo(action, gids);
        return data;

    def getMrname(self, lnbts_gid_arr):
        return self.dataFetch.getMrname(lnbts_gid_arr);

    def launchAlarmMonitor(self,gid):
        #print("gid:" + gid);
        self.dataFetch.launchAlarmMonitor(gid);

    def setDefaultView(self, gui, data):
        for aobj in self.action_obj_list:
            if(hasattr(aobj, "setDefaultView")):
                aobj.setDefaultView(gui, data);

    def onInitTableRightMenu(self, gui, menu):
        for aobj in self.action_obj_list:
            if(hasattr(aobj, "onInitTableRightMenu")):
                aobj.onInitTableRightMenu(gui, menu);

    def copyDataFromWorkerThread(self, gui, worker_data):
        for aobj in self.action_obj_list:
            if(hasattr(aobj, "copyDataFromWorkerThread")):
                aobj.copyDataFromWorkerThread(gui, worker_data);

    def mergeAction(self):
        # for registerSignalHandler
        self.action_obj_list = [];

        for cls in self.actionCls_list:
            action_obj = self.loadActionClass(cls, None);
            if(action_obj == None):
                continue;
            self.action_obj_list.append(action_obj);
            if ( hasattr(action_obj, "isGUIActions") and action_obj.isGUIActions ):
                self.guiActionsObj = action_obj;

            self.dataActions.update(action_obj.getDataActions());
            self.windowActions.update(action_obj.getWindowActions());
        pass;

    def setGUIObj(self, gui):
        for aobj in self.action_obj_list:
            if(hasattr(aobj, "setGUIObj")):
                aobj.setGUIObj(gui);

    def loadActionClass(self, actionCls, gui):
        if(actionCls == None or len(actionCls) == 0):
            return None;
        actionObject = None;
        try:
            mod = __import__(actionCls, globals(), locals(), [actionCls])
            klass = getattr(mod, actionCls)
            actionObject = klass(gui);
        except:
            print("can't import " + actionCls +  "\n" + str(sys.exc_info()[1]));
            actionObject = None;
        return actionObject;
    
