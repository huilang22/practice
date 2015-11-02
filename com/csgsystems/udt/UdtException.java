package com.csgsystems.udt;

/**
 * Exception for improper construction of a UDT request
 * 
 * @author Mark Brahler
 */
public class UdtException extends Exception {
    /**
     * No argument constructor
     */
    public UdtException() {
        super ();
    }
    /**
     * Constructor with message
     * 
     * @param A      reason exception is being thrown
     */
    public UdtException(String A) {
        super(A);
    }
}
