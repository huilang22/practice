/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailSubRequestParent.java
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
 * Abstract base class for all InvoiceDetail related UdtSubRequestParents
 *
 */
public abstract class InvoiceDetailSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AdjustmentSubRequestParent as an InputRequest
 * @param inputRequest AdjustmentSubRequestParent to add as InputRequest
 *
 */
    public void addAdjustmentSourceInvoiceDetailInputRequest(AdjustmentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Adjustment_Source_InvoiceDetail_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BalanceLineItemSubRequestParent as an InputRequest
 * @param inputRequest BalanceLineItemSubRequestParent to add as InputRequest
 *
 */
    public void addBalanceLineItemInvoiceDetailInputRequest(BalanceLineItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BalanceLineItem_InvoiceDetail_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BilledUsageSubRequestParent as an InputRequest
 * @param inputRequest BilledUsageSubRequestParent to add as InputRequest
 *
 */
    public void addBilledUsageInvoiceDetailInputRequest(BilledUsageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BilledUsage_InvoiceDetail_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceInvoiceDetailInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_InvoiceDetail_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on InvoiceDetailRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvoiceDetailRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvoiceDetailSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvoiceDetailSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addInvoiceDetailAdjustmentSubRequest(AdjustmentRequest subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addInvoiceDetailAdjustmentSubRequest(AdjustmentSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_Adjustment_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addInvoiceDetailBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addInvoiceDetailBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addInvoiceDetailBilledUsageSubRequest(BilledUsageRequest subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_BilledUsage_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addInvoiceDetailBilledUsageSubRequest(BilledUsageSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_BilledUsage_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addInvoiceDetailInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addInvoiceDetailInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvoiceDetail_Invoice_Ref");
    }

/**
 *
 * Constructor for InvoiceDetailSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvoiceDetailSubRequestParent(String id, String method) {
    super(id, "InvoiceDetail", method);
  }
}
