import re;
import time,gtk,gobject

class Singleton(type):
    """Singleton Metaclass"""

    def __init__(cls, name, bases, dic):
        #print "Singleton2::__init__ enter", cls, name, bases, dic;
        super(Singleton, cls).__init__(name, bases, dic)
        cls.instance = None
        #print "Singleton2::__init__ leave";

    def __call__(cls, *args, **kwargs):
        #print "Singleton2::__call__ enter";
        if cls.instance is None:
            #print "Singleton2::__call__, do init and super(Singleton2, cls)=",super(Singleton2, cls).__class__.__name__;
            cls.instance = super(Singleton, cls).__call__(*args, **kwargs)
        #print "Singleton2::__call__ leave";
        return cls.instance

    def getInstance(cls, *args, **kwargs):
        #print "Singleton2::getInstance enter and cls=",cls;
        if cls.instance is None:
            #print "Singleton2::getInstance, do init";
            cls.instance = super(Singleton, cls).__call__(*args, **kwargs)
        #print "Singleton2::getInstance leave";
        return cls.instance

class DataControl:
    """DataControl is a dataaccess for subcontrol, it provides the following interfaces:
    1.Regist actions into guiaccess
    2.Define the columns
    3.Define the mainmenu
    4.Define the toolbar
    5.Define the right menu of table.
    @version:1.0
    @author:bobyan
    @modify:
         (bobyan)2011.3.11 add a new interface "setTableMenu"
         (bobyan)2001.4.11 add a new interface "setDataFilters" to set initial filter settings.
    """      
    __metaclass__ = Singleton;
    def __init__(self):
        """Initiate all values of gui settings
        """
        self.dataActions = {};
        self.windowActions = {};
        self.methodActions = {};
        self.columnDef = None;
        self.mainMenu = None;
        self.toolbar = None;
        self.tableRightMenu = None;
        
        self.dataColumnDef = None

    def registerDataActions(self, actions):
        """register action of data, data action is for changing the value in the table content
        e.g.:If the value is "1" from DB, it need be changed "Enabled" when showing it. In the case
        We need such dataActioin.  registerDataActions({"getMyColumnID":xx.getMyColumnID});
        @param:actions   A dict including the actionsID and actionReference.
        """
        self.__mergeActions(self.dataActions, actions);

    def registerWindowActions(self, actions):
        """register action of window, window action is for response the action happened in GUI
        e.g.:If operator click one button , it will lock the cell.
        registerWindowActions({"buttonActionID":xx.lockcell});
        @param:actions   A dict including the actionsID and actionReference.
        """
        self.__mergeActions(self.windowActions, actions);
    #############################################################################
    # cpRawvalue functions added for support default calling.these 3 function is 
    # common used so add in framework
    ############################################################################ 
    def cpRawvalueAlarms(self,des_node,src_node):
        if (hasattr(src_node, 'alarms')):
            des_node.alarms =  src_node.alarms;
    def cpRawvalueOperational(self,des_node,src_node):
        if (hasattr(src_node, 'Operational')):
            des_node.Operational =  src_node.Operational;
    def cpRawvalueAdministrative(self,des_node,src_node):
        if (hasattr(src_node, 'administrative')):
            des_node.administrative =  src_node.administrative;

    def mergeColwithMethod(self, SubctrlInstance, col_list):
        """This function used for bind column name with cpRawvalue functions automaticly. 
           The function is named in cpRawvalue+columnname style and defined in LTEStatusSubControl
           @para:SubctrlInstance is the instance of LTEStatusSubControl,here using it has 2 purpose:
           1. get the instance methodlist after dir() is called 
           2. get the method address through eval('SubctrlInstance.'+method)
           3. if user doesn't define private cpRawvalue function ,then set default 
           @para:col_list is a list contains visible column name
           After process, method address will insstore in methodActions with key columnname
           e.g.: the value will be, methodActions[Alarms] = cpRawvalueAlarms           
        """
        methodList = dir(SubctrlInstance);
        for colName in col_list:
            for method in methodList:
                if (method == 'cpRawvalue'+colName):
                     self.methodActions[colName] = eval('SubctrlInstance.'+method);
                     break;
            if ((colName == "Alarms" or colName == "Administrative" or colName == "Operational") and (not self.methodActions.has_key(colName))):
                self.methodActions[colName] = eval('self.cpRawvalue'+colName);
    def __mergeActions(self, self_actions, out_actions):
        """Private method which abstract the common parts of
        registing window actions and data actions
        @param:self_actions old actions kept in the instance.
        @param:out_actions  the new actions. 
        """        
        if(out_actions == None):
             retrun;
        for key in out_actions.keys():
            action = out_actions[key];
            newActions = [];
            if(self_actions.has_key(key)):
                newActions = self_actions[key];
            if(isinstance(action, list)):
                newActions = newActions + action;
            else:
                newActions.append(action);
            self_actions[key] = newActions;
        
    def setColumnDef(self, columnDef):
        """Set the column definitions
        e.g.:setColumnDef("GID:visible=false,DN:expander=true;filter=NEType,Name");
        comma"," is between the columns
        colon":" is between the column name and column definitions
        semicolon";" is between definitions.
        @param:columnDef New column definitions
               Attributs:
                   1.ID: the columnID, it can be used when there blank among the name.
                         The default value is same as its column name.
                   2.widge: Define the type of component used to show the value of column
                            Currently there only two values: checkbutton and label(default)
                   3.sort: True(default) or False, enable or disable the sorting function of column
                   4.pos: Define the order position in the table (>=0)
                   5.action: the actionID.It can trigger an action related the actionID when the component in
                            the column is activated.e.g.:the checkbutton is clicked.
                   6.visible: True(default) or False
                   7.expander: True or False(default), it's for define which column can be shown as
                               a tree hierarchy when show tree view.
                   8.filter: True or False(default) or specified columnID. If it's set to true or columnID
                             ,the column can be filtered. If columnID is set, the distinct values can be
                             choosen in filter list table.
                             e.g.: DN:filter=NEType. when you open the filter dialog, you can see the DN
                             in drop menu of the combobox, and when you choose it, you just can see there
                             are "MRBTS, LNBTS,LNCEL,FTM" in the table list instead of actual DN values.
                   9.filtertype: value(default) or range. Define the filter type, if value ,it shows checkbutton
                              before every value, If range, it can input a range value to filter out the content.
        """
        self.columnDef = columnDef;
        self.setDataColumnDef()
    def getColumnDef(self):
        """Get the column definitions
        @return:columnDef
        """
        return self.columnDef;
    def setMainMenu(self, mainMenu):
        """Set the mainMenu definitions
        e.g.:setMainMenu([{'File':{'submenu':[{'Export':{'action':"FILEEXPORT"}},{'Exit':{'ID':'WINDOWQUIT'}}]}}
                          ,{'Operation':{{'Automatic Refresh':{'type':'check','ID':'MENU_AUTOREFRESH','action':'ACTIONAUTOREFRESH'}}]}
                           }
                         ]);
        Explain above settings:
            1.File: the name of the first level menu
            2.submenu: define submenu item below File menu, it's another dict.
            3.Export: the first menu name in submenu.
            4.action: Define the actionID related to certain actionMethod. When the menu is clicked
                      It can invoke some actions related to the actionID.
            5.Exit: the second submenu item.
            6.ID: the refrence of "Exit" menu item, you can get the menu item instance according the ID.
            7.Operation: the second name of the first level
            8.type: check or value(default) If check is set, it means the menu item can be shown a point before its name when it's activated.
        @param:mainMenu New mainMenu definitions
        """        
        self.mainMenu = mainMenu;
    def getMainMenu(self):
        """Get the mainMenu definitions
        @return:mainMenu
        """
        return self.mainMenu;
    def setToolbar(self, toolbar):
        """Set the toolbar definitions
        e.g.:setToolbar([{'Refresh':{'hint':'Fetch data manually','action':'ACTIONREFRESHONCE'}},'space'
                 ,{'Autorefresh':{'hint':'Enable automatic refresh|Disable automatic refresh','ID':'TOOLBAR_AUTOREFRESH','type':'toggle', 'action':'ACTIONAUTOREFRESH'}}]);
        Explain above settings:
            1.Refresh: the name of button
            2.hint: define the tooltip . note: if there is a pipeline among the hint text such as the above Autorefresh,
                    and it's toggle button, it define two tooltips respectively for up and down status.
            3.action: Define the actionID related to certain actionMethod. When the button is clicked
                      It can invoke some actions related to the actionID.
            4.space: Define a pipeline between two buttons.
            5.ID: the refrence of "Autorefresh" button, you can get the button instance according the ID.
            6.type: toggle or value(default) If toggle is set, it means the button can be toggle down or up.
        @param:toolbar New toolbar definitions
        """          
        self.toolbar = toolbar;
    def getToolbar(self):
        """Get the toolbar definitions
        @return:toobar
        """        
        return self.toolbar;
    def setTableMenu(self, tableMenu):
        """Set the tableMenu definitions(popup menu when mouse right button is clicked)
        e.g.:setTableMenu([{'Copy Selected Rows':{'action':'EDITCOPYSELECTED'}},{'Copy ALL':{'action':'EDITCOPYALL'}}]);
        Its meanings is same as MainMenu definitions.
        @param:mainMenu New tableMenu definitions
        """           
        self.tableRightMenu = tableMenu;
    def getTableMenu(self):
        """Get the tableMenu definitions
        @return:tableRightMenu
        """        
        return self.tableRightMenu;
    
    def getDataActions(self):
        """Get the dataActions 
        @return:dataActions  A dict which including the actions set by subcontrol
        """           
        return self.dataActions;
    def getWindowActions(self):
        """Get the windowActions 
        @return:windowActions  A dict which including the actions set by subcontrol
        """    
        return self.windowActions;
    def setDataFilters(self, filters):
        """Set the filter definitions
        e.g.:setDataFilters({"DN":{"MRBTS":False,"FTM":False, "LNBTS":True,"LNCEL":True},
                   "COSTATE":{"Non operational":False,"Operational":True}});
        Explain above settings:
            1.DN: The name of filter column name. It can shown in drop popup menu of comobox in filter dialog.
            2."MRBTS":False: Define default value of MRBTS, it means MRBTS can't be shown in the table content.
            3.Note: If the filtertype of that column is range , it could be written similar as {"MRSITE":{"[1,5]":[1,5]}};
              It means only show the data which mrsite value is in [1,2,3,4,5].
        @param:filters New filter definistions.
        """          
        if(filters != None):
           self.filters = filters;
    def getDataFilters(self):
        """Get the filter definitions
        @return:filters  if no definistion, it returns None.
        """
        filters = None;
        if(hasattr(self,"filters")):
           filters = self.filters;
        return filters;
    
    def getNETypeClassId(self):
        return {"MRBTS" : "3128"
                ,"LNBTS" : "3129"
                ,"LNCEL" : "3130"
                ,"FTM" : "1793"
                ,"RNC" : "811"
                ,"WBTS" : "812"
                ,"WCEL" : "813"
                ,"OMS" : "2347"
                ,"BCF" : "27"}
    
    def getClassIdNeType(self):
        return {"3128"  : "MRBTS"
               ,"3129" : "LNBTS"
               ,"3130" : "LNCEL"
               ,"1793" : "FTM"
               ,"2347" : "OMS" 
               ,"811"  : "RNC"
               ,"812"  : "WBTS"
               ,"813"  : "WCEL"
               ,"27"  : "BCF"
              }
    
    def getLNCELAdministrative(self):
        return {'1':'Unlocked', '2':'Shutting down', '3':'Locked'}
    
    def getLNCELOperational(self):
        return {'0':'Disabled', '1':'Enabled'}
    
    def getLNBTSOperational(self):
        return { '0' : 'Disabled(initializing)'
                ,'1' : 'Disabled(commissioned)'
                ,'2' : 'Disabled(not commisioned)'
                ,'3' : 'Disabled(configured)'
                ,'4' : 'Disabled(integrated to RAN)'
                ,'5' : 'Enabled(on air)'
                ,'6' : 'Disabled(test)'
                }
    
    def getCommonStates(self):
         return {'0':'Operational', '2':'Created from the network', '3':'Non operational'}
       
    def setDataColumnDef(self):
        if(self.columnDef == None):
            return;
        dataColumnDef = ColumnDef(self.columnDef);
        if self.dataColumnDef:
            self.dataColumnDef.setAllColumns(dataColumnDef.getAllColumns());
        else:   
            self.dataColumnDef = dataColumnDef;
        self.PRIMARY_KEY = len(dataColumnDef.getAllColumns());
        
    def getDataColumnDef(self):
        return self.dataColumnDef

