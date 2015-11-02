/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanSubRequestParent.java
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
 * Abstract base class for all ServicePricingPlan related UdtSubRequestParents
 *
 */
public abstract class ServicePricingPlanSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceServicePricingPlanInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_ServicePricingPlan_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceServicePricingPlanInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_ServicePricingPlan_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ServicePricingPlanRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServicePricingPlanRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServicePricingPlanSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServicePricingPlanSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServicePricingPlanSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServicePricingPlanSubRequestParent(String id, String method) {
    super(id, "ServicePricingPlan", method);
  }
}
