package com.csgsystems.udt;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

import com.csgsystems.aruba.connection.BSDMSessionContext;

/**
 * Abstract class that defines root udt request elements
 * 
 * @author Mark Brahler
 */
public class BulkUdtTemplateRootRequest implements Request {
    
	protected BSDMSessionContext bsdmContext = null;
	
	public static final String TEMPLATE_LIST = "TemplateList";
	
    /**
     * List of subrequests
     */
    protected List<BulkUdtTemplateItem> templateList = null;

    /**
     * Constructor
     */
    public BulkUdtTemplateRootRequest(BSDMSessionContext context) {
    	bsdmContext = context;
    	templateList = new ArrayList<BulkUdtTemplateItem>();
    }
    
    /**
     * No argument constructor
     */
    public BulkUdtTemplateRootRequest() {
    	this(null);
    }


    /**
     * Returns all templates
     * 
     * @return Collection of templates
     */
    public Collection<BulkUdtTemplateItem> getBulkUdtTemplateItemList() {
        return templateList;
    }

   /**
    *
    * Adds a BulkUdtTemplateItem to the BulkUdtTemplateRootRequest
    * @param template template to add
    *
    */
    public void addBulkUdtTemplateItem(BulkUdtTemplateItem template) {
    	if (template != null) {
    		templateList.add(template);
    	}
    }
    /**
    *
    * Updates a BulkUdtTemplateItem in the BulkUdtTemplateRootRequest
    * @param template template to update
    *
    */
    public void updateBulkUdtTemplateItem(BulkUdtTemplateItem template) {
    	if (templateList != null) {
    		int pos = 0;
    		BulkUdtTemplateItem toRemove = null;
    		for (BulkUdtTemplateItem item: templateList) {
    			if (item.getTemplateId().equals(template.getTemplateId())) {
    				toRemove = item;
    				break;
    			} else {
    				pos++;
    			}
    		}
        	if (toRemove != null) {
        		templateList.remove(toRemove);
            	templateList.add(pos, template);
        	}
    	}
    }
    /**
    *
    * Removes a BulkUdtTemplateItem from the BulkUdtTemplateRootRequest
    * @param template template to remove
    *
    */
    public void removeBulkUdtTemplateItem(BulkUdtTemplateItem template) {
    	if (templateList != null) {
    		BulkUdtTemplateItem toRemove = null;
    		for (BulkUdtTemplateItem item: templateList) {
    			if (item.getTemplateId().equals(template.getTemplateId())) {
    				toRemove = item;
    			}
    		}
        	if (toRemove != null) {
        		templateList.remove(toRemove);
        	}
    	}
    }
    
    public static Map toMap(BulkUdtTemplateRootRequest in) {
    	return toMap(in, new HashMap());
    }
    
    public static Map getMap(BulkUdtTemplateRootRequest in, Map inputMap) {
    	return toMap(in, inputMap, null);
    }
    
    public static Map toMap(BulkUdtTemplateRootRequest in, Map inputMap, String rootName) {
    	if (in == null) return null;
    	if (inputMap == null) inputMap = new HashMap();
    	Map tempMap = new HashMap();
    	BSDMSessionContext tempContext = in.getBsdmContext();
    	if (tempContext != null) {
    		BSDMSessionContext.toMap(tempContext, tempMap);
    	}
    	Collection<BulkUdtTemplateItem> templates = in.getBulkUdtTemplateItemList();
    	if (templates != null) {
    		Map[] templateMaps = new Map[templates.size()];
    		int pos = 0;
    		for (Iterator<BulkUdtTemplateItem> iter = templates.iterator(); iter.hasNext();) {
    			templateMaps[pos] = iter.next().toMap();
    			pos++;
    		}
    		tempMap.put(TEMPLATE_LIST, templateMaps);
    	}
    	String baseName = null;
    	if (rootName == null) {
    		baseName = "BulkUdtTemplateRootRequest";
    	} else {
    		baseName = rootName;
    	}
    	inputMap.put(baseName, tempMap);
    	return inputMap;
    }
    
    public static Map toMap(BulkUdtTemplateRootRequest in, Map inputMap) {
    	return toMap(in, inputMap, null);
    }

    
    public static BulkUdtTemplateRootRequest fromMap(Map in) {
    	if (in == null) return null;
    	BulkUdtTemplateRootRequest retVal = new BulkUdtTemplateRootRequest();
    	retVal.setBsdmContext(BSDMSessionContext.fromMap(in));
     	Object[] templateMaps = (Object[])in.get(TEMPLATE_LIST);
    	if (templateMaps != null) {
    		for (int i = 0; i < templateMaps.length; i++) {
    			retVal.addBulkUdtTemplateItem(BulkUdtTemplateItem.fromMap((Map)templateMaps[i]));
    		}
    	}
    	return retVal;
    }
    
    public static BulkUdtTemplateRootRequest fromMap(Map in, String rootName) {
    	if (in == null) return null;
    	Map namedMap = (Map)in.get(rootName);
    	if (namedMap == null) namedMap = in;
    	return fromMap(namedMap);
    }


	public BSDMSessionContext getBsdmContext() {
		return bsdmContext;
	}

	public void setBsdmContext(BSDMSessionContext bsdmContext) {
		this.bsdmContext = bsdmContext;
	}
}