class LTEStatusData:    
    """LTEStatusData is a kind of medium which carries the original NE information and GUI settings from out module.
    @version:1.2
    @author:bobyan
    @modify:
           (bobyan)2011.3.11 change the hash tree to entity tree considering the automatic alarm count in treeview.
                             provide the register interface to support dataAction.
           (bobyan)2011.4.11 change the entity tree to hash tree again to create MRSite tree more easier.
    """
    def __init__(self):
        """Initiate settings in GUI (for LTE subsystem) and some instance variables.
        """
        self.PRIMARY_KEY = 2;
        self.setColumnDef(DataControl.getInstance().getColumnDef());
        self.setMainMenu(DataControl.getInstance().getMainMenu());
        self.setToolbar(DataControl.getInstance().getToolbar());
        self.setTableMenu(DataControl.getInstance().getTableMenu());
        ###################################
        # methodSet is for storing the dataNode method (get,set) defined by sub-control
        # you can add new method with registerDataMethod("getXXX", methodRef)
        # XXX is the columnID
        ###################################
        self.methodSet = {};
        self.registerDataMethod(DataControl.getInstance().getDataActions());
        self.neNodes = [];
        self.tree_format = None;
        self.data = None;

        self.hierachy_define = 'DN';
        
        #!!!Below is for VirtualTreeModel
        self.rawDataFromDB = []
        self.sortedRawData = []
        self._topNodes = [] #The top level nodes

    def registerDataMethod(self, out_actions):
        """Register some dataActions.
        @param:out_actions  A dict which including actionID and actionReference.
        """
        for key in out_actions.keys():
            action = out_actions[key];
            newActions = [];
            if(self.methodSet.has_key(key)):
                newActions = self.methodSet[key];
            if(isinstance(action, list)):
                newActions = newActions + action;
            else:
                newActions.append(action);
            self.methodSet[key] = newActions;
        
    def createNode(self, gid):
        """To help get an empty node for out module
        @param: gid It's a str type . However if the gid is less than 0, which means such node is a virtual node.
        @return: LTEStatusDataNode 
        """
        node = LTEStatusDataNode(gid,self.dataColumnDef, self.methodSet);
        return node;
  
    def setColumnDef(self, columnTitle):
        """Set column definition
        @param: columnTitle The column definition.
               Attributs:
                   1.ID: the columnID, it can be used when there blank among the name.
                         The default value is same as its column name.
                   2.widge: Define the type of component used to show the value of column
                            Currently there only two values: checkbutton and label(default)
                   3.sort: True(default) or False, enable or disable the sorting function of column
                   4.pos: Define the order position in the table (>=0)
                   5.action: the actionID.It can trigger an action related the actionID when the component in
                            the column is activated.e.g.:the checkbutton is clicked.
                   6.visible: True(default) or False
                   7.expander: True or False(default), it's for define which column can be shown as
                               a tree hierarchy when show tree view.
                   8.filter: True or False(default) or specified columnID. If it's set to true or columnID
                             ,the column can be filtered. If columnID is set, the distinct values can be
                             choosen in filter list table.
                             e.g.: DN:filter=NEType. when you open the filter dialog, you can see the DN
                             in drop menu of the combobox, and when you choose it, you just can see there
                             are "MRBTS, LNBTS,LNCEL,FTM" in the table list instead of actual DN values.
                   9.filtertype: value(default) or range. Define the filter type, if value ,it shows checkbutton
                              before every value, If range, it can input a range value to filter out the content.        
        """
        if(columnTitle == None):
            return;
        columnTitle += ",DataNodePath:visible=false,color:visible=false";
        dataColumnDef = ColumnDef(columnTitle);
        if(hasattr(self, 'dataColumnDef')):
            self.dataColumnDef.setAllColumns(dataColumnDef.getAllColumns());
        else:   
            self.dataColumnDef = dataColumnDef;
        self.PRIMARY_KEY = len(dataColumnDef.getAllColumns()) - 2;

    def setMainMenu(self, menuDef):
        """Set the mainMenu definitions
        e.g.:setMainMenu([{'File':{'submenu':[{'Export':{'action':"FILEEXPORT"}},{'Exit':{'ID':'WINDOWQUIT'}}]}}
                          ,{'Operation':{{'Automatic Refresh':{'type':'check','ID':'MENU_AUTOREFRESH','action':'ACTIONAUTOREFRESH'}}]}
                           }
                         ]);
        Explain above settings:
            1.File: the name of the first level menu
            2.submenu: define submenu item below File menu, it's another dict.
            3.Export: the first menu name in submenu.
            4.action: Define the actionID related to certain actionMethod. When the menu is clicked
                      It can invoke some actions related to the actionID.
            5.Exit: the second submenu item.
            6.ID: the refrence of "Exit" menu item, you can get the menu item instance according the ID.
            7.Operation: the second name of the first level
            8.type: check or value(default) If check is set, it means the menu item can be shown a point before its name when it's activated.
        @param:menuDef New mainMenu definitions
        """ 
        if(menuDef != None and isinstance(menuDef, list)):
            self.main_menu = menuDef;
    def setToolbar(self, toolbarDef):
        """Set the toolbar definitions
        e.g.:setToolbar([{'Refresh':{'hint':'Fetch data manually','action':'ACTIONREFRESHONCE'}},'space'
                 ,{'Autorefresh':{'hint':'Enable automatic refresh|Disable automatic refresh','ID':'TOOLBAR_AUTOREFRESH','type':'toggle', 'action':'ACTIONAUTOREFRESH'}}]);
        Explain above settings:
            1.Refresh: the name of button
            2.hint: define the tooltip . note: if there is a pipeline among the hint text such as the above Autorefresh,
                    and it's toggle button, it define two tooltips respectively for up and down status.
            3.action: Define the actionID related to certain actionMethod. When the button is clicked
                      It can invoke some actions related to the actionID.
            4.space: Define a pipeline between two buttons.
            5.ID: the refrence of "Autorefresh" button, you can get the button instance according the ID.
            6.type: toggle or value(default) If toggle is set, it means the button can be toggle down or up.
        @param:toolbar New toolbar definitions
        """          
        if(toolbarDef != None and isinstance(toolbarDef, list)):
            self.toolitems = toolbarDef;
    def setTableMenu(self, tableMenu):
        """Set the tableMenu definitions(popup menu when mouse right button is clicked)
        e.g.:setTableMenu([{'Copy Selected Rows':{'action':'EDITCOPYSELECTED'}},{'Copy ALL':{'action':'EDITCOPYALL'}}]);
        Its meanings is same as MainMenu definitions.
        @param:mainMenu New tableMenu definitions
        """  
        if(tableMenu != None and isinstance(tableMenu, list)):
            self.tableRightMenu=tableMenu;
    def getColumnDef(self):
        """Get the column definitions
        @return:columnDef
        """
        return self.dataColumnDef;

    def addNode(self, node):
        """Put a new node in the list of node list
        @param: node LTEStatusDataNode 
        """
        dn = node.getDataNodePath();
        if(len(dn) == 0 ):
            return;
        self.neNodes.append(node);
        self.dataColumnDef.addFilterToColumn(node);
    def getRealNodes(self):
        """Get current nodes which are from DB excluding virtual nodes created by the program.
        @return: list which including LTEStatusDataNodes
        """
        return self.neNodes;
    def getHierachyNodes(self, hierachy_define=None):
        """Get a hash tree formed by hierachy_define
           e.g.: {"root":"NULL","NULL":{'children':['PLMN-PLMN/MRBTS-1','PLMN-PLMN/MRBTS-2']}
                  ,"PLMN-PLMN/MRBTS-1":{'value':<the instance of LTEStatusDataNodes>,'children':[...]}
                  ,"PLMN-PLMN/MRBTS-2":{'value':<the instance of LTEStatusDataNodes>,'children':[...]}
                 }
        @param:hierachy_define str The default is "DN", you can set it to "MRSITE/DN" which means you need a tree
               which has the MRSITE as the first level in the tree then follow the DN hierarchy.
        @return: dict It's a hash tree.
        """
