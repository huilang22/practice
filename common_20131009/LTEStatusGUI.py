#!/usr/bin/python
import pygtk
pygtk.require('2.0')
import gtk,gobject
import random
import warnings
import csv
import re, popen2
import pango
import copy
import time
import threading

warnings.filterwarnings("ignore") 

import LTEStatusData as LTEStatusData
from LTEStatusData import * 

class LTEStatusGUI:
    """GUIAccess class, it including all components in the GUI and provide
    some usefult interfaces for out modules. It also constructs the window and
    components in it according to settings by out modules.
    The original settings from out modules is carried by data (LTEStatusData).
    @version:1.3
    @author:bobyan, rexie
    @modify:
            ~ v1.2 bobyan
            v1.3 a lot of old code that are not used by lazy loading are removed
    """
    MSG_WARNING = gtk.MESSAGE_WARNING;
    """Define warning dialog
    """
    MSG_INFO = gtk.MESSAGE_INFO;
    """Define infomation dialog
    """
    MSG_ERROR = gtk.MESSAGE_ERROR;
    """Define error dialog
    """
    MSG_QUESTION =  gtk.MESSAGE_QUESTION;
    """Define comfirmation dialog(not in use)
    """

    STATUS_TEMP = 1
    """Show text in status bar as temporary type, it will show previous text after
    4 seconds.
    """
    STATUS_DYNAMIC = 3
    """Show text in status bar as dynamic type, which can be appended "..." in
    3 seconds to show the process running.
    """
    STATUS_MSG = 0
    """Show text in status bar as common type, it will replace previous text.
    """    
    STATUS_TIMER = -1
    """Internal using. Don't set such value 
    """   

    #EVEN_ROW_COLOR = "#A099C1";
    #ODD_ROW_COLOR = "#C9C9C9";
    #ODD_ROW_COLOR = "#A099C1";
    #EVEN_ROW_COLOR = "#B9BFEA";
    EVEN_ROW_COLOR = "#C4C4C4";
    """Define the colour of table cell
    """
    ODD_ROW_COLOR = "#C4C4C4";
    """Define the colour of table cell, now keep it same as EVEN_ROW_COLOR
    """
    ROW_COLORS = [EVEN_ROW_COLOR, ODD_ROW_COLOR];
    """Define the colour of table rows, include EVEN_ROW_COLOR and ROW_COLORS
    """    
    
    def __init__(self,control,data):
        """Construct the LTEStatusGUI
           1. Get the settings from LTEStatusData.
           2. Construct the window and containers
           3. Construct menus , toolbar and table structure according to settings
           4. Connect some events to the references of method
           5. Merge window actions to the action dict.
        @param:data LTEStatusData
        """
        self.control = control;
        self.CHECKED_KEY = -1;
        self.PRIMARY_KEY = 0;
        if(data <> None):
            self.data = data;
            title = data.getColumnDef();                     
            self.PRIMARY_KEY = data.PRIMARY_KEY;
            self.main_menu = data.main_menu;
            self.toolitems = data.toolitems;
            self.tableRightMenu = data.tableRightMenu;
        self.guicontainer = {};
        self.filters = {};
        self.tree_format = "DN";
        self.sortOrder = 1
        self.sortColumnIndex = DataControl.getInstance().getDataColumnDef().colIndexMap('DN')
        self.hasSetColumnSort = False
        self.action_invoker = GUIActions(self);       
        #self.action_invoker = LTEStatusActions(self);       
        #self.action_invoker = None; # should be set by the application's Action class
        font = pango.FontDescription("Courier %s" % 14) 
        self.w = gtk.Window(gtk.WINDOW_TOPLEVEL)        
        window = self.w
       # window.modify_font(font);
        window.set_size_request(950, 400)
        window.vbox = gtk.VBox(False,0);
        window.vbox.box1 = gtk.VBox(False, 0);
        window.vbox.box2 = gtk.VBox(False, 0);
        window.vbox.box3 = gtk.VBox(False, 0);
        window.vbox.pack_start(window.vbox.box2, False, False, 0)  
        window.vbox.pack_start(window.vbox.box1, True, True, 0)  
        window.vbox.pack_start(window.vbox.box3, False, False, 0)

        window.vbox.box2.box1 = gtk.VBox(False, 0);
        window.vbox.box2.box2 = gtk.VBox(False, 0);
        window.vbox.box2.pack_start(window.vbox.box2.box1, False, False, 0)
        window.vbox.box2.pack_start(window.vbox.box2.box2, True, False, 0)

        #self.clipboard = gtk.clipboard_get(gtk.gdk.SELECTION_CLIPBOARD);
        self.clipboard = gtk.clipboard_get(gtk.gdk.SELECTION_PRIMARY);
        
        menu_bar = gtk.MenuBar()
        window.vbox.box2.box1.pack_start(menu_bar, False, False, 2)
        menu_bar.show()        
        self.addMenus(menu_bar,self.main_menu);

        #window.handlebox = gtk.HandleBox()
        window.toolbar = gtk.Toolbar()
        self.tooltip = gtk.Tooltips();
#        self.tooltip.set_tip(window.toolbar,"");
       # window.add(window.toolbar)        
        window.toolbar.set_orientation(gtk.ORIENTATION_HORIZONTAL)
        window.toolbar.set_style(gtk.TOOLBAR_TEXT)
        window.toolbar.set_border_width(0)        
        window.vbox.box2.box2.pack_start(window.toolbar, False, False, 0);
        #self.addToolbar(window.toolbar);
        self.addToolbarItem(self.toolitems, window.toolbar);
        window.toolbar.show();
        #window.handlebox.show();

        window.status = gtk.Statusbar();

        window.vbox.box3.pack_start(window.status, True, False, 0)
        timer = gobject.timeout_add (1000, self.showStatus, self.STATUS_TIMER, "");       

        self.w.tablecontentmenu = gtk.Menu();
        self.addMenus(self.w.tablecontentmenu,self.tableRightMenu);
        
        window.add(window.vbox);
        window.sw = gtk.ScrolledWindow();
        window.vbox.box1.pack_start(window.sw);
        
        
        window.connect("delete_event", self.delete_event)
        table = self.create_table(window, window.sw);        
        table.connect_object('button_press_event',self.rightClickButton, self.w.tablecontentmenu );
        
        ## NOTE !!! GUIActions is an 'virtual base class' now
        #  so, not mergeActions here
        # instead move to later hpase. TODO: more comments
        self.mergeActions(self.action_invoker.getActions());
        self.changeContainerFont(self.w,font);
        window.sw.show();
        window.set_policy(gtk.POLICY_AUTOMATIC,gtk.POLICY_AUTOMATIC,gtk.POLICY_AUTOMATIC)

        self._createProgressBar();


        # for lazy-loading
        #callback fuction porinter, to be called before the table right-click menu be shown
        # to be set in Control
        self.fp_onInitTableRightMenu = self.action_invoker.onInitTableRightMenu;

    def getData(self):
        return self.data
    
    def setModel(self, model):
        self.liststore = model
        self.w.tv.set_model(model)
    
    def getModel(self):
        return self.liststore
    
    def getActiveHandler(self):
        return self.action_invoker.viewHandler[ViewHandlerBase.currentActivatedView]
    
    def delete_event(self, widget, event, data=None):
        '''
        Quit App by click right-top corner 'x'
        '''
        self.control.exitWorker();
        gtk.main_quit()
        return False

    def error_quit(self):
        self.error_set_progress();
        gobject.timeout_add(500, self.error_quit_callback);

    def error_quit_callback(self):
        self.action_invoker.doActions(None,GUIActions.WINDOW_QUIT);

    def _createProgressBar(self):
        # create the progressBar
        self.p_label = gtk.Label("Loading data, please wait...");
        self.p_label.set_size_request(900,150);
        self.w.vbox.box1.pack_start(self.p_label, False, False, 5);
        self.progress = gtk.ProgressBar();
        self.progress.set_size_request(900,20);
        self.progress.set_pulse_step(0.01);
        self.w.vbox.box1.pack_start(self.progress, False, False, 5);

    def initShowProgressBar(self):
        self.should_show_progress = True;

        # hide the scroll window and all children (table)
        self.w.sw.hide_all();

        self.p_label.show();
        self.progress.set_text("Loading data, please wait...");
        self.progress.grab_add();
        self.progress.show();
        #print "force update GUI...";
        while gtk.events_pending():
            gtk.main_iteration(False) 
        #print "force update GUI... end";
        
        # timer to update the progress
        gobject.timeout_add(50, self.timer_update_progress); # 0.05 sec

    def timer_update_progress(self):
        if( hasattr(self, "progress_text") ):
            self.progress.set_text(self.progress_text);
        self.progress.pulse();
        if ( self.progress.get_fraction() > 0.99 ):
            self.progress.set_fraction(0.0);
        return self.should_show_progress;

    def error_set_progress(self):
        self.should_show_progress = False;

    def setUpdatingViewText(self, text):
        self.progress_text = text;
        self.progress.set_text(self.progress_text);
        self.p_label.set_text(self.progress_text);
        self.progress.set_fraction(0.0);
        #print "force update GUI...";
        while gtk.events_pending():
            gtk.main_iteration(False) 

    def hideProgressBar(self):
        # hide progressbar
        self.should_show_progress = False;
        self.progress.set_text("");
        self.progress.grab_remove();
        self.progress.hide();
        self.p_label.hide();

        # show the scroll window and all children (table)
        self.w.sw.show_all();
        pass

    def getControl(self):
        return self.control;

    def show(self):
        """Show the window and invoke gtk.main() to loop&wait the GUI
        """
        self.w.show_all()
        self.initShowProgressBar();
        gtk.main()

    def get_object(self, object_id):
        """Get the component instance according to its ID
        @param:object_id str Such ID can be defined in menu definition
               or toolbar definition
        @return:gtk.Widget or None.
        """
        myobj = None;
        if(self.guicontainer.has_key(object_id)):
            myobj = self.guicontainer[object_id];
        return myobj;
    def setWindowTitle(self, title):
        """Set window title
        @param:title 
        """
        self.w.set_title(title);
    def setFilters(self, fitlers):
        """Set the filters settings
        @param:filters 
        """
        self.filters = fitlers;    
    def changeContainerFont(self, container, font):
        """Change the font of all components in that container.
        @param:container gtk.Container
        @param:font gtk.Font
        """
       # if(isinstance(container, gtk.Label)):
        container.modify_font(font);
    #    print(str(type(container)));
      #  else:
        if(hasattr(container,'get_children')):
            children = container.get_children();
            if(children == None):
                return;
            for child in (children):
                if(hasattr(child,'get_children')):
                    self.changeContainerFont(child,font);

    def mergeActions(self, actions): 
        """Register actions into GUI
        @param:actions dict which including actionID and actionReference.
        """
        if(not hasattr(self, 'reg_actions')):
            self.reg_actions = {};
        for key in actions.keys():
            action = actions[key];
            newActions = [];
            if(self.reg_actions.has_key(key)):
                newActions = self.reg_actions[key];
            if(isinstance(action, list)):
                newActions = newActions + action;
            else:
                newActions.append(action);
            self.reg_actions[key] = newActions;

    def addMenus(self, parent, values): 
        """Private method, add menus into parent(menubar or top menu) according to values (menuDefinition)
        @param:parent gtk.MenuBar or other gtk.Container
        @param:values str Menu definition. e.g.:{'Export':{'action':"FILEEXPORT"}}
        """
        if(values == None or len(values) == 0):
            return;
        for value in (values):
            if(isinstance(value, str)):
                item = None;
                item = self.createMenuItem(None,value);
                parent.append(item);
                item.show();
            elif(isinstance(value, dict)):
                (key,h_value) = value.items()[0];                
                menuType = None;
                if(h_value.has_key('type')):
                    menuType = h_value['type'];
                menuitem = self.createMenuItem(menuType,key);
                parent.append(menuitem);
                menuitem.show();
                if(h_value.has_key('action')):
                    action_id = h_value['action'];                    
                    menuitem.connect('activate',self.action_invoker.doActions, action_id);
                if(h_value.has_key('ID')):
                     myid = h_value['ID'];
                     self.guicontainer[myid] = menuitem;
                if(h_value.has_key('group')):
                     myid = h_value['group'];
                     item = self.get_object(myid);
                     menuitem.set_group(item);
                if(h_value.has_key('submenu')):   
                    submenus = h_value['submenu'];
                    menu=gtk.Menu();
                    menuitem.set_submenu(menu);
                    self.addMenus(menu, submenus);
                if(h_value.has_key('default')):   
                    default = h_value['default'];
                    if(cmp(default.lower(),'active') == 0):
                        menuitem.set_active(True);
                    if(cmp(default.lower(),'disabled') == 0):
                        menuitem.set_sensitive(False);
                    if(cmp(default.lower(),'invisibled') == 0):
                        menuitem.set_visible(False);  
                 
    def createMenuItem(self, menuType, text):
        """Create a menuitmer accodring to menuType with text label.
        @param:menuType str There are following types:
               check create a checkbutton menu item. checkbutton item can be checked or not. 
               radio create a group of radio menu item, only one item can be chosen at one time.
               space a blank line to divide the menu into different group.
               text common menu.
        @text the label of the menu.
        """
        item = None;
        if(menuType != None and cmp(menuType,'check')==0):
            item = gtk.CheckMenuItem(text);
        elif(menuType != None and cmp(menuType,'radio')==0):
                item = gtk.RadioMenuItem(None,text,False);                
        elif(cmp(text, "space") == 0 ):
            item = gtk.SeparatorMenuItem();
        else:
            item = gtk.MenuItem(text);
        return item;

    def addToolbarItem(self, items_defs, toolbar):
        """Add a toolbar item into toolbar
        @items_defs  str Define the items properties.
        E.g.: [{'Refresh':{'hint':'Fetch data manually','action':'ACTIONREFRESHONCE'}},'space'
                 ,{'Autorefresh':{'hint':'Enable automatic refresh|Disable automatic refresh','ID':'TOOLBAR_AUTOREFRESH','type':'toggle', 'action':'ACTIONAUTOREFRESH'}}];
        Explain above settings:
            1.Refresh: the name of button
            2.hint: define the tooltip . note: if there is a pipeline among the hint text such as the above Autorefresh,
                    and it's toggle button, it define two tooltips respectively for up and down status.
            3.action: Define the actionID related to certain actionMethod. When the button is clicked
                      It can invoke some actions related to the actionID.
            4.space: Define a pipeline between two buttons.
            5.ID: the refrence of "Autorefresh" button, you can get the button instance according the ID.
            6.type: toggle or value(default) If toggle is set, it means the button can be toggle down or up.
        @param:toolbar gtk.Toolbar
        """
        if(items_defs == None or (not isinstance(items_defs, list))):
            return;
        count = len(items_defs);
        for i in range(count):
            singleDef = items_defs[i];
            if(isinstance(singleDef, str)):
                if(cmp(singleDef,'space') == 0):
                    toolbar.append_space();
            elif(isinstance(singleDef, dict)):
                (key,h_value) = singleDef.items()[0];
                type_def = None;
                hints = ();
                button_hint = "";
                button_name = key;
                button_action = None;
                if(h_value.has_key('type')):
                    type_def = h_value['type'];
                if(h_value.has_key('hint')):
                    hints = h_value['hint'].split("|");
                    button_hint = hints[0];
                if(h_value.has_key('action')):
                    button_action = h_value['action'];
                item = None;
                if(type_def != None):                    
                    if(cmp(type_def,'toggle')==0):
                        item = toolbar.append_element(gtk.TOOLBAR_CHILD_TOGGLEBUTTON,None,button_name, button_hint,"Private",None
                                                      , self.action_invoker.doActions, button_action);
                    elif(cmp(type_def, 'label') == 0):
                        item =gtk.Label(button_name);
                        toolbar.append_widget(item,  "", "Private");
                        item.show();
                    elif(cmp(type_def, 'entry') == 0):
                        item = gtk.Entry();
                        toolbar.append_widget(item,  button_hint, "Private");
                        item.show();
                else:
                     item = toolbar.append_item(button_name, button_hint, "Private", None,self.action_invoker.doActions, button_action);
                
                if(h_value.has_key('ID')):
                    myid = h_value['ID'];
                    self.guicontainer[myid] = item;
                if(h_value.has_key('default')):   
                    default = h_value['default'];
                    if(cmp(default.lower(),'active') == 0):
                        item.set_active(True);
                    if(cmp(default.lower(),'disabled') == 0):
                        item.set_sensitive(False);
                    if(cmp(default.lower(),'invisibled') == 0):
                        item.set_visible(False);  
                if(len(hints)>0):
                    item.myHints = hints;

    def showStatusTest(self, widget, data):
        self.showStatus(data[1],data[0]);

    
