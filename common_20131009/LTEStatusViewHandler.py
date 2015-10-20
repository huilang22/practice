import gtk
from LTEStatusGUI import ToolbarStateReset
from LTEStatusGUI import LazyDataExport
from LTEStatusGUI import ViewHandlerBase
from LTEStatusData import *

class VirtualTreeHandler(ViewHandlerBase):
    def __init__(self):
        self.exporter = LazyDataExport(self);
        self.finder = FindingImpl(self);
        
        self.newDnFilters = None #For update paths
        self.oldDnFilters = None
        
        self.initializeDnNodes()
    
    def initializeDnNodes(self):
        self.oldTopNodes = []
        self.oldDnNodes = {}
        self.newDnNodes = {}
        self.orderedOldDNs = []
        self.orderedNewDNs = []
    
    def initializeNewDnNodes(self):
        self.orderedNewDNs = []
        self.newDnNodes = {}
    
    def recordNewDnNodes(self, nodes):
        for node in nodes:
            self.newDnNodes[node.getDN()] = node
            self.orderedNewDNs.append(node.getDN())
            if node.getChildren():
                self.recordNewDnNodes(node.getChildren())
    
    def recordOldNodes(self):
        self.oldTopNodes = self._gui.data.getTopNodes()
        self.oldDnNodes = self.newDnNodes
        self.orderedOldDNs = self.orderedNewDNs
        self.oldDnFilters = self.newDnFilters
    
    def setGUIObj(self, gui):
        self._gui = gui;
        
    def setEditMenuStates(self, gui):
	if self.viewType ==  VirtualTreeHandler.viewType_List:
            value = False
        else:
            value = True
        item = gui.get_object("EIDTSCOLLAPSEALL");
        if(item):
            item.set_sensitive(value);
        item2 = gui.get_object("EIDTSEXPANDALL");
        if(item2):
            item2.set_sensitive(value);
    
    def setColumnSortFunction(self, gui):
        if gui.hasSetColumnSort:
            return
        i = 0
        for column in ColumnDef.getInstance().getAllColumns():
            gui.w.tv.column[i].set_clickable(True);
            gui.w.tv.column[i].connect("clicked", gui.sort, i)  
	    
            title = gui.getColumnProperty(column,'text');
            gui.w.tv.column[i].set_widget(gui.createHeader(gui.w.tv.column[i], title))
 
            i = i + 1;
            
        gui.hasSetColumnSort = True

    def isFirstLoaded(self):
        return not self.oldDnNodes     
     
    def getPathByNode(self, node):
        if not node:
            return None
        
        index = node.getIndex()
        path = (index,)
        parent = node.getParent()
        if parent:
            return self.getPathByNode(parent) + path
        return path
                   
    def getExportValues(self, seq):
        topNodes = self._gui.getData().getTopNodes()    
        rawData = []
        for topNode in topNodes:
            rawData.append(seq.join(topNode.getExportValues()))
            rawData += self.getChildrenValues(topNode, seq)
        
        return rawData
    
    def getChildrenValues(self, node, seq):
        rawData = []
        if not node.getChildren():
            return []
        
        for child in node.getChildren():
            rawData.append(seq.join(child.getExportValues()))
            rawData += self.getChildrenValues(child, seq)
        return rawData
    
    def getFilteredNeClassHierarchy(self):
        """ Get object classes hierarchy
            For default neType filter, it returns:
            {'level_2': ['3129'], 'level_3': ['3130'], 'level_1': ['2347']}
        """
        neTypeClassId = DataControl.getInstance().getNETypeClassId();
        dnFilters = DataControl.getInstance().getDataFilters()['DN']
        topNE = 'OMS'
        neHierarchy = [['MRBTS'], ['LNBTS'], ['LNCEL', 'FTM']]
        neFilteredHierarchy = {}
        level_id = 1
        
        if dnFilters.get(topNE):
            neFilteredHierarchy['level_' + str(level_id)] = [neTypeClassId[topNE]]
            
        for neTypes in neHierarchy:
            isFiltered = False
            for neType in neTypes:
                if dnFilters[neType]:
                    key = 'level_' + str(level_id)
                    isFiltered = True
                    if neFilteredHierarchy.has_key(key):
                        neFilteredHierarchy[key].append(neTypeClassId[neType])
                    else:
                        neFilteredHierarchy[key] = [neTypeClassId[neType]]
            if isFiltered:
                level_id += 1
    
        return neFilteredHierarchy
    
    def sortAndBuildDataNodes(self, data):
        sortColumnIndex = self._gui.sortColumnIndex
        dnColumnIndex = DataControl.getInstance().getDataColumnDef().colIndexMap('DN')
        treeViewTypes = [self.viewType_DN, self.viewType_MRSITE, self.viewType_OMS]
	
        dnNodes = self.getFilteredDnNodesByDN(data.getRawData())
        sortedRawData = []