#        print "[LTEStatusData.py], getHierachyNodes, start, time=", time.time()
        if(hierachy_define == None or len(hierachy_define) == 0):
            hierachy_define = "DN";
        data = {"root":"NULL"};
        self.tree_format = hierachy_define;
        for node in self.neNodes:
            self.__addNodeToData(node, data, hierachy_define);
        self.data = data;
#        print "[LTEStatusData.py], getHierachyNodes, end, time=", time.time()
        return data;

    def __addNodeToData(self, node, data, hierachy_define=None):
        """Private mehtod for put a node in hash tree according to hierachy_define.
        @param:node A new node which need to be put in the hash tree.
        @param:data A hash tree including the tree relationship of nodes.
        @param:hierachy_define str The default is "DN", you can set it to "MRSITE/DN" which means you need a tree
               which has the MRSITE as the first level in the tree then follow the DN hierarchy.
        """
        dn = node.getDN();
        if(len(dn) == 0 ):
            return;
        self.configureVirtualNode(data,node,hierachy_define);
        dn_paths = self.__getHierachyPaths(node,hierachy_define);
        parent_dn = None;
        dn_path = "";
        for dn_path in dn_paths:
            if(not data.has_key(dn_path)):
                 data[dn_path] = {'children':[]};
                 mynode = self.createNode("0");
                 mynode.set_property("DN",dn_path);
                 data[dn_path]['value'] = mynode;
            elif(not (data[dn_path].has_key("children"))):
                data[dn_path]['children'] = [];
            if(parent_dn != None):
                p_children = data[parent_dn]['children'];                
                if(not (dn_path in p_children)):
                    p_children.append(dn_path);
            parent_dn = dn_path;
        data[dn_path]['value'] = node;
        node.set_property("DataNodePath",dn_path);
        
    def __getHierachyPaths(self,node, hierachy_define):
        """Private method is for forming a tree paths from root node to current node according to hierachy_define and the value of node
        e.g.:["NULL","PLMN-PLMN","PLMN-PLMN/MRBTS-1"]
        @param:node LTEStatusDataNode
        @param:hierachy_defin hierachy_define str The default is "DN", you can set it to "MRSITE/DN" which means you need a tree
               which has the MRSITE as the first level in the tree then follow the DN hierarchy.
        @return:list which including the paths from root node to current node.   
        """
        wholePath = "";
        column_ids = hierachy_define.split("/");
        for column_id in column_ids:
            value = node.get_property(column_id);
            if(cmp(column_id.lower(),"dn")!=0):
                value = column_id + "-" + value;
            wholePath += "/" + value;
        paths = wholePath.split("/");
        dn_all_path = [];
        curpath = "";
        for path in paths:
            if(len(path) == 0):
                continue;
            curpath += path;
            dn_all_path.append(curpath);
            curpath += "/";
        dn_all_path.insert(0,"NULL");
        return dn_all_path;
    
    def configureVirtualNode(self, data, node, hierachy_define):
        """Private method is for configur a sub tree according to hierachy_define and the value of node
        Especially it can create virtual node if there is the parent of current node.
        @param:data A hash tree including the tree relationship of nodes.
        @param:node LTEStatusDataNode
        @param:hierachy_defin hierachy_define str The default is "DN", you can set it to "MRSITE/DN" which means you need a tree
               which has the MRSITE as the first level in the tree then follow the DN hierarchy.
        """        
        column_ids = hierachy_define.split("/");
        for column_id in column_ids:
            value = node.get_property(column_id);
            if(cmp(column_id.lower(),"dn")!=0):
                value = column_id + "-" + value;
            mynode = self.createNode("-1");
            mynode.set_property("DN",value);
            mynode.set_property(column_id,node.get_property(column_id));
            if(not data.has_key(value)):
                data[value] = {};
                data[value]['value'] = mynode;
    
    def __getHierachyPath(self,node, hierachy_define):
        """Private method is for forming a tree path according to hierachy_define and the value of node
        e.g.:PLMN-PLMN/MRBTS-1 , however you can get the node directly according to the path in hash tree.
        @param:node LTEStatusDataNode
        @param:hierachy_defin hierachy_define str The default is "DN", you can set it to "MRSITE/DN" which means you need a tree
               which has the MRSITE as the first level in the tree then follow the DN hierarchy.
        @return:str The path of the node in hash tree.
        """        
        paths = self.__getHierachyPaths(node, hierachy_define);
        path = "";
        if(len(paths) > 0):
            path = paths[-1];
        return path;    
             
    def getChildren(self,node=None):
        """Get all nodes in hastree as the tree hierarchy, if there is no hash tree,
        it can form the hash tree as DN hierarchy.
        @param:node LTEStatusDataNode Specify the root node you want to get the children of that. The default is the NULL node ,
        which means you will get all nodes in the tree.
        @return: list Including all children below node.
        """
