package com.csgsystems.api.base;

import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import java.util.Locale;
import java.util.Iterator;
import java.util.Properties;

import java.math.BigInteger;

import com.csgsystems.api.utilities.reload.ReloadMgr;
import com.csgsystems.api.utilities.reload.Reloadable;

import com.csgsystems.api.utilities.cache.Cache;
import com.csgsystems.api.utilities.cache.CacheManager;
import com.csgsystems.api.utilities.cache.CacheableWrapper;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ConfigurationManager;

import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.aruba.filter.StringEquals;

import com.csgsystems.bp.session.ExtendedDataAssociationBean;
import com.csgsystems.bp.session.ExtendedDataParamBean;
import com.csgsystems.bp.session.ExtendedDataEnumerationBean;

import com.csgsystems.bp.data.ExtendedDataObjectData;
import com.csgsystems.bp.data.ExtendedDataObjectDataList;
import com.csgsystems.bp.data.ExtendedDataObjectFilter;
import com.csgsystems.bp.data.ExtendedDataObjectKeyData;
import com.csgsystems.bp.data.XPDObjectData;
import com.csgsystems.bp.data.XPDObjectKeyData;
import com.csgsystems.bp.data.EDObjectData;
import com.csgsystems.bp.data.EDObjectKeyData;

/**
 * Handles access to  extended data capabilities. Configured via
 * api.properties, which must be in the classpath. Configuration properties
 * are dynamically reloaded on a periodic basis.
 *
 * @author Mark Brahler
 */
public class ExtendedDataManager implements Reloadable {

    private static final String CACHE_CAPACITY       = "ext-data-mgr.cache.capacity";
    private static final String ITEM_STALE_TIME      = "ext-data-mgr.cache.item-stale-time";
    private static final String LOAD_FACTOR          = "ext-data-mgr.cache.load-factor";
    private static final String LRU_PURGE_NUMBER     = "ext-data-mgr.cache.lru-purge-number";
    private static final String RELOAD_EXTENDED_DATA = "ext-data-mgr.reload-ext-data";
    private static final String SERVER_ID            = "ext-data-mgr.server-id";
    private static final String LANGUAGE_CODE        = "ext-data-mgr.language-code";

    private long cacheItemStaleTime = 7200000;

    private Cache cachedExtData = null;

    private String cacheCapacity = null;
    private String cacheLoadFactor = null;
    private String cacheLruPurgeNumber = null;

    private Integer serverId = new Integer(3);
    
    private Integer languageCode = new Integer(1);

    /** The one and only field format manager */
    private static ExtendedDataManager instance = null;

    /**
     * Accessor for the one and only ExtendedDataManager instance
     *
     * @return The one and only ExtendedDataManager instance
     */
    public static ExtendedDataManager getInstance() {
        if (instance ==  null) instance = new ExtendedDataManager();
        return instance;
    }

