import LTEStatusGUI as LTEStatusGUI
from LTEStatusGUI import *
from LTEStatusData import *

#############################################
# Author: Dong Jiantao

# Date: 05-18-2012
# OMS block support for list view
class ListHandler_LTEStatusDisplay_OMS(ListHandler_LTEStatusDisplay):
    def __init__(self):
        ListHandler_LTEStatusDisplay.__init__(self);

    def compareValue(self, value1, value2, sort_type):
        if(value1==None):
            value1 = "";
        if(value2==None):
            value2 = "";
        if(cmp(sort_type,'num') == 0):
                data1 = re.findall('\d+',value1);
                data2 = re.findall('\d+',value2);
                count = min(len(data1),len(data2));
                if(count == 0):
                    return cmp(value1,value2);
                else:
                    for i in range(0,count):
                        if(cmp(int(data1[i]),int(data2[i])) != 0 ):
                            return cmp(int(data1[i]),int(data2[i]));
                    return cmp(len(data1), len(data2));
        elif(cmp(sort_type,'both') == 0 or cmp(sort_type,'both[SYSTEM_ID]') == 0):
            data1 = re.findall('\d+|\D+',value1);
            data2 = re.findall('\d+|\D+',value2);
            count = min(len(data1),len(data2));
            if(count == 0):
                return cmp(value1,value2);
            else:
                for i in range(0,count):
                    sec_value1 = data1[i].isdigit() and int(data1[i]) or data1[i];
                    sec_value2 = data2[i].isdigit() and int(data2[i]) or data2[i];                                  
                    if(cmp(sec_value1,sec_value2) != 0 ):
                        return cmp(sec_value1,sec_value2);
                return cmp(len(data1), len(data2));
        elif(cmp(sort_type,'str') == 0):
            return cmp(value1,value2);
        else:
            raise Exception("Error! Sort type not defined!");


# Date: 04-27-2012
# Level-1 OMS support for tree view
class DnTreeHandler_LTEStatusDisplay_OMS(DnTreeHandler_LTEStatusDisplay):
    # by default, the Level-1 dn is OMS/LNBTS
    def __init__(self):
        DnTreeHandler_LTEStatusDisplay.__init__(self);

        self.setL1DnPattern('^(.*OMS-\d+|.*LNBTS-\d+)/.*$');

    def expandall(self,widget, gui):
        treemodel = gui.liststore_tree;
        iter = treemodel.get_iter_root();
        while(iter != None):
#            print "fill lazyloading data for iter:", treemodel.get_value(iter, ViewHandlerBase.colIndexMap['DN']);
            gid = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('GID'));
            if ( self.dummyGID_DN == gid ):
                # The row is an Level-1 DN row and it's not expanded.
                self._expandL1Row(gui.w.tv, iter);
            iter = treemodel.iter_next(iter);

#        print "lazyloading data filled, do full expaned."
        gui.w.tv.expand_all();

    def changeL1DnPattern(self, filters):
        ## TODO: adding 3G StatusDisplay L1 counterpart obj in 5.4cd2
        if ( isinstance(filters, dict) and filters.has_key('DN') ):
            dnf = filters['DN'];
            for key in CheckboxColumnHelper.show_NE.keys():
                CheckboxColumnHelper.show_NE[key] = isinstance(dnf, dict) and dnf.has_key(key) and dnf[key];
#                print "CheckboxColumnHelper.show_NE[", key, "]=", CheckboxColumnHelper.show_NE[key];
            #
            if ( CheckboxColumnHelper.showNEType('MRBTS') ):
                self.setL1DnPattern('^(.*MRBTS-\d+)/.*$');
                if (CheckboxColumnHelper.showNEType('OMS')):
                    self.setL1DnPattern('^(.*OMS-\d+|.*MRBTS-\d+)/.*$');
            elif ( CheckboxColumnHelper.showNEType('LNBTS') ):
                self.setL1DnPattern('^(.*LNBTS-\d+)/.*$');
                if (CheckboxColumnHelper.showNEType('OMS')):
                    self.setL1DnPattern('^(.*OMS-\d+|.*LNBTS-\d+)/.*$');
