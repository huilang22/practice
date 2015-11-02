/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateSubRequestParent.java
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
 * Abstract base class for all OverrideUsageCreditRate related UdtSubRequestParents
 *
 */
public abstract class OverrideUsageCreditRateSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractOverrideUsageCreditRateInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_OverrideUsageCreditRate_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractOverrideUsageCreditRateInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_OverrideUsageCreditRate_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OverrideUsageCreditRateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OverrideUsageCreditRateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OverrideUsageCreditRateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OverrideUsageCreditRateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOverrideUsageCreditRateCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "OverrideUsageCreditRate_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOverrideUsageCreditRateCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OverrideUsageCreditRate_CustomerContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOverrideUsageCreditRateOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "OverrideUsageCreditRate_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOverrideUsageCreditRateOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OverrideUsageCreditRate_OrderedContract_Ref");
    }

/**
 *
 * Constructor for OverrideUsageCreditRateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OverrideUsageCreditRateSubRequestParent(String id, String method) {
    super(id, "OverrideUsageCreditRate", method);
  }
}
