package com.csgsystems.udt;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.StringTokenizer;

import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.utilities.Logger;

/**
 * Abstract class from which all implementations will extend
 * 
 * @author Mark Brahler
 */
public abstract class BulkUdtTemplateItem implements Request {

	public static final String NAME = "#NAME";
	public static final String TEMPLATE_ITEM = "TemplateItem";
	public static final String TEMPLATE_ITEM_ID = "TemplateItemId";
	public static final String REF = "Ref";
	public static final String PARTICIPANT_REF = "ParticipantRef";
	public static final String HEADER = "Header";
	public static final String XPATH_SEPERATOR = "/";
	public static final String ISNOOP = "IsNoOp";

	protected Map<String, String> inputFieldRefHeaderMap = new TreeMap<String, String>();
	protected Map<String, String> participantRefHeaderMap = new TreeMap<String, String>();

	protected Map<String, String> inputFieldRefMethodMap = new TreeMap<String, String>();
	protected Map<String, String> participantRefMethodMap = new TreeMap<String, String>();

	protected Map inputMap = new HashMap();

	protected String requestName;

	protected boolean isNoOp = false;

	/**
	 * id of template
	 */
	protected String templateId = null;

	/**
	 * sessionContext of template
	 */
	protected BSDMSessionContext bsdmContext = null;

	/**
	 * Constructor
	 * 
	 */
	public BulkUdtTemplateItem () {
	}
	/**
	 * Constructor
	 * 
	 * @param template Id of template
	 */
	public BulkUdtTemplateItem (String template, String request) {
		this(template, null, request);
	}