###########################
# set the status, if 1 means temp text, after a while it can restore old text
# if 0 set the text until next time unchanged text
# if 3 automatic append "..." via timer(3 seconds).
##########################    
    def showStatus(self, signal, text):
        """Show some information in status bar.
        @param:signal str Define the type of status text.
               if LTEStatusGUI.STATUS_TEMP (1) means temp text, after a while it can restore old text
               if LTEStatusGUI.STATUS_MSG (0) set the text until next time unchanged text
               if LTEStatusGUI.STATUS_DYNAMIC (3) automatic append "..." via timer(3 seconds).
        @param:text str The content to be shown in status bar.
        """
        statusbar = self.w.status;
       # if(text == None or len(text) == 0 ):
       #    return;
        if(signal == self.STATUS_MSG or signal == self.STATUS_DYNAMIC):
            if(hasattr(self.w.status,"signal")):
                oldstatus = statusbar.signal;
                statusbar.pop(oldstatus);
            statusbar.signal = signal;
            statusbar.status_value = text;
            statusbar.status_TMP_value = text;
            statusbar.keepcount = 0;
            #statusbar.push(signal,text);
            self.pushTextToStatusBar(statusbar,signal,text);
        if(signal == self.STATUS_TEMP):
            statusbar.keepcount = 3;
           # statusbar.push(signal,text);
            self.pushTextToStatusBar(statusbar,signal,text);
        if(signal == self.STATUS_TIMER):
            if(hasattr(self.w.status,"keepcount") and self.w.status.keepcount > 0):
                self.w.status.keepcount = self.w.status.keepcount -1;
                if(self.w.status.keepcount == 0):
                    statusbar.pop(self.STATUS_TEMP);
            elif(hasattr(self.w.status,"signal") and self.w.status.signal == self.STATUS_DYNAMIC):
                statusbar.pop(self.STATUS_DYNAMIC);
                tmpvalue = statusbar.status_value;
                if(hasattr(statusbar,"status_TMP_value")):            
                    tmpvalue = statusbar.status_TMP_value;
                valueLen = len(tmpvalue);
                if(valueLen > 60):
                    tmpvalue = statusbar.status_value;
                else:
                    tmpvalue = tmpvalue + "...";
                statusbar.status_TMP_value = tmpvalue;                
               # statusbar.push(self.STATUS_DYNAMIC,tmpvalue);
                self.pushTextToStatusBar(statusbar,self.STATUS_DYNAMIC,tmpvalue);
        return True;
    def pushTextToStatusBar(self,statusbar,id,text):
        """Private method, to change the dynmic information in the status bar.
        @param:statusbar gtk.Statubar
        @param:id int This is a special value for gtk.Statusbar , that value is for controling the stack mesg in status bar.
        @param:text str The content of text.
        """
        if(text == None):
           return;
        hint = "";
        if(len(text) > 100):
           hint = text;
           text = text[0:99] + "...";
        statusbar.push(id,text);
#        statusbar.set_tooltip_text(hint);

    def tableKeyEvent(self,widget,event):
        """Private Method, it accepts all keyboard events happened in table.
        @param:widget get.Widget it sould be the get.Treeview
        @param:event gtk.Event
        """
        if(event.state == gtk.gdk.CONTROL_MASK and event.keyval == 99 ):
            self.action_invoker.doActions(widget, "EDITCOPYSELECTED");
            return True;
        if(event.state == gtk.gdk.CONTROL_MASK and event.keyval == 102 ):
            if(self.guicontainer.has_key('TOOLBAR_FINDENTRY')):
                entry = self.guicontainer['TOOLBAR_FINDENTRY'];
                entry.grab_focus();           
            return True;
        if(event.state == gtk.gdk.CONTROL_MASK and event.keyval == 110 ):
            # TODO:
            self.action_invoker.doActions(widget, "FINDNEXT");           
            return True;    
        else:
            return False;
    
    def rightClickButton(self,widget,event):
        """Private method , it accepts the mouse click event happened in table.
        @param:widget gtk.Widget has been change to popup menu, However if you want to invoke treeview instance , you can call self.w.tv.
        @param:event gtk.Event
        """
        if(event.button == 1):            
            return False;
        else:
            # for lazy-loading
            # for disable some menu items on the right-click-menu
            #
            if ( self.fp_onInitTableRightMenu ):
