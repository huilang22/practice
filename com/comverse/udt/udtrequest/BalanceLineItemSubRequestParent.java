/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemSubRequestParent.java
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
 * Abstract base class for all BalanceLineItem related UdtSubRequestParents
 *
 */
public abstract class BalanceLineItemSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AdjustmentSubRequestParent as an InputRequest
 * @param inputRequest AdjustmentSubRequestParent to add as InputRequest
 *
 */
    public void addAdjustmentSourceBalanceLineItemInputRequest(AdjustmentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Adjustment_Source_BalanceLineItem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BilledUsageSubRequestParent as an InputRequest
 * @param inputRequest BilledUsageSubRequestParent to add as InputRequest
 *
 */
    public void addBilledUsageBalanceLineItemInputRequest(BilledUsageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BilledUsage_BalanceLineItem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CollectableSubRequestParent as an InputRequest
 * @param inputRequest CollectableSubRequestParent to add as InputRequest
 *
 */
    public void addCollectableBalanceLineItemInputRequest(CollectableSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Collectable_BalanceLineItem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceBalanceLineItemInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_BalanceLineItem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceDetailSubRequestParent as an InputRequest
 * @param inputRequest InvoiceDetailSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceDetailBalanceLineItemInputRequest(InvoiceDetailSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvoiceDetail_BalanceLineItem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentDistributionSubRequestParent as an InputRequest
 * @param inputRequest PaymentDistributionSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentDistributionBalanceLineItemInputRequest(PaymentDistributionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "PaymentDistribution_BalanceLineItem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentDistributionSubRequestParent as an InputRequest
 * @param inputRequest PaymentDistributionSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentDistributionSourceBalanceLineItemInputRequest(PaymentDistributionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "PaymentDistribution_Source_BalanceLineItem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  RefinancePlanSubRequestParent as an InputRequest
 * @param inputRequest RefinancePlanSubRequestParent to add as InputRequest
 *
 */
    public void addRefinancePlanBalanceLineItemInputRequest(RefinancePlanSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "RefinancePlan_BalanceLineItem_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on BalanceLineItemRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BalanceLineItemRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BalanceLineItemSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BalanceLineItemSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addBalanceLineItemAdjustmentSubRequest(AdjustmentRequest subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addBalanceLineItemAdjustmentSubRequest(AdjustmentSubRequestParent subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_Adjustment_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addBalanceLineItemBilledUsageSubRequest(BilledUsageRequest subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_BilledUsage_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addBalanceLineItemBilledUsageSubRequest(BilledUsageSubRequestParent subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_BilledUsage_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addBalanceLineItemCollectableSubRequest(CollectableRequest subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_Collectable_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addBalanceLineItemCollectableSubRequest(CollectableSubRequestParent subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_Collectable_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addBalanceLineItemInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addBalanceLineItemInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addBalanceLineItemInvoiceDetailSubRequest(InvoiceDetailRequest subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_InvoiceDetail_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addBalanceLineItemInvoiceDetailSubRequest(InvoiceDetailSubRequestParent subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_InvoiceDetail_Ref");
    }
/**
 *
 * Adds a PaymentDistributionRequest sub request
 * @param subRequest PaymentDistributionRequest
 *
 */
    public void addBalanceLineItemPaymentDistributionSubRequest(PaymentDistributionRequest subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_PaymentDistribution_Ref");
    }
/**
 *
 * Adds a PaymentDistributionRequest sub request
 * @param subRequest PaymentDistributionRequest
 *
 */
    public void addBalanceLineItemPaymentDistributionSubRequest(PaymentDistributionSubRequestParent subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_PaymentDistribution_Ref");
    }
/**
 *
 * Adds a RefinancePlanRequest sub request
 * @param subRequest RefinancePlanRequest
 *
 */
    public void addBalanceLineItemRefinancePlanSubRequest(RefinancePlanRequest subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_RefinancePlan_Ref");
    }
/**
 *
 * Adds a RefinancePlanRequest sub request
 * @param subRequest RefinancePlanRequest
 *
 */
    public void addBalanceLineItemRefinancePlanSubRequest(RefinancePlanSubRequestParent subRequest) {
      addSubRequest(subRequest, "BalanceLineItem_RefinancePlan_Ref");
    }

/**
 *
 * Constructor for BalanceLineItemSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BalanceLineItemSubRequestParent(String id, String method) {
    super(id, "BalanceLineItem", method);
  }
}
