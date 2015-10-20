import LTEStatusGUI as LTEStatusGUI
from LTEStatusGUI import *
from LTEStatusData import *
from LTEStatusViewHandler import *

class LTEStatusActions(StatusReportActionsBase):
    def __init__(self, gui):
        GUIActions.__init__(self, gui);
        self.dataActions = {};
        self.windowActions = {};
        self.initActions();

        self.viewHandler[ViewHandlerBase.viewType_List] = ListHandler_LTEStatusDisplay();
        self.viewHandler[ViewHandlerBase.viewType_DN] = DnTreeHandler_LTEStatusDisplay();

    def expandall(self,widget, gui):
#        print "action expandall called";
        if (ViewHandlerBase.currentActivatedView == ViewHandlerBase.viewType_DN):
            self.viewHandler[ViewHandlerBase.viewType_DN].expandall(widget, gui);

    def getDataActions(self):
        return self.dataActions;
    def getWindowActions(self):
        return self.windowActions;

    def getSystemID(self, node, value):
        return value;
    
    def initActions(self):
        self.dataActions['getSYSTEM_ID'] = self.getSystemID;

        self.windowActions[self.LOCK_IMMEDIATE] = self.immediate_lock;
        self.windowActions[self.LOCK_GRACEFUL] = self.graceful_lock;
        self.windowActions[self.UNLOCK_LNCEL] = self.unlock_lncel;
        self.windowActions[self.RESET_LNBTS] = self.reset_lnbts; 
        self.windowActions[self.UPDATE_ACTIONSTATE] = self.update_actionstate;

    def setDefaultView(self, gui, data):
        self.refreshOnce(None, gui);
    
    def immediate_lock(self,widget,gui):
        '''Lock LNCEL checked by operator(For LTE), it can popup a comfirm dialog and then do lock action if operator click OK button.
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        '''
        action_name = 'locked';
        node_list = gui.action_invoker.viewHandler[ViewHandlerBase.currentActivatedView].getCheckedNodes(action_name)
        dialog = ConfirmDialogForLock(gui.w, action_name, node_list);
        isConfirmed = dialog.show();
        if(not isConfirmed):
            return;
        node_executeList = dialog.getCheckedNodeList();
        gids = "";
        for node in node_executeList:
            gid = node.getGID();
            gids += " " + gid;
        if(len(node_executeList) == 0):
            return;
        cmd = " lteBatchExecuter.pl nogui_lock  " + gids;
        self._runCMD(cmd);

    def graceful_lock(self,widget,gui):
        '''Shutdown LNCEL checked by operator(For LTE), it can popup a comfirm dialog and then do shut down action if operator click OK button.
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        '''        
        action_name = 'shut down';
        node_list = gui.action_invoker.viewHandler[ViewHandlerBase.currentActivatedView].getCheckedNodes(action_name)
        dialog = ConfirmDialogForLock(gui.w, action_name, node_list);
        isConfirmed = dialog.show();
        if(not isConfirmed):
            return;
        node_executeList = dialog.getCheckedNodeList();
        gids = "";
        for node in node_executeList:
            gid = node.getGID();
            gids += " " + gid;
        if(len(node_executeList) == 0):
            return;
        cmd = " lteBatchExecuter.pl nogui_shutdown " + gids;
        self._runCMD(cmd);

    def unlock_lncel(self,widget,gui):
        '''Unlock LNCEL checked by operator(For LTE), it can popup a comfirm dialog and then do unlock action if operator click OK button.
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        '''
        action_name = 'unlocked';
        node_list = gui.action_invoker.viewHandler[ViewHandlerBase.currentActivatedView].getCheckedNodes(action_name)
        dialog = ConfirmDialogForLock(gui.w, action_name, node_list);
        isConfirmed = dialog.show();
        if(not isConfirmed):
            return;
        node_executeList = dialog.getCheckedNodeList();
        gids = "";
        for node in node_executeList:
            gid = node.getGID();
            gids += " " + gid;
        if(len(node_executeList) == 0):
            return;
        cmd = " lteBatchExecuter.pl nogui_unlock  " + gids;
        self._runCMD(cmd);

    def reset_lnbts(self,widget,gui):
        '''Reset LNBTS checked by operator(For LTE), it can popup a comfirm dialog and then do reset action if operator click OK button.
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        '''
        action_name = 'reset';
        node_list = gui.action_invoker.viewHandler[ViewHandlerBase.currentActivatedView].getCheckedNodes(action_name)
        dialog = ConfirmDialogForLock(gui.w, action_name, node_list);
        isConfirmed = dialog.show();
        if(not isConfirmed):
            return;
        node_executeList = dialog.getCheckedNodeList();
        gids = "";
        for node in node_executeList:
            gid = node.getGID();
            gids += " " + gid;
        if(len(node_executeList) == 0):
            return;
        listType = self.__getListType(node_executeList);
        cmd = " lteBatchExecuter.pl nogui_lnbts_reset  " + gids;
        if(cmp(listType, "LNCEL") == 0):
            cmd = " lteBatchExecuter.pl nogui_lncel_reset  " + gids;
        self._runCMD(cmd);

    def update_actionstate(self,widget, gui):
        '''This is for lock/unlock/shutdown/reset, If the operator click the checkbutton at the first column, it trigger this action.
        This action can check if the selected row satisfy "lock/unlock/reset/shutdown". If no, it greys out these buttons.
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        '''
        nodes = gui.action_invoker.viewHandler[ViewHandlerBase.currentActivatedView].getCheckedNodes("reset")
        enabledReset = True;
        enabledShutdown = True;
        enableLock = True;
        enableUnlock = True;
        statusText = "";
        hasBTS = False;
        hasLNCEL = False;
        
        for node in nodes:
            dn = node.getDN()