#                print "to call onInitTableRightMenu: ", self.fp_onInitTableRightMenu;
                self.fp_onInitTableRightMenu(self, widget);
            widget.popup(None, None, None, event.button, event.time)
        
        return True;

    def create_table(self, window, container):
        """Private Method, it construct the table showed in the window.
           1. create the gtk.TreeViewColumn according to columnDef
           2. create gtk.Treeview
           3. create two instance variable (gtk.ListStore and gtk.TreeStore)
           4. create gtk.CellRenderer to render every cell.(Including assign the color in cell)
           5. set column properties according columnDef.
        @param:window gtk.Window  it's the top window which contains the treeview.
        @param:container gtk.ScrolledWindow which can stick the treeview with scroll bars
        """
        columnDef = self.data.getColumnDef();
        count = len(columnDef.getAllColumns());
        self.columnTotal = count;
        types = [];
        for column in (columnDef.getAllColumns()):
            if(hasattr(column,"widget") and cmp(column.widget,'checkbutton')==0):
                types.append(gobject.TYPE_BOOLEAN);
            else:
                types.append(gobject.TYPE_STRING);
        self.liststore_list = gtk.ListStore(*types);
        self.liststore_tree = gtk.TreeStore(*types);
        self.liststore = self.liststore_tree;
        window.tv = gtk.TreeView(self.liststore);

        window.tv.set_property ('rules-hint', False)
        color = gtk.gdk.color_parse("#FFFFFF");
        window.tv.modify_base(gtk.STATE_NORMAL, color)
        window.tv.connect("key_press_event",self.tableKeyEvent);
        window.sw.add(window.tv);        
        
        sel = window.tv.get_selection();
        sel.set_mode(gtk.SELECTION_MULTIPLE)        
        window.tv.column=[None]*count;
        window.tv.cell=[None]*count;
        i = 0;
        for column in columnDef.getAllColumns():
            ID = self.getColumnProperty(column,'ID');
            text = self.getColumnProperty(column,'text');
            wiget = self.getColumnProperty(column,'widget');
            actionID = self.getColumnProperty(column,'action');
            window.tv.cell[i] = self.getRender(wiget, actionID,self.liststore , i);
            if(isinstance(window.tv.cell[i], gtk.CellRendererText)):
                window.tv.column[i] = gtk.TreeViewColumn(text
                                                         , window.tv.cell[i], text=i
                                                         ,background=count-1);
                
            elif(isinstance(window.tv.cell[i],gtk.CellRendererToggle)):
                window.tv.column[i] = gtk.TreeViewColumn(text
                                                         , window.tv.cell[i]);
                window.tv.column[i].add_attribute( window.tv.cell[i], "active", i);
            isSort = self.getColumnProperty(column,'sort');
            if(isSort == None or cmp(isSort.lower(),'true') == 0):  
                window.tv.column[i].set_sort_column_id(i);
            sortType = self.getColumnProperty(column,'sorttype');            
            if(sortType != None):
                sortData = {};
                sortData['column_id'] = i;
                sortData['type'] = sortType;
                self.liststore_list.set_sort_func(i, self.sortColumn,sortData);
                self.liststore_tree.set_sort_func(i, self.sortColumn,sortData); 
            isVisible = self.getColumnProperty(column,'visible');
            if(isVisible != None and cmp(isVisible.lower(),'false') == 0):
                window.tv.column[i].set_visible(False);               
            window.tv.column[i].set_resizable(True);
            if(hasattr(column,'pos') and int(column.pos) < i):
                window.tv.insert_column(window.tv.column[i],int(column.pos));
            else:
                window.tv.append_column(window.tv.column[i]);
            if(hasattr(column,'expander') and cmp(column.expander.lower(),'true') == 0):
                window.tv.set_expander_column(window.tv.column[i]);
            i = i + 1;            
        return window.tv

    def getColumnProperty(self,column,prop):
        """Private method, get the value of one property of the column
        @param:column DataColumn
        @param:prop str the property name
        """
        rlt = None;
        if(hasattr(column,prop)):
            exec 'rlt=column.'+prop;
        return rlt;
    def getRender(self,widgetDef,actionID, store, column):
        """Private method. It create the gtk.CellRenderer according to column definition, also connect the action to toggled column
        @param:widgetDef str Define the column type--check or text.
        @param:actionID str It can trigger an action related the actionID when the component in
                            the column is activated.e.g.:the checkbutton is clicked.
        @param:store gtk.TreeStore Deprecated now, however it's not in use as there are two kind of stores currently.
        @param:column DataColumn
        """
        widgetRender = None;   
        if(cmp(widgetDef,"checkbutton")==0):
            widgetRender = gtk.CellRendererToggle();
            widgetRender.set_property('activatable', True)
            self.CHECKED_KEY = column;
            widgetRender.connect( 'toggled', self.tableCheckButtonAction, store,column, actionID)
            #widgetRender.set_property('cell-background', '#FFFFFF');
        else:
            widgetRender = gtk.CellRendererText();
            widgetRender.set_property('editable', False);
            #widgetRender.set_property('background','#C4C4C4');

        return widgetRender;

    def tableCheckButtonAction(self, cell, path, store, column,actionID):
        """Private method , it's triggered when the check button in the treeview clicked by operator
           Note: It's import to use the current active treestore as there are two kinds of treestore.
                 self.liststore is current active treestore
        @param:cell gtk.CellRenderer
        @param:path gtk.Treepath
        @param:store gtk.Treestore
        @param:column column number
        @param:actionID str It can trigger an action related the actionID when the component in
                            the column is activated.e.g.:the checkbutton is clicked.
        """
        store = self.liststore;
        if not isinstance(store,VirtualTreeModel):   
            store[path][column] = not store[path][column];   
        else:
            path = self.changePathType(path)
            node = store.getNodeByPath(path)
            
            if node.getCheckboxValue():
                node.setCheckboxValue('')
            else:
                node.setCheckboxValue('True')
        self.action_invoker.doActions(cell, actionID);
        return 
    
    def changePathType(self, path):
        path = path.split(':')
        newPath = []
        for i in path:
            newPath.append(int(i))
        return newPath
    
    def getColumnTitles(self):
        """Get column titles as the following formate:
           "column1,column2,...,columnN"
        @return: str 
        """
        columns = self.w.tv.column;
        count = len(columns);
        titles = "";
        for i in range(count):
            if(not isinstance(self.w.tv.cell[i], gtk.CellRendererText)
                or self.w.tv.column[i].get_visible() == False):
                continue;
            else:
                if(len(titles) > 0):                       
                    titles += ",";            
            titles += columns[i].get_title(); 
        return titles;

    def showDialog(self,title,msg_type,information):
        """Private method. It can show a information dialog.
        @param:title str The dialog title
        @param:msg_type int It's one kind of gtk constant.
                MSG_WARNING ;   Define warning dialog
                MSG_INFO ;  Define infomation dialog
                MSG_ERROR; Define error dialog
                MSG_QUESTION =  gtk.MESSAGE_QUESTION; Define comfirmation dialog(not in use)
        @param:information str The content in the dialog.
        """
        window = gtk.Dialog(title,
                   self.w,
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
    def sortColumn(self, treemodel, itr1, itr2, sortdata):
        columnID = sortdata['column_id'];
        sort_type = sortdata['type'];
        liststore = treemodel;
        value1 = liststore.get_value(itr1,columnID);
        value2 = liststore.get_value(itr2,columnID);
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
        elif(cmp(sort_type,'both') == 0):
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
        elif(cmp(sort_type,'both[SYSTEM_ID]') == 0):
            activeHandler = self.action_invoker.viewHandler[ViewHandlerBase.currentActivatedView];
            if (hasattr(activeHandler, "compareValue")):
                omsValue1 = liststore.get_value(itr1, ColumnDef.getInstance().colIndexMap('SYSTEM_ID'));##
                omsValue2 = liststore.get_value(itr2, ColumnDef.getInstance().colIndexMap('SYSTEM_ID'));##
#                print("omsValue1:", omsValue1, "\tomsValue2:", omsValue2);
                cmpOms = activeHandler.compareValue(omsValue1, omsValue2, sort_type);##
#                print("debug 1 - cmpOms = ", cmpOms);
                if(cmpOms != 0):##
                    return cmpOms;##

#                print("debug 2");
                # else
                #sortdata['type'] = 'both';
                #return self.sortColumn(treemodel, itr1, itr2, sortdata);
                data1 = re.findall('\d+|\D+',value1);
                data2 = re.findall('\d+|\D+',value2);
#                print("data1:", data1, "data2:", data2);
                count = min(len(data1),len(data2));
                if(count == 0):
#                    print("cmp(value1, value2)");
                    return cmp(value1,value2);
                else:
                    for i in range(0,count):
                        sec_value1 = data1[i].isdigit() and int(data1[i]) or data1[i];
                        sec_value2 = data2[i].isdigit() and int(data2[i]) or data2[i];                                  
                        if(cmp(sec_value1,sec_value2) != 0 ):
#                            print ("cmp(sec_value1, sec_value2)");
                            return cmp(sec_value1,sec_value2);
#                    print("cmp(len(data1), len(data2))");
                    return cmp(len(data1), len(data2));
            raise Exception("No compareValue function found in the active ", ViewHandlerBase.currentActivatedView, " view."); 
                
        elif(cmp(sort_type,'str') == 0):
            return cmp(value1,value2);
        else:
            if(not hasattr(self,"reg_actions")):
#                print "reg_actions";
                return;
            if(self.reg_actions.has_key(sort_type)):
                actions = self.reg_actions[sort_type];
                result = actions[0](treemodel, itr1, itr2, columnID);
                return result;
    
    #Below sort function only apply for 4g and rfs report            
    def sort(self, widget, columnIndex):
        #a = time.time()
        #print "sort column begin = ", a
        activeHandler = self.getActiveHandler()
        if self.sortOrder == 1:
            self.sortOrder = -1
        else:
            self.sortOrder = 1
        
        self.sortColumnIndex = columnIndex
        activeHandler.sortAndBuildDataNodes(self.data)
	self.setSortIndicator()
	self.w.tv.column[columnIndex].connect("notify::width", self.onColWidthChange)
        activeHandler.activateViewForSort()
        #print "sort column end = ",time.time(), " cost = ", time.time()-a

    def setSortIndicator(self):
        columnIndex = self.sortColumnIndex
        if self.sortOrder == -1:
            arrow_type = gtk.ARROW_DOWN
        else:
            arrow_type = gtk.ARROW_UP
            
        i=0
        for column in ColumnDef.getInstance().getAllColumns():
            arrow = self.w.tv.column[i].get_widget().get_children()[-1]
            if i == columnIndex:
                arrow.set(arrow_type, gtk.SHADOW_IN)
                arrow.show()
            else:
                arrow.hide()
            i = i+1    
 
    def createHeader(self, column, title):
        box = gtk.HBox(False, 0);
        label = gtk.Label(title);
        box.pack_start(label, True, False, 0)
        label.show()
        box.show()
        
        arrow = gtk.Arrow(gtk.ARROW_UP, gtk.SHADOW_IN);
        box.pack_start(arrow, False, False, 0)
        
        return box

    def onColWidthChange(self, column, width):
        # ref http://stackoverflow.com/questions/3999146/detect-when-column-in-gtk-treeview-is-resized
        # gtk.TreeViewColumns aren't widgets so they unfortunately don't have a dedicated signal for size changes. 
        # But you can register a callback function that receives "width" change notifications:
        #
        # Note that "width" is a GParamInt object, not an integer
	#print "column width......",column.get_width()," column id = ",column.get_sort_column_id()
	widgets = column.get_widget().get_children()
	widgets_width =widgets[-1].size_request()[-2]+ widgets[-2].size_request()[-2]

	if column.get_width()-30 > widgets_width:
            column.get_widget().set_size_request(column.get_width()-30,16)

    
class FilterDialog:
    """Show and set the filter rules in the dialog
    @version:1.0
    @author:bobyan
    @modify:
         (bobyan)2011.4.11 add range filter page.
    """
    def __init__(self,parent, columns,filters={}):
        """Construct a filter dialog with the default definition by columns and filters.
        @param:parent gtk.Window The parent window, if parent window is destroyed, the dialog also be destroyed.
        @param:columns list of DataColumn.
        @param:filters dict of filters definition.
                e.g.:{"DN":{"MRBTS":False,"FTM":False, "LNBTS":True,"LNCEL":True},
                   "COSTATE":{"Non operational":False,"Operational":True}};
                Explain above settings:
                    1.DN: The name of filter column name. It can shown in drop popup menu of comobox in filter dialog.
                    2."MRBTS":False: Define default value of MRBTS, it means MRBTS can't be shown in the table content.
                    3.Note: If the filtertype of that column is range , it could be written similar as {"MRSITE":{"[1,5]":[1,5]}};
                      It means only show the data which mrsite value is in [1,2,3,4,5].

        """
        self.nodecolumns = copy.deepcopy(columns);
        self.addFiltersToColumn(copy.deepcopy(filters));
        self.dialog = gtk.Dialog("Filter Dialog...",
                   parent,
                   gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                   ("OK", gtk.RESPONSE_ACCEPT,
                    "Cancel", gtk.RESPONSE_REJECT));
        window = self.dialog;
        window.set_border_width(10)
        window.set_size_request(350, 200)
        hbox = gtk.VBox(False);
        combobox = gtk.combo_box_entry_new_text();
        nodeColumns = self.nodecolumns;
        for nodeColumn in nodeColumns:
           # if(len(nodeColumn.filter_list) > 0):
            if(hasattr(nodeColumn,"filter") and cmp(nodeColumn.filter.lower(), "false") != 0):
                combobox.append_text(nodeColumn.text);       
        combobox.child.connect('changed', self.onComboChanged);
        hbox.pack_start(combobox,False);
        combobox.show();
        
        scrolled_window = self.createDefaultFilterPane();

        self.toolbar = gtk.Toolbar();
        self.toolbar.set_orientation(gtk.ORIENTATION_HORIZONTAL)
        self.toolbar.set_style(gtk.TOOLBAR_TEXT)
        self.toolbar.set_border_width(0);
        item = self.toolbar.append_item("Append", "Apply new value", "Private",None, self.appendRange);
        self.toolbar.append_space();
        item = self.toolbar.append_item("Edit", "Edit new value", "Private", None,self.editRange);
        self.toolbar.append_space();
        item = self.toolbar.append_item("Remove", "Remove new value", "Private", None,self.deleteRange);
        self.toolbar.append_space();
        
        hbox.pack_start(self.toolbar,False);
        self.toolbar.show();
        
        hbox.pack_start(scrolled_window);
        scrolled_window.show();
        self.tree_scroll_pane = scrolled_window;
        hbox.show();
        window.vbox.pack_start(hbox);
        combobox.set_active(0);

    def appendRange(self,button):
        """Private method.Append a range into range filter box.
           It opens a dialog to input the range condition , then if operator click OK button,
           then append the range into filter box and also add the value in DataColumn instance
        @param:button gtk.Button notin use, it's a internal parameter from gtk event process.
        """
        model = self.tree_view.get_model();
        dialog = RangeEditDialog(self.dialog)
        isOk = dialog.show();
        if(isOk):
            (key,value) = dialog.getRangeValue();
            curNodeColumn = self.using_nodecolumn;
            curNodeColumn.filter_list[key] = value;
            iter = model.append();
            model.set(iter, 0, key);
    def editRange(self,button):
        """Private method.Edit a selected range in range filter box.
           It opens a dialog and show the values in range entry .The operator can change its value , then if operator click OK button,
           then change the range in filter box and also change the value in DataColumn instance
        @param:button gtk.Button notin use, it's a internal parameter from gtk event process.
        """        
        path = self.getSelectedRow(self.tree_view);
        if(path == None):
            self.showDialog("Info","Please select a row.");
            return;
        model = self.tree_view.get_model();
        oldkey = model[path][0];
        dialog = RangeEditDialog(self.dialog,oldkey)
        isOk = dialog.show();
        if(isOk):
            (key,value) = dialog.getRangeValue();            
            curNodeColumn = self.using_nodecolumn;
            del curNodeColumn.filter_list[oldkey];
            curNodeColumn.filter_list[key] = value;
            model[path][0] = key;
    def deleteRange(self,button):
        """Private method.Remove a selected range in range filter box.
           It opens a confirm dialog then if operator click OK button, the range can be removed.
        @param:button gtk.Button notin use, it's a internal parameter from gtk event process.
        """ 
        treeview = self.tree_view;
        path = self.getSelectedRow(treeview);
        if(path == None):
            self.showDialog("Info","Please select a row.");
            return;
        dialog = LTESimpleDialog(LTESimpleDialog.Msg_Confirm,"Do you want to delete selected row?"
                                 ,self.dialog,"Confirm Dialog...");
        isOk = dialog.show();
        if(isOk):
            model = treeview.get_model();
            oldkey = model[path][0];
            itr = model.get_iter(path);
            model.remove(itr);
            curNodeColumn = self.using_nodecolumn;
            del curNodeColumn.filter_list[oldkey];
                   
    def getSelectedRow(self,treeview):
        """Private method. To get the gtk.TreePath of first selected row in filter box.
        @param:treeview gtk.TreeView
        @return: gtk.TreePath
        """
        sel = treeview.get_selection();
        selected_list = [];
        (model, pathlist) = sel.get_selected_rows();
        if(len(pathlist) == 0):            
            return None;
        return pathlist[0];
        
    def showDialog(self,title,information):
        """Private method. It can show a information dialog.
        @param:title str The dialog title
        @param:information str The content in the dialog.
        """
        dialog = LTESimpleDialog(LTESimpleDialog.Msg_Info,information,self.dialog,title);
        dialog.show(); 
        
    def createDefaultFilterPane(self):
        """Private method. It creates a default panel which includes a scroll window below combobox
           Then there is a treeview in the scroll window. The treeview is filled with gtk.TreeListStore.
        """
        scrolled_window = gtk.ScrolledWindow()
        scrolled_window.set_policy(gtk.POLICY_AUTOMATIC, gtk.POLICY_AUTOMATIC)

        self.model = gtk.ListStore(gobject.TYPE_STRING, gobject.TYPE_BOOLEAN)
        model = self.model;
        model.set_sort_func(0,self.compareMethod);
        tree_view = gtk.TreeView(model);
        scrolled_window.add_with_viewport(tree_view)
        widgetRender = gtk.CellRendererToggle();
        widgetRender.set_property('activatable', True)            
        widgetRender.connect( 'toggled', self.tableCheckButtonAction, model,1)
        cell = gtk.CellRendererText()
        column = gtk.TreeViewColumn("Filter List", cell, text=0);
        self.columnText = column;
        self.renderText = cell;        
        checkColumn = gtk.TreeViewColumn(' ', widgetRender);
        checkColumn.add_attribute(widgetRender, "active", 1)
        self.checkColumn = checkColumn;
        tree_view.append_column(checkColumn);
        tree_view.append_column(column);        
        self.tree_view = tree_view;
        tree_view.show();
        return scrolled_window;
    
    def show(self):
        """Show the filter dialog. If the dialog is destoryed , it return the confirming state value.
        If True means the operator click OK button.
        @return:bool True or False is corresponding to "OK" or "Cancel".
        """
        isConfirmed = False;
        response =  self.dialog.run();
        if(response == gtk.RESPONSE_ACCEPT):           
            isConfirmed = True;
            # check for RFS: we must check LNBTS and WBTS
            # otherwise the dn-sub tree can not be established( FTM under both LNBTS and WBTS)
            filters = self.getFiltersHash();
            if ( isinstance(filters, dict) and filters.has_key('DN') ):
                dnf = filters['DN'];
                has_wbts   = isinstance(dnf, dict) and dnf.has_key('WBTS');
                show_wbts  = isinstance(dnf, dict) and dnf.has_key('WBTS') and dnf['WBTS'];
                has_lnbts   = isinstance(dnf, dict) and dnf.has_key('LNBTS');
                show_lnbts = isinstance(dnf, dict) and dnf.has_key('LNBTS') and dnf['LNBTS'];
                if ( has_lnbts and has_wbts ):
                    if ( (not show_lnbts) or (not show_wbts) ):
                        self.showDialog("Notice", "Both LNBTS and WBTS must be checked from the DN filter");
                        return self.show();
            DataControl.getInstance().setDataFilters(filters)
        self.dialog.destroy();
        return isConfirmed;     
       
    def onComboChanged(self, entry):
        """Private method.It accepts the event when the value changed in combobox.
        If the value in combobox is changed, it will update the values in filter box, also change looks
        as it need show different container with range filter and value filter. 
        @param:entry gtk.Entry It's the entry in combobox.
        """
        value = entry.get_text()
        nodeColumns = self.nodecolumns;
        for nodeColumn in nodeColumns:
            if(cmp(value,nodeColumn.text) == 0):
                filterType = "check";
                self.using_nodecolumn = nodeColumn;
                if(hasattr(nodeColumn,"filtertype")):                    
                    filterType = nodeColumn.filtertype;
                if(cmp(filterType,"range") == 0):
                    self.columnText.set_title("Range List");
                    self.update_range(self.model, nodeColumn);
                else:
                    self.columnText.set_title("Filter List");
                    self.update_list(self.model, nodeColumn);

    def tableCheckButtonAction(self, cell, path, store, column):
        """Private method. It accepts the event when operator click the checkbutton in value filter box.
        If the button is checked out, the value in the filter box can be filtered out in the table.
        @param:cell gtk.TreeCellRenderer
        @param:path gtk.TreePath
        @param:store gtk.TreeStore
        @param:column int The number of column
        """
        store[path][column] = not store[path][column];
        value = store[path][0];
        curNodeColumn = self.using_nodecolumn;
        curNodeColumn.filter_list[value] = store[path][column];           
        return

    def addFiltersToColumn(self, out_filters):
        """Private method. It add filter conditions in the filter dialog.
        According this method, the dialog can know current filter state in table. And also keep same as out filters.
        @param:out_filters dict of filters definition.
                e.g.:{"DN":{"MRBTS":False,"FTM":False, "LNBTS":True,"LNCEL":True},
                   "COSTATE":{"Non operational":False,"Operational":True}};
                Explain above settings:
                    1.DN: The name of filter column name. It can shown in drop popup menu of comobox in filter dialog.
                    2."MRBTS":False: Define default value of MRBTS, it means MRBTS can't be shown in the table content.
                    3.Note: If the filtertype of that column is range , it could be written similar as {"MRSITE":{"[1,5]":[1,5]}};
                      It means only show the data which mrsite value is in [1,2,3,4,5].
        """
        columns = self.nodecolumns;
        for column in columns:
            myid = column.ID;
            if(out_filters.has_key(myid)):
                for key in out_filters[myid].keys():
                   column.filter_list[key] = out_filters[myid][key];
                   
    def compareMethod(self, treemodel, iter1, iter2):
        """Private method. This method is for sorting range list in range filtering box.
        Single value is less than range value and compare range value with their begining value.
        @param:treemodel gtk.TreeModel
        @param:iter1 gtk.TreeIter The previous iter of row.
        @param:iter2 gtk.TreeIter The next iter of row.
        """
        key1 = treemodel.get_value(iter1,0);
        key2 = treemodel.get_value(iter2,0);        
        curNodeColumn = self.using_nodecolumn;
        value1 = curNodeColumn.filter_list[key1];
        value2 = curNodeColumn.filter_list[key2];
        A = isinstance(value1,bool);
        B = isinstance(value2,bool);
        if(A and B):
            return cmp(key1,key2);
        A = isinstance(value1,list);
        B = isinstance(value2,list);            
        if(A and not B):
            return 1;
        elif(not A and B):
            return -1;
        elif(A and B):
            return cmp(value1,value2);
        else:
            C = value1.isdigit();
            D = value2.isdigit();
            if(C and D):
                return cmp(int(value1),int(value2));
            else:
                return cmp(value1,value2);
        return  cmp(value1,value2);   
    
    def update_list(self, model, column):
        """Private method. It updates the values in text filter treeview according current column definition.
        @param:model gtk.TreeModel
        @param:column DataColumn It define whether the column has filter and what values can be filtered.
        """
        model.clear();
        self.tree_view.set_headers_visible(True);
        self.columnText.set_visible(True);
        self.checkColumn.set_visible(True);
        self.renderText.set_property('editable', False)
        self.columnText.set_sort_column_id(0);
        self.toolbar.hide();
        filter_list = column.filter_list;
        if(filter_list == None or len(filter_list) == 0):
            return;
        list_values = [];
        for value in filter_list.keys():
            list_values.append(value);
        list_values.sort();
        for value in list_values:
            iter = model.append();
            model.set(iter, 0, value)
            model.set(iter,1,filter_list[value]);
            
    def update_range(self,model, column):
        """Private method. It updates the values in range filter treeview according current column definition.
        Of course it also change container to range container.
        @param:model gtk.TreeModel
        @param:column DataColumn It define whether the column has filter and what values can be filtered.
        """        
        model.clear();
        self.tree_view.set_headers_visible(True);
        self.renderText.set_property('editable', False)
        self.toolbar.show();
        self.columnText.set_visible(True);
        self.columnText.set_sort_column_id(0);
        self.checkColumn.set_visible(False);
        filter_list = column.filter_list;
        if(filter_list == None or len(filter_list) == 0):
            return;
        list_values = [];
        for value in filter_list.keys():
            list_values.append(value);
        list_values.sort();
        for value in list_values:
            if(len(value) == 0):
                continue;
            iter = model.append();
            model.set(iter, 0, value)
        
    def getFiltersHash(self):
        """Get current filtering settings.
        @return:dict of filters definition.
                e.g.:{"DN":{"MRBTS":False,"FTM":False, "LNBTS":True,"LNCEL":True},
                   "COSTATE":{"Non operational":False,"Operational":True}};
                Explain above settings:
                    1.DN: The name of filter column name. It can shown in drop popup menu of comobox in filter dialog.
                    2."MRBTS":False: Define default value of MRBTS, it means MRBTS can't be shown in the table content.
                    3.Note: If the filtertype of that column is range , it could be written similar as {"MRSITE":{"[1,5]":[1,5]}};
                      It means only show the data which mrsite value is in [1,2,3,4,5].

        """
        h_filter = {};
        for nodeColumn in self.nodecolumns:
            if(hasattr(nodeColumn,"filter") and cmp(nodeColumn.filter.lower(), "false") != 0):
                myid = nodeColumn.ID;
                h_filter[myid] = nodeColumn.filter_list;
        return h_filter;

class AutoRefreshItervalDialog:
    def __init__(self, parentWnd, old_interval):
        self.old_interval = old_interval;
        self.new_interval = old_interval;
        self.parentWnd = parentWnd;
        self.dialog = gtk.Dialog("Set Auto-refresh Interval",
                                 self.parentWnd,
                                 gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                                 ("OK", gtk.RESPONSE_ACCEPT,
                                  "Cancel", gtk.RESPONSE_REJECT)
                                );
        self.dialog.set_border_width(10);
        self.dialog.set_size_request(270, 100);
        self.dialog.set_resizable(False);
        #vbox = gtk.VBox(False)
        #self.dialog.vbox.pack_start(vbox);
        #vbox.show();
        hbox = gtk.HBox(False, 0);
        hbox.show();
        self.dialog.vbox.pack_start(hbox);
        #
        label = gtk.Label("Autorefresh Interval: ");
        label.show();
        label2 = gtk.Label(" Second(s)");
        label2.show();
        self._entry = gtk.Entry();
        self._entry.set_width_chars(4);
        self._entry.show();
        #vbox.pack_start(label,False,False,0);
        #vbox.pack_start(self._entry,False,False,0);
        hbox.pack_start(label,False,False,0);
        hbox.pack_start(self._entry,False,False,0);
        hbox.pack_start(label2,False,False,0);

        # set initial value
        self._entry.set_text(str(self.old_interval));

    def show(self):
        isConfirmed = False;
        response =  self.dialog.run();
        if(response == gtk.RESPONSE_ACCEPT):
            p=re.compile("^\d+$");
            if(not p.match(self._entry.get_text())):
                title = "Warning Dialog";
                information = "Please input valid integer.";
                dlg = LTESimpleDialog(LTESimpleDialog.Msg_Info,information,self.dialog,title);
                dlg.show(); 
                return self.show();
            if ( int(self._entry.get_text()) < 20 ):
                title = "Warning Dialog";
                information = "Interval must >= 20";
                dlg = LTESimpleDialog(LTESimpleDialog.Msg_Info,information,self.dialog,title);
                dlg.show(); 
                return self.show();
            if ( (len(self._entry.get_text()) > 5) or (int(self._entry.get_text()) > 86400) ):
                title = "Warning Dialog";
                information = "Interval should <= 86400 seconds (one day)";
                dlg = LTESimpleDialog(LTESimpleDialog.Msg_Info,information,self.dialog,title);
                dlg.show(); 
                return self.show();
            isConfirmed = True;
            self.new_interval = self._entry.get_text();
        self.dialog.destroy();
        return isConfirmed;

    def getAutorefreshInterval(self):
#        print "new interval = ", self.new_interval;
        return self.new_interval;

class RangeEditDialog:
    """Show and set single range rule in the dialog
    @version:1.0
    @author:bobyan
    @modify:
    """
    def enter_callback(self, widget, entry):
        """Private method. To save the value in entry input by operator.
        @param:widget gtk.Widget
        @param:entry gtk.Entry
        """
        entry_text = entry.get_text()

    def entry_toggle_editable(self, checkbutton, entry):
        """Private method. To keep the editable state of entry same as radio active state.
        @param:checkbutton gtk.CheckButton
        @param:entry gtk.Entry  
        """
        entry.set_editable(checkbutton.get_active());

    def entry_toggle_visibility(self, checkbutton, entry):
        """Private method. To keep the visible state of entry same as radio active state.
        @param:checkbutton gtk.CheckButton
        @param:entry gtk.Entry  
        """        
        entry.set_visibility(checkbutton.get_active())
    def showRange(self,widget, isVisible):
        """Private method. To control the look of entry according which radio is checked
        There are two types : range value or single value. If single value is chosen, only one entry can be shown
        Or both entry should be shown.
        @param:widget gtk.Widget The widget trigger the event.
        @param:isVisible True means it needs show range value.
        """
        if(isVisible):
            self.firstLabel.set_text("From:");
            self.secondEntry.show();
            self.secondLabel.show();
        else:
            self.firstLabel.set_text("Value:");
            self.secondEntry.hide();
            self.secondLabel.hide();
        self.isRangeValue = isVisible;
    def show(self):
        """To show the range dialog. It can accept the input from operator.
        Now you can imput single value or range value in the range dialog.
        It return the comfirmation from operator.
        @return:bool True or False is corresponding to "OK" or "Cancel".
        """
        isConfirmed = False;
        response =  self.dialog.run();
        if(response == gtk.RESPONSE_ACCEPT):
            if(not self.setRange()):
                self.showDialog("Warning Dialog","Please input valid range:\n1.Check if it's digit.\n2.Check if the first value is less than second one.");
                return self.show();                
            isConfirmed = True;
        self.dialog.destroy();
        return isConfirmed;
    def showMainWindow(self):
        """Not in use, only for self test.
        """
        self.dialog.show();
        gtk.main();

    def showDialog(self,title,information):
        """Private method. It can show a information dialog.
        @param:title str The dialog title
        @param:information str The content in the dialog.
        """        
        dialog = LTESimpleDialog(LTESimpleDialog.Msg_Info,information,self.dialog,title);
        dialog.show();
    def setRange(self):
        """To set range value into the entries in the dialog. It's for initialize the values in the range dialog.
        """
        isValid = True;
        if(self.isRangeValue):
            firstValue = self.firstEntry.get_text();
            secondValue = self.secondEntry.get_text();
            try:
                if(int(firstValue) > int(secondValue)):
                    isValid = False;
                else:
                    self.filterKey = "[" + firstValue + "," + secondValue + "]";
                    self.filterValue = [int(firstValue),int(secondValue)];                
            except:
                isValid = False;
        else:
            firstValue = self.firstEntry.get_text();
            if(len(firstValue) == 0):
                isValid = False;
            else:
                self.filterKey = firstValue;
                self.filterValue = firstValue;                  
        return isValid;
    def getRangeValue(self):
        """To get the range values set by operator
        @return:list of range values.
        """
        return (self.filterKey, self.filterValue);
    def __init__(self,parent=None,values=None):
        """Construct the range dialog.
        It creates the frame of the range dialog and also initialize the values according to values.
        @param:parent gtk.Window if parent is destroyed then range dialog also is destroyed
        @param:values list of range from out modules.
        """
        self.dialog = gtk.Dialog("Range Dialog...",
                   parent,
                   gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                   ("OK", gtk.RESPONSE_ACCEPT,
                    "Cancel", gtk.RESPONSE_REJECT));
        window = self.dialog;
        window.set_border_width(10)
        window.set_size_request(400, 120)

        vbox = gtk.VBox(False)
        window.vbox.pack_start(vbox);
        window.set_resizable(False);
        vbox.show();


        self.isRangeValue = True;
        radio_hbox = gtk.HBox(False, 0);
        range_radio = gtk.RadioButton(None, "Range value");
        self.range_radio = range_radio;
        range_radio.connect("toggled", self.showRange,True)
    
        radio_hbox.pack_start(range_radio, False, False, 0)
        range_radio.show();
        single_radio = gtk.RadioButton(range_radio, "Single value");
        self.single_radio = single_radio;
        single_radio.connect("toggled", self.showRange,False);
        radio_hbox.pack_start(single_radio, False, False, 0)
        single_radio.show();       
        vbox.pack_start(radio_hbox,False,False,0);
        radio_hbox.show();
        
        entry_hbox = gtk.HBox(False, 0);
        label = gtk.Label("From:");
        self.firstLabel = label;
        entry = gtk.Entry();
        self.firstEntry = entry;
        entry.connect("activate", self.enter_callback, entry);
        entry_hbox.pack_start(label,False,False,0);
        entry_hbox.pack_start(entry,False,False,0);
        label.show();
        entry.show();
        label = gtk.Label("  To:");
        self.secondLabel = label;
        entry = gtk.Entry();
        self.secondEntry = entry;
        entry.connect("activate", self.enter_callback, entry);
        entry_hbox.pack_start(label,False,False,0);
        entry_hbox.pack_start(entry,False,False,0);
        label.show();
        entry.show();        
        vbox.pack_start(entry_hbox,False,False,0);
        entry_hbox.show(); 
        self.initValues(values);

        self.filterKey = None;
        self.filterValue = None;
    def initValues(self,values):
        """Private method. It initializes the values in the range entries.
        @param:values list of range values.
        """
        if(values == None):
            return;
        pos = values.find(",");
        if(pos <= 0):
            self.single_radio.clicked();
            self.firstEntry.set_text(values);
        else:
            self.range_radio.clicked();
            values = values.replace("[","");
            values = values.replace("]","");
            pos = values.find(",");
            self.firstEntry.set_text(values[0:pos]);
            self.secondEntry.set_text(values[pos+1:]);

class LTESimpleDialog:
    """Show a simple dialog including two types:
       Msg_Info dialog only has OK button and provide some tip information
       Msg_Confirm dialog has OK and Cancel dialog to permit operator to choose
                   Yes or No.
    @version:1.0
    @author:bobyan
    @modify:
    """
    Msg_Confirm = 0;
    Msg_Info = 1;
    def __init__(self,msgType,msg,parent=None,title = "Info"):
        """Construct a simple dialog according msgType
        @param:msgType int Msg_Info dialog only has OK button and provide some tip information,
                           Msg_Confirm dialog has OK and Cancel dialog to permit operator to choose Yes or No.
        @param:msg str The msg body in the dialog
        @param:parent gkt.Window
        @param:title str It the dialog title.
        """
        self.dialog = None;
        if(msgType == self.Msg_Confirm):
            self.dialog =  gtk.Dialog(title,
                   parent,
                   gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                   ("OK", gtk.RESPONSE_ACCEPT,
                    "Cancel", gtk.RESPONSE_REJECT));
        else:
            self.dialog = gtk.Dialog(title,
                   self.dialog,
                   gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT ,
                   ("OK", gtk.RESPONSE_ACCEPT));
        
        label = gtk.Label("\n" + msg+"\n");
        label.set_justify(gtk.JUSTIFY_LEFT)

        self.dialog.vbox.pack_start(label,False, False,0)
        label.show();
        self.dialog.set_has_separator(False);
        self.dialog.set_resizable(False);
    def show(self):
        """To show the dialog
        @return:bool  If it's confirming dialog, it ruturns confirming result from operator, or return False.
        """
        isConfirmed = False;
        response =  self.dialog.run();
        if(response == gtk.RESPONSE_ACCEPT):              
            isConfirmed = True;
        self.dialog.destroy();
        return isConfirmed;   

class ConfirmDialogForLock:
    """A little complicated comfirm dialog, it includes all objects chosen by
       operator to be done one action (lock/unlock/shutdown/reset).It lists all
       objects in a box and the operator also can check out it. It can return
       which objects is checked in after the dialog disappeared.
       Note: the parseNodeList is very important and not well implemented currently
       There are some hard codes in it. Enhanced in future.
    @version:1.0
    @author:bobyan
    @modify:
    """    
    def create_list(self, actioin_name, node_list, isShowActivated,dn_column_title):
        """Private method. To create a treeview in scroll window
        @param:action_name str The action name such as lock/unlock/shutdown/reset
        @param:node_list list of LTEStatusDataNode Which are these nodes are checked in report table.
        @param:isShowAcivated bool If true it show a checkbutton before every row.
        @param:dn_column_title str The column name.
        """
        # Create a new scrolled window, with scrollbars only if needed
        scrolled_window = gtk.ScrolledWindow()
        scrolled_window.set_policy(gtk.POLICY_AUTOMATIC, gtk.POLICY_AUTOMATIC)

        model = gtk.ListStore(gobject.TYPE_STRING, gobject.TYPE_BOOLEAN, gobject.TYPE_STRING,)
        tree_view = gtk.TreeView(model)
        scrolled_window.add_with_viewport (tree_view)
        tree_view.show()
        scrolled_window.listStore = model;
        model.clear();
        # Add some messages to the window
        for node in node_list:
            dn = node.getDN();
            iter = model.append()
            model.set(iter, 0, dn)
            model.set(iter,1,True);
            if(hasattr(node,"message")):
                message = node.message;
                model.set(iter, 2, message);

        cell = gtk.CellRendererText()
        column = gtk.TreeViewColumn(dn_column_title, cell, text=0)
        
        if(isShowActivated):
            widgetRender = gtk.CellRendererToggle();
            widgetRender.set_property('activatable', True)            
            widgetRender.connect( 'toggled', self.tableCheckButtonAction, model,1)
            checkColumn = gtk.TreeViewColumn(' ', widgetRender);
            checkColumn.add_attribute(widgetRender, "active", 1)
            tree_view.append_column(checkColumn)
            tree_view.append_column(column)
        else:
            tree_view.append_column(column)
            msgCell = gtk.CellRendererText()
            msgcolumn = gtk.TreeViewColumn("message", msgCell, text=2)
            tree_view.append_column(msgcolumn)
        return scrolled_window 

    def tableCheckButtonAction(self, cell, path, store, column):
        """Private method. It change the check state when operator click the checkbox.
        @param:cell gtk.TreeCellRenderer
        @param:path gtk.TreePath
        @param:store gtk.TreeModel
        @param:column int It's the number of the row.
        """
        store[path][column] = not store[path][column];
        return 
   
    def parseNodeList(self, action_name, node_list):
        """Private method. To make sure which node is valide for current action_name.If invalide node, put them in invalide box.
        @param:action_name str Such as lock/unlock/shutdown/reset
        @param:node_list list of LTEStatusDataNode.
        """
        validateNodes = [];
        inValidateNodes = [];
        for node in node_list:
            version = node.getVersion();
            if(cmp(node.getCOSTATE(),"Operational") != 0):
                inValidateNodes.append(node);
                node.message = "It's not operational object!";
            elif(re.search('\d+',version) == None):
                inValidateNodes.append(node);
                node.message = "Can't get it's version";
            elif(cmp(action_name,'reset') == 0
                 and cmp(version,'LN1.0') == 0):
                inValidateNodes.append(node);
                node.message = "RL10 can't support such function";
            elif(((action_name.find('lock') >= 0) or (action_name.find('shut') >= 0))
                 and cmp(node.getNEType(),'LNCEL') != 0):
                continue;
            elif(cmp(action_name,'shut down') == 0
                 and cmp(version,'LN1.0') == 0):
                inValidateNodes.append(node);
                node.message = "RL10 can't support such function";
            elif(cmp(action_name,'shut down') == 0 and cmp(node.getAdministrative(),"Locked") == 0):
                inValidateNodes.append(node);
                node.message = "Locked cell can't be shut down";               
            else:
                validateNodes.append(node);
                
        return(validateNodes, inValidateNodes);
    def __init__(self,parent, action_name, node_list):
        """Construct special confirming dialog for lock/unlock/shutdown/reset
        It includes a treeview in a scrool window where it lists the nodes checked in report table for doing certain action.
        @param:parent gtk.Window
        @param:action_name str Such as lock/unlock/shutdown/reset
        @param:node_list list of LTEStatusDataNode checked in report table.
        """
        self.dialog = gtk.Dialog("Confirm Dialog...",
                   parent,
                   gtk.DIALOG_MODAL | gtk.DIALOG_DESTROY_WITH_PARENT,
                   ("OK", gtk.RESPONSE_ACCEPT,
                    "Cancel", gtk.RESPONSE_REJECT));
        window = self.dialog

        window.set_border_width(10)
        window.set_size_request(450, 400)

        vpaned = gtk.VPaned()
        window.vbox.pack_start(vpaned)
        vpaned.show();
        (validate_data, invalidate_data) = self.parseNodeList(action_name,node_list);
        self.validate_data = validate_data;

        list = self.create_list(action_name, validate_data, True, 'DN');
        frame = gtk.Frame("The following objects can be " + action_name.lower());
        frame.show();
        frame.add(list);
        vpaned.add1(frame)
        list.show()
        self.listStore = list.listStore;
        if(len(invalidate_data) == 0):
            return;
        
        list2 = self.create_list(action_name, invalidate_data, False
                                , 'DN');
        frame = gtk.Frame('The following objects can\'t be ' + action_name.lower());
        frame.add(list2);
        frame.show();
        vpaned.add2(frame)
        list2.show()
        vpaned.set_property('position-set', True);
        vpaned.set_position(200)
    def show(self):
        """Show the confirming dialog. 
        @return:bool True or False is corresponding to "OK" or "Cancel".
        """
        isConfirmed = False;
        response =  self.dialog.run();
        checkedItem = [];
        if(response == gtk.RESPONSE_ACCEPT):           
            for i in range(len(self.listStore)):
                isChecked = self.listStore[i][1];                
                if(isChecked):
                    dn = self.listStore[i][0];
                    node = self.getNodeByDN(self.validate_data, dn);
                    
                    if(node == None):
                        continue;
                    checkedItem.append(node);
            isConfirmed = True;
        self.checkedNode_list = checkedItem;
        self.dialog.destroy();
        return isConfirmed;
    def getCheckedNodeList(self):
        """To get the checked nodes in treeveiw.
        @return:list Which stores LTEStatusDataNode.
        """
        return self.checkedNode_list;
    
    def getNodeByDN(self, node_list, dn):
        """Private mehtod. To get a LTEStatusDataNode according to dn value.
        @param:node_list list storing LTEStatusDataNode.
        @param:dn str The DN value.
        """
        myNode = None;
        for node in node_list:
            if(cmp(dn,node.getDN()) == 0):
                myNode = node;
                break;
        return myNode;

class GUIActions:
    """Including some actions of common and special for LTE
       This class also provide an adapter method to control all window
       actions. However it's better to avoid adding more actions in this class.
    @version:1.2
    @author:bobyan
    @modify:
         (bobyan)2011.3.11 add update_actionstate to control the status of actioin buttons
                 2011.4.11 add tree view actions and filters actions
    """
    FILE_EXPORT = 'FILEEXPORT';
    WINDOW_QUIT = 'WINDOWQUIT';
    
    EDIT_COPY_SELECTED = 'EDITCOPYSELECTED';
    EDIT_COPY_ALL = 'EDITCOPYALL';
    EDIT_SELECT_ALL = 'EDITSELECTALL';
    EDIT_UNSELECT_ALL = 'EDITSUNELECTALL';
    EDIT_COLLAPSE_ALL = 'EDITSCOLLAPSEALL';    
    EDIT_EXPAND_ALL = 'EDITSEXPANDALL';       

    ACTION_AUTOREFRESH = 'ACTIONAUTOREFRESH';
    ACTION_REFRESH_ONCE = 'ACTIONREFRESHONCE';
    

    FIND_PREVOUS = 'FINDPREVIOUS';
    FIND_NEXT = 'FINDNEXT';    

    LOCK_IMMEDIATE = 'LOCKIMMEDIATE';
    LOCK_GRACEFUL = 'LOCKGRACEFUL';
    UNLOCK_LNCEL = 'UNLOCKLNCEL';
    RESET_LNBTS = 'RESETLNBTS';

    UPDATE_ACTIONSTATE = 'UPDATEACTIONSTATE';
    ALARM_LINK = 'ALARMLINK';

    SETTING_LISTVIEW = 'SHOWLISTVIEW';
    SETTING_TREEVIEW = 'SHOWTREEVIEW';
    SETTING_DATAFILTER = 'DATAFILTER';
    SETTING_AUTOREFRESH_INTERVAL = 'AUTO_REFRESH_INTERVAL';

    def __init__(self, gui):
        """Construct the GUI actions
        @param:gui LTEStatusGUI 
        """

        self._gui = gui;
        self.isGUIActions = True;

        self.regester = {};
        self.regester[self.FILE_EXPORT] = self.exportAllClicked;
        self.regester[self.WINDOW_QUIT] = self.windowquit;
        self.regester[self.EDIT_COPY_SELECTED] = self.copySelectedRows;
        self.regester[self.EDIT_COPY_ALL] = self.copyAllClicked;
        self.regester[self.EDIT_SELECT_ALL] = self.selectAllVisibleRows;
        self.regester[self.EDIT_UNSELECT_ALL] = self.unselectAllClicked;
        self.regester[self.EDIT_COLLAPSE_ALL] = self.collapseall;
        self.regester[self.EDIT_EXPAND_ALL] = self.expandall;
        self.regester[self.FIND_NEXT] = self.findNextClicked;
        self.regester[self.FIND_PREVOUS] = self.findPrevClicked;

        self.regester[self.SETTING_LISTVIEW] = self.showaListviewLazy;
        self.regester[self.SETTING_TREEVIEW] = self.showDnTreeviewLazy;
        self.regester[self.SETTING_DATAFILTER] = self.setTableFilter;

        self.regester[self.ALARM_LINK] = self.showAlarmMonitor;

        #############################################################################
        # lazy loading refactory
        self.viewHandler = {};
        self.viewHandler[ViewHandlerBase.viewType_List] = ListHandler();
        self.viewHandler[ViewHandlerBase.viewType_DN] = DnTreeHandler();

        # refresh-once
        self.regester[self.ACTION_REFRESH_ONCE] = self.refreshOnce;

        # auto-refresh related
        self.autoRefreshImpl = AutoRefreshImpl();
        # auto-refresh clicked
        self.regester[self.ACTION_AUTOREFRESH] = self.autoRefreshClicked;
        # auto-refresh interval setting
        self.regester[self.SETTING_AUTOREFRESH_INTERVAL] = self.setAutoRefreshInterval;
        # end lazy loading refactory
        #############################################################################

    def setGUIObj(self, gui):
        self._gui = gui;
    
    def onInitTableRightMenu(self, gui, menu):
#        print "[GUIActions] onInitTableRightMenu";
        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        if ( isinstance(activeHandler, ViewHandlerBase) ):
            activeHandler.onInitTableRightMenu(gui, menu);
        else:
            raise Exception("Error!, no active View!!!");

    # data refreshed notify, after "Refresh" or "Autorefresh"
    def notifyDataUpdated(self, gui):
#        print "[in thread:", threading.currentThread().getName(), "] notifyDataUpdated.";
#        print "[LTEActions.py] notifyDataUpdated, data row count=", len(gui.data.getRealNodes());

	gui.dataUpdated = True
        gui.during_notifyDataUpdated = True;
        status_text = "Data loaded, updating the view...";
        if (gui.should_show_progress):
            gui.setUpdatingViewText(status_text);
        gui.showStatus(gui.STATUS_DYNAMIC, status_text);

        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        if ( isinstance(activeHandler, ViewHandlerBase) ):
            activeHandler.setGUIObj(gui);
            gui.w.tv.set_sensitive(False);
            activeHandler.reloadView();
            gui.w.tv.set_sensitive(True);
        else:
            raise Exception("Error!, no active View!!!");

        if (gui.should_show_progress):
            gui.hideProgressBar();
        
        if hasattr(gui.action_invoker, 'update_actionstate'):
            gui.action_invoker.update_actionstate(None, gui)
        else:
            gui.showStatus(gui.STATUS_MSG, "");
        gui.during_notifyDataUpdated = False;
        
    def showaListviewLazy(self, widget, gui):
        self.viewHandler[ViewHandlerBase.viewType_List].showView(widget, gui);

    def showDnTreeviewLazy(self, widget, gui):
        self.viewHandler[ViewHandlerBase.viewType_DN].showView(widget, gui);

    def copyAllClicked(self, widget, gui):
#        print "copyAll called.", widget;
        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        if ( isinstance(activeHandler, ViewHandlerBase) ):
	    #gui.clipboard.clear();
	    gui.clipboard.set_text('')
            activeHandler.exporter.copyAll(widget, gui);
        else:
#            print "ERROR!";
            pass

    def selectAllVisibleRows(self, widget, gui):
        liststore = gui.liststore;
        selection = gui.w.tv.get_selection();
        selection.select_all();  # select_all only select the 'expanded' rows (visible or can scroll-to-visible)

    def unselectAllClicked(self, widget, gui):
        selection = gui.w.tv.get_selection();
        selection.unselect_all();

    def copySelectedRows(self, widget, gui):
        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        if ( isinstance(activeHandler, ViewHandlerBase) ):
            activeHandler.copySelectedRows(widget, gui);
        else:
#            print "ERROR!";
            pass

    def findNextClicked(self, widget, gui):
        self.doFind(widget, gui, "Next");

    def findPrevClicked(self, widget, gui):
        self.doFind(widget, gui, "UP");

    def doFind(self, widget, gui, direction):
        #print "doFind--", direction;
        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        if ( isinstance(activeHandler, ViewHandlerBase) ):
            activeHandler.finder.findKeyword(gui, direction);
        else:
            #print "ERROR!";
            pass

    def exportAllClicked(self, widget, gui):
        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        if ( isinstance(activeHandler, ViewHandlerBase) ):
            activeHandler.exporter.exportAll(widget, gui);
            return True;
        else:
#            print "ERROR!";
            pass

    def refreshOnce(self, widget, gui):
        self._gui = gui;
        control = gui.getControl();
        control.setDataNotifyMethod(self.notifyDataUpdated);
        control.fetchDataFromDB();  # after data fetched from DB, worker thread will notify GUI thread
                                    # by calling it's dataNotifyMethod "function pointer"
                                    # and as we set it by:
                                    #   control.setDataNotifyMethod(self.notifyDataUpdated);
                                    # ==>
                                    #   self.notifyDataUpdated will be called after data fetched from DB
        # show progressbar when refresh once
        #gui.initShowProgressBar();

    def autoRefreshClicked(self, widget, gui):
        self.autoRefreshImpl.toggleAutorefresh(widget, gui, self);

    def setAutoRefreshInterval(self, widget, gui):
        dialog = AutoRefreshItervalDialog(gui.w, gui.control.getAutoRefreshInterval());
        isConfirmed = dialog.show();
        if(isConfirmed):
            self._gui.control.saveAutorefreshInterval(dialog.getAutorefreshInterval());

            autorefresh_is_on = self.autoRefreshImpl.isAutorefreshEnabled();
            if ( autorefresh_is_on ):
                #self.autoRefreshImpl.enableAutorefresh(False);
                #self.autoRefreshImpl.enableAutorefresh(True);
                    # this will NOT working, because the autoRefreshImpl may in waiting the timer
                    # status, stop and start medialtely will not take effect.
                    # instead, we new another AutoRefreshImpl instance
                self.autoRefreshImpl.enableAutorefresh(False, False);
                self.autoRefreshImpl = AutoRefreshImpl();
                self.autoRefreshImpl.setGUIAndActionObj(gui, self);
                self.autoRefreshImpl.enableAutorefresh(True);

    def getActions(self):
        '''Get current action dict, In that there are the actionID and action reference
        @return: a dict 
        '''
        return self.regester;
    
    def doActions(self, widget, action_id):
        '''Invoke the action according action_id. All GUI events need access this method and trigger the real action.
        However if certain action return True, then the other actions after that will not be triggered.
        @param:widget gtk.Widget It's the componet which triggers the action.
        @param:action_id str
        @return: bool If return True, the process can be interuppted and the later actions are ignored.
        '''
        if(action_id == None):
            return;
        gui = self._gui;
        if(not hasattr(gui,"reg_actions")):
            return;
        if(gui.reg_actions.has_key(action_id)):
            actions = gui.reg_actions[action_id];
            for action in actions:
                result = action(widget,gui);
                if(result != None and isinstance(result, bool) and result == True):
                    return True;

    def windowquit(self,widget, gui):
        '''
        Quit App from menu 'File' -- Exit
        '''
        gui.control.exitWorker();
        gui.w.destroy();
        gtk.main_quit()
        return False;
    
    def collapseall(self,widget, gui):
        '''Collapse all tree nodes if current view is tree view
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        '''        
        gui.w.tv.collapse_all();
    def expandall(self,widget, gui):
        '''Expand all tree nodes if current view is tree view
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        '''  
        gui.w.tv.expand_all();

    def setTableFilter(self, widget, gui):
        '''Define filtering settings. It will popup a filter dialog,
        the operator can set filering values and then click OK button, the report
        can filter out some rows which can't sastify the filtering settings.
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance
        ''' 
        nodeColumns = gui.data.getColumnDef().getAllColumns();
        dialog = FilterDialog(gui.w,nodeColumns,gui.filters);
        isConfirmed = dialog.show();
        if(not isConfirmed):
            return;
        else:
            filters = dialog.getFiltersHash();
            gui.filters = filters;
            self._applyFilter(filters);

    def _applyFilter(self, filters):
        for key in self.viewHandler.keys():
            vh = self.viewHandler[key];
            if ( hasattr(vh, "changeL1DnPattern") ):
                vh.changeL1DnPattern(filters);
        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        if ( isinstance(activeHandler, ViewHandlerBase) ):
#            if ( hasattr(activeHandler, "changeL1DnPattern") ):
#                activeHandler.changeL1DnPattern(filters);
            activeHandler.reloadView();
        else:
            #print "Error!, no active View!!!";
            pass

    def showAlarmMonitor(self, widget, gui):
        activeHandler = self.viewHandler[ViewHandlerBase.currentActivatedView];
        activeHandler.setGUIObj(gui);
        if ( isinstance(activeHandler, ViewHandlerBase) ):
            sel = gui.w.tv.get_selection();
            (model, pathlist) = sel.get_selected_rows();

            # get all selected gids
            lstGID = [];
            for i in pathlist:
                itr = model.get_iter(i);
                gid = model.get_value(itr, ColumnDef.getInstance().colIndexMap('GID'));
#                print "showAlarmMonitor, gid=", gid;
                if ( "-3" == gid ):
                    # not expanded level-1 DN (WBTS, LNBTS)
                    if ( not isinstance(activeHandler, DnTreeHandler) ):
                        raise Exception("has gid=-3 row, but not DnTreeHandler.");
                    dn = model.get_value(itr, ColumnDef.getInstance().colIndexMap('DN'));
#                    print "showAlarmMonitor, dn=", dn;
                    gid = activeHandler.getL1RealGID(dn);
                    if ( not gid ):
                        raise Exception("has gid=-3 row, but can not find real GID.");
                    lstGID.append(gid);
                elif ( len(gid) > 2 ):  # not dummy GID like '-1', '-2' ...
                                      # selected items are always visible
                                      # ==> already expanded
                                      # ==> no possible the GID is '-1' '-2'
                                      # but anyway, check it here
                    lstGID.append(gid);
            if ( len(lstGID) > 0):
                strGid = ' '.join(lstGID);
#                print "strGIDs=", strGid;
                self._gui.control.fecher.launchAlarmMonitor(strGid);
            else:
                raise Exception("Error!, no GID for AlarmMonitor!!!");
        else:
            raise Exception("Error!, no active View!!!");

class StatusReportActionsBase(GUIActions):
    def __init__(self, gui):
        GUIActions.__init__(self, gui);

    def _runCMD(self, cmd):
        '''Only for test, it can run a command line
        @param:cmd str The command line.
        '''
        child = popen2.Popen3(cmd, 1);
        child.tochild.close();

    def getCheckedNodes(self, action_name, gui):
        """
        For lock/unlock/shutdown/reset, to get current selected LTEStatusDataNodes.
        However it also return children of selected node if action_name is not "reset"
        @param:action_name str reset,lock,unlock,shutdown ...;
        @return: list of LTEStatusDataNode.
        """
        checked_hash = CheckboxColumnHelper.getCheckedList(gui);
        checked_nodes = []
        liststore = gui.liststore;
        p = re.compile('OMS|MRBTS|LNBTS|LNCEL|FTM')
        
        costate_hash = {'Operational':'0', 'Created from the network':'2', 'Non operational':'3'}
        ad_hash = {'Unlocked':'1','Shutting down':'2','Locked' : '3'}
        data = LTEStatusData();
        
        record_dn = []        
        checked_keys = checked_hash.keys()
        checked_keys.sort() 
        for dn in checked_keys:
            if dn not in record_dn:
                iter = checked_hash[dn]
                gid = liststore.get_value(iter, ColumnDef.getInstance().colIndexMap('GID'))
                costate = liststore.get_value(iter, ColumnDef.getInstance().colIndexMap('COSTATE'))
                version = liststore.get_value(iter, ColumnDef.getInstance().colIndexMap('Version'))
                admin_state = liststore.get_value(iter, ColumnDef.getInstance().colIndexMap('Administrative'))
                m =  p.findall(dn)
            
                node = data.createNode(gid);   
                node.dn = dn
                node.costate = costate_hash.get(costate)
                node.setVersion(version)
                node.setAdministrative(ad_hash.get(admin_state))
                node.neType = m[-1]
            
                checked_nodes.append(node)
                record_dn.append(dn)
                #print "node = ",node.getRowValue()

                if(cmp(action_name,'reset') == 0):
                    continue;
            
                if node.neType == 'LNBTS':
                    children = gui.lncel_nodes.get(dn)
                    for child in children:
                        if child.getDN() not in record_dn:
                            checked_nodes.append(child)
                            record_dn.append(child.getDN())
                            #print "lncel node = ",node.getRowValue()
                    
        return checked_nodes;

class ViewHandlerBase:
    # constant to indicate the current type.
    viewType_List   = 'List';
    viewType_DN     = 'DN';
    viewType_MRSITE = 'MRSITE';
    viewType_OMS    = 'OMS';

    # does currently the view of type[LIST/OMS/MRSITE/DN] actived?
    currentActivatedView = viewType_DN;  # default show DN tree

    def __init__(self):
        # for export data; will be assigned in subclass
        self.exporter = None;
        # for lazyFinding
        self.finder = LazyFindingImpl(self);

    def setGUIObj(self, gui):
        self._gui = gui;

    def showView(self, widget, gui):
        if (isinstance(widget, gtk.RadioMenuItem) and widget.active == False):
            #print "[LTEActions.py, ", self.viewType, "-showView]called with deactive.\n";
            ViewHandlerBase.currentActivatedView = None;
            self.deactivateView(widget, gui);
            return;
        if( not gui.during_notifyDataUpdated ):
            # there are 3 cases that are not during_notifyDataUpdated
            # 1) switch view
            # 2) filter -- updating view
            # 3) (3G status display only) advanced filter -- updating view
            # ==> change the status text from "Switching view" to ""Updating view"
            gui.showStatus(gui.STATUS_DYNAMIC, "Updating view, please wait.");
        self.activateView(widget, gui);
        ViewHandlerBase.currentActivatedView = self.viewType;
        if( not gui.during_notifyDataUpdated ):
            if hasattr(gui.action_invoker, 'update_actionstate'):
                gui.action_invoker.update_actionstate(widget, gui)
            else:
                gui.showStatus(gui.STATUS_MSG, "");
        
    ### virtual method, called when the view is to hide
    def deactivateView(self, widget, gui):
        pass
    ### virtual method, called when the view is to be shown
    def activateView(self, widget, gui):
        pass

    ### virtual method, called when new filter is applied
    def reloadView(self):
        self.showView(None, self._gui);

    # virtual method, for Finding
    # for lazyFinding, 
    #    doesContainsFindingString should return whether 
    #    there is some row contains the keyword, under the not-expanded row (@iter)
    # for non-lazyFinding, 
    #    can direct return False;
    def doesContainsFindingString(self, iter, keyword):
        pass

    # virtual method, for disable table-right-click menuitems
    # default do nothing
    def onInitTableRightMenu(self, gui, menu):
#        print "[LTEActions.py] ViewHandlerBase, onInitTableRightMenu=", menu;
        self.setGUIObj(gui);

        selection = gui.w.tv.get_selection();
        sel_row_cnt = selection.count_selected_rows();
        if ( 0 == sel_row_cnt ):
            # we are total 5 menuitems(see SubControl.py: tableRightMenu; separator is not menu-item?!!!)
            #   in this case(no row selected) ,only enable the 2nd one: (Copy ALL)
            for idx in range(5):
                menu.set_active(idx);
                #print "idx=", idx, ", menuitem=", menu.get_active().get_child().get_label();
                    #idx= 0 , menuitem= Copy Selected Rows
                    #idx= 1 , menuitem= Copy ALL
                    #idx= 2 , menuitem= Copy ALL          # seems somethins wrong with the separator label!
                    #idx= 3 , menuitem= Alarm Monitor
                    #idx= 4 , menuitem= Alarm Monitor For Multiradio Site
                if (1 == idx):
                    menu.get_active().set_sensitive(True);
#                    print "enable menuitem:",  menu.get_active().get_child().get_label();
                elif (2==idx):
                    pass   # do nothing for the separator!!!
                else:
                    menu.get_active().set_sensitive(False);
#                    print "disable menuitem:",  menu.get_active().get_child().get_label();
        else:
            for idx in range(5):
                menu.set_active(idx);
                menu.get_active().set_sensitive(True);

    def copySelectedRows(self, widget, gui):
        gui.clipboard.clear(); # seem not take effect. why???

        selection = gui.w.tv.get_selection();
        sel_row_cnt = selection.count_selected_rows();
        real_row_cnt = self._countRows(gui);
#        print "sel=", sel_row_cnt, ", real=", real_row_cnt;
        #if(sel_row_cnt == real_row_cnt):
        #    # all rows are selected, execute copy_all!
        #    print "TO copy all!";
        #else:
        if (True): # always copy selected
            # copy select rows!
            sel = gui.w.tv.get_selection();
            (model, pathlist) = sel.get_selected_rows();
            values = "";
            for i in pathlist:
                itr = model.get_iter(i);
                length = gui.columnTotal;
                value = "";
                for j in range(length):
                    if(not isinstance(gui.w.tv.cell[j], gtk.CellRendererText)
                       or gui.w.tv.column[j].get_visible() == False):
                        continue;
                    else:
                        if(len(value) > 0):                       
                            value += "\t";
                    value +=  str(model.get_value(itr,j));
                values += value + "\n";
            if ( len(values)==0 ):
                gui.clipboard.set_text("\n");
            else:
                gui.clipboard.set_text(values);

    # helper for copySelectedRows
    def _countRows(self, gui):
        treeview = gui.w.tv;
        treemodel = treeview.get_model();
        self._row_count = 0;
        treemodel.foreach(self._countRows_CB, treeview);
        return self._row_count - self._getDummyRowCount();
    # helper for copySelectedRows
    def _countRows_CB(self, model, path, iter, user_data):
        self._row_count = self._row_count + 1;
    # virtual
    def _getDummyRowCount(self):
        return 0; # return 0 for non-lazy-view

class ListHandler(ViewHandlerBase):
    def __init__(self):
        ViewHandlerBase.__init__(self);
        self.viewType = ViewHandlerBase.viewType_List;
        self._gui = None;
        self.exporter = ListDataExport(self);

    def deactivateView(self, widget, gui):
        gui.w.tv.set_model(None);
        gui.liststore_list.clear();

    ## virtual
    def onBeforeFillingData(self):
        pass

    ## virtual
    def onAfterFillingData(self):
        pass

    def activateView(self, widget, gui):
        self._gui = gui; # save gui for later use
        self.onBeforeFillingData();

        ViewHandlerBase.currentActivatedView = self.viewType;
        data = gui.data;
        columnDef = gui.data.getColumnDef();

        item = gui.get_object("EIDTSCOLLAPSEALL");
        if(item):
            item.set_sensitive(False);
        item2 = gui.get_object("EIDTSEXPANDALL");
        if(item2):
            item2.set_sensitive(False);    

        gui.w.tv.set_model(None);
        gui.w.tv.freeze_child_notify()
        gui.liststore = gui.liststore_list;
        gui.liststore.clear();
        #print " -- start filling data, ", time.time();
	gui.lncel_nodes = {}.fromkeys(gui.lncel_nodes.keys())
        p = re.compile('^(.*LNBTS-\d+)/.*$')
        for node in data.getRealNodes():
            ##################################################################
            ## TODO: for dynamic filter,
            ##       we need to always add the node here...
            ##################################################################
	    dn = node.getDN()
            if 'LNCEL' in dn:
                l1_dn = p.match(dn).group(1)
                l2_arr =[]
                if gui.lncel_nodes.get(l1_dn):
                    l2_arr = gui.lncel_nodes[l1_dn]
                l2_arr.append(node)
                gui.lncel_nodes[l1_dn] = l2_arr

            if(self.isFilteredNode(node, columnDef, gui)):
                #print "Ignore filtered out node:", node.getDN();
                continue;
            self.addNodeTolist(gui, node);
            #print "force update GUI...";
            while gtk.events_pending():
                gtk.main_iteration(False) 
            #print "force update GUI... end";
        #print " -- done, ", time.time();

        gui.w.tv.set_model(gui.liststore);
        gui.w.tv.thaw_child_notify();
        self.onAfterFillingData();

    def doesContainsFindingString(self, iter, keyword):
        return False;

class DnTreeHandler(ViewHandlerBase):
    def __init__(self):
        ViewHandlerBase.__init__(self);
        self.viewType = ViewHandlerBase.viewType_DN;
        self.setL1DnPattern('^(.*LNBTS-\d+|.*WBTS-\d+)/.*$');
        self.L1IterMap = {};
        self.L1Hash = {};  # 
        self.L1NodeMap = {};   # key: dn, value real dataNode
        self._gui = None;

        # for save/restore expanded rows
        self.need_restoreExpandedRows = False;
        # for export data
        self.exporter = LazyDataExport(self);

        self.dummyGID_tmp    = "0";
        self.dummyGID_OMS    = "-1";
        self.dummyGID_OMS_expanded    = "1";
        self.dummyGID_MRSITE = "-2";
        self.dummyGID_MRSITE_expanded = "2";
        self.dummyGID_DN = "-3";
        self.dummyGID_DN_expanded = "3";
        
    def setL1DnPattern(self, ptn):
        self.L1_DN_Pattern = ptn;
        
    def getL1Dn(self, dn):
## >>> p = re.compile('^(.*LNBTS-\d+|.*WBTS-\d+)/.*$');
## >>> print p.match("aksfWBTS-111/aaa").group(1)
## aksfWBTS-111
## >>> print p.match("aksfLNBTS-111/aaa").group(1)
## aksfLNBTS-111
        p = re.compile(self.L1_DN_Pattern);
        m = p.match(dn);
        if ( not m ):
            # not match, means the dn (not has '/' behind the 'BTS-xxx'
            # ==> is level-1 dn (LNBTS|WBTS)
            return (True, dn);

        # not match, means it's not level-1 dn (LNBTS|WBTS)
        return (False, m.group(1));
        
    def saveExpandedRowsIfNeeded(self, gui):
        self.need_restoreExpandedRows = False;
        # save old expanded rows if we are already in treetype(OMS/MRSITE/DN).
        if ( ViewHandlerBase.currentActivatedView == self.viewType ):
            #print "_saveExpandedRows, ", time.time();
            self._saveExpandedRows(gui.w.tv);
            self.need_restoreExpandedRows = True;
        
    def restoreExpandedRowsIfNeeded(self, gui):
        #restore expanded rows...
        if ( self.need_restoreExpandedRows ):
            self._restoreExpandedRows(gui.w.tv);

    def _saveExpandedRows(self, treeview):
        self.expandedLines = [];
        treemodel = treeview.get_model();

        # gtk.TreeModel.foreach
        #   def foreach(func, user_data)
        #   def func(self, model, path, iter, user_data)
        if ( treemodel ):
            treemodel.foreach(self._cbSaveExpandingRows, treeview);

    def _cbSaveExpandingRows(self, model, path, iter, user_data):
        treeview = user_data;
        if treeview.row_expanded(path):
            self.expandedLines.append(path);

    def _restoreExpandedRows(self, treeview):
        treemodel = treeview.get_model();
        # gtk.TreeModel.foreach
        #   def foreach(func, user_data)
        #   def func(self, model, path, iter, user_data)
        if ( treemodel ):
            treemodel.foreach(self._cbRestoreExpandedRows, treeview);

    def _cbRestoreExpandedRows(self, model, path, iter, user_data):
        treeview = user_data;
        if path in self.expandedLines:
            treeview.expand_row(path, False); ## True:  recursively expand, 

    def onTreeRowExpanded(self, treeview, iter, path):
        return False;

    def onTreeRowCollapsed(self, treeview, iter, path):
        return False;

    def getDNPath(self, myDN):
        #print "getDNPath,", myDN;
        ret = [];
        # TODO: may change for 2G
        # PLNM-xxxx/[MRBTS|RNC]-xxx/[LNBTS|WBTS]-xxx/[LNCEL|FTM|WCEL]-xxx
        values = myDN.split("/");
        length = len(values);
        #print "length=", length;
        if( length >=3 ):
            i_dn = values[0]+"/"+values[1]+"/"+values[2];
            ret.append(i_dn);
            i=3;
            while (i < length):
                i_dn = i_dn + "/" + values[i];
                ret.append(i_dn);
                i = i+1;
        else:
#            print "NOTE!!! Ignore invalid DN:", myDN;
            pass
        return ret;
    
    def _doesNodelistContainsKeyword(self, the_list, keyword):
        if ( isinstance(the_list, list) ):
            for node in the_list:
                # does the node contains keyword?
                # (only cares the visible columns)
                for col in ColumnDef.getInstance().getVisibleColumns():
                    value = node.get_property(col);
                    if(value.find(keyword) != -1):
                        # yes, it contains.        
                        #print " -- Yes node=", node.get_property('DN');
                        return True;
        return False;

    def getExportValues(self, sep):
        self._sep = sep;
        treemodel = self._gui.liststore_tree;
        iter = treemodel.get_iter_root();
        values = [];
        while(iter):
            if ( treemodel.iter_has_child(iter) ):
                values.extend(self._getExportValuesInSubTree(iter));
            else:
                values.extend(self._getExportValues_Iterself(iter));
            #
            iter = treemodel.iter_next(iter);

        #print "export list=", values;
        return values;

    #virtual method

    def _getExportValues_Iterself(self, iter):
        values = [];
        value = "";
        treemodel = self._gui.liststore;
        for col in ColumnDef.getInstance().getVisibleColumns():
            if(len(value) > 0):    
                value += self._sep;
            value += str(treemodel.get_value(iter,ColumnDef.getInstance().colIndexMap(col)));
            #print "_getExportValues_Iterself, value=", value;
        values.append(value);
        #print "_getExportValues_Iterself=", values;
        return values;

    # because our tree depth is limited (< 10 levels)
    # there will NOT have the recursive-to-stack-overflow issue.
    def _getExportValuesForExpandedSubTree(self, iter):
        values = [];
        # 1) export itself
        values.extend(self._getExportValues_Iterself(iter));
        # 2) export children
        treemodel = self._gui.liststore_tree;
        child = treemodel.iter_children(iter);
        while(child):
            values.extend(self._getExportValuesForExpandedSubTree(child));
            child = treemodel.iter_next(child);
        return values;

    def _getExportValueForDataNode(self, node):
        value = "";
        for col in ColumnDef.getInstance().getVisibleColumns():
            if(len(value) > 0):                       
                value += self._sep;
            value += node.get_property(col);
        return value;

    def doesContainsFindingString(self, iter, keyword):
        treemodel = self._gui.liststore_tree;
        #print "[LTEActions.py], ", self.viewType, "doesContainsFindingString, ", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN')), ", start, time=", time.time()
        gid = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('GID'));
        if ( self.dummyGID_DN == gid ):
            # The row is an Level-1 DN row and it's not expanded.
            return self.doesContainsFindingString_DnIter(iter, keyword);
        #print "for already expanded row, -- No";
        return False;
    
    def doesContainsFindingString_DnIter(self, iter, keyword):
        treeview = self._gui.w.tv;
        treemodel = treeview.get_model();
        # 1) the L1-dn row itself contains the keyword?
        # skip, since the LazyFindingImpl will check it. (LazyFindingImpl.findInSubtree, check iter itself)
        #
        # 2) the descendant contains the keyword?
        dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
        #print "--", dn;
        if ( self.L1Hash.has_key(dn) ):
            l2_array = self.L1Hash[dn];
            return self._doesNodelistContainsKeyword(l2_array, keyword);
        return False;

    def _getExportValuesInSubTree(self, iter):
        treemodel = self._gui.liststore_tree;
        values = [];
        gid = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('GID'));
        if ( self.dummyGID_DN == gid ):
            # The row is an L1-dn row and it's not expanded.
            #print "export for NOT-EXPANDED-L1-DN row";
            dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
            values.extend(self._exportNotExpandedDnRow(iter, dn));
            #print values;
        else:
            # for expanded row, just export all existing child.
            #print "export for expanded-L1-dn row";
            values.extend(self._getExportValuesForExpandedSubTree(iter));
            #print values;
        return values;
    def _exportNotExpandedDnRow(self, iter, dn):
        values = [];  # array to be return
        # 1) L1-dn-row itself
        values.extend(self._getExportValues_Iterself(iter));
        #print "self--", values;
        # 2) all dn row under the L1-dn-row
        if ( self.L1Hash.has_key(dn) ):
            l2_array = self.L1Hash[dn];
            if ( isinstance(l2_array, list) ):
                for node in l2_array:
                    values.append(self._getExportValueForDataNode(node));
    