#        print "sort column index  = ",sortColumnIndex
        if sortColumnIndex == dnColumnIndex:
#            print "-- sort dn begin = ", time.time()
            for dn in sorted(dnNodes.keys(), cmp= lambda x,y:self.sortDNColumn(x, y, dnNodes)):
#                print "append1 -------", dn
                sortedRawData.append(dnNodes[dn].getRawData())
                
            rawData = self.getFilteredRawDataByCommonState(sortedRawData)
            
#            for i in rawData:
#                print "state = ",i[-7]," ",i[-1]," MRSITE-",i[0]," ",i[2]
            
            data.setSortedRawData(rawData)
            self.buildDataNodes(data)
#            print "-- sort dn end = ",time.time()
            
        elif self.viewType in treeViewTypes  and sortColumnIndex != dnColumnIndex:
#            print "-- sort non dn begin = ", time.time()
            for dn in sorted(dnNodes.keys(), cmp= lambda x,y:self.sortDNColumn(x, y, dnNodes)):
#                print "----------------- append dn = ",dn
                sortedRawData.append(dnNodes[dn].getRawData())
                
            tmpData = LTEStatusData()
            tmpData.setSortedRawData(self.getFilteredRawDataByCommonState(sortedRawData))
            self.buildDataNodes(tmpData)
            
            newTopNodes = []
            for topNode in sorted(tmpData.getTopNodes(), cmp= lambda x,y:self.sortNonDNColumn(x, y, sortColumnIndex)):
                topNode.setIndex(len(newTopNodes))
                newTopNodes.append(topNode)
                
                if topNode.getChildren(): 
                    self.sortChildren(topNode, sortColumnIndex)
            
            data.setTopNodes(newTopNodes)
#            print "-- sort non dn begin = ", time.time()
        else:
#            print "-- sort non dn begin = ", time.time()
            for node in sorted(dnNodes.values(), cmp= lambda x,y:self.sortNonDNColumn(x, y, sortColumnIndex)):
                sortedRawData.append(node.getRawData())
            
            data.setSortedRawData(self.getFilteredRawDataByCommonState(sortedRawData))
            self.buildDataNodes(data)
