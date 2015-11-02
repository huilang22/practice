package com.csgsystems.udt;

public class InputRequest implements Request {

    private String requestId = null;
    private String relationshipId = null;

    public InputRequest (String request, UdtRelationship relationship) {
        requestId = request;
        relationshipId = relationship.getRelationship();
    }

    public String getRequestId () {
        return requestId;
    }

    public String getRelationshipId () {
        return relationshipId;
    }
    /**
     * String representation of the object
     * 
     * @return object as String
     */
    public String toString() {
        return this.getClass().getName() + " requestId = "+requestId+" relationshipId "+relationshipId;
    }

    /**
     * Returns the hashCode of the object
     * 
     * @return hashCode of the object
     */
    public int hashCode() {
        int i = 0;
        if (requestId != null) {
            i = i + requestId.hashCode();
        }
        if (relationshipId != null) {
            i = i + relationshipId.hashCode();
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
            if (obj instanceof InputRequest) {
                InputRequest val = (InputRequest)obj;
                String inreq = val.getRequestId();
                String inrel = val.getRelationshipId();
                if (((this.relationshipId != null && this.relationshipId.equals(inrel)) || (this.relationshipId == null && inrel == null)) &&
                    ((this.requestId != null && this.requestId.equals(inreq)) || (this.requestId == null && inreq == null))) {
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