class ToolbarStateReset:
    def __init__(self):
        pass

    def resetAllLockUnlockEtc(gui):
        ids = ['SHUTDOWN', 'LOCK', 'UNLOCK', 'RESET'];
        for id in ids:
            menu_id = "MENU_" + id;
            toolbar_id = "TOOLBAR_" + id;
            menu_button = gui.get_object(menu_id);
            if(menu_button != None):  
                menu_button.set_sensitive(True);
            toolbar_button = gui.get_object(toolbar_id);
            if(toolbar_button != None):
                toolbar_button.set_sensitive(True);
    resetAllLockUnlockEtc = staticmethod(resetAllLockUnlockEtc);

class CheckboxColumnHelper:
    checkedRows = [];
    selectedRows = [];
    expandedRows = [];
	
    selectedHash = {}
    checkedHash = {}
    expandedHash = {}
    original_L1_NE = ''

    show_NE = {};
    show_NE['OMS'] = True; # default True
    show_NE['MRBTS'] = False;
    show_NE['LNBTS'] = True; # default True
    show_NE['LNCEL'] = True; # default True
    show_NE['FTM']   = False;
#    show_NE['WBTS']  = True;
#    show_NE['WCEL']  = True;
    def __init__(self):
        self.need_restoreCheckedRows = False;

    def showNEType(type):
        return CheckboxColumnHelper.show_NE.has_key(type) and CheckboxColumnHelper.show_NE[type];
    showNEType = staticmethod(showNEType);

    #For DN Tree view
    def saveExpandedSelectedAndCheckedRows(gui, vh):
        # checked rows
        if CheckboxColumnHelper.show_NE['MRBTS'] and CheckboxColumnHelper.original_L1_NE == 'LNBTS':
            return
        
        CheckboxColumnHelper.checkedHash = {};
        CheckboxColumnHelper.checkedHash = CheckboxColumnHelper.getCheckedList(gui);
        
        # selected rows
        CheckboxColumnHelper.selectedHash = {};
        sel = gui.w.tv.get_selection();
        (model, pathlist) = sel.get_selected_rows();
        for i in pathlist:
            itr = model.get_iter(i);
            dn = model.get_value(itr, ColumnDef.getInstance().colIndexMap('DN'));
            CheckboxColumnHelper.selectedHash[dn] = None;

        # expanded rows
        CheckboxColumnHelper.expandedHash = {};
        CheckboxColumnHelper.expandedHash =CheckboxColumnHelper.getExpanedRows(gui) 
    saveExpandedSelectedAndCheckedRows = staticmethod(saveExpandedSelectedAndCheckedRows);
    
    #For DN Tree view
    def restoreExpandedSelectedAndCheckedRows(gui, L1IterMap):
        treemodel = gui.liststore
        
        for l1_dn in L1IterMap.keys():
            iter = L1IterMap[l1_dn]
            
            if CheckboxColumnHelper.expandedHash.has_key(l1_dn):
                gui.w.tv.expand_row(treemodel.get_path(iter), False)
                CheckboxColumnHelper.expandedHash.pop(l1_dn)
            
            if CheckboxColumnHelper.checkedHash.has_key(l1_dn):
                CheckboxColumnHelper.checkedHash[l1_dn] = iter
                
            if CheckboxColumnHelper.selectedHash.has_key(l1_dn):
                CheckboxColumnHelper.selectedHash[l1_dn] = iter
        tree_selection = gui.w.tv.get_selection();

        for dn in CheckboxColumnHelper.expandedHash.keys():
            iter = CheckboxColumnHelper.expandedHash[dn]
            if iter:
                gui.w.tv.expand_row(treemodel.get_path(iter), False)
            CheckboxColumnHelper.expandedHash.pop(dn)
            
        for dn in CheckboxColumnHelper.selectedHash.keys():
            iter = CheckboxColumnHelper.selectedHash[dn]
            if iter:
                tree_selection.select_iter(iter)
            CheckboxColumnHelper.selectedHash.pop(dn)
         
        for dn in CheckboxColumnHelper.checkedHash.keys():
            iter = CheckboxColumnHelper.checkedHash[dn]
            if iter:
                path = treemodel.get_path(iter)
		if path:
                    treemodel[path][gui.CHECKED_KEY] = True
            CheckboxColumnHelper.checkedHash.pop(dn)

        #Record the first level NE of last dn tree view
        if CheckboxColumnHelper.showNEType('MRBTS'):
            CheckboxColumnHelper.original_L1_NE = 'MRBTS'
            
        elif CheckboxColumnHelper.showNEType('LNBTS'):
            CheckboxColumnHelper.original_L1_NE = 'LNBTS'
            
    restoreExpandedSelectedAndCheckedRows = staticmethod(restoreExpandedSelectedAndCheckedRows);
 
    #For List view
    def saveSelectedAndCheckedRows(gui):
        #Save checked rows in the list view
        CheckboxColumnHelper.checkedHash = {}
        CheckboxColumnHelper.checkedHash = CheckboxColumnHelper.getCheckedList(gui)
        
        #Save selected rows in the list view
        CheckboxColumnHelper.selectedHash = {}
        sel = gui.w.tv.get_selection()
        (model, pathlist) = sel.get_selected_rows()
        for i in pathlist:
            itr = model.get_iter(i)
            dn = model.get_value(itr, ColumnDef.getInstance().colIndexMap('DN'))
            CheckboxColumnHelper.selectedHash[dn] = None
    saveSelectedAndCheckedRows = staticmethod(saveSelectedAndCheckedRows)
    
    #For List view
    def restoreSelectedAndCheckedRows(gui):
        treemodel = gui.liststore
        tree_selection = gui.w.tv.get_selection();
        
        for dn in CheckboxColumnHelper.checkedHash.keys():
            iter = CheckboxColumnHelper.checkedHash[dn]
            if iter:
                path = treemodel.get_path(iter)
		if path:
                    treemodel[path][gui.CHECKED_KEY] = True
            CheckboxColumnHelper.checkedHash.pop(dn)
            
        for dn in CheckboxColumnHelper.selectedHash.keys():
            iter = CheckboxColumnHelper.selectedHash[dn]
            if iter:
                tree_selection.select_iter(iter)
            CheckboxColumnHelper.selectedHash.pop(dn)
    restoreSelectedAndCheckedRows = staticmethod(restoreSelectedAndCheckedRows) 
    def _removeNotShownDN(array):
        for key in CheckboxColumnHelper.show_NE.keys():
            if ( not CheckboxColumnHelper.showNEType(key) ):
                p = re.compile(".*"+key+"-\d+$");  # eg. ".*MRBTS-\d+$"
                for dn in array:
                    if (p.match(dn)):
                        array.remove(dn);
    _removeNotShownDN = staticmethod(_removeNotShownDN);

    def getCheckedList(gui):
        """
        To get a list of currently checked nodes.
        In the list is the primary key(normally DN) of LTEStatusDataNode, 
        according to the key you can get the LTEStatusDataNode with LTEStatusData.getNode(key).
        @return: list of str
        """
	liststore = gui.liststore;
        rootNode = liststore.get_iter_root();
        iters = CheckboxColumnHelper.getAllVisibleIterInStore(gui, liststore, rootNode);
        row_count = len(iters);
        checked_hash = {};
        if(gui.CHECKED_KEY < 0):
            return checked_hash;
        for i in range(row_count):
            iter1 = iters[i];
            (isChecked, dataID) = liststore.get(iter1,gui.CHECKED_KEY,gui.PRIMARY_KEY);            
            if(isChecked):                
                checked_hash[dataID] = iter1;
        return checked_hash;
    getCheckedList = staticmethod(getCheckedList);

    def getExpanedRows(gui):
	liststore = gui.liststore;
        rootNode = liststore.get_iter_root();
        iters = CheckboxColumnHelper.getAllVisibleIterInStore(gui, liststore, rootNode);
        row_count = len(iters);
        expanded_rows = {};
        for i in range(row_count):
            iter1 = iters[i];
            path = liststore.get_path(iter1);
            if ( gui.w.tv.row_expanded(path) ):
                dn = liststore.get_value(iter1, ColumnDef.getInstance().colIndexMap('DN'));       