#            print "-- sort non dn end = ",time.time()
	
	#For Status Report, Lock/unlock operation
        if self.viewType == self.viewType_List:
            self.storeLNBTSChildren(dnNodes)
    
    def getClassIdFilter(self):
        dataControl = DataControl.getInstance()
        neFilters = dataControl.getDataFilters().get('DN')
        neClassId = dataControl.getNETypeClassId()
        classIdFilters = {}
        
        for ne in neFilters.keys():
            classIdFilters[neClassId[ne]] = neFilters[ne]
        
        return classIdFilters
    
    def getFilteredNeClassId(self):
        neTypeClassId = DataControl.getInstance().getNETypeClassId();
        dnFilters = DataControl.getInstance().getDataFilters()['DN']
        classFilters = {}
        
        for ne in dnFilters.keys():
            classFilters[neTypeClassId.get(ne)] = dnFilters.get(ne)
        return classFilters
    
    def sortDNColumn(self, dn1, dn2, dnNodes):
        node1 = dnNodes[dn1]
        node2 = dnNodes[dn2]
        
        omsValue1 = node1.getSystemId()
        omsValue2 = node2.getSystemId()
        
        if dn1 in dn2 or dn2 in dn1:
            return cmp(dn1, dn2)
        
        return self._gui.sortOrder * cmp(omsValue1+dn1, omsValue2+dn2)
    
    def sortNonDNColumn(self, node1, node2, sortColumnIndex):
        value1 = node1.getNodeValues()[sortColumnIndex]
        value2 = node2.getNodeValues()[sortColumnIndex]
        value1 = value1 and value1.strip() + ' ' + node1.getDN() or '' + ' ' + node1.getDN()
        value2 = value2 and value2.strip() + ' ' + node2.getDN() or '' + ' ' + node2.getDN()
        
        return self._gui.sortOrder * cmp(value1, value2)
    
    def sortChildren(self, node, sortColumnIndex):
        children = []
        
        for child in sorted(node.getChildren(), cmp= lambda x,y:self.sortNonDNColumn(x, y, sortColumnIndex)):
            children.append(child)
#            print "append child ......dn = ",child.getDN()," value = ",child.getNodeValues()[sortColumnIndex]
            if child.getChildren(): self.sortChildren(child, sortColumnIndex)
            
        node.setChildren(children)

    def setGUIModel(self, model):
	if len(model.getData().getTopNodes()) == 0:
            self._gui.setModel(None)
            return

        if self.viewType_List == self.viewType:
            model.setListModelFlag()
        else:
            model.setTreeModelFlag()
        self._gui.setModel(model)
   
    def activateView(self, widget, gui):
        """This method only handles "Refresh" and "Filter" funciton.
        """
#        a = time.time()
#        print "[",self.viewType,"]:activating view..........start time = ",a
        ViewHandlerBase.currentActivatedView = self.viewType;
        self._gui = gui; 
        data = gui.getData()
        
        self.setEditMenuStates(gui)
        self.setColumnSortFunction(gui)
        
        #Do sort and build the nodes for VirtualTreeModel
        self.sortAndBuildDataNodes(data)
        
        #Record new dn nodes
        self.initializeNewDnNodes()
        self.recordNewDnNodes(data.getTopNodes())
        
        if self.isFirstLoaded():
#            print "[Tree view] : first load ..."
            self.setGUIModel(VirtualTreeModel(data))
        else:
            if self.viewType != self.viewType_List and self.isTreeChanged():
#                print "[Tree view] : do refresh : top ne changes to higher or lower....."
                self.setGUIModel(VirtualTreeModel(data))
            else:
#                print "[Tree view] : do refresh : update path...."
                self.updatePaths(gui)
                gui.w.tv.queue_draw()
        
        self.recordOldNodes()
#        print "[",self.viewType,"]:activating view............end time = ",time.time(), " cost = ",time.time() - a
    
    def deactivateView(self, widget, gui):
        ToolbarStateReset.resetAllLockUnlockEtc(gui);
        gui.w.tv.set_model(None);
        self.initializeDnNodes()

    def copySelectedRows(self, widget, gui):
        #gui.clipboard.clear(); # seem not take effect. why???
	gui.clipboard.set_text('')
        
        sel = gui.w.tv.get_selection();
        (model, pathlist) = sel.get_selected_rows();
        values = []
        for path in pathlist:
            node = model.getNodeByPath(path)
            values.append("\t".join(node.getExportValues()))
                
        if ( len(values)==0 ):
            gui.clipboard.set_text("\n");
        else:
            v = "\n".join(values)
            gui.clipboard.set_text(v,len(v))