#            print " dn = ",dn
            neType = node.getNEType()
            if(node == None):
                continue;
            version = node.getVersion();
            if(cmp(neType,'LNBTS')==0):
                hasBTS = True; 
            if(cmp(neType,'LNCEL')==0):
                hasLNCEL = True; 
            if(hasBTS and hasLNCEL):
                enabledReset = False;
                statusText ="LNBTS and LNCEL can't be reset together.\t";
            if(cmp(neType,'LNCEL') != 0 and cmp(neType,'LNBTS')!=0):
                enabledReset = False;
                enabledShutdown = False;
                enableLock = False;
                enableUnlock = False;
                statusText = statusText + dn + "("+ neType+") can't support lock/reset...\t";
            if(cmp(neType,'LNCEL') == 0 and cmp(node.getAdministrative(),"Locked") == 0):
                enabledShutdown = False;
                statusText = statusText + dn + "(Locked) can't do shutdown\t";
            if(cmp(neType,'LNCEL') == 0 and (cmp(version,'LN1.0') == 0 or cmp(version,'LNT1.0')==0)):                
                enabledShutdown = False;
                statusText = statusText + dn + "(RL10/RL15) can't support shutdown\t";
            if(cmp(neType,'LNBTS') == 0 and cmp(version,'LN1.0') == 0):
                enabledReset = False;
                statusText = statusText + dn + "(RL10) can't support reset. Please do it via Site Manager.\t";
            if(cmp(neType, 'LNBTS') == 0):
                children = node.getChildren()
                for child in children:
                    childNeType = child.getNEType()
                    childCoState  = child.getCOSTATE() 
                    if(cmp(childCoState,"Operational") != 0):
                        continue;
                    childversion = child.getVersion();
                    if(cmp(childNeType,'LNCEL') == 0 and (cmp(childversion,'LN1.0') == 0 or cmp(childversion,'LNT1.0')==0)):
                        enabledShutdown = False;
                        statusText = statusText + dn + "(RL10/RL15) can't support shutdown\t";
                    if(cmp(childNeType,'LNCEL') == 0 and cmp(child.getAdministrative(),"Locked") == 0):
                        enabledShutdown = False;
                        statusText = statusText + child.getDN() + "(Locked) can't do shutdown\t";
            if(cmp(neType,'LNCEL') == 0 and (cmp(version,'LN1.0') == 0)):
                enabledReset = False;
                statusText = statusText  + dn + "(" + version + ")" + " can't support reset.\t";           
            
            if(enabledReset == False and enabledShutdown == False):
                break;
            
        self.__setActionStatus("reset",enabledReset,gui);
        self.__setActionStatus("shutdown",enabledShutdown,gui);
        self.__setActionStatus("lock",enableLock,gui);
        self.__setActionStatus("unlock",enableUnlock,gui);
        gui.showStatus(gui.STATUS_MSG,statusText);

   
    def __getListType(self, inList):
        '''It's for getting current node type in the list.
        @param:inList  list of LTEDataNode
        @return:str if including several type ,it returns mixed, or the NEType
        '''
        myType = None;
        for node in inList:
            if(myType == None):
                myType = node.getNEType();
            else:
                if(cmp(myType, node.getNEType()) != 0):
                    myType = "mixed";
                    break;
        return myType;
    def __setActionStatus(self, actionname, isEnabled, gui):
        '''It's for changing the state of buttons(lock/unlock/shutdown/reset)
        @param:actionname str It's the possible value of lock/unlock/reset/shutdown
        @param:isEnabled bool If True means enable the button.
        @param:gui LTEStatusGUI instance
        '''
        menu_id = "MENU_" + actionname.upper();
        toolbar_id = "TOOLBAR_" + actionname.upper();
        menu_button = gui.get_object(menu_id);
        if(menu_button != None):  
            menu_button.set_sensitive(isEnabled);
        toolbar_button = gui.get_object(toolbar_id);
        if(toolbar_button != None):
            toolbar_button.set_sensitive(isEnabled);