##                print "expanded dn=", dn;
#                expanded_rows.append(dn);
                expanded_rows[dn] = None
##        print "getExpanedRows=", expanded_rows;
        return expanded_rows;
    getExpanedRows = staticmethod(getExpanedRows);

    def getAllVisibleIterInStore(gui, treemodel, rootIter):
        """Private method. It returns a list including all visible treeiters below ROOT in the table
        @return: list of gtk.TreeIter
        """
        allList = [];
        cur_iter = rootIter;
        while(cur_iter != None):
            allList += CheckboxColumnHelper.getVisibleItersBelowParent(gui, treemodel, cur_iter);
            cur_iter = treemodel.iter_next(cur_iter);
        return allList;
    getAllVisibleIterInStore = staticmethod(getAllVisibleIterInStore);

    def getVisibleItersBelowParent(gui, treemodel, parent):
        """Private method. It returns a list including all treeiters below parent in the table
        @param:treemodel gtk.TreeModel
        @param:parent gtk.TreeIter
        @return: list of gtk.TreeIter
        """
        iterList = [];
        if(parent == None):
            return iterList;

        iterList.append(parent);

        if(treemodel.iter_has_child(parent)):
            treeview = gui.w.tv;
            path = treemodel.get_path(parent);
            if ( treeview.row_expanded(path) ): # only need to take care of the expanded children
                child = treemodel.iter_children(parent);
                while(child != None):
                    iterList = iterList + CheckboxColumnHelper.getVisibleItersBelowParent(gui, treemodel, child);
                    child = treemodel.iter_next(child);
        return iterList; 
    getVisibleItersBelowParent = staticmethod(getVisibleItersBelowParent);