#        print "[LTEStatusData.py], getChildren, start, time=", time.time()
        if(self.data == None):
            data = self.getHierachyNodes(self.tree_format);
        else:            
            data = self.data;
            
        children = [];
        path = "NULL";
        if(node != None and (not isinstance(node,str))):
            path = node.get_property("DataNodePath");
        children_paths = [];
        if(data.has_key(path) and data[path].has_key('children')):
            children_paths = data[path]['children'];
        for child_path in children_paths:
            child = None;
            if(data.has_key(child_path) and data[child_path].has_key('value')):
                child = data[child_path]['value'];
            children.append(child);
            children += self.getChildren(child);
#        print "[LTEStatusData.py], getChildren, end, time=", time.time()
        return children;        
    
    def getParent(self, node):
        """Get the parentNode of node
        @param:node LTEStatusDataNode
        @return: parent LTEStatusDataNode or None
        """
#        print "[LTEStatusData.py], getParent, start, time=", time.time()
        if(self.data == None):
            data = self.getHierachyNodes(self.hierachy_define);
        else:
            data = self.data;        
        parent_path = node.getParent();
        parent = None;
        if(data.has_key(parent_path) and data[parent_path].has_key('value')):
            parent = data[parent_path]['value'];        
#        print "[LTEStatusData.py], getParent, end, time=", time.time()
        return parent;
    
    def getNode(self, id_value):
        """Search one node according id_value(defaul the dn)
        @param:id_value str
        @return:LTEStatusDataNode or None
        """
#        print "[LTEStatusData.py], getNode, start, time=", time.time()
        if(self.data == None):
            data = self.getHierachyNodes(self.hierachy_define);
        else:
            data = self.data;
        node = None;
        key_column = self.getColumnDef().getAllColumns()[self.PRIMARY_KEY].ID;
        if(data.has_key(id_value)):
            node = data[id_value]['value']; 
#        print "[LTEStatusData.py], getNode, end, time=", time.time()
        return node;
    
    def getTableContent(self):
        """Get all value in the tree (for test)
        @return:str  It's all values in the tree.
        """
        content = [];
        children = self.getChildren();
        for child in children:
            if(child == None or isinstance(child,str)):
                continue;
            content.append(child.getRowValue());
        return content;

    #!!!Below is for VirtualTreeModel 
    def setRawData(self, rawData):
        self.rawDataFromDB = rawData
    
    def getRawData(self):
        return self.rawDataFromDB
    
    def getSortedRawData(self):
        return self.sortedRawData
    
    def setSortedRawData(self, data):
        self.sortedRawData = data
    
    def setTopNodes(self, topNodes):
        self._topNodes = topNodes
    
    def getTopNodes(self):
        return self._topNodes 
    
    def getTopNodesCount(self):
        return len(self._topNodes)
    
    def buildNode(self, parent, node):
        if parent == None:
            node.setIndex(len(self._topNodes))
            self._topNodes.append(node)
#            print "build parent node = ",node.getDN()," index = ",node.getIndex()
#            for node in self.getTopNodes():
#                print "current top node......",node.getDN()
        else:
            node.setParent(parent)
            parent.setChild(node)
#            print "build child node =",node.getDN(), " parent = ",node.getParent().getDN(), " index = ",node.getParent().getIndex()
        return node
    
    def initializeTopNodes(self):
        self._topNodes = [] 

