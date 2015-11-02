/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefinancePlanSubRequestParent.java
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
 * Abstract base class for all RefinancePlan related UdtSubRequestParents
 *
 */
public abstract class RefinancePlanSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AdjustmentSubRequestParent as an InputRequest
 * @param inputRequest AdjustmentSubRequestParent to add as InputRequest
 *
 */
    public void addAdjustmentRefinancePlanInputRequest(AdjustmentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Adjustment_RefinancePlan_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BalanceLineItemSubRequestParent as an InputRequest
 * @param inputRequest BalanceLineItemSubRequestParent to add as InputRequest
 *
 */
    public void addBalanceLineItemRefinancePlanInputRequest(BalanceLineItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BalanceLineItem_RefinancePlan_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcRefinancePlanInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_RefinancePlan_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcRefinancePlanInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_RefinancePlan_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on RefinancePlanRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RefinancePlanRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RefinancePlanSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RefinancePlanSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addRefinancePlanAdjustmentSubRequest(AdjustmentRequest subRequest) {
      addSubRequest(subRequest, "RefinancePlan_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addRefinancePlanAdjustmentSubRequest(AdjustmentSubRequestParent subRequest) {
      addSubRequest(subRequest, "RefinancePlan_Adjustment_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addRefinancePlanBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "RefinancePlan_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addRefinancePlanBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "RefinancePlan_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addRefinancePlanNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "RefinancePlan_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addRefinancePlanNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "RefinancePlan_Nrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addRefinancePlanOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "RefinancePlan_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addRefinancePlanOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "RefinancePlan_OrderedNrc_Ref");
    }

/**
 *
 * Constructor for RefinancePlanSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RefinancePlanSubRequestParent(String id, String method) {
    super(id, "RefinancePlan", method);
  }
}
