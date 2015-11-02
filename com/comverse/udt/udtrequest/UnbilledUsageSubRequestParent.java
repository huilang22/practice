/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageSubRequestParent.java
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
 * Abstract base class for all UnbilledUsage related UdtSubRequestParents
 *
 */
public abstract class UnbilledUsageSubRequestParent extends UdtSubRequestParent {

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
 * Adds SelfRequest based on UnbilledUsageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnbilledUsageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UnbilledUsageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnbilledUsageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addUnbilledUsageAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "UnbilledUsage_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addUnbilledUsageAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "UnbilledUsage_Account_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addUnbilledUsageAdjustmentSubRequest(AdjustmentRequest subRequest) {
      addSubRequest(subRequest, "UnbilledUsage_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addUnbilledUsageAdjustmentSubRequest(AdjustmentSubRequestParent subRequest) {
      addSubRequest(subRequest, "UnbilledUsage_Adjustment_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addUnbilledUsageOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "UnbilledUsage_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addUnbilledUsageOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "UnbilledUsage_OrderedAccount_Ref");
    }

/**
 *
 * Constructor for UnbilledUsageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UnbilledUsageSubRequestParent(String id, String method) {
    super(id, "UnbilledUsage", method);
  }
}