class ColumnDef:
    """It is a class for handle column definition and operation.
    e.g.: You can us isFilteredNode(node) interface to verify if current node can be shown.
    It's also a collection for storing DataColumn
    @version:1.2
    @author:bobyan
    @modify:
          (bobyan) 2011.3.11 add isFilteredNode interface to hanlde the filter feature.
          (bobyan) 2011.4.11 add range filter process
    """
    __metaclass__ = Singleton;
    def __init__(self,columnDef):
        """Construct the ColumnDef with column definition(str), also forms DataColumn with single column definition
        @param:columnDef str
               e.g.: "GID:visible=false,DN:expander=true;filter=NEType,Name"
        """
        self.columnDef = columnDef;
        column_defs = columnDef.split(",");
        self.columns = [];
        index = 0;
        for column_def in column_defs:
            column = DataColumn(column_def);
            column.setColumnIndex(index);
            index = index + 1;
            self.columns.append(column);    
        self.setColumnTypes()
            
    def getDataColumn(self, columnID):
        """Deprecated method, it get the DataColumn by columnID  , replaced by getDataColumnByID(columnID)
        @param:columnID str
        """
        column = None;
        for tmpcolumn in self.columns:
            if(cmp(tmpcolumn.ID, columnID) == 0):
                column = tmpcolumn;
                break;
        return column;
    def getAllColumns(self):
        """Get all DataColumns in the definition
        @return: list
        """
        return self.columns;
    def setAllColumns(self,columns):
        """Set DataColumns to it
        @param:columns list of DataColumn
        """
        self.columns = columns;
    def addFilterToColumn(self, node):
        """Get the value from node and set distinct value to filtering content.This method will be expired.
        as we can set such filteriong content at beginning.
        e.g.: The node is "MRBTS", so set MRBTS to DN filtering list.
        @param:node LTEStatusDataNode
        """
        for column in self.columns:
            value = None;
            if(not hasattr(column,'filter') or cmp(column.filter.lower(),"none") == 0):
                continue;
            if(hasattr(column,'filtertype') and cmp(column.filtertype,'range') == 0):
                continue;
            if(hasattr(column,'filter')):
                filterName = column.filter;
                if(cmp(filterName.lower(),"true") != 0):
                    value = node.get_property(filterName);
                else:
                    value = node.get_property(column.ID);
            if(value != None and len(value) > 0):
                column.filter_list[value] = True;                
    def isFilteredNode(self, node, filters={}):
        """Check if current node needs to be filtered out
        @param:node LTEStatusDataNode
        @param:filters  dict of filter definition from out module. If no the parameter, it shall use the default filter definition
        @return: True or False.  True means filtering out the node.
        """
        isFiltered = False;
        gid = node.getGID();
        if(cmp(gid,'0') == 0):
           return True;
        for column in self.columns:
            value = None;
            filtertype = "value";
            if(hasattr(column,"filtertype")):
               filtertype = column.filtertype;
            if( not hasattr(column,'filter') or cmp(column.filter.lower(),"none") == 0):
                continue;
            if(hasattr(column,'filter')):
                filterName = column.filter;
                if(cmp(filterName.lower(),"true") != 0):
                    value = node.get_property(filterName);
                else:
                    value = node.get_property(column.ID);
            if(filters.has_key(column.ID)):
                filter_list = filters[column.ID];
                isFiltered = self.isFilteredValue(filter_list,value,filtertype);
            else:
                isFiltered = self.isFilteredValue(column.filter_list,value,filtertype);
            if(isFiltered):
                break;
        return isFiltered;
    def isFilteredValue(self,filter_list, nodeValue, filtertype):
        """check if the node value is in filter definition.
        @param:filter_list dict of filter definition
        @param:nodeValue
        @param:filtertype  range or not.
        @return: True or False;
        """
        isFiltered = True;
        if(cmp(filtertype,"range") != 0):
            if(filter_list.has_key(nodeValue) and isinstance(filter_list[nodeValue],bool) and filter_list[nodeValue] == False):                
                isFiltered = True;
            else:
               isFiltered = False;
        else:
            if(len(filter_list.keys()) == 0):
               isFiltered = False;
            if(not nodeValue.isdigit()):
               if(filter_list.has_key(nodeValue)):
                  isFiltered = False;
            else:
                for filter_key in filter_list.keys():
                    value = filter_list[filter_key];
                    if(isinstance(value,list)):
                        myrange = range(value[0], value[1] + 1);
                        if(int(nodeValue) in myrange):
                            isFiltered = False;
                            break;
                    elif(cmp(value,nodeValue) == 0):
                        isFiltered = False;
                        break;
        return isFiltered;

    def setFilterToColumn(self, h_filters):
        """set default filter definition in the ColumnDef
        @param:h_filters dict of filter definition
        """
        for key in h_filters.keys():
            column = self.getColumnByID(key);
            if(column == None):
                continue;
            column.filter_list = h_filters[key];
            

    def getColumnByID(self, columnID):
        """it get the DataColumn by columnID
        @param:columnID str
        """
        find_column = None;
        for column in self.columns:
            col_id = column.ID;
            if(cmp(col_id, columnID) == 0):
                find_column = column;
                break;
        return find_column;

    def getVisibleColumns(self):
        visibleColumns = [];
        for column in self.columns:
            if((not hasattr(column, "visible")) or (hasattr(column, "visible") and column.visible == "true")):
                if((not hasattr(column, "widget")) or (hasattr(column, "widget") and column.widget == "label")):
                    visibleColumns.append(column.ID);
        return visibleColumns;

    def colIndexMap(self, columnID):
        column = self.getColumnByID(columnID);
        return column.getColumnIndex();
    
    def getColumnsNum(self):
        return len(self.columns)
     
    def setColumnTypes(self):
        types = [];
        for column in self.columns:
            if(hasattr(column,"widget") and cmp(column.widget,'checkbutton')==0):
                types.append(gobject.TYPE_BOOLEAN);
            else:
                types.append(gobject.TYPE_STRING);
        self.columnTypes = types
        
    def getColumnType(self, index):
        if index < len(self.columnTypes):
            return self.columnTypes[index]
        return gobject.TYPE_STRING

class DataColumn:
    """Single column definition class which including all properties in the column and columnID
    @version:1.2
    @author:bobyan
    @modify:
          (bobyan)2011.3.11 add filter_list to store filter values.
    """
    def __init__(self, columnDef):
        """Construct DataColumn with setting all properties according to columnDef
        @param:columnDef str
              e.g.: "Mytest:ID=check;widget=checkbutton;sort=true;pos=0;action=UPDATEACTIONSTATE"
        """
        col_defs  = columnDef.split(":");
        value = col_defs[0];
        self.text = value;
        self.filter_list = {};
        self.ID = value.replace(" ","_");
        if(len(col_defs) == 1):
            return;
        defs_str = col_defs[1];
        defs = defs_str.split(";");
        for mydef in defs:
            (def_name, def_value) = mydef.split("=");
            exec 'self.'+def_name+'="'+def_value+'"';

    def setColumnIndex(self, index):
        """It sets the column index for the DataColumn.
        @param:index int
        """
        self.index = index;

    def getColumnIndex(self):
        """It gets the column index for the DataColumn.
        @return:index int
        """
        return self.index;

class VirtualTreeModel(gtk.GenericTreeModel, gtk.TreeSortable):
    '''This class represents the model of a tree.  The iterators used
    to represent positions are converted to python objects when passed
    to the on_* methods.  This means you can use any python object to
    represent a node in the tree.  The None object represents a NULL
    iterator.

    In this tree, we use simple tuples to represent nodes, which also
    happen to be the tree paths for those nodes. '''

    def __init__(self, data, order=0):
        gtk.GenericTreeModel.__init__(self)
        self.setData(data)
        self.modelFlag = 0
        
    def on_get_flags(self):
        '''returns the GtkTreeModelFlags for this particular type of model'''
        return self.modelFlag

    def on_get_n_columns(self):
        '''returns the number of columns in the model'''
        return ColumnDef.getInstance().getColumnsNum()
    
    def on_get_column_type(self, index):
        '''returns the type of a column in the model'''
        if index == ColumnDef.getInstance().getColumnsNum()-1:
            return gobject.TYPE_STRING
        return ColumnDef.getInstance().getColumnType(index)
    
    def on_get_path(self, path):
        '''returns the tree path(a tuple of indices at the various
        levels) for a particular node.'''
        return path

    def on_get_iter(self, path):
        '''returns the node corresponding to the given path.  In our
        case, the node is the path'''
        return path

    def on_get_value(self, path, column):
        '''returns the value stored in a particular column for the node'''
        if column < self.on_get_n_columns():
            node = self.getNodeByPath(path)
            if node:
                return node.getNodeValues()[column]
        return None
    
    def on_iter_next(self, path):
        '''returns the next node at this level of the tree'''