class ListHandler_LTEStatusDisplay(VirtualTreeHandler):
    def __init__(self):
        VirtualTreeHandler.__init__(self)
        self.viewType = ViewHandlerBase.viewType_List
    
    def activateViewForSort(self): 
	self.initializeNewDnNodes()
        self.recordNewDnNodes(self._gui.getData().getTopNodes())

        self.reorderRowsForModel() 
        self._gui.getModel().setData(self._gui.getData())
	#self._gui.setModel(VirtualTreeModel(self._gui.getData()))
        self.recordOldNodes()
        self._gui.w.tv.queue_draw()   	
 
    def buildDataNodes(self, data):
        self.newDnFilters = self.getFilteredNeClassHierarchy()
        commonStates = DataControl.getInstance().getDataFilters()['COSTATE']
        filteredNeClassId = self.getFilteredNeClassId()
        data.initializeTopNodes()
        self.initializeNewDnNodes()
        
        dataRows = data.getSortedRawData()
        for row in dataRows:
            node = NewLTEStatusDataNode(row)
            if filteredNeClassId.get(node.getClassId()) and \
                        commonStates.get(node.getCOSTATE()) :
                data.buildNode(None, node)
        
    def updatePaths(self, gui):
        model = gui.liststore
        if self.oldDnNodes:
	    oldData = LTEStatusData()
            oldData.setTopNodes(self.oldTopNodes)
            gui.getModel().setData(oldData)

            self.orderedOldDNs.reverse()
            for oldDN in self.orderedOldDNs:
                if not self.newDnNodes.get(oldDN):
                    model.row_deleted(self.getPathByNode(self.oldDnNodes.get(oldDN)))
        
	    model.setData(gui.getData())
            for newDN in self.orderedNewDNs:
                if not self.oldDnNodes.get(newDN):
                    path = self.getPathByNode(self.newDnNodes[newDN])
                    model.row_inserted(path, model.get_iter(path))
                else:
                    self.newDnNodes.get(newDN).setCheckboxValue(self.oldDnNodes.get(newDN).getCheckboxValue())
    
    def getFilteredDnNodesByDN(self, rawData):
        classIdFilters = self.getClassIdFilter()
        dnNodes = {}
        for d in rawData:
            node = NewLTEStatusDataNode(d)
            if classIdFilters.get(node.getClassId()):
                dnNodes[node.getDN()]=node
                
        return dnNodes
    
    def getFilteredRawDataByCommonState(self, dnSortedRawData):
        return dnSortedRawData
    
    def reorderRowsForModel(self):
        model = self._gui.getModel()
        newTopNodes = self._gui.getData().getTopNodes()
        
        #Reorder the top nodes order
        top_order=[]
        for node in newTopNodes:
            oldNode = self.oldDnNodes.get(node.getDN())
            top_order.append(oldNode.getIndex())
        model.rows_reordered(None, None, top_order)

    def storeLNBTSChildren(self, dnNodes):
        classIds = ''
        for v in self.newDnFilters.values():
            classIds += ','.join(v) + ','
        #print "calssIds = ",classIds
        if not('3129' in classIds and '3130' in classIds):
            return
        
        self.lnbtsChildren = {}
	commonStates = DataControl.getInstance().getDataFilters()['COSTATE']
        for dn in sorted(dnNodes.keys(), cmp= lambda x,y:self.sortDNColumn(x, y, dnNodes)):
            node = dnNodes[dn]
            if node.getNEType() == 'LNBTS':
                self.lnbtsChildren[dn]  = []
                lnbtsDn = dn
            if node.getNEType() == 'LNCEL' and commonStates.get(node.getCOSTATE()):
                self.lnbtsChildren[lnbtsDn].append(node)
            
    def getCheckedNodes(self, actionName):
        checkedNodes = []
        for dn in self.orderedNewDNs:
            node = self.newDnNodes[dn]
            if node.getCheckboxValue():
                n = NewLTEStatusDataNode(node.getRawData())
                checkedNodes.append(n)
                if node.getNEType() == 'LNBTS':
                    for child in self.lnbtsChildren[dn]:
                        if not child.getCheckboxValue() and child.getNEType() == 'LNCEL':
                            n.setChild(child)
                            if actionName != "reset":
                                checkedNodes.append(child)
	return checkedNodes
                    
