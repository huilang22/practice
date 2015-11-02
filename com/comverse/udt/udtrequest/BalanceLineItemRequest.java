/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BalanceLineItem related UdtRequests
 *
 */

public abstract class BalanceLineItemRequest extends UdtRequest {

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
 * Constructor for BalanceLineItemRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BalanceLineItemRequest(String id, String method) {
    super(id, "BalanceLineItem", method);
  }
}