#        print "on_iter_next path = ",path
        if not path:
            return None;

        if (len(path)==1): # level 1
            if( path[-1]+1 < len(self._data.getTopNodes()) ):
                return path[:-1] +(path[-1]+1,)
            else:
                return None;

        if path != None:
            child_num = self.on_iter_n_children(path[:-1])
            index_id = path[-1]
            if index_id < child_num-1:
                return path[:-1] + (index_id+1,)
            else:
                return None
        return None

    def on_iter_children(self, path):
        '''returns the first child of this node'''
        if path == None: # top of tree
            return(0,)
#        print "on_iter_children path = ",path
        node = self.getNodeByPath(path);
        if not len(node.getChildren()): # no more levels
            return None
        
#        if node.getDN() == 'PLMN-PLMN/MRBTS-1/LNBTS-1' or  node.getDN() == 'PLMN-PLMN/OMS-1':
#            print "on_iter_children path = ",path+(0,)
        return path +(0,)

    def on_iter_has_child(self, path):
        '''returns true if this node has children''' 
#        print "on_iter_has_child______path = ",path
        _row = self.getNodeByPath(path);
        if _row:
#            print "on_iter_has_child return =",_row and len(_row.getChildren())>0 ," path = ",path, " _row = ",_row.getDN()," child = ",_row.getChildren()
            return _row and len(_row.getChildren())>0

    def on_iter_n_children(self, path):
        '''returns the number of children of this node'''
        if path == None:
            return self._data.getTopNodesCount()

        _row = self.getNodeByPath(path);
#        if _row and (_row.getDN() == 'PLMN-PLMN/MRBTS-1/LNBTS-1' or  _row.getDN() == 'PLMN-PLMN/OMS-1'):
#            print "on_iter_n_children num = ",len(_row.getChildren())>0 and len(_row.getChildren()) or 0, " path = ",path
        return len(_row.getChildren())>0 and len(_row.getChildren()) or 0
        
    def on_iter_nth_child(self, path, n): 
        '''returns the nth child of this node'''
        if path == None:
            return(n,)
        _row = self.getNodeByPath(path);
        if ( n < len(_row.getChildren()) ):
            return self.getPathByNode(_row.getChildren()[n])
        else:
            return None

    def on_iter_parent(self, path):
        '''returns the parent of this node'''
        if not path:
            return None
        else:
            return path[:-1]
    
    def setData(self, data):
        self._data = data
#        print "[[[[[[[[[[[[[[[[[set data]]]]]]]]]]]]]]]] top nodes = ",self._data.getTopNodes()
    def getData(self):
        return self._data
    
    def getTopNodesCount(self):
        return self._data.getTopNodesCount()
    
    def getPathByNode(self, node):
        if not node:
            return None
        index = node.getIndex()
        path = (index,)
        parent = node.getParent()
        if parent:
            return self.getPathByNode(parent) + path
        return path
    
    def getNodeByPath(self, path):
        if path[0] >= len(self._data.getTopNodes()):
            return None
        
        if ( len(path) == 1 ): # level-1
            if self._data.getTopNodes():
                return self._data.getTopNodes()[path[0]]
            return None
        
        l1_path = path[:1]
        l1_node = self._data.getTopNodes()[l1_path[0]]
        _node = l1_node;
        pos=1;
        while(pos<len(path)):
            sibling_idx = path[pos]
#            data_idx = self.getOrderedIndex(sibling_idx, _node);
#            if _node.getDN() == 'PLMN-PLMN/MRBTS-1/LNBTS-1' or  _node.getDN() == 'PLMN-PLMN/OMS-1':
#            print "_node = ",_node.getDN()," children = ",_node.getChildren()," path = ",path,"sibling_idx = ",sibling_idx
            _node = _node.getChildren()[sibling_idx]
            pos += 1;
        return _node;
    
    def setListModelFlag(self):        
        self.modelFlag = gtk.TREE_MODEL_LIST_ONLY
#        print "setListModelFlag----------------", gtk.TREE_MODEL_LIST_ONLY
        
    def setTreeModelFlag(self):    
        self.modelFlag = 0