class DnTreeHandler_LTEStatusDisplay(VirtualTreeHandler):
    def __init__(self):
        VirtualTreeHandler.__init__(self)
        self.viewType = ViewHandlerBase.viewType_DN
    
    def buildDataNodes(self, data):
        self.newDnFilters = self.getFilteredNeClassHierarchy()
        level_1 = self.newDnFilters.get('level_1')
        level_2 = self.newDnFilters.get('level_2')
        level_3 = self.newDnFilters.get('level_3')
        
        data.initializeTopNodes()
        dataRows = data.getSortedRawData()
        
        parent_1 = None
        parent_2 = None
        
        for row in dataRows:
            node = NewLTEStatusDataNode(row)
            classId = node.getClassId()
#            print "-------- node = ", node.getDN()

            if level_1 and classId in level_1:
                parent_1 = data.buildNode(None, node)
                continue
            elif level_2 and classId in level_2:
                parent_2 = data.buildNode(parent_1, node)
            elif level_3 and classId in level_3:
                data.buildNode(parent_2, node)
            else:
                continue

    def isTreeChanged(self):
        """Check if the dnFilters hierarchy changed, except
        that only the last level ne changed.
        """
#        print "self.oldDnFilters = ",self.oldDnFilters,"\n new = ",self.newDnFilters
        len1 = len(self.newDnFilters.keys())
        len2 = len(self.oldDnFilters.keys())
        
        diff = len1 - len2
        if diff == 1 or diff == -1 or diff == 0:
            for i in range(1, min(len1, len2)+1):
                oldIds = ''.join(self.oldDnFilters.get('level_'+str(i)))
                newIds = ''.join(self.newDnFilters.get('level_'+str(i)))
                if oldIds != newIds:
                    if i == 1 and (oldIds in newIds or newIds in oldIds):
                        continue
                    
                    if i != 1 and i == min(len1, len2) and diff == 0:
                        return False
                    
                    return True
                
            return False

        return True
            
    def updatePaths(self, gui):
        model = gui.getModel()
        
        if self.oldDnNodes:
            oldData = LTEStatusData()
            oldData.setTopNodes(self.oldTopNodes)
            gui.getModel().setData(oldData)
 
	    #Updates the deleted paths
            self.orderedOldDNs.reverse()
            for oldDN in self.orderedOldDNs:
                if not self.newDnNodes.get(oldDN):
                    node = self.oldDnNodes[oldDN]
                    model.row_deleted(self.getPathByNode(node))
#                    print "------ delete path = ",self.getPathByNode(self.oldDnNodes[oldDN])," dn = ",oldDN
                    oldParent = node.getParent()
                    if oldParent:
			oldParent.getChildren().remove(node)
                        oldNodeParentPath = self.getPathByNode(self.oldDnNodes.get(oldParent.getDN()))
                        model.row_has_child_toggled(oldNodeParentPath
                                                      ,model.get_iter(oldNodeParentPath))
		    else:
                        self.oldTopNodes.remove(node)

	    self.updateIndexForTopNodes()
            self.reorderRowsForOldModel()	

            #Update the insert paths
	    model.setData(gui.getData())
            for newDN in self.orderedNewDNs:
                if not self.oldDnNodes.get(newDN):
#                    self.updateInsertPaths(self.newDnNodes[newDN], model)
                    newNode = self.newDnNodes[newDN]
                    path = self.getPathByNode(newNode)
                    model.row_inserted(path, model.get_iter(path))
