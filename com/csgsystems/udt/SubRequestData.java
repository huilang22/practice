package com.csgsystems.udt;

import java.util.Collection;

/**
 * Internal class used for translation
 * 
 * @author Mark Brahler
 */
public class SubRequestData {
    /**
     * Colleciton of DynamicRequest objects
     */
    private Collection dynamics = null;

    /**
     * Name for subrequest
     */
    private String name = null;

    /**
     * Constructor
     * 
     * @param n      Name of subRequest
     * @param dyn    Collection of DynamicRelationships
     */
    public SubRequestData (String n, Collection dyn) {
        name = n;
        dynamics = dyn;
    }

    /**
     * Returns the name of the subRequest
     * 
     * @return name of subRequest
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the Collection of DynamicRelationships
     * 
     * @return Collection of DynamicRelationships
     */
    public Collection getDynamicRelationships() {
        return dynamics;
    }
    /**
     * Returns the String representation of the object
     * 
     * @return String representation of the object
     */
    public String toString () {
        return this.getClass().getName() + " dynamics = "+ dynamics + " name = " + name;
    }

    /**
     * Returns the hashCode of the object
     * 
     * @return hashCode of the object
     */
    public int hashCode() {
        int i = 1;
        if (dynamics != null) {
            i = i + dynamics.hashCode();
        } 
        if (name != null) {
            i = i + name.hashCode();
        } 
        return i;
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
            if (obj instanceof SubRequestData) {
                SubRequestData dyn = (SubRequestData)obj;
                Collection inColl = dyn.getDynamicRelationships();
                String inname = dyn.getName();
                if (((this.dynamics != null && this.dynamics.equals(inColl)) || (this.dynamics == null && inColl == null)) &&
                    ((this.name != null && this.name.equals(inname)) || (this.name == null && inname == null))) {
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