class KeepScrollPosImpl:
    # for keep-scroll pos
    visible_dn = []
    def saveScrollPosInfo(gui): 
        treeview = gui.w.tv;
        vrange = treeview.get_visible_range();
        start_path, end_path = (None, None)
        KeepScrollPosImpl.visible_dn = [];
        if ( vrange ):
            treemodel = treeview.get_model();
            start_path, end_path = vrange;
##            print "start_path, end_path =", (start_path, end_path);
##            for i in range(start_path[0], end_path[0]+1):
##                iter = treemodel.get_iter( (i,) );
##                #print "path: ", (i,), "iter", iter;
##                dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
##                print "    dn=", dn; 
##                KeepScrollPosImpl.visible_dn.append(dn);
    # above method only can find the level-1 objects
    # ==> use below saveDnBetweenPath
            KeepScrollPosImpl.saveDnBetweenPath(treeview, start_path, end_path);
            
    saveScrollPosInfo = staticmethod(saveScrollPosInfo);

    def restoreScrollPosInfo(gui):
        if ( len(KeepScrollPosImpl.visible_dn)>0 ):
            #for dn in self.visible_dn:
            #    ...
            #dn = self.visible_dn[0];
            dn = KeepScrollPosImpl.findFirstShouldShownDn(KeepScrollPosImpl.visible_dn);
            #print "onAfterFillingData, dn", dn
            # NOTE: if the performance is an issue, 
            #       to speed up scroll_to_this_cell
            #       view can save the iter when loading the tree.
            #       and then use it here directly instead of loop and find it out.
            #       currently no need do this, for 10k rows, only need 0.x second
            treeview = gui.w.tv;
            treemodel = treeview.get_model();
            iter = treemodel.get_iter_root();
            target_iter = None
            while(iter != None):
                target_iter = KeepScrollPosImpl.findIterbyDN(treemodel, iter, dn);
                    # we handle this after restoreExpandedSelectedAndCheckedRows
                    # so, the iter should already be there!
                if ( target_iter ):
                    break;
                iter = treemodel.iter_next(iter);
            if ( target_iter ):
                target_path = treemodel.get_path(target_iter);
                treeview.scroll_to_cell(target_path);
    restoreScrollPosInfo = staticmethod(restoreScrollPosInfo);

    def saveDnBetweenPath(treeview, start_path, end_path):
        '''
        return all iters between [start_path, start_path].
        '''
        treemodel = treeview.get_model();
        iter = treemodel.get_iter(start_path);
        while(iter):
           dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
           #print "    dn=", dn; 
           _path = treemodel.get_path(iter);
           if ( _path > end_path ):   # tuple compare
               #print "_path > end_path";
               break;

           KeepScrollPosImpl.visible_dn.append(dn);

           if ( treemodel.iter_has_child(iter) and treeview.row_expanded(_path) ):
               iter = treemodel.iter_children(iter);
               continue;
           # else, no child or not expanded
           next_iter = treemodel.iter_next(iter);
           if( None == next_iter ):
               #print "no next sibling, swith to parent's next sibling";
               next_iter = treemodel.iter_parent(iter);
               if( next_iter ):
                   #print "switch to parent's next.";
                   next_iter = treemodel.iter_next(next_iter);
           if( None == next_iter ):
               #print "no next.";
               break;
           iter = next_iter;

        return;
    saveDnBetweenPath = staticmethod(saveDnBetweenPath);
   
    def findFirstShouldShownDn(dn_list):
        '''
        if this dn is no longer shows, use the 1st one that still need to show.
        '''
        # create a temp node by dn and then using isFilteredNode is not reliable
        # since that row may filtered out.
        return dn_list[0];
    findFirstShouldShownDn=staticmethod(findFirstShouldShownDn);

    def findIterbyDN(treemodel, iter, dn):
        ''' 
         The DN should already loaded in tree -- NON lazy data.
        '''
        iter_dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
        if ( iter_dn == dn ):
            return iter;
        child = treemodel.iter_children(iter);
        while(child):
            ret = KeepScrollPosImpl.findIterbyDN(treemodel, child, dn);
            if ( ret ):
                return ret;
            child = treemodel.iter_next(child);
        return None;
    findIterbyDN=staticmethod(findIterbyDN);