#                    print"+++++++++ insert path = ",path," dn = ",newDN
                else:
                    self.newDnNodes[newDN].setCheckboxValue(self.oldDnNodes[newDN].getCheckboxValue())

    def updateIndexForTopNodes(self):
        i = 0
        for node in self.oldTopNodes:
            node.setIndex(i)
            i = i+1
    
    def getFilteredDnNodesByDN(self, rawData):
        classIdFilters = self.getClassIdFilter()
        dnNodes = {}
        for d in rawData:
            node = NewLTEStatusDataNode(d)
            if classIdFilters.get(node.getClassId()):
                dnNodes[node.getDN()]=node
                
        return dnNodes
    
    def getFilteredRawDataByCommonState(self, dnSortedRawData):
        self.newDnFilters = self.getFilteredNeClassHierarchy()
        
        if len(self.newDnFilters.keys()) == 3:
            return self.getFilteredRawDataByCommonStateForLevel3(dnSortedRawData)
        else:
            return self.getFilteredRawDataByCommonStateForLevel2(dnSortedRawData)
        
    def getFilteredRawDataByCommonStateForLevel3(self, dnSortedRawData):
        self.newDnFilters = self.getFilteredNeClassHierarchy()
        commonStates = DataControl.getInstance().getDataFilters()['COSTATE']
        level_1 = self.newDnFilters.get('level_1')
        level_2 = self.newDnFilters.get('level_2')
        level_3 = self.newDnFilters.get('level_3')
        
#        print "commonStates = ", commonStates
        
        filteredRawData = []
        parent_1 = None
        parent_2 = None
        for d in dnSortedRawData:
            node = NewLTEStatusDataNode(d)
            classId = node.getClassId()
#            print "node = ",node.getDN()
            if level_1 and classId in level_1:
                if parent_2 and parent_2.getRawData() == filteredRawData[-1] \
                            and not commonStates.get(parent_2.getCOSTATE()):
                    filteredRawData.pop()
                if parent_1 and parent_1.getRawData() == filteredRawData[-1] \
                            and not commonStates.get(parent_1.getCOSTATE()):
                    filteredRawData.pop()
                parent_1 = node
                filteredRawData.append(d)
            elif level_2 and classId in level_2: 
                parent_2 = node        
                filteredRawData.append(d)
            
            elif level_3 and classId in level_3 and commonStates.get(node.getCOSTATE()):         
                filteredRawData.append(d)
        
        if parent_2 and parent_2.getRawData() == filteredRawData[-1] \
                    and not commonStates.get(parent_2.getCOSTATE()):
            filteredRawData.pop()
        if parent_1 and parent_1.getRawData() == filteredRawData[-1] \
                    and not commonStates.get(parent_1.getCOSTATE()):
            filteredRawData.pop()
        
        return filteredRawData
    
    def getFilteredRawDataByCommonStateForLevel2(self, dnSortedRawData):
        self.newDnFilters = self.getFilteredNeClassHierarchy()
        commonStates = DataControl.getInstance().getDataFilters()['COSTATE']
        level_1 = self.newDnFilters.get('level_1')
        level_2 = self.newDnFilters.get('level_2')
        
#        print "commonStates = ", commonStates
        
        filteredRawData = []
        parent_1 = None
        for d in dnSortedRawData:
            node = NewLTEStatusDataNode(d)
            classId = node.getClassId()
#            print "node = ",node.getDN()
            if level_1 and classId in level_1:
                if parent_1 and parent_1.getRawData() == filteredRawData[-1] \
                            and not commonStates.get(parent_1.getCOSTATE()):
                    filteredRawData.pop()
                parent_1 = node
                filteredRawData.append(d)
            elif level_2 and classId in level_2 and commonStates.get(node.getCOSTATE()): 
                filteredRawData.append(d)
            
        if parent_1 and parent_1.getRawData() == filteredRawData[-1] \
                    and not commonStates.get(parent_1.getCOSTATE()):
            filteredRawData.pop()
        
        return filteredRawData
    
    def activateViewForSort(self): 
 
   	#Record new dn nodes
