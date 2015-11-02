package com.csgsystems.udt;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import com.csgsystems.aruba.ArubaObjectData;

import com.csgsystems.bali.BaliObjectFilter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Abstract class from which all implementations will extend
 * 
 * @author Mark Brahler
 */
@JsonIgnoreProperties({ "InputMap", "OutputMap", "MethodName", "ObjectName" })
public abstract class UdtRequest implements Request {
    /**
     * collection of dynamic requests
     */
    protected Collection dynamics = null;
    /**
     * map of inputrequest -- NOT USED - the irList structure is used to track input request
     */
    protected Map irMap = null;
    /**
     * collection of inputrequests
     */
    protected List irList = null;
    /**
     * list of subrequests
     */
    protected Collection requests = null;

    /**
     * map of input data
     */
    protected Map inputMap = null;

    /**
     * map of output data
     */
    protected Map outputMap = null;

    /**
     * method name for request
     */
    protected String methodName = null;
    /**
     * object name for request
     */
    protected String objectName = null;
    /**
     * id of request
     */
    protected String requestId = null;

    /**
     * Constructor
     * 
     */
    public UdtRequest () {
    }
    /**
     * Constructor
     * 
     * @param request Id of request
     * @param object Id of object
     * @param method  name of method
     */
    public UdtRequest (String request, String object, String method) {
        initialize(request, object, method);
    }

    /**
     * sets up initial structure on request
     * 
     * @param request id of request
     * @param method  name of method
     */
    protected void initialize(String request, String object, String method) {
        methodName = method;
	objectName = object;
        requestId = request;
        requests = new ArrayList();
        inputMap = new HashMap();
        outputMap = new HashMap();
        irMap = null;
        irList = null;
    }

    /**
     * method 
     * 
     * returns object name for request
     * 
     * @return object name
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * returns the request id
     * 
     * @return request id
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * returns the method name
     * 
     * @return method name
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the InputRequest in the subRequest mappings
     * 
     * @param request inputrequest
     * @deprecated use addInputRequest(InputRequest request) instead
     */
    public void setInputRequest(InputRequest request) {
        irMap = new HashMap();
        irMap.put("RequestId", request.getRequestId());
        irMap.put("RelationshipId", request.getRelationshipId());
    }

    /**
     * adds the InputRequest 
     * 
     * @param request inputrequest
     */
    public void addInputRequest(InputRequest request) {
        if (irList == null) {
           irList = new ArrayList();
        }

        HashMap inReq = new HashMap();
        inReq.put("RequestId", request.getRequestId());
        inReq.put("RelationshipId", request.getRelationshipId());
        irList.add(inReq);
    }

    /**
     * Retrieves the input request list
     * 
     * @return inputrequest list
     */
    public List getInputRequestsList() {
        return irList;
    }

    /**
     * Clears the input request list
     * 
     */
    public void clearInputRequestsList() {
        if (irList != null) {
           irList.clear();
        }
    }

    /**
     * Retrieves the input request map
     * 
     * @return inputrequest map
     */
    public Map getInputRequestMap() {
        return irMap;
    }

    /**
     * Returns the subrequests associated with this request
     * 
     * SubRequestWrapper
     * 
     * @return Collection of SubRequestWrapper
     */
    public Collection getSubRequests() {
        return requests;
    }

    /**
     * Returns the input map for the request
     * 
     * @return input map for request
     */
    public Map getInputMap () {
        return inputMap;
    }

    /**
     * Returns the Collection of DynamicRelationships
     * 
     * @return Collection of dynamic Relationships
     */
    public Collection getDynamicRelationships() {
        return dynamics;
    }

    public void setDynamicRelationships(Collection<DynamicRelationship> relations) {
       if (dynamics == null) dynamics = new ArrayList();
       dynamics.addAll(relations); 
    }
    /**
     * Adds a DynamicRelationship to the Request
     * 
     * @param relation DynamicRelationship to add to request
     */
    public void addDynamicRelationship(DynamicRelationship relation) {
        if (dynamics == null) dynamics = new ArrayList();
        dynamics.add(relation);
    }

    /**
     * Returns the output map for the request
     * 
     * @return output map for request
     */
    public Map getOutputMap() {
        return outputMap;
    }

    /**
     * Sets the output map for the request
     * 
     * @param output output map for request
     */
    public void setOutputMap(Map output) {
        outputMap = output;
    }

    /**
     * Adds input to the input map
     * 
     * @param key    key for input data
     * @param value  value for input data
     */
    public void addInput(Object key, Object value) {
        inputMap.put(key, value);
    }

    /**
     * Retrieves the output for from the output map for the given key
     * 
     * @param key    key of data to return
     * @return value of that data
     */
    public Object getOutput(Object key) {
        return outputMap.get(key);
    }
}