class LazyFindingImpl:
    def __init__(self, handlerObj):
        self._gui = None;
        self._handlerObj = handlerObj;
        if ( not isinstance(self._handlerObj, ViewHandlerBase) ):
            exit("Error:LazyFindingImpl with non-ViewHandlerBase object.");
        self.during_finding = False;
        self._keyword = "";
        self._searchUp = False;
        self._findTimesOnStartIter = 0;

    def setGUI(self, gui):
        self._gui = gui;

    def setKeyword(self, keyword):
        self._keyword = keyword;

    def findKeyword(self, gui, direction):
        if ( self.during_finding ):
            # previous finding is ongoning, do nothing
            return;

        self._gui = gui;
        self.during_finding = True;
        self._findKeyword(gui, direction);
        self.during_finding = False;

    # pygtk does not have a iter_prev (compare to iter_next)
    def iter_prev(self, iter, model):
        path = model.get_path(iter);
        position = path[-1];
        if position == 0:
            return None;
        prev_path = list(path)[:-1];
        prev_path.append(position - 1);
        prev = model.get_iter(tuple(prev_path));
        return prev;

    def _getNextIter(self, model, iter):
        if(self._searchUp):
            return self.iter_prev(iter, model);

        return model.iter_next(iter);

    def _getNextChildIter(self, treemodel, iter):
        retIter = treemodel.iter_children(iter);
        if(self._searchUp):
            tmpIter = treemodel.iter_next(retIter);
            while(tmpIter):
                retIter = tmpIter;
                tmpIter = treemodel.iter_next(tmpIter);

        return retIter;

    def _getRootIter(self, treemodel):
        retIter = treemodel.get_iter_root();
        if(self._searchUp):
            tmpIter = treemodel.iter_next(retIter);
            while(tmpIter):
                retIter = tmpIter;
                tmpIter = treemodel.iter_next(tmpIter);

        return retIter;

    def get_model(self, gui):
        treemodel = None;
        if ( isinstance(self._handlerObj, DnTreeHandler) ):
            treeview = gui.w.tv;
            treemodel = treeview.get_model();
        elif ( isinstance(self._handlerObj, ListHandler) ):
            treemodel = gui.liststore_list;
        else:
            raise Exception("Error! can not get model!!!");
        return treemodel;

    def _findKeyword(self, gui, direction):
        startIter = self._findGetCurrentFocusItem();
        searchEntry = gui.get_object("TOOLBAR_FINDENTRY");
        if(searchEntry == None):
            return;
        self._keyword = searchEntry.get_text();

        if(cmp(direction,"UP") == 0):
            # search up
            # iter = self._findPrevIter(iter);
            self._searchUp = True;
        else:
            # search down
            self._searchUp = False;

        iter = startIter;
        self._findTimesOnStartIter = 0;
        self.__findTheNextIter_recur = 0;

        treemodel = self.get_model(gui);
        if ( not startIter ): # currently no slected item
            #iter = treemodel.get_iter_root();
            iter = self._getRootIter(treemodel);
            if ( not iter ): # no rows in treeview
                return;
            #self._startIter = iter;  # using iter is NOK, we need to using DN
            dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
            self._startDN = dn;
            iter = self._findTheNextIter(iter, False); # False: should also finding on the beginning iter itself.
        else:
            #self._startIter = iter;
            dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
            self._startDN = dn;
            iter = self._findTheNextIter(iter, True);    # True: the beginning iter should be ignored
                                                       # ( it's the one found by previous finding).
        # focus(select) the find iter
        if ( iter ):
            self._focusIter(iter);
        else:
            iter = startIter;  # if not find new row, keep the currently selected row(found by previous finding)
        if ( (not iter) or ( (iter == startIter) and (not self.findMatch(treemodel, iter))) ):
            gui.showDialog("Find Hint", gui.MSG_INFO,'There is no any row matched with (' + self._keyword + ')');

    def _findGetCurrentFocusItem(self):
        iterRet = None;
        treeview = self._gui.w.tv;
        treemodel = treeview.get_model();
        sel = treeview.get_selection();
        (model, pathlist) = sel.get_selected_rows();
        if(len(pathlist) == 0):            
            return None;
        return treemodel.get_iter(pathlist[0]);

    def findMatch(self, treemodel, iter):
        isFind = False;
        # all visible columns in RFS Report.
        for col in ColumnDef.getInstance().getVisibleColumns():
            i = ColumnDef.getInstance().colIndexMap(col);
            value = treemodel.get_value(iter,i);
            if(not isinstance(value,str)):
                continue;
            if(value.find(self._keyword) != -1):
                isFind = True;
                break;
        return isFind;

    # because our tree depth is limited (< 10 levels)
    # there will NOT have the recursive-to-stack-overflow issue.
    def _findTheNextIter(self, currIter, ignore_crrrIter = True, ignore_subtree = False):
        treemodel = self._handlerObj._gui.liststore;
        self.__findTheNextIter_recur = self.__findTheNextIter_recur +1;
        #if ( self.__findTheNextIter_recur > 990 ): # crash!
        if ( self.__findTheNextIter_recur > 100 ): # debug
            #print "seems will recursive-to-stack-overflow.";
            return None;
        #print "_findTheNextIter:", treemodel.get_value(currIter, ColumnDef.getInstance().colIndexMap('DN')), ignore_crrrIter, ignore_subtree, self.__findTheNextIter_recur;

        # navigate the tree to find 'next' row that contains keyword.
        #
        # step 1) does the siblings(include siblings's sub-tree) match?
        #print "step 1) does the siblings(include sub-tree) match?";
        tmpIter = currIter;   
        #while( tmpIter = treemodel.iter_next(tmpIter) ):   # syntax not supported
        # ==>
        retIter = None;
        bIsLazyLoadingView = isinstance(self._handlerObj, DnTreeHandler);
        bIsListview = isinstance(self._handlerObj, ListHandler);
        while( (self._findTimesOnStartIter <= 1) and tmpIter ):
            if ( bIsLazyLoadingView ):
                if ( (tmpIter == currIter) ):
                    retIter = self.findInSubtree(tmpIter, ignore_crrrIter, ignore_subtree);
                else:
                    retIter = self.findInSubtree(tmpIter, False);
            elif ( bIsListview ):
                if ( (tmpIter == currIter) ):
                    retIter = self.__findInListView(tmpIter, ignore_crrrIter);
                else:
                    retIter = self.__findInListView(tmpIter);
            else:
                raise Exception("Error! model type not Lazy-loading nor List!!!");

            if ( retIter ):
                # find it!
                return retIter;
            if (self._findTimesOnStartIter > 1):
                return None;
            #tmpIter = treemodel.iter_next(tmpIter);
            tmpIter = self._getNextIter(treemodel, tmpIter);

        #
        # step 2) still not find, try find in ancestor(parent's siblings and recursive)
        #print "step 2) still not find, try find in ancestor(parent's siblings and recursive)";
        parentIter = treemodel.iter_parent(currIter);
        if ( parentIter ):
            tmpIter = parentIter;
            while(parentIter):
                if ( parentIter == tmpIter ):
                    retIter = self._findTheNextIter(parentIter, True, True);
                else:
                    retIter = self._findTheNextIter(parentIter, False);
                if ( retIter ):
                    return retIter;
                if ( self._findTimesOnStartIter > 1):
                    #print "should stop!", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
                    return None;

                tmpIter = parentIter;
                #parentIter = treemodel.iter_next(tmpIter);
                parentIter = self._getNextIter(treemodel, tmpIter);

            #print "not find in ancestor(parent's siblings";
            return None;
        else:    # loop to the start of treeview
                 # Note: due to 'loop to the start of treeview', 
                 #       we have a chance to recursive-to-stack-overflow
                 #       Be careful with the recursive terminal(self._findTimesOnStartIter).
            #print "wrap to start row...";
            #iter = treemodel.get_iter_root();
            iter = self._getRootIter(treemodel);
            return self._findTheNextIter(iter, False);

    def __findInListView(self, iter, ignore_crrrIter = False):
        treemodel = self._gui.liststore_list;

        if (not ignore_crrrIter):
            if ( self.findMatch(treemodel, iter) ):
                # find it!
                #print "find on row:", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
                return iter;
        dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
        if ( dn == self._startDN ):
            #print "*************** _findTimesOnStartIter++", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
            self._findTimesOnStartIter = self._findTimesOnStartIter + 1;
        #print "NOT find on row:", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
        return None;

    # because our tree depth is limited (< 10 levels)
    # there will NOT have the recursive-to-stack-overflow issue.
    def findInSubtree(self, iter, ignore_crrrIter = False, ignore_subtree = False):
        treemodel = self._gui.liststore_tree;
        treeview  = self._gui.w.tv;
        #print "findInSubtree:", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN')), ignore_crrrIter, ignore_subtree;

        # step 1-1)
        # does the iter itself match?
        if (not ignore_crrrIter):
            if ( self.findMatch(treemodel, iter) ):
                # find it!
                #print "find on row:", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
                return iter;
            else:
                #print "not match on self", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
                pass
        else:
            #print "no need check on self", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
            pass