#        print "enter activateview for sort"
        self.checkedNodes = []
        self.initializeNewDnNodes()
        self.recordNewDnNodes(self._gui.getData().getTopNodes())
        
	self.reorderRowsForModel()
        self._gui.getModel().setData(self._gui.getData())
	
	#self._gui.setModel(VirtualTreeModel(self._gui.getData()))
        self._gui.w.tv.queue_draw()
        self.recordOldNodes()
 
    def reorderRowsForModel(self):
        model = self._gui.getModel()
        newTopNodes = self._gui.getData().getTopNodes()
        
        #Reorder the top nodes order
        top_order=[]
        for node in newTopNodes:
            oldNode = self.oldDnNodes.get(node.getDN())
            top_order.append(oldNode.getIndex())
        model.rows_reordered(None, None, top_order)
        
        #Reorder the second level nodes order
        for node in newTopNodes:
            second_order=[]
            
            for child in node.getChildren():
                old_child = self.oldDnNodes.get(child.getDN())
                second_order.append(old_child.getIndex())
                
            path = self.getPathByNode(node)
            iter = model.get_iter(path)
            model.rows_reordered(path, iter, second_order)
       
    def reorderRowsForOldModel(self):
        model = self._gui.getModel()
        newTopNodes = self._gui.getData().getTopNodes()
        
        #Reorder the top nodes order
        top_order=[]
        for node in newTopNodes:
            oldNode = self.oldDnNodes.get(node.getDN())
            if oldNode:
                top_order.append(oldNode.getIndex())
        model.rows_reordered(None, None, top_order)
        
        #Reorder the second level nodes order
        for node in newTopNodes:
            second_order=[]
            oldNode = self.oldDnNodes.get(node.getDN())
            if oldNode:
                for child in node.getChildren():
                    
                    old_child = self.oldDnNodes.get(child.getDN())
                    if old_child:
                        second_order.append(old_child.getIndex())
                    
                path = self.getPathByNode(oldNode)
                iter = model.get_iter(path)
                model.rows_reordered(path, iter, second_order)

    def expandall(self,widget, gui):
        gui.w.tv.expand_all();

    def getCheckedNodes(self, actionName):
        checkedNodes = []
        for dn in self.orderedNewDNs:
            node = self.newDnNodes[dn]
            if node.getCheckboxValue():
                checkedNodes.append(node)
                if actionName == "reset":
                    continue
                if node.getNEType() == 'LNBTS':
                    for child in node.getChildren():
                        if not child.getCheckboxValue() and child.getNEType() == 'LNCEL':
                            checkedNodes.append(child)
                        
        return checkedNodes  

    def storeLNBTSChildren(self, dnNodes):
        pass

class FindingImpl:
    def __init__(self, handlerObj):
        self._gui = None;
        self._handlerObj = handlerObj;
        if ( not isinstance(self._handlerObj, ViewHandlerBase) ):
            exit("Error:FindingImpl with non-ViewHandlerBase object.");
        self.during_finding = False;
        self._keyword = "";
        self._searchUp = False;
        self._findTimesOnStartPath = 0;

    def setGUI(self, gui):
        self._gui = gui;

    def setKeyword(self, keyword):
        self._keyword = keyword;

    def findKeyword(self, gui, direction):
        if ( self.during_finding ):
            return;

        self._gui = gui;
        self.during_finding = True;
        self._findKeyword(gui, direction);
        self.during_finding = False;

    def _getRootPath(self, treemodel):
        path = treemodel.get_path(treemodel.get_iter_root())
        if(self._searchUp):
            if len(treemodel.getData().getTopNodes()) == 0:
                return None
            lastNode = treemodel.getData().getTopNodes()[-1]
            path = treemodel.getPathByNode(lastNode.getLastChild(lastNode))
        return path

    def _findKeyword(self, gui, direction):
        searchEntry = gui.get_object("TOOLBAR_FINDENTRY");
        if(searchEntry == None):
            return;
        self._keyword = searchEntry.get_text().strip().upper();

        if(cmp(direction,"UP") == 0):
            self._searchUp = True;
        else:
            self._searchUp = False;

        startPath = self._findGetCurrentFocusItem(gui);
        path = startPath;
        treemodel = gui.getModel();
        
        if not path:
            path = self._getRootPath(gui.getModel())
            node = treemodel.getNodeByPath(path)
            if not node:
                gui.showDialog("Find Hint", gui.MSG_INFO,'There is no any row matched with (' + self._keyword + ')');
                return
            values = ','.join(node.getExportValues()).upper()
            if values.find(self._keyword) != -1:
                self._focusPath(path)
                return
            
        path = self.getMatchPath(gui, path)
        
        if not startPath:
            startPath = (0,)
            
        if path != startPath : 
