/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusSubRequestParent.java
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
 * Abstract base class for all ServiceStatus related UdtSubRequestParents
 *
 */
public abstract class ServiceStatusSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceServiceStatusInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_ServiceStatus_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceServiceStatusInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_ServiceStatus_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ServiceStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addServiceStatusOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "ServiceStatus_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addServiceStatusOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceStatus_OrderedService_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addServiceStatusServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "ServiceStatus_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addServiceStatusServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceStatus_Service_Ref");
    }

/**
 *
 * Constructor for ServiceStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceStatusSubRequestParent(String id, String method) {
    super(id, "ServiceStatus", method);
  }
}
