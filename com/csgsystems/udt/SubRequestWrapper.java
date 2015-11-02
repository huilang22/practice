package com.csgsystems.udt;

/**
 * Class to hold the sub request and its data
 * 
 * @author Raj Venkat
 */

public class SubRequestWrapper {
    /**
     * request
     */
    private UdtRequest request = null;
    /**
     * sub request data
     */
    private SubRequestData subRequestData = null;

    /**
     * Constructor
     * 
     */
    public SubRequestWrapper (UdtRequest request, SubRequestData subRequestData) {
       this.request = request;
       this.subRequestData = subRequestData;
    }

    /**
     * returns the request
     * 
     * @return request
     */
    public UdtRequest getRequest() {
       return request;
    }

    /**
     * returns the request data
     * 
     * @return request data
     */
    public SubRequestData getSubRequestData() {
       return subRequestData;
    }
}

