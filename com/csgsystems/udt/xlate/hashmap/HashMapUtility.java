package com.csgsystems.udt.xlate.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import java.io.PrintStream;

/**
 * Utility class for debugging HashMap innput and output
 * 
 * @author Mark Brahler
 */
public class HashMapUtility {

    /**
     * Offset for different levels of map
     */
    private static final String offsetDiff = "  ";

    /**
     * Debugs a map to the PrintStream provided
     * 
     * @param map    Map to debug
     * @param ps     PrintStream to which to write
     */
    public static void debug(Map map, PrintStream ps) {
        if (map != null) {
            debug(map, ps, "");
        }
    }
    /**
     * Debugs a map to the PrintStream provided with teh given offset
     * 
     * @param map    Map to debug
     * @param ps     PrintStream to which to write
     *               
     * @param offset offset for map levels
     */
    public static void debug(Map map, PrintStream ps, String offset) {
        Iterator iter = map.keySet().iterator();
        Object key;
        Object value;
        while (iter.hasNext()) {
            key = iter.next();
            value = map.get(key);
            printValue(key, value, ps, offset);
        }
    }

    /**
     * Prints the value of an entry in the map
     * 
     * @param key    Key from the map
     * @param value  Value from the map
     * @param ps     PrintStream to which we are writting
     * @param offset offset for different levels
     */
    public static void printValue (Object key, Object value, PrintStream ps, String offset) {
        if (value instanceof Object[]) {
            value = convertArray((Object[])value);
        }
        if (value instanceof HashMap) {
            ps.println(offset+key+"=");
            debug((HashMap)value, ps, offset+offsetDiff);
        } else if (value instanceof HashMap[]) {
            ps.println(offset+key+"=");
            HashMap[] array = (HashMap[]) value;
            ps.println(offset+"[");
            for (int i = 0; i < array.length; i++) {
                ps.println(offset+i);
                debug((HashMap)array[i], ps, offset+offsetDiff);
            }
            ps.println(offset+"]");
        } else {
            if (value != null) {
                ps.println(offset+key+":"+value+" ("+value.getClass().getName()+")");
            } else {
                ps.println(offset+key+":"+value+" (NULL)");
            }
        }
    }

    /**
     * Converts an object array into an array of HashMaps
     * 
     * @param objects Object array to conver
     * @return hashmap array from object array
     */
    public static HashMap[] convertArray(Object[] objects) {
        HashMap[] maps = null;
        if (objects != null) {
            maps = new HashMap[objects.length];
            for (int i = 0; i < objects.length; i++) {
                maps[i] = (HashMap)objects[i];
            }
        }
        return maps;
    }
}
