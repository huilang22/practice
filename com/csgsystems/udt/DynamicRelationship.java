package com.csgsystems.udt;

import java.util.Map;
import java.util.HashMap;

/**
 * This class is used to define relationships
 * in addition to those defined by the individual
 * UDT server definitions.
 * 
 * @author Mark Brahler
 */
public class DynamicRelationship {

    /**
     * location in prior request 
     */
    private String from = null;

    /**
     * location in this 
     */
    private String to = null;

    public DynamicRelationship () {
    }
    /**
     * No argument constructor
     * @param f String location to copy data from
     * @param t String location to copy data to
     */
    public DynamicRelationship (String f, String t) {
       from = f;
       to = t;
    }

    /**
     * Returns the String representation of the object
     * 
     * @return String representation of the object
     */
    public String toString () {
        return this.getClass().getName() + " From = "+ from + " To "+ to;
    }

    /**
     * Returns the hashCode of the object
     * 
     * @return hashCode of the object
     */
    public int hashCode() {
        int hash = 1;
        if (from != null) {
            hash += from.hashCode();
        }
        if (to != null) {
            hash += to.hashCode();
        }
        return hash;
    }
  
    /**
     * Returns the to location
     * @return the to location
     */
    public String getTo() {
      return to;
    }
    /**
     * Returns the from location
     * @return the from location
     */
    public String getFrom() {
      return from;
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
        } else if (obj == this) {
            return true;
        } else {
            if (obj instanceof DynamicRelationship) {
              DynamicRelationship other = (DynamicRelationship) obj;
              String thisTo = getTo();
              String thisFrom = getFrom();
              String otherTo = other.getTo();
              String otherFrom = other.getFrom();
              if (((thisTo != null && thisTo.equals(otherTo))  || (thisTo == null && otherTo == null)) &&
                  ((thisTo != null && thisTo.equals(otherTo))  || (thisTo == null && otherTo == null))) {
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