	/**
	 * Constructor
	 * 
	 * @param template Id of template
	 * @param context Context to overwrite
	 */
	public BulkUdtTemplateItem (String template, BSDMSessionContext context, String request) {
		templateId = template;
		requestName = request;
		bsdmContext = context;
	}
	public BSDMSessionContext getBsdmContext() {
		return bsdmContext;
	}
	public void setBsdmContext(BSDMSessionContext bsdmContext) {
		this.bsdmContext = bsdmContext;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public void addRef(String field, String refVal, RefTypeEnum refType, TemplateItemTypeEnum itemType) {
		if (refType == RefTypeEnum.ParticipantRef) {
			if (itemType == TemplateItemTypeEnum.Header) {
				participantRefHeaderMap.put(HEADER+XPATH_SEPERATOR+field, refVal);
			} else {
				participantRefMethodMap.put(requestName+XPATH_SEPERATOR+field, refVal);
			}
		} else {
			if (itemType == TemplateItemTypeEnum.Header) {
				inputFieldRefHeaderMap.put(HEADER+XPATH_SEPERATOR+field, refVal);
			} else {
				inputFieldRefMethodMap.put(requestName+XPATH_SEPERATOR+field, refVal);
			}
		}
	}
	public void removeRef(String field, RefTypeEnum refType, TemplateItemTypeEnum itemType) {
		if (refType == RefTypeEnum.ParticipantRef) {
			if (itemType == TemplateItemTypeEnum.Header) {
				participantRefHeaderMap.remove(HEADER+XPATH_SEPERATOR+field);
			} else {
				participantRefMethodMap.remove(requestName+XPATH_SEPERATOR+field);
			}

		} else {
			if (itemType == TemplateItemTypeEnum.Header) {
				inputFieldRefHeaderMap.remove(HEADER+XPATH_SEPERATOR+field);
			} else {
				inputFieldRefMethodMap.remove(requestName+XPATH_SEPERATOR+field);
			}
		}
	}
	public void updateRef(String field, String refVal, RefTypeEnum refType, TemplateItemTypeEnum itemType) {
		addRef(field, refVal, refType, itemType);
	}
	/**
	 * Adds input to the input map
	 *
	 * @param key    key for input data
	 * @param value  value for input data
	 */
	protected void addInput(Object key, Object value) {
		inputMap.put(key, value);
	}
	public Map toMap() {
		Map retVal = new HashMap();
		retVal.put(NAME, TEMPLATE_ITEM);
		retVal.put(TEMPLATE_ITEM_ID, this.getTemplateId());
		if (isNoOp) retVal.put(ISNOOP, Boolean.TRUE);
		if (bsdmContext != null) {
			BSDMSessionContext.toMap(bsdmContext, retVal);
		}

		translateToMap();
		retVal.put(requestName, inputMap);

		setupDynamicRelationships(retVal, inputFieldRefMethodMap, REF);
		setupDynamicRelationships(retVal, participantRefMethodMap, PARTICIPANT_REF);
		setupDynamicRelationships(retVal, inputFieldRefHeaderMap, REF);
		setupDynamicRelationships(retVal, participantRefHeaderMap, PARTICIPANT_REF);


		if (Logger.DEBUG) Logger.debug(this.getClass(), "toMap", "Map being returned = "+retVal);

		return retVal;
	}

	public static BulkUdtTemplateItem fromMap(Map in) {
		if (Logger.DEBUG) Logger.debug(BulkUdtTemplateItem.class, "fromMap", "Map passed in = "+in);
		if (in == null) return null;
		Object keyObj = null;
		String key = null;
		BulkUdtTemplateItem retVal = null;

		String templateId = (String)in.get(TEMPLATE_ITEM_ID);
		for (Iterator iter = in.keySet().iterator(); iter.hasNext();) {
			keyObj = iter.next();
			if (keyObj instanceof String) {
				key = (String)keyObj;
				if (!key.equals(NAME) && !key.equals(TEMPLATE_ITEM_ID) && !key.equals(HEADER) && !key.equals(ISNOOP)) {
					String className = null;
					try {
						Class clazz = getBulkClass(key);
						Constructor constructor = clazz.getConstructors()[0];
						int paramCount = constructor.getParameterTypes().length;
						Object[] constructorParams = new Object[paramCount];
						constructorParams[0] = templateId;
						constructorParams[1] = null;
						retVal = (BulkUdtTemplateItem)constructor.newInstance(constructorParams);
					} catch (Exception x) {
						System.err.println(BulkUdtTemplateItem.class.getName() + " Could not instantiate "+className);
						x.printStackTrace();
						return null;
					}
					break;
				}
			}
		}

		populateRefMaps(XPATH_SEPERATOR, in, retVal);
		BSDMSessionContext context = BSDMSessionContext.fromMap(in);
		retVal.setBsdmContext(context);
		
		Boolean noOp = (Boolean)in.get(ISNOOP);
		if (noOp != null) {
			retVal.isNoOp = noOp.booleanValue();
		}
		retVal.inputMap = (Map)in.get(key);
		retVal.translateFromMap();
		return retVal;
	}

	private static Class getBulkClass(String key) {
		String className = "com.comverse.udt.udtrequest."+key+"BulkUdtTemplateItem";
		Class retVal = null;
		try {
			retVal = Class.forName(className);
		} catch (Exception x) {
			if (Logger.DEBUG) Logger.debug(BulkUdtTemplateItem.class, "getBulkClass", "Could not create class "+className);
			retVal = null;
		}
		className = "com.csgsystems.udt.udtrequest."+key+"BulkUdtTemplateItem";
		if (retVal == null) {
			try {
				retVal = Class.forName(className);
			} catch (Exception x) {
				if (Logger.DEBUG) Logger.debug(BulkUdtTemplateItem.class, "getBulkClass", "Could not create class "+className);
				retVal = null;
			}	
		}
		return retVal;
	}

	public abstract void translateFromMap();
	public abstract void translateToMap();

	private static void populateRefMaps(String xpath, Map input, BulkUdtTemplateItem item) {
		if (input != null) {
			Collection<String> toRemove = new ArrayList<String>();
			String key = null;
			Object value = null;
			for (Iterator iter = input.keySet().iterator(); iter.hasNext();) {
				key = (String)iter.next();
				value = input.get(key);
				if (value instanceof Map) {
					populateRefMaps(xpath+key+XPATH_SEPERATOR, input, (Map)value, item, toRemove);
				}
			}
			for (Iterator<String> iter = toRemove.iterator(); iter.hasNext();) {
				StringTokenizer tok = new StringTokenizer(iter.next(), XPATH_SEPERATOR);
				int count = tok.countTokens();
				Map map = input;
				for (int i = 0; i < (count - 2); i++) {
					key = tok.nextToken();
					map = (Map)map.get(key);
				}
				map.remove(tok.nextToken());
			}
		}
	}
	private static void populateRefMaps(String xpath, Map parent, Map input, BulkUdtTemplateItem item, Collection toRemove) {
		if (input != null) {
			String key = null;
			Object value = null;
			for (Iterator iter = input.keySet().iterator(); iter.hasNext();) {
				key = (String)iter.next();
				value = input.get(key);
				if (REF.equals(key)) {
					TemplateItemTypeEnum itemType;
					if (xpath.indexOf(HEADER) >= 0) {
						itemType = TemplateItemTypeEnum.Header;
					} else {
						itemType = TemplateItemTypeEnum.Method;
					}
					item.addRef(xpath, (String)value, RefTypeEnum.Ref, itemType);
					toRemove.add(xpath+key);
				} else if (PARTICIPANT_REF.equals(key)) {
					TemplateItemTypeEnum itemType;
					if (xpath.indexOf(HEADER) >= 0) {
						itemType = TemplateItemTypeEnum.Header;
					} else {
						itemType = TemplateItemTypeEnum.Method;
					}
					item.addRef(xpath, (String)value, RefTypeEnum.ParticipantRef, itemType);
					toRemove.add(xpath+key);
				}
				if (value instanceof Map) {
					populateRefMaps(xpath+key+XPATH_SEPERATOR, input, (Map)value, item, toRemove);
				} 
			}
		}
	}


	private void setupDynamicRelationships(Map map, Map refMap, String refName) {
		if (refMap != null) {
			String key = null;
			for (Iterator<String> iter = refMap.keySet().iterator(); iter.hasNext();) {
				key = iter.next();
				setupDynamicRelationships(map, key, (String)refMap.get(key), refName);
			}
		}
	}
	/**
	 * Defines any dynamic relationships in the Map for hte UdtReuqest
	 *
	 * @param inMap Map to which dynamic relationships need to be added
	 * @param to where the ref is to 
	 * @param from where the ref is from
	 */
	private void setupDynamicRelationships(Map inMap, String to, String from, String refName) {
		if (inMap != null && from != null && to != null) {
			StringTokenizer tok = new StringTokenizer(to, "/");
			int count = tok.countTokens();
			String key = null;
			Map map = inMap;
			for (int i = 0; i < (count - 1); i++) {
				key = tok.nextToken();
				if (map.containsKey(key)) {
					map = (Map)map.get(key);
				} else {
					Map tempmap = new HashMap();
					map.put(key, tempmap);
					map = tempmap;
				}
			}
			Map newMap = new HashMap();
			newMap.put(refName, from);
			map.put(tok.nextToken(), newMap);
		} else {
			//Logger.error(this.getClass(), "setupDynamicRelationships", "Required fields were null");
		}
	}
	public boolean isNoOp() {
		return isNoOp;
	}                    
}