class LTEStatusDataNode:
    ocid_to_netype = {};
    ocid_to_netype["3128"] = "MRBTS";
    ocid_to_netype["3129"] = "LNBTS";
    ocid_to_netype["3130"] = "LNCEL";
    ocid_to_netype["1793"] = "FTM";
    ocid_to_netype["811"] = "RNC";
    ocid_to_netype["812"] = "WBTS";
    ocid_to_netype["813"] = "WCEL";
    ocid_to_netype["2347"] = "OMS";
    """One single node including all information from DB.
    @version:1.2
    @author:bobyan
    @modify:
         (bobyan)2011.3.11 provide the set_property and get_property method to extend class function.
                 The out modules can set and get any propety value according to these interfaces.
                 It also can support to invoke the data actions defined by out modules.
    """
    def __init__(self, gid, columnDef, methodSet):
        """Construct one LTEStatausDataNode, it initiate all variables the instance need.
        @param:gid str
        @param:columnDef ColumnDef
        @param:methodSet dict Including all dataActions defined by out modules.
        """
        self.methodSet = methodSet;
        self.values = {};        
        self.columnDef = columnDef;
        self.children = [];
        self.parent = None;
        self.isFilteredOut = False;
        self.__stringToNode(gid);
    def setPRIMARY_KEY(self, PRIMARY_KEY):
        """Set the primary key to node (not in use)
        """
        p_columnID = self.columnDef.getAllColumns()[PRIMARY_KEY];
        self.primary_column = p_columnID;
    def getPrimaryValue(self):
        """Get the primary key
        """
        value = self.getDN();
        if(hasattr(self,'primary_column')):
            value = self.get_property(self.primary_column);
        return value;
        
    def __stringToNode(self, rowValue):
        """Private interface, to convert the string to node value (The order of the value need be same as column definition)
        @param:rowValue  str
        e.g.: "102031341234,PLMN-PLMN/MRBTS-7053/LNBTS-705/LNCEL-123,Test,disabled,locked,critical:(15) major:(20),UNKNOWN,10.31.43.1,LN2.0"
        """
        if(rowValue == None or cmp(rowValue,"") == 0 ):
            return;
        content = rowValue.split(",");
        gid = content[0];
        if(len(content) == 1):
            self.setGID(gid);
            return;
        i = 0;
        for column in self.columnDef.getAllColumns():
            myid = column.ID;
            if(len(column.text)== 0):
                continue;
            if(i>=len(content)):
                break;
            value = self.set_property(myid,content[i]);  
            i += 1;
        
    def set_property(self,p_name, p_value):
        """Set field value in the node.
        @param:p_name str the columnID
        @param:p_value str 
        """
        if(self.methodSet.has_key("set"+p_name)):
            actions = self.methodSet['set'+p_name];
            for action in actions:
                result = action(self, p_value);
                if(result != None and isinstance(result, bool) and result == True):
                    return True;
        elif(hasattr(self,"set"+p_name)):            
            exec 'self.set'+p_name+'("'+p_value + '")';
        else:
            self.values[p_name] = p_value;

    def get_property(self, p_name):
        """Get the value of column "p_name".Note:it will capitalize the value if no any dataAction handling it.
        @param: p_name  str It's columnID
        @return: the value in the columnID or empty.
        """
        value = "";
        if(self.methodSet.has_key("get"+p_name)):
            getMethod = self.methodSet['get'+p_name];
            tmpValue = None;
            if(self.values.has_key(p_name)):
                tmpValue = self.values[p_name];
            actions = self.methodSet["get"+p_name];
            for action in actions:
                value = action(self,tmpValue);
                if(value != None):
                    break;
        elif(hasattr(self,"get" + p_name)):
            exec 'value=self.get'+p_name+'()';            
        else:
            if(self.values.has_key(p_name)):
                value = self.values[p_name];
                if(len(value) > 2):
                    value = value[0].upper() + value[1:].lower();
        if(value == None):
            value = "";
        return value;
    def setGID(self,gid):
       # self.gid = str(gid);
        self.values["GID"] = str(gid);
    
    def getGID(self):
       # self.gid = str(gid);
        gid = self.values["GID"];
        return gid;

    def setDN(self,value):        
        if(len(value) == 0):
            self.dn = "";
            return;
        if(cmp(value[-1],'/')==0):
            value = value[0:len(value)-1];        
        self.dn = str(value);
        if ( self.values.has_key("OCID") and LTEStatusDataNode.ocid_to_netype.has_key(self.values["OCID"])):
        # optimized quick set neType
            self.neType = LTEStatusDataNode.ocid_to_netype[self.values["OCID"]];
        else:
            pos = self.dn.find("/");
            if(pos > 0):
                neType = re.search("/\w+\-?((\d*$)|(\w*$))",self.dn).group(0);
                neType = re.search("\w+",neType).group(0);
            else:
                neType = re.search("\w+",self.dn).group(0);
            self.neType = neType;
        if((not hasattr(self, "mynodepath")) or cmp(self.mynodepath,"") == 0):
            self.mynodepath = self.dn;
    def getDN(self):
        if(hasattr(self,'dn')):
            return self.dn
        else:
            return "";
        
    def setDataNodePath(self, value):
        """Use it in future.
        @param: value the path value in the tree.
        """
        self.mynodepath = value;
    def getDataNodePath(self):
        """Use it in future.
        @return: value the path value in the tree.
        """        
        value = "";
        if(hasattr(self, "mynodepath")):
            value = self.mynodepath;
        return value;
    
    def getParentDN(self):
        """Get the DN of parent
        @return: str.
        """                
        parentDN = None;
        if(hasattr(self, 'mynodepath')):            
            pos = self.mynodepath.rfind("/");
            if(pos != -1):
                parentDN = self.dn[0:pos];
        return parentDN;
    def getParentPath(self):
        """Get the tree path of parent. (use in future);
        @return: str 
        """   
        parentPath = None;
        if(hasattr(self, 'mynodepath')):            
            pos = self.mynodepath.find("/"+self.neType);
            if(pos != -1):
                parentPath = self.mynodepath[0:pos];
        return parentPath;
    def getNEType(self):
        if(hasattr(self,'neType')):
            return self.neType.upper();
        else:
           return "";

    def setName(self,value):
        self.name = value;
    def getName(self):
        if(hasattr(self,'name')):
            return self.name
        else:
            return "";

    def setIP(self,value):
        self.ip = value;
    def getIP(self):
        if(hasattr(self,'ip')):
            return self.ip
        else:
            return "";

        
    def setAdministrative(self,value):
        self.administrative = str(value);
    def getAdministrative(self):
        ad = "";
        if (cmp(self.getCOSTATE(),"Non operational") != 0):
            if(hasattr(self,'administrative')):
                ad = self.administrative;
                ad = self.changeStateToValue('ad', ad);
        return ad;

    def setOperational(self,value):
        self.Operational = str(value);

    def getOperational(self):
        operation = "";
        if (cmp(self.getCOSTATE(),"Non operational") != 0):
            if(hasattr(self,'Operational')):
                operation = self.Operational
                operation = self.changeStateToValue('op', operation);
            if(operation == None or cmp(operation, "") == 0):
                ad = self.getAdministrative();
                if( ad != None and (cmp(ad, 'locked') == 0 or cmp(ad, 'shutdown') == 0)):
                    operation = "disabled";
                elif( ad != None and cmp(ad, 'unlocked') == 0):
                    operation = "enabled";
        return operation;
    def setCOSTATE(self, value):
        self.costate = value;
    def getCOSTATE(self):
        costate = "";
        if(hasattr(self,'costate')):
            costate = self.costate;
            costate = self.changeStateToValue('netact', costate);
        return costate;

    def setVersion(self,value):
        self.version = str(value);
    def getVersion(self):
        if(hasattr(self,'version')):
            return self.version
        else:
            return "";

    def setConnection(self,value):
        self.connection = value;
    def getConnection(self):
        if(hasattr(self,'connection')):
            connection = self.connection;
            if(len(connection) < 2):
                return "";
            connection = connection[0].upper() + connection[1:].lower();
            return connection;
        else:
            return "";

    def appendAlarm(self, alarmSeverity, alarmCount):
        if(not hasattr(self, 'alarms')):
            self.alarms = {};
        self.alarms[alarmSeverity] = alarmCount;
    def setAlarms(self,alarms):
        alarm_list = alarms.split(" ");
        i = 1;
        for alarm in alarm_list:
            if(cmp(alarm,"") == 0):
                continue;
            count = re.findall("\d",alarm)[0];
            alarmSeverity = i;
            self.appendAlarm(alarmSeverity, count);
            i = i + 1;
    def getAlarms(self):
        alarms = "";
        if(hasattr(self, 'alarms')):
            alarmDict = self.alarms;
            if(isinstance(alarmDict, str)):
                return alarmDict;
            ##for alarmNumber in alarmDict.keys():
            ##    alarmSeverity = self.getSeverity(alarmNumber);
            ##    alarmCount = alarmDict[alarmNumber];
            ##    if(cmp(alarms,"") == 0):
            ##        alarms += alarmSeverity + ":(" + str(alarmCount) + ")";
            ##    else:
            ##        alarms += " " + alarmSeverity + ":(" + str(alarmCount) + ")";
            a_1_cnt = 0;
            a_2_cnt = 0;
            a_3_cnt = 0;
            if (alarmDict.has_key(1)):
                a_1_cnt = int(alarmDict[1]);
            if (alarmDict.has_key(2)):
                a_2_cnt = int(alarmDict[2]);
            if (alarmDict.has_key(3)):
                a_3_cnt = int(alarmDict[3]);
            if ( a_1_cnt + a_2_cnt + a_3_cnt> 0 ):
                alarms = self.getSeverity(1)+" "+str(a_1_cnt)+" / "+self.getSeverity(2)+" "\
                         + str(a_2_cnt) + " / "+self.getSeverity(3)+" " + str(a_3_cnt);
        return alarms;
    def getSeverity(self, alarmNumber):
        #severities = { 1 : "Critical",2 : "Major",3 :  "minor"
        #               , 4 : "warning",99 : "unknown"};
        severities = { 1 : "***",2 : "**",3 :  "*"
                       , 4 : "warning",99 : "unknown"};
        if(severities.has_key(alarmNumber)):
            return severities[alarmNumber];
        else:
            return alarmNumber;     
        

    def getRowValue(self):
        """change the node to str value according to columnDef
        @return: str Like "102031341234,PLMN-PLMN/MRBTS-7053/LNBTS-705/LNCEL-123,Test,disabled,locked,critical:(15) major:(20),UNKNOWN,10.31.43.1,LN2.0"
        """
        data_row = None;
        for column in self.columnDef.getAllColumns():
            myid = column.ID;            
            value = self.get_property(myid);
            if(data_row == None):
                data_row = value ;
            else:
                data_row += "," + value;
        return data_row;

    def changeStateToValue(self, stateName, stateValue):
        valueTable = {'lncel_ad_1':'Unlocked','lncel_ad_2':'Shutting down','lncel_ad_3':'Locked', 'lncel_op_0':'Disabled', 'lncel_op_1':'Enabled'};
        valueTable['lnbts_op_0'] = 'Disabled(initializing)';##'Initializing';
        valueTable['lnbts_op_1'] = 'Disabled(commissioned)';##'Commissioned';
        valueTable['lnbts_op_2'] = 'Disabled(not commisioned)';##'Not Commisioned';
        valueTable['lnbts_op_3'] = 'Disabled(configured)';##'Configured';
        valueTable['lnbts_op_4'] = 'Disabled(integrated to RAN)';##'Integrated to RAN';
        valueTable['lnbts_op_5'] = 'Enabled(on air)';##'OnAir';
        valueTable['lnbts_op_6'] = 'Disabled(test)';##'Test';
        valueTable['netact_0'] = 'Operational';##'Integrated to RAN';
        valueTable['netact_2'] = 'Created from the network';##'OnAir';
        valueTable['netact_3'] = 'Non operational';##'Test';
        result = "";
        key = stateName + '_' + stateValue;
        dn = self.getDN();
        if(valueTable.has_key(key)):
            result = valueTable[key];
        if(cmp(dn,"") <> 0):
            if(dn.upper().find("LNCEL-") > 0):
                key = 'lncel' + '_' + key;
            elif(dn.upper().find("LNBTS-") > 0):
                key = 'lnbts' + '_' + key;
        if(valueTable.has_key(key)):
            result = valueTable[key];
        return result;