#            elif ( CheckboxColumnHelper.showNEType('WBTS') ):
#                self.setL1DnPattern('^(.*WBTS-\d+)/.*$');
            else:
                self.setL1DnPattern('^(.*LNCEL-\d+|.*WCEL-\d+|.*FTM-\d+)/.*$');
                if (CheckboxColumnHelper.showNEType('OMS')):
                    self.setL1DnPattern('^(.*OMS-\d+|.*LNCEL-\d+|.*WCEL-\d+|.*FTM-\d+)/.*$');

    def fillLazyLoadingData(self, gui, node):
        dn = node.get_property('DN');
#        print "fillLazyLoadingData, dn", dn;
        if ( len(dn) > 0 ):
            treemodel = gui.liststore_tree;
            (is_l1_dn, l1_dn) = self.getL1Dn(dn);
            if ( is_l1_dn ):
#                print 'is_l1_dn', l1_dn, node;
                dnIter = self.createNotExpandedDnIter(node, treemodel);
                # lazy loading
                # create a dummy child since still not have one, only except that l1_dn is OMS
                p = re.compile('.*OMS.*');
                matchObj = p.match(l1_dn);
                if (matchObj == None):
                    self.createDummyChild(treemodel, dnIter);
                else:
                    treemodel.set_value(dnIter, ColumnDef.getInstance().colIndexMap('GID'), node.get_property('GID'));
                treemodel.set_value(dnIter, ColumnDef.getInstance().colIndexMap('SYSTEM_ID'), node.get_property('SYSTEM_ID'));
                self.L1IterMap[l1_dn] = dnIter;
                self.L1NodeMap[l1_dn] = node;
            else:
                # save non-Level-1 real node into our "1-hash+1-array" for later use.
                l2_array = [];
                if ( self.L1Hash.has_key(l1_dn) ):
                    l2_array = self.L1Hash[l1_dn];
                l2_array.append(node);
#                print "l2_array for l1_dn(", l1_dn, ")=", l2_array;
                self.L1Hash[l1_dn] = l2_array;

    def compareValue(self, value1, value2, sort_type):
        if(value1==None):
            value1 = "";
        if(value2==None):
            value2 = "";
        if(cmp(sort_type,'num') == 0):
                data1 = re.findall('\d+',value1);
                data2 = re.findall('\d+',value2);
                count = min(len(data1),len(data2));
                if(count == 0):
                    return cmp(value1,value2);
                else:
                    for i in range(0,count):
                        if(cmp(int(data1[i]),int(data2[i])) != 0 ):
                            return cmp(int(data1[i]),int(data2[i]));
                    return cmp(len(data1), len(data2));
        elif(cmp(sort_type,'both') == 0 or cmp(sort_type,'both[SYSTEM_ID]') == 0):
            data1 = re.findall('\d+|\D+',value1);
            data2 = re.findall('\d+|\D+',value2);
            count = min(len(data1),len(data2));
            if(count == 0):
                return cmp(value1,value2);
            else:
                for i in range(0,count):
                    sec_value1 = data1[i].isdigit() and int(data1[i]) or data1[i];
                    sec_value2 = data2[i].isdigit() and int(data2[i]) or data2[i];                                  
                    if(cmp(sec_value1,sec_value2) != 0 ):
                        return cmp(sec_value1,sec_value2);
                return cmp(len(data1), len(data2));
        elif(cmp(sort_type,'str') == 0):
            return cmp(value1,value2);
        else:
            raise Exception("Error! Sort type not defined!");

# End of Level-1 OMS support of Tree
#############################################

# LTE StatusDisplay specific actions
#class LTEStatusActions(GUIActions):
class LTEStatusActions(StatusReportActionsBase):
    def __init__(self, gui):
        GUIActions.__init__(self, gui);
        self.dataActions = {};
        self.windowActions = {};
        self.initActions();

        self.viewHandler[ViewHandlerBase.viewType_List] = ListHandler_LTEStatusDisplay_OMS();
        self.viewHandler[ViewHandlerBase.viewType_DN] = DnTreeHandler_LTEStatusDisplay_OMS();

        # self.windowActions['EDITSEXPANDALL'] = self.expandall;
        # not need to register again, since it's already resigtered in the base class GUIActions
        # what needed is we override the def expandall(self,widget, gui):

    def expandall(self,widget, gui):