    /**
     * Constructs a FieldExtendedDataManager - no arguments
     */
    private ExtendedDataManager() {
        super();
        reload(true);
        ReloadMgr.getInstance().registerReloadable(this);
    }
    public boolean isValidExtData(String table, Integer id) {
        Set data = getValidExtData(table);
        if (data != null) {
            Iterator iter = data.iterator();
            ExtDataDefinition extData = null;
            while (iter.hasNext()) {
                extData = (ExtDataDefinition)iter.next();
                if (extData.extDataId.equals(id)) {
                    return true;
                }
            }
            return false;
        } else {
            Logger.error(this.getClass(), "isValidExtData", "Set was null");
            return false;
        }
    }
    public Integer getExtDataType(String table, Integer id) throws ExtendedDataException {
        if (isValidExtData(table, id)) {
            Set data = getValidExtData(table);
            if (data != null) {
                Iterator iter = data.iterator();
                ExtDataDefinition extData = null;
                while (iter.hasNext()) {
                    extData = (ExtDataDefinition)iter.next();
                    if (extData.extDataId.equals(id)) {
                        return extData.extDataType;
                    }
                }
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_ID_NOT_VALID", "Parameter id "+id+" is not valid");
            } else {
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_ID_NOT_VALID", "Parameter id "+id+" is not valid");
            }
        } else {
            throw new ExtendedDataException ("PC_EXT_DATA_PARAM_ID_NOT_VALID", "Parameter id "+id+" is not valid");
        }
    }
    public Object getExtDataTypeObject(String table, Integer key, String value) throws ExtendedDataException {
        Integer type = this.getExtDataType(table, key);
        if (type.intValue() == 1) return new Integer(value);
        else if (type.intValue() == 2) return value;
        else if (type.intValue() == 3) {
            int posSign = value.indexOf("+");
            Date nowDate = new Date();
            long offSet = 0;
            if (posSign >= 0) {
                offSet = Long.parseLong(value.substring(posSign+1, value.length()));    
            } else {
                posSign = value.indexOf("-");
                if (posSign >= 0) {
                    offSet = Long.parseLong(value.substring(posSign+1, value.length()));    
                    offSet = 0 - offSet;
                }
            }
            nowDate.setTime(nowDate.getTime() + offSet);
            return nowDate;
        } else if (type.intValue() == 4) return new BigInteger(value);
        else if (type.intValue() == 5) return new Boolean(value);
        else throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid");
    }
    public Class getExtDataTypeClass(String table, Integer id) throws ExtendedDataException {
        Integer type = this.getExtDataType(table, id);
        if (type.intValue() == 1) return Integer.class;
        else if (type.intValue() == 2) return String.class;
        else if (type.intValue() == 3) return Date.class;
        else if (type.intValue() == 4) return BigInteger.class;
        else if (type.intValue() == 5) return Boolean.class;
        else throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid");
    }
    public Set getValidExtData(String table) {
        Set extData = null;
        boolean getFromDB = true;
        if (cachedExtData.getCache().containsKey(table)) {
            if (Logger.DEBUG) Logger.debug(this.getClass(), "getValidExtData", "Found Set in the cache");
            CacheableWrapper cachedObj = (CacheableWrapper)cachedExtData.get(table);
            if (cachedObj != null) {
                extData = (Set)cachedObj.getValue();
                getFromDB = false;
            }
        } 
        if (getFromDB) {
            if (Logger.DEBUG) Logger.debug(this.getClass(), "getValidExtData", "Did not Find Set in the cache - Adding");
            extData = getExtDataFromServer(table);
            CacheableWrapper wrapper = new CacheableWrapper(table, extData);
            wrapper.setStaleTime(cacheItemStaleTime);
            cachedExtData.set(wrapper);
        }
        return extData;
    }
    private Set getExtDataFromServer(String table) {
        if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtDataFromServer");
        if (Logger.DEBUG) Logger.debug(this.getClass(), "getExtDataFromServer", "Entered with "+table);
        Set returnSet = null;
        try {
            ExtendedDataAssociationBean bean = new ExtendedDataAssociationBean(BSDMSettings.getDefault());
            ExtendedDataParamBean param = new ExtendedDataParamBean(BSDMSettings.getDefault());
            ExtendedDataEnumerationBean enumeration = new ExtendedDataEnumerationBean(BSDMSettings.getDefault());
            ExtendedDataObjectFilter filter = new ExtendedDataObjectFilter();
            filter.setBaseTableFilter(new StringEquals[]{new StringEquals(table)});
            filter.setIndex(new Integer(0));
            filter.setBlockSize(new Integer(1000));
            filter.setFetch(true);
            BSDMSessionContext context = new BSDMSessionContext();
            context.setServerId(serverId);
            ExtendedDataObjectDataList list = bean.find(context, filter);
            ExtendedDataObjectData[] array = list.getArray();
            returnSet = new HashSet();

            XPDObjectData data = null;
            XPDObjectKeyData key = new XPDObjectKeyData();

            EDObjectData enumData = null;
            EDObjectKeyData enumKey = new EDObjectKeyData();

            Integer enumKeyId = null;
            String enumName = null;

            for (int i = 0; i < array.length; i++) {
                if (Logger.DEBUG) Logger.debug(this.getClass(), "getExtDataFromServer", "Adding ParamId "+array[i].getParamId()+", type "+array[i].getEntityType());
                key.setParamId(array[i].getParamId());
                key.setLanguageCode(languageCode);
                data = param.get(context, key);
                enumKeyId = data.getAssocEnumerationId();
                if (enumKeyId != null) {
                    enumKey.setEnumerationId(enumKeyId);
                    enumData = enumeration.get(context, enumKey);
                    enumName = enumData.getEnumerationName();
                } else {
                    enumName = null;
                }
                returnSet.add(new ExtDataDefinition(array[i].getParamId(), data.getParamDatatype(), enumName, array[i].getDefaultValue()));    
            }
        } catch (Exception x) {
            if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtDataFromServer");
            Logger.error(this.getClass(), "getExtDataFromServer", "Could not get extended data from server", x);
        }
        if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtDataFromServer");
        return returnSet;
    }
    public String getExtDataDefaultValue(String table, Integer id) throws ExtendedDataException {
        Set data = getValidExtData(table);
        if (data != null) {
            Iterator iter = data.iterator();
            ExtDataDefinition extData = null;
            while (iter.hasNext()) {
                extData = (ExtDataDefinition)iter.next();
                if (extData.extDataId.equals(id)) {
                    return extData.extDataDefault;
                }
            }
            return null;
        } else {
            throw new ExtendedDataException("PC_EXT_DATA_PARAM_ID_NOT_VALID", table+" does not have ext data "+id);
        }
    }
    public String getExtDataEnumerationName(String table, Integer id) throws ExtendedDataException {
        Set data = getValidExtData(table);
        if (data != null) {
            Iterator iter = data.iterator();
            ExtDataDefinition extData = null;
            while (iter.hasNext()) {
                extData = (ExtDataDefinition)iter.next();
                if (extData.extDataId.equals(id)) {
                    return extData.extDataEnumName;
                }
            }
            return null;
        } else {
            throw new ExtendedDataException("PC_EXT_DATA_PARAM_ID_NOT_VALID", table+" does not have ext data "+id);
        }
    }
    public String getExtDataFormattedString(String table, Integer key, Object value, Locale locale) throws ExtendedDataException {
        Integer type = getExtDataType(table, key);
        if (type.intValue() == 1) {
            try {
                return FieldFormatMgr.getInstance().formatNumber((Integer)value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 2) {
            try {
                return FieldFormatMgr.getInstance().formatString((String)value);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 3) {
            try {
                return FieldFormatMgr.getInstance().formatDate((Date)value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 4) {
            try {
                return FieldFormatMgr.getInstance().formatBigInteger((BigInteger)value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 5) {
            try {
                return FieldFormatMgr.getInstance().formatBoolean((Boolean)value);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else {
            throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid");
        }
    }
    public Object getExtDataFromFormattedString(String table, Integer key, String value, Locale locale) throws ExtendedDataException {
        Integer type = getExtDataType(table, key);
        if (type.intValue() == 1) {
            try {
                return FieldFormatMgr.getInstance().parseNumber(value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFromFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 2) {
            try {
                return FieldFormatMgr.getInstance().parseString(value);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFromFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 3) {
            try {
                return FieldFormatMgr.getInstance().parseDate(value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFromFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 4) {
            try {
                return FieldFormatMgr.getInstance().parseBigInteger(value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFromFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else if (type.intValue() == 5) {
            try {
                return FieldFormatMgr.getInstance().parseBoolean(value);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFromFormattedString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else {
            throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid");
        }
    }
    public String getExtDataFormattedCurrencyString(String table, Integer key, Object value, Locale locale) throws ExtendedDataException {
        Integer type = getExtDataType(table, key);
        if (type.intValue() == 4) {
            try {
                return FieldFormatMgr.getInstance().formatCurrency((BigInteger)value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFormattedCurrencyString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else {
            throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+value+" is not valid currency data type");
        }
    }
    public Object getExtDataFromFormattedCurrencyString(String table, Integer key, String value, Locale locale) throws ExtendedDataException {
        Integer type = getExtDataType(table, key);
        if (type.intValue() == 4) {
            try {
                return FieldFormatMgr.getInstance().parseCurrency(value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFromFormattedCurrencyString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else {
            throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid currency");
        }
    }
    public String getExtDataFormattedDateTimeString(String table, Integer key, Object value, Locale locale) throws ExtendedDataException {
        Integer type = getExtDataType(table, key);
        if (type.intValue() == 3) {
            try {
                return FieldFormatMgr.getInstance().formatDate((Date)value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFormattedDateTimeString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else {
            throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+value+" is not valid date time type");
        }
    }
    public Object getExtDataFromFormattedDateTimeString(String table, Integer key, String value, Locale locale) throws ExtendedDataException {
        Integer type = getExtDataType(table, key);
        if (type.intValue() == 3) {
            try {
                return FieldFormatMgr.getInstance().parseDateTime(value, locale);
            } catch (Exception x) {
                Logger.error(this.getClass(), "getExtDataFromFormattedDateTimeString", "Exception formatting", x);
                throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid", x);
            }
        } else {
            throw new ExtendedDataException ("PC_EXT_DATA_PARAM_TYPE_NOT_VALID", "Parameter type of "+type+" is not valid date time");
        }
    }
    public void reload(boolean full) {
        if (Logger.TRACE) Logger.traceEntry(this.getClass(), "reload");
        try {
            ConfigurationManager cMan = ConfigurationManager.getInstance();
            Properties props = cMan.getPropertiesFromClassPath("/api.properties");

            boolean reloadData = Boolean.valueOf(props.getProperty(RELOAD_EXTENDED_DATA)).booleanValue();

            String newCacheCapacity = props.getProperty(CACHE_CAPACITY);
            String newCacheLoadFactor = props.getProperty(LOAD_FACTOR);
            String newCacheLruPurgeNumber = props.getProperty(LRU_PURGE_NUMBER);
            String newItemStaleTime = props.getProperty(ITEM_STALE_TIME);
            String newServerId = props.getProperty(SERVER_ID);
            String newLangCode = props.getProperty(LANGUAGE_CODE);

            if (newCacheCapacity == null) {
                if (Logger.DEBUG) Logger.debug(this.getClass(), "reload", "No property for "+CACHE_CAPACITY+" checking default for cache "+Cache.CACHE_CAPACITY);
                newCacheCapacity = props.getProperty(Cache.CACHE_CAPACITY);
            }
            if (newCacheLoadFactor == null) {
                if (Logger.DEBUG) Logger.debug(this.getClass(), "reload", "No property for "+LOAD_FACTOR+" checking default for cache "+Cache.CACHE_LOAD_FACTOR);
                newCacheLoadFactor = props.getProperty(Cache.CACHE_LOAD_FACTOR);
            }
            if (newCacheLruPurgeNumber == null) {
                if (Logger.DEBUG) Logger.debug(this.getClass(), "reload", "No property for "+LRU_PURGE_NUMBER+" checking default for cache "+Cache.CACHE_LRU_PURGE_NUMBER);
                newCacheLruPurgeNumber = props.getProperty(Cache.CACHE_LRU_PURGE_NUMBER);
            }
            if (newItemStaleTime == null) {
                if (Logger.DEBUG) Logger.debug(this.getClass(), "reload", "No property for "+ITEM_STALE_TIME+" checking default for cache "+Cache.CACHE_ITEM_STALE_TIME);
                newItemStaleTime = props.getProperty(Cache.CACHE_ITEM_STALE_TIME);
            }
            cacheItemStaleTime = Long.parseLong(props.getProperty(ITEM_STALE_TIME));

            if (Logger.DEBUG) {
                Logger.debug(this.getClass(), "reload", "new RELOAD_DATA setting - " + reloadData);
                Logger.debug(this.getClass(), "reload", "new CACHE_CAPACITY setting - " + newCacheCapacity);
                Logger.debug(this.getClass(), "reload", "new CACHE_LOAD_FACTOR setting - " + newCacheLoadFactor);
                Logger.debug(this.getClass(), "reload", "new CACHE_LRU_PURGE_NUMBER setting - " + newCacheLruPurgeNumber);
                Logger.debug(this.getClass(), "reload", "new CACHE_ITEM_STALE_TIME setting - " + cacheItemStaleTime);
                Logger.debug(this.getClass(), "reload", "new SERVER_ID setting - " + newServerId);
                Logger.debug(this.getClass(), "reload", "new LANGUAGE_CODE setting - " + newLangCode);
            }

            serverId = new Integer(newServerId);
            languageCode = new Integer(newLangCode);

            if (reloadData || cachedExtData == null || 
                !cacheCapacity.equals(newCacheCapacity) || !cacheLoadFactor.equals(newCacheLoadFactor) ||
                !cacheLruPurgeNumber.equals(newCacheLruPurgeNumber)) {
                cacheCapacity = newCacheCapacity;
                cacheLoadFactor = newCacheLoadFactor;
                cacheLruPurgeNumber = newCacheLruPurgeNumber;

                Properties cacheParams = new Properties();
                cacheParams.setProperty(Cache.CACHE_CAPACITY, cacheCapacity);
                cacheParams.setProperty(Cache.CACHE_LOAD_FACTOR, cacheLoadFactor);
                cacheParams.setProperty(Cache.CACHE_LRU_PURGE_NUMBER, cacheLruPurgeNumber);
                CacheManager.getInstance().removeCache(cachedExtData);
                cachedExtData = CacheManager.getInstance().createCache(cacheParams);
                if (Logger.INFO) Logger.info(this.getClass(), "reload", "Reconstructed cache using new parameters");
            }
        } catch (Exception x) {
            Logger.error(this.getClass(), "reload", "Error reloading - "+x, x);
        }

        if (Logger.TRACE) Logger.traceExit(this.getClass(), "reload");
    }

    class ExtDataDefinition {
        public Integer extDataId = null;
        public Integer extDataType = null;

        public String extDataEnumName = null;
        public String extDataDefault = null;

        public ExtDataDefinition (Integer id, Integer type, String enumeration, String def) {
            extDataId = id;
            extDataType = type;
            extDataEnumName = enumeration;
            extDataDefault = def;
        }
        public String toString() {
            return "ParamId = "+extDataId+", DataType = "+extDataType+", EnumName = "+extDataEnumName+", Default = "+extDataDefault;
        }
    }
}