##         if ( iter == self._startIter ):
##             print "*************** _findTimesOnStartIter++", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
##             self._findTimesOnStartIter = self._findTimesOnStartIter + 1;
##             if ( self._findTimesOnStartIter > 1):
##                 print "should stop!", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
##                 return None;
        dn = treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
        if ( hasattr(self, "_startDN") and (dn == self._startDN) ):
            #print "*************** _findTimesOnStartIter++", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
            self._findTimesOnStartIter = self._findTimesOnStartIter + 1;
            if ( self._findTimesOnStartIter > 1):
                #print "should stop!", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
                return None;

        # step 1-2)
        # does the children of the iter match?
        #print "step 1-2) does the children of the iter match?";
        if ( (not ignore_subtree) and treemodel.iter_has_child(iter) ):
            #print "doesContainsFindingString(", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
            if ( self._handlerObj.doesContainsFindingString(iter, self._keyword) ):
                # expanding the not expanded row ( loading lazy data )
                path = treemodel.get_path(iter);
                self._gui.w.tv.expand_to_path(path);

            #childIter = treemodel.iter_children(iter);
            childIter = self._getNextChildIter(treemodel, iter);
            while(childIter != None):
                retIter = self.findInSubtree(childIter, False);
                if ( retIter ):
                    # find it!
                    #print "find in subTree of :", treemodel.get_value(iter, ColumnDef.getInstance().colIndexMap('DN'));
                    return retIter;

                if (self._findTimesOnStartIter > 1):
                    return None;

                #childIter = treemodel.iter_next(childIter);
                childIter = self._getNextIter(treemodel, childIter);

        # step 1-3)
        # did not find one
        #print "not match in findInSubtree";
        return None;

    # expand to the iter and select it.
    def _focusIter(self, iter):
        tree_selection = self._gui.w.tv.get_selection();
        tree_selection.unselect_all();
        parent = self._gui.liststore.iter_parent(iter);
        if(parent != None):
            p_path = self._gui.liststore.get_path(parent);
            self._gui.w.tv.expand_to_path(p_path);
        tree_selection.select_iter(iter);
        path = self._gui.liststore.get_path(iter);
        self._gui.w.tv.scroll_to_cell(path,None,True,0.5,0.0);        
        pass

class DataExportBase:
    def __init__(self, handlerObj):
        self._gui = None;
        self._handlerObj = handlerObj;
    # for confirm-overwrite
    def saveBtnPressed(self, btn, chooser):
        '''
            Auto append '.csv' to the exported filepath, 
        if user does not enput the extension.
            By this can make sure the confirm-overwrite
        functionality work in case that user enput 'aaa'
        and there already has a 'aaa.csv' file exists.
        '''
        #print "saveBtnPressed()", btn;
        filepath = (chooser.get_filename());
        if not filepath:
            self.showDialog(chooser, "Warning", " Please input the file name. ");
            return
        
        file = filepath[filepath.rindex('/')+1:].strip()
        if not file:
            self.showDialog(chooser, "Warning", " Please input the file name. ");
            return  
        
        if ( filepath[-4:].lower() != '.csv' ):
            filepath += ".csv";
            chooser.set_current_name(filepath);

    def exportAll(self, widget, gui):
        '''Export the content of report into csv file.
        An overwrite confirm dialog will popup in case of
        the file already exists.
        @param:widget the component which trigger the action.
        @param:gui LTEStatusGUI instance   
        '''
        self._gui = gui;
        self._handlerObj.setGUIObj(gui);
        chooser = gtk.FileChooserDialog( title="Status Export",
                                         action=gtk.FILE_CHOOSER_ACTION_SAVE,
                                         buttons=(gtk.STOCK_CANCEL,gtk.RESPONSE_CANCEL,
                                                  gtk.STOCK_SAVE,gtk.RESPONSE_OK))        
        filter = gtk.FileFilter();
        filter.set_name("Status")
        filter.add_mime_type("status/csv")
        filter.add_pattern("*.csv")
        chooser.add_filter(filter)
        # for confirm-overwrite
        vbox = chooser.get_children()[0]; # gtk.Container.get_children
        saveBtn = None; 
        if ( type(vbox)==gtk.VBox ):
            vbc = vbox.get_children();
            hbb = vbc[len(vbc)-1];
            if ( type(hbb) == gtk.HButtonBox):
                for c in hbb.get_children():  
                    if ( type(c) == gtk.Button and (c.get_label()=='gtk-save')):
                        saveBtn=c;
                        break;  
        if ( saveBtn ):
            saveBtn.connect("pressed", self.saveBtnPressed, chooser);
        if ( hasattr(chooser, "set_do_overwrite_confirmation")):
            chooser.set_do_overwrite_confirmation(True);
        else:
            #print "set_do_overwrite_confirmation is not availabled for PyGTK < 2.8";
            pass
        chooser.set_action(gtk.FILE_CHOOSER_ACTION_SAVE);
        # end confirm-overwrite
        response = chooser.run();
        filename = "";
        if response == gtk.RESPONSE_OK:
            filename = chooser.get_filename();
            chooser.destroy();
        #elif response == gtk.RESPONSE_CANCEL:
        else:
            chooser.destroy();
            return;

        p = re.compile(".*\.csv$");
        matchObj = p.match(filename.lower());
        if(matchObj==None):
            filename += ".csv";
        values = self.getAllRowData(",");
        titles = gui.getColumnTitles();
        
        writer = csv.writer(open(filename,'wb'),delimiter=',');
        writer.writerow(titles.split(","));
        count = len(values);
        for i in range(count):
            row_str = values[i];
            #print(row_str);
            rowValues = row_str.split(',');                
            writer.writerow(rowValues);

    def copyAll(self, widget, gui):
        self._gui = gui;
        self._handlerObj.setGUIObj(gui);
	gui.clipboard.clear()
        values = self.getAllRowData("\t");
        gui.clipboard.set_text("\n".join(values),len("\n".join(values)));

    # virtual method
    def getAllRowData(self, sep):
        self._sep = sep;
        
    def showDialog(self, parent, title,information):
        dialog = LTESimpleDialog(LTESimpleDialog.Msg_Info, information, parent, title);
        dialog.show();
        
class ListDataExport(DataExportBase):
    def __init__(self, handlerObj):
        DataExportBase.__init__(self, handlerObj);

    def getAllRowData(self, sep):
        self._sep = sep;
        # for non-lazy list view, just copy the data row-by-row
        liststore = self._gui.liststore;
        iter = liststore.get_iter_root();
        values = [];
        while(iter):
            value = "";
            for col in ColumnDef.getInstance().getVisibleColumns():
                if(not isinstance(self._gui.w.tv.cell[ColumnDef.getInstance().colIndexMap(col)], gtk.CellRendererText)):
                    continue;
                if(len(value) > 0): 
                    value += sep;
                value +=  str(liststore.get_value(iter,ColumnDef.getInstance().colIndexMap(col)));
            values.append(value);
            #
            iter = liststore.iter_next(iter);

        return values;

class LazyDataExport(DataExportBase):
    def __init__(self, handlerObj):
        DataExportBase.__init__(self, handlerObj);
            
    def getAllRowData(self, sep):
        return self._handlerObj.getExportValues(sep);

class AutoRefreshImpl:
    def __init__(self):
        self.interval = 20000; # 20 seconds by default
        self.autorefresh_enabled = False;  # does auto-refresh enabled?

        self.main_timer_id = None;
        self.should_stop_timer = False;
        self._gui = None;

    def isAutorefreshEnabled(self):
        return self.autorefresh_enabled;

    def setGUIAndActionObj(self, gui, actionObj):
        self._gui = gui;
        self._actionObj = actionObj;

    def toggleAutorefresh(self, widget, gui, actionObj):
        self.autorefresh_enabled = widget.get_active();
        self._gui = gui;
        self._actionObj = actionObj;

        self.enableAutorefresh(self.autorefresh_enabled);

    def enableAutorefresh(self, bEnable, toggleGUI=True):
        self.autorefresh_enabled = bEnable;

        # disable the "Refresh" button, since Autorefresh is ON
        # enable the "Refresh" button, since Autorefresh is OFF
        toolbar_refresh = self._gui.get_object("TOOLBAR_REFRESH");
        menu_refresh    = self._gui.get_object('MENU_REFRESH');
        toolbar_refresh.set_sensitive(not self.autorefresh_enabled);
        menu_refresh.set_sensitive(not self.autorefresh_enabled);


        #print "AutoRefreshImpl, ", self.autorefresh_enabled, ",", self.interval;
        if ( toggleGUI ):
            self.makeGuiItemsIdentical();

        if (self.autorefresh_enabled):
            self.interval = int(self._gui.control.getAutoRefreshInterval()) * 1000;
            self._startTimer();
        else:
            self._stopTimer();

    def makeGuiItemsIdentical(self):
        # make the status of auto-refresh toolbar-item and menu-item the same.
        toolbar_autoitem = self._gui.get_object("TOOLBAR_AUTOREFRESH");
        if(toolbar_autoitem != None):
            toolbar_autoitem.set_active(self.autorefresh_enabled);
            if(hasattr(toolbar_autoitem,"myHints")):
                hints = toolbar_autoitem.myHints;
                index = 0;
                if(self.autorefresh_enabled):
                    index = 1;
                tooltip = self._gui.tooltip;
                tooltip.set_tip(toolbar_autoitem,hints[index]);
                tooltip.enable();

        menu_autoitem = self._gui.get_object('MENU_AUTOREFRESH');
        if(menu_autoitem != None):
            menu_autoitem.set_active(self.autorefresh_enabled);
            #print "set_active";

    def _startTimer(self):
        if ( self.main_timer_id ):
            # there is already a timer is scheduled.
#            print "there is already a timer is scheduled.";
            return;

        # def gobject.timeout_add(interval, callback, ...)
        # The function is called repeatedly until it returns FALSE, 
        # at which point the timeout is automatically destroyed and the function will not be called again. 
        self.should_stop_timer = False;
        self.main_timer_id = gobject.timeout_add(self.interval, self.main_timer_callback);
        # according to: pygtk doc:
        #   After each call to the timeout function, 
        #   the time of the next timeout is recalculated based on the current time and the given interval 
        #   (it does not try to 'catch up' time lost in delays).
        # It's not possible to dead-lock in gobject.timeout_add callback
        # but, according our testing, there is dead-loak if too many data need to be fetch.(fetch time > self.interval)
        # ==>
        # if main_timer_callback not return within self.interval, the main_timer_callback will be called again...
        # ==> dead loop!
        # ==> we can not do time-consuming work in main_timer_callback
        # ==> adding a sub-timer, which only run one time:
        #     1) main timer immediately return False; ==> main timer will not be called again... ==> no dead lock
        #     2) in sub-timer, do the time-consuming work(loading data from DB); 
        #     3) after 2) is finished, start another 'main timer'
        #    ==> main timer runs 'periodically'

    def main_timer_callback(self):
        if (self.should_stop_timer):
            # auto-refresh is canceled
            self.main_timer_id = None;
            return False;

        if (self.autorefresh_enabled):
            #print "main_timer_callback called";
            if (hasattr(self, "_sub_timer") and self._sub_timer):
                # sub timer is running, means the time-consuming-refresh-work is not done yet.
                # do nothing.
                #print "sub timer is running, do nothing";
                self.main_timer_id = None;
                return False;

            self._sub_timer = gobject.timeout_add(1, self._sub_itmer_cb);
            self.main_timer_id = None;
            # return False, so that we can 'kill' the main-timer temporarily. 
            # (and only restore it after data-fetch has been finished.
            # all in all, to avoid data-fetch dead-lock when there are too many data in DB.
            return False;

        self.main_timer_id = None;
        return False;

    def _sub_itmer_cb(self):
        # fetch data
        control = self._gui.getControl();
        control.setDataNotifyMethod(self.notifyDataUpdated);
        control.fetchDataFromDB();  # after data fetched from DB, worker thread will notify GUI thread
                                    # by calling it's dataNotifyMethod "function pointer"
                                    # and as we set it by:
                                    #   control.setDataNotifyMethod(self.notifyDataUpdated);
                                    # ==>
                                    #   self.notifyDataUpdated will be called after data fetched from DB

        self._sub_timer = None;
        return False; # sub-timer are always one-time timer

    def notifyDataUpdated(self, gui):
        # update the view
        self._actionObj.notifyDataUpdated(gui);

        # restore our main-timer, let it 'auto-refresh'
        if (self.autorefresh_enabled):
            self._startTimer();

    def _stopTimer(self):
        # oops, gobject.timeout_add does NOT has the corresponding kill-timer
        # we need another timer to simulate kill-the-main-timer
        self.should_stop_timer = True;
	if self.main_timer_id:
            gobject.source_remove(self.main_timer_id)
        self.main_timer_id = None;
        self.autorefresh_enabled = False;

# end for lazy-loading framework
#################################################################################

