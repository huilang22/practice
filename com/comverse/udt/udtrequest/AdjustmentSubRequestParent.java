/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentSubRequestParent.java
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
 * Abstract base class for all Adjustment related UdtSubRequestParents
 *
 */
public abstract class AdjustmentSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  BalanceLineItemSubRequestParent as an InputRequest
 * @param inputRequest BalanceLineItemSubRequestParent to add as InputRequest
 *
 */
    public void addBalanceLineItemAdjustmentInputRequest(BalanceLineItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BalanceLineItem_Adjustment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BilledUsageSubRequestParent as an InputRequest
 * @param inputRequest BilledUsageSubRequestParent to add as InputRequest
 *
 */
    public void addBilledUsageAdjustmentInputRequest(BilledUsageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BilledUsage_Adjustment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceAdjustmentInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_Adjustment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceBilledAdjustmentInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_Billed_Adjustment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceDetailSubRequestParent as an InputRequest
 * @param inputRequest InvoiceDetailSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceDetailAdjustmentInputRequest(InvoiceDetailSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvoiceDetail_Adjustment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  RefinancePlanSubRequestParent as an InputRequest
 * @param inputRequest RefinancePlanSubRequestParent to add as InputRequest
 *
 */
    public void addRefinancePlanAdjustmentInputRequest(RefinancePlanSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "RefinancePlan_Adjustment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  UnbilledUsageSubRequestParent as an InputRequest
 * @param inputRequest UnbilledUsageSubRequestParent to add as InputRequest
 *
 */
    public void addUnbilledUsageAdjustmentInputRequest(UnbilledUsageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "UnbilledUsage_Adjustment_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on AdjustmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AdjustmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addAdjustmentSourceBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addAdjustmentSourceBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addAdjustmentSourceBilledUsageSubRequest(BilledUsageRequest subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_BilledUsage_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addAdjustmentSourceBilledUsageSubRequest(BilledUsageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_BilledUsage_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAdjustmentBilledInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "Adjustment_Billed_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAdjustmentBilledInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Adjustment_Billed_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAdjustmentSourceInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAdjustmentSourceInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addAdjustmentSourceInvoiceDetailSubRequest(InvoiceDetailRequest subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_InvoiceDetail_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addAdjustmentSourceInvoiceDetailSubRequest(InvoiceDetailSubRequestParent subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_InvoiceDetail_Ref");
    }
/**
 *
 * Adds a RefinancePlanRequest sub request
 * @param subRequest RefinancePlanRequest
 *
 */
    public void addAdjustmentRefinancePlanSubRequest(RefinancePlanRequest subRequest) {
      addSubRequest(subRequest, "Adjustment_RefinancePlan_Ref");
    }
/**
 *
 * Adds a RefinancePlanRequest sub request
 * @param subRequest RefinancePlanRequest
 *
 */
    public void addAdjustmentRefinancePlanSubRequest(RefinancePlanSubRequestParent subRequest) {
      addSubRequest(subRequest, "Adjustment_RefinancePlan_Ref");
    }
/**
 *
 * Adds a UnbilledUsageRequest sub request
 * @param subRequest UnbilledUsageRequest
 *
 */
    public void addAdjustmentSourceUnbilledUsageSubRequest(UnbilledUsageRequest subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_UnbilledUsage_Ref");
    }
/**
 *
 * Adds a UnbilledUsageRequest sub request
 * @param subRequest UnbilledUsageRequest
 *
 */
    public void addAdjustmentSourceUnbilledUsageSubRequest(UnbilledUsageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Adjustment_Source_UnbilledUsage_Ref");
    }

/**
 *
 * Constructor for AdjustmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AdjustmentSubRequestParent(String id, String method) {
    super(id, "Adjustment", method);
  }
}
