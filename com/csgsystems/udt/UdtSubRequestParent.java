package com.csgsystems.udt;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import com.csgsystems.aruba.ArubaObjectData;

import com.csgsystems.bali.BaliObjectFilter;

/**
 * Abstract class from which all implementations will extend
 * 
 * @author Mark Brahler
 */
public abstract class UdtSubRequestParent extends UdtRequest {

    /**
     * Constructor
     * 
     */
    public UdtSubRequestParent () {
        super();
    }
    /**
     * Constructor
     * 
     * @param request Id of request
     * @param object Id of object
     * @param method  name of method
     */
    public UdtSubRequestParent (String request, String object, String method) {
        super(request, object, method);
    }

    protected void addSubRequest(UdtRequest request, String relationship) {
        requests.add(new SubRequestWrapper(request, new SubRequestData(relationship, null)));
    }
    /*
    public void addSelfRequest(UdtRequest request) {
        addSubRequest(request, "SelfRequest");
    }
    */
}