class NewLTEStatusDataNode:
    #Defines the Status Report column index 
    #which maps to the database search result
    _CHECKBOX = 0
    _GID = 1
    _DN = 2
    _NAME = 3
    _VERERSION = 4
    _OPERATIONAL = 5
    _ADMINISTRATIVE_STATE = 6 # Administrative state 
    _UNKNOWN_STATUS = 7 # Unknown status
    _CRITICAL_ALARM = 8 # Number of critical alarms
    _MAJOR_ALARM = 9 # Number of major alarms
    _MINOR_ALARM = 10 # Number of minor alarms
    _IP = 11
    _COMMON_STATE = 12 # State of common object
    _CLASS_ID = 13 # NE Class id 
    _SYSTEM_ID = 14
    
    def __init__(self, data):
        self._data = data # a row of _data fetched from DB
        self.index = None
        self.parent = None
        self.children = []
        
        self.nodeValues = None
        
    def setNodeValues(self, values):
        self.nodeValues = values
    
    def getNodeValues(self):
        """Return the values that need to be set for GUI
        """
        if not self.nodeValues:
            self.nodeValues = self.getAllColumnValues()
        self.nodeValues[0] = self.getCheckboxValue()
	self.nodeValues.append('#C4C4C4')
        
        return self.nodeValues
    
    def getExportValues(self):
        if not self.nodeValues:
            self.nodeValues = self.getAllColumnValues()
        
        return [self.nodeValues[2], self.nodeValues[3]
                ,self.nodeValues[4], self.nodeValues[5]
                ,self.nodeValues[6], self.nodeValues[7]
                ,self.nodeValues[8]]
    
    def getAllColumnValues(self):
        operational, administrative = self.getOperationalAndAdministrative()
        return [ self._data[self._CHECKBOX]
                 ,self._data[self._GID]
                 ,self._data[self._DN]
                 ,self._data[self._NAME]
                 ,operational, administrative
                 ,self.getAlarms()
                 ,self._data[self._UNKNOWN_STATUS]
                 ,self._data[self._IP]
                 ,self._data[self._VERERSION]
                 ,self.getCOSTATE()
                 ,self._data[self._SYSTEM_ID]]    
        
    def setCheckboxValue(self, value):
        self._data[self._CHECKBOX] = value
        
    def getCheckboxValue(self):
        return self._data[self._CHECKBOX]
    
    def getIndex(self):
        if self.parent:
#            if '863177' in self.getDN():
#                print "-------------------dn = ",self.getDN()
#                for c in self.getParent().getChildren():
#                    print "c = ",c.getDN()," index = ",c.parent.getChildren().index(c)
#                print "-------------------"
            return self.parent.getChildren().index(self)
        return self.index
    
    def setIndex(self, index):
        self.index = index
    
    def getOperationalAndAdministrative(self):
        classIdNeType = DataControl.getInstance().getClassIdNeType()
        lnbtsOperational = DataControl.getInstance().getLNBTSOperational()
        lncelOperational = DataControl.getInstance().getLNCELOperational()
        lncelAdministrative = DataControl.getInstance().getLNCELAdministrative()
        
        classId = self.getClassId() 
        if classIdNeType[classId] == 'LNBTS': 
            op = lnbtsOperational.get(self._data[self._OPERATIONAL]) 
            op = op and op or ''
            
            return (op, "")
        
        elif classIdNeType[classId] == 'LNCEL':
            op = lncelOperational.get(self._data[self._OPERATIONAL])
            ad = lncelAdministrative.get(self._data[self._ADMINISTRATIVE_STATE])
            op = op and op or ''
            ad = ad and ad or ''
            
            return (op, ad)
        return ('','')    
        
    def getOperational(self):
        return self.getOperationalAndAdministrative()[0]
    
    def getAdministrative(self):
        return self.getOperationalAndAdministrative()[1]
    
    def getAlarms(self):
        a1 = self._data[self._CRITICAL_ALARM]
        a2 = self._data[self._MAJOR_ALARM]
        a3 = self._data[self._MINOR_ALARM]
        
        a1 = a1 and int(a1) or 0
        a2 = a2 and int(a2) or 0
        a3 = a3 and int(a3) or 0
        
        if a1+a2+a3 > 0:
            return "*** " + str(a1) + " / ** " + str(a2) + " / * " + str(a3)
        return ""
    
    def setChild(self, node):
        self.children.append(node)
        
    def setParent(self, node):
        self.parent = node
    
    def getChildren(self):
        return self.children
  
    def setChildren(self, children):
        self.children = children
      
    def getParent(self):
        return self.parent

    def getDN(self):
        return self._data[self._DN]
    
    def getGID(self):
        return self._data[self._GID]
    
    def getClassId(self):
        return self._data[self._CLASS_ID]
    
    def getVersion(self):
        return self._data[self._VERERSION]
    
    def getSystemId(self):
        return self._data[self._SYSTEM_ID]
    
    def getNEType(self):
        return DataControl.getInstance().getClassIdNeType().get(self.getClassId())
    
    def getCOSTATE(self):
        return DataControl.getInstance().getCommonStates().\
                        get(self._data[self._COMMON_STATE])  
    
    def getLastChild(self, node):
        children = node.getChildren()
        
        if not children:
            return node
        
        return self.getLastChild(children[-1])
    
    def getRawData(self):
        return self._data
    
    def getTopParent(self):
        if self.parent == None:
            return self
        return self.parent.getTopParent()