#        print "action expandall called";
        if (ViewHandlerBase.currentActivatedView == ViewHandlerBase.viewType_DN):
            self.viewHandler[ViewHandlerBase.viewType_DN].expandall(widget, gui);
        else:
            # for list view, do nothing
            print "for list view, do nothing for expand."

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
        node_list = self.getCheckedNodes(action_name, gui);
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
        node_list = self.getCheckedNodes(action_name, gui);
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
        node_list = self.getCheckedNodes(action_name, gui);
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
        node_list = self.getCheckedNodes(action_name, gui);
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
        nodes = self.getCheckedNodes("reset", gui);
        enabledReset = True;
        enabledShutdown = True;
        enableLock = True;
        enableUnlock = True;
        statusText = "";
        hasBTS = False;
        hasLNCEL = False;
        for node in nodes:
            if(node == None):
                continue;
            version = node.getVersion();
            if(cmp(node.getNEType(),'LNBTS')==0):
                hasBTS = True; 
            if(cmp(node.getNEType(),'LNCEL')==0):
                hasLNCEL = True; 
            if(hasBTS and hasLNCEL):
                enabledReset = False;
                statusText ="LNBTS and LNCEL can't be reset together.\t";
            if(cmp(node.getNEType(),'LNCEL') != 0 and cmp(node.getNEType(),'LNBTS')!=0):
               enabledReset = False;
               enabledShutdown = False;
               enableLock = False;
               enableUnlock = False;
               statusText = statusText + node.getDN() + "("+ node.getNEType()+") can't support lock/reset...\t";
            if(cmp(node.getNEType(),'LNCEL') == 0 and cmp(node.getAdministrative(),"Locked") == 0):
               enabledShutdown = False;
               statusText = statusText + node.getDN() + "(Locked) can't do shutdown\t";
            if(cmp(node.getNEType(),'LNCEL') == 0 and (cmp(version,'LN1.0') == 0 or cmp(version,'LNT1.0')==0)):                
                enabledShutdown = False;
                statusText = statusText + node.getDN() + "(RL10/RL15) can't support shutdown\t";
            if(cmp(node.getNEType(),'LNBTS') == 0 and cmp(version,'LN1.0') == 0):
                enabledReset = False;
                statusText = statusText + node.getDN() + "(RL10) can't support reset. Please do it via Site Manager.\t";
            if(cmp(node.getNEType(), 'LNBTS') == 0):
                 children = gui.data.getChildren(node);
                 for child in children:
                    if(cmp(child.getCOSTATE(),"Operational") != 0):
                       continue;
                    childversion = child.getVersion();
                    if(cmp(child.getNEType(),'LNCEL') == 0 and (cmp(childversion,'LN1.0') == 0 or cmp(childversion,'LNT1.0')==0)):
                        enabledShutdown = False;
                        statusText = statusText + node.getDN() + "(RL10/RL15) can't support shutdown\t";
                    if(cmp(child.getNEType(),'LNCEL') == 0 and cmp(child.getAdministrative(),"Locked") == 0):
                        enabledShutdown = False;
                        statusText = statusText + child.getDN() + "(Locked) can't do shutdown\t";
            if(cmp(node.getNEType(),'LNCEL') == 0 and (cmp(version,'LN1.0') == 0)):
                 enabledReset = False;
                 statusText = statusText  + node.getDN() + "(" + version + ")" + " can't support reset.\t";           
            
            if(enabledReset == False and enabledShutdown == False):
                 break;
       # if(len(statusText) > 0):
        gui.showStatus(gui.STATUS_MSG,statusText);
        self.__setActionStatus("reset",enabledReset,gui);
        self.__setActionStatus("shutdown",enabledShutdown,gui);
        self.__setActionStatus("lock",enableLock,gui);
        self.__setActionStatus("unlock",enableUnlock,gui);

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
