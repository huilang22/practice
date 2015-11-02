package com.csgsystems.udt;

import java.util.Collection;
import java.util.ArrayList;

/**
 * Abstract class that defines root udt request elements
 * 
 * @author Mark Brahler
 */
public abstract class UdtRootRequest implements Request {
    
    /**
     * List of subrequests
     */
    protected Collection requests = null;

    /**
     * Enforce subrequest relationship
     * if this is set to true, then UDT server will enforce data integrity among relationships
     */
    protected boolean enforceSubRequestRelationship = false;
    protected boolean enforceSubRequestRelationshipIsSet = false;

    /**
     * No argument constructor
     */
    public UdtRootRequest() {
        requests = new ArrayList();
    }

    /**
     * Returns all requests
     * 
     * @return requests
     */
    public Collection getRequests() {
        return requests;
    }

    /**
     * Adds collection of UdtRequests to UdtRootRequest
     *
     * @param requests
     */
    public void setRequests(Collection<UdtRequest> requestCollection) {
        requests.addAll(requestCollection);
    }

   /**
    *
    * Adds a UdtRequest to the UdtRootRequest
    * @param request request to add
    *
    */
      
    public void addUdtRequest(UdtRequest request) {
        requests.add(request);
    }

    /**
     * sets the enforceSubRequestRelationship flag to enforce data integrity amoung
     * sub requests. (sets and sends the request to the middle ware whether it is set
     * to true or false. Unsets does not send the information to the UDT server
     */
    public void setEnforceSubRequestRelationship(boolean enforceSubRequestRelationship) {
        this.enforceSubRequestRelationship = enforceSubRequestRelationship;
        this.enforceSubRequestRelationshipIsSet = true;
    }

    /**
     * unsets the enforceSubRequestRelationship flag to enforce data integrity amoung
     * sub requests. Once this is unset, this information will not be sent to the middleware
     */
    public void unsetEnforceSubRequestRelationship() {
        this.enforceSubRequestRelationshipIsSet = false;
    }

    /**
     * gets the enforceSubRequestRelationship flag 
     * @returns if enforceSubRequestRelationship is set or not
     */
    public boolean isEnforceSubRequestRelationshipIsSet() {
        return enforceSubRequestRelationshipIsSet;
    }

    /**
     * gets the enforceSubRequestRelationship flag 
     */
    public boolean getEnforceSubRequestRelationship() {
        return this.enforceSubRequestRelationship;
    }
}
