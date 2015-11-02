/*
 * HashMapOutput.java
 *
 * Created on October 17, 2002, 11:30 AM
 */

package com.csgsystems.udt.xlate.hashmap;

import com.csgsystems.udt.xlate.UdtOutput;

import java.util.HashMap;

import java.io.PrintStream;

/**
 * HashMapOutput to be used to translate
 * 
 * @author Mark Brahler
 */
public class HashMapOutput implements UdtOutput {
    
    private HashMap hm = null;
    
    /** Creates a new instance of HashMapOutput */
    public HashMapOutput() {
    }
    
    /** Debugs this UdtOutput instance
     * @param ps stream location to write out debug
     *
     */
    public void debug(PrintStream ps) {
        HashMapUtility.debug(hm, ps);
    }
    
    /** Getter for property hm.
     * @return Value of property hm.
     *
     */
    public HashMap getHashMap() {
        return hm;
    }
    
    /**
     * Setter for property hm.
     * 
     * @param hash   hashmap to set
     */
    public void setHashMap(HashMap hash) {
        this.hm = hash;
    }  

    /**
     * String representation of the object
     * 
     * @return object as String
     */
    public String toString() {
        return this.getClass().getName() + " Map = "+hm;
    }

    /**
     * Returns the hashCode of the object
     * 
     * @return hashCode of the object
     */
    public int hashCode() {
        if (hm != null) {
            return hm.hashCode();
        } else {
            return 1;
        }
    }
    /**
     * Determines of this object and the object passed in are equal
     * 
     * @param obj    Object to check equality against
     * @return true if the objects are equal
     *         false if they are not
     */
    public boolean equals (Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof HashMapOutput) {
                HashMapOutput val = (HashMapOutput)obj;
                HashMap valMap = val.getHashMap();
                if ((hm != null && hm.equals(valMap)) || (hm == null && valMap == null)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
