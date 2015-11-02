/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OverrideUsageCreditRate related UdtRequests
 *
 */

public abstract class OverrideUsageCreditRateRequest extends UdtRequest {

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
 * Constructor for OverrideUsageCreditRateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OverrideUsageCreditRateRequest(String id, String method) {
    super(id, "OverrideUsageCreditRate", method);
  }
}
