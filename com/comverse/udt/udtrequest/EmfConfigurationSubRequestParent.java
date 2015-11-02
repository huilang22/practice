/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationSubRequestParent.java
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
 * Abstract base class for all EmfConfiguration related UdtSubRequestParents
 *
 */
public abstract class EmfConfigurationSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceEmfConfigurationInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_EmfConfiguration_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceEmfConfigurationInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_EmfConfiguration_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on EmfConfigurationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EmfConfigurationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EmfConfigurationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EmfConfigurationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addEmfConfigurationOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "EmfConfiguration_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addEmfConfigurationOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "EmfConfiguration_OrderedService_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addEmfConfigurationServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "EmfConfiguration_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addEmfConfigurationServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "EmfConfiguration_Service_Ref");
    }

/**
 *
 * Constructor for EmfConfigurationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EmfConfigurationSubRequestParent(String id, String method) {
    super(id, "EmfConfiguration", method);
  }
}
