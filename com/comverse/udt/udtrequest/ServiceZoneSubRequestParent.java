/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceZone related UdtSubRequestParents
 *
 */
public abstract class ServiceZoneSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceServiceZoneInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_ServiceZone_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceServiceZoneInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_ServiceZone_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ServiceZoneRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceZoneRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceZoneSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceZoneSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addServiceZoneOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "ServiceZone_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addServiceZoneOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceZone_OrderedService_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addServiceZoneServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "ServiceZone_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addServiceZoneServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceZone_Service_Ref");
    }

/**
 *
 * Constructor for ServiceZoneSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceZoneSubRequestParent(String id, String method) {
    super(id, "ServiceZone", method);
  }
}
