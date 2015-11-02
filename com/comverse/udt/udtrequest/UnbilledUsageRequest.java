/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UnbilledUsage related UdtRequests
 *
 */

public abstract class UnbilledUsageRequest extends UdtRequest {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountUnbilledUsageInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_UnbilledUsage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AdjustmentSubRequestParent as an InputRequest
 * @param inputRequest AdjustmentSubRequestParent to add as InputRequest
 *
 */
    public void addAdjustmentSourceUnbilledUsageInputRequest(AdjustmentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Adjustment_Source_UnbilledUsage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountUnbilledUsageInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_UnbilledUsage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for UnbilledUsageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UnbilledUsageRequest(String id, String method) {
    super(id, "UnbilledUsage", method);
  }
}
