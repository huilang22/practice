/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageSubRequestParent.java
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
 * Abstract base class for all BilledUsage related UdtSubRequestParents
 *
 */
public abstract class BilledUsageSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AdjustmentSubRequestParent as an InputRequest
 * @param inputRequest AdjustmentSubRequestParent to add as InputRequest
 *
 */
    public void addAdjustmentSourceBilledUsageInputRequest(AdjustmentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Adjustment_Source_BilledUsage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BalanceLineItemSubRequestParent as an InputRequest
 * @param inputRequest BalanceLineItemSubRequestParent to add as InputRequest
 *
 */
    public void addBalanceLineItemBilledUsageInputRequest(BalanceLineItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BalanceLineItem_BilledUsage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceBilledUsageInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_BilledUsage_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceDetailSubRequestParent as an InputRequest
 * @param inputRequest InvoiceDetailSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceDetailBilledUsageInputRequest(InvoiceDetailSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvoiceDetail_BilledUsage_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on BilledUsageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BilledUsageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BilledUsageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BilledUsageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addBilledUsageAdjustmentSubRequest(AdjustmentRequest subRequest) {
      addSubRequest(subRequest, "BilledUsage_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addBilledUsageAdjustmentSubRequest(AdjustmentSubRequestParent subRequest) {
      addSubRequest(subRequest, "BilledUsage_Adjustment_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addBilledUsageBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "BilledUsage_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addBilledUsageBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "BilledUsage_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addBilledUsageInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "BilledUsage_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addBilledUsageInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "BilledUsage_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addBilledUsageInvoiceDetailSubRequest(InvoiceDetailRequest subRequest) {
      addSubRequest(subRequest, "BilledUsage_InvoiceDetail_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addBilledUsageInvoiceDetailSubRequest(InvoiceDetailSubRequestParent subRequest) {
      addSubRequest(subRequest, "BilledUsage_InvoiceDetail_Ref");
    }

/**
 *
 * Constructor for BilledUsageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BilledUsageSubRequestParent(String id, String method) {
    super(id, "BilledUsage", method);
  }
}