#            self._focusPath(path);
            node = treemodel.getNodeByPath(path)
            values = ','.join(node.getExportValues()).upper()
            if values.find(self._keyword) != -1:
                self._focusPath(path);
            else:
                path = None
        else: 
            path = startPath;
            node = treemodel.getNodeByPath(path)
            values = ','.join(node.getExportValues()).upper()
            if values.find(self._keyword) == -1:
                path = None
            
        if not path:
            gui.showDialog("Find Hint", gui.MSG_INFO,'There is no any row matched with (' + self._keyword + ')');

    def _findGetCurrentFocusItem(self, gui):
        treeview = self._gui.w.tv;
        sel = treeview.get_selection();
        (model, pathlist) = sel.get_selected_rows();
        if(len(pathlist) == 0):
            return None
        return pathlist[0]
    
    def findPrePath(self, gui, currPath):
        treemodel = self._handlerObj._gui.liststore
        activeHandler = gui.getActiveHandler()
        dns = activeHandler.orderedNewDNs
        dnNodes = activeHandler.newDnNodes
        
        curNode = treemodel.getNodeByPath(currPath)
	if self._handlerObj.viewType == ViewHandlerBase.viewType_OMS:
            curPos = dns.index(curNode.getTopOMS()+curNode.getDN())
        else:
            curPos = dns.index(curNode.getDN())
        
        if curPos == 0: prePos = len(dns)-1
        else: prePos = curPos -1
        
        while prePos != curPos:
            node = dnNodes.get(dns[prePos])
            values = ','.join(node.getExportValues()).upper()
            if values.find(self._keyword) != -1:
                break
            if prePos == 0: prePos = len(dns)-1
            else: prePos = prePos -1
        
        return treemodel.getPathByNode(dnNodes.get(dns[prePos]))
    
    def findNextPath(self, gui, currPath):
        treemodel = self._handlerObj._gui.liststore
        activeHandler = gui.getActiveHandler()
        dns = activeHandler.orderedNewDNs
        dnNodes = activeHandler.newDnNodes
        
        curNode = treemodel.getNodeByPath(currPath)

	if self._handlerObj.viewType == ViewHandlerBase.viewType_OMS:
            curPos = dns.index(curNode.getTopOMS()+curNode.getDN())
        else:
            curPos = dns.index(curNode.getDN())
        
        if curPos == len(dns)-1: nextPos = 0
        else: nextPos = curPos + 1
            
        while nextPos != curPos:
            node = dnNodes.get(dns[nextPos])
            values = ','.join(node.getExportValues()).upper()
            if values.find(self._keyword) != -1:
                break
            
            if nextPos == len(dns)-1: nextPos = 0
            else: nextPos = nextPos + 1
            
        return treemodel.getPathByNode(dnNodes.get(dns[nextPos]))
    
    def getMatchPath(self, gui, currPath):
        if self._searchUp:
            return self.findPrePath(gui, currPath)
        
        return self.findNextPath(gui, currPath)
            
    def _focusPath(self, path):
        tree_selection = self._gui.w.tv.get_selection();
        tree_selection.unselect_all();
        parent = self._gui.liststore.on_iter_parent(path)
        
        if parent:
            self._gui.w.tv.expand_to_path(parent);
            
        tree_selection.select_path(path);
        self._gui.w.tv.scroll_to_cell(path,None,True,0.5,0.0);       
