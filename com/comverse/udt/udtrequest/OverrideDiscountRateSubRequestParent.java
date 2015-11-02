/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateSubRequestParent.java
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
 * Abstract base class for all OverrideDiscountRate related UdtSubRequestParents
 *
 */
public abstract class OverrideDiscountRateSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractOverrideDiscountRateInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_OverrideDiscountRate_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractOverrideDiscountRateInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_OverrideDiscountRate_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OverrideDiscountRateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OverrideDiscountRateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OverrideDiscountRateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OverrideDiscountRateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOverrideDiscountRateCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "OverrideDiscountRate_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOverrideDiscountRateCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OverrideDiscountRate_CustomerContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOverrideDiscountRateOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "OverrideDiscountRate_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOverrideDiscountRateOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OverrideDiscountRate_OrderedContract_Ref");
    }

/**
 *
 * Constructor for OverrideDiscountRateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OverrideDiscountRateSubRequestParent(String id, String method) {
    super(id, "OverrideDiscountRate", method);
  }
}
