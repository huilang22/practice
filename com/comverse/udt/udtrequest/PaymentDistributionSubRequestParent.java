/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionSubRequestParent.java
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
 * Abstract base class for all PaymentDistribution related UdtSubRequestParents
 *
 */
public abstract class PaymentDistributionSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  BalanceLineItemSubRequestParent as an InputRequest
 * @param inputRequest BalanceLineItemSubRequestParent to add as InputRequest
 *
 */
    public void addBalanceLineItemPaymentDistributionInputRequest(BalanceLineItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BalanceLineItem_PaymentDistribution_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoicePaymentDistributionAppliedInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_PaymentDistribution_Applied_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoicePaymentDistributionInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_PaymentDistribution_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentSubRequestParent as an InputRequest
 * @param inputRequest PaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentPaymentDistributionInputRequest(PaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Payment_PaymentDistribution_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on PaymentDistributionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentDistributionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PaymentDistributionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentDistributionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addPaymentDistributionBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addPaymentDistributionBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addPaymentDistributionSourceBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Source_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addPaymentDistributionSourceBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Source_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addPaymentDistributionInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addPaymentDistributionInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addPaymentDistributionSourceInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Source_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addPaymentDistributionSourceInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Source_Invoice_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addPaymentDistributionPaymentSubRequest(PaymentRequest subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Payment_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addPaymentDistributionPaymentSubRequest(PaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "PaymentDistribution_Payment_Ref");
    }

/**
 *
 * Constructor for PaymentDistributionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PaymentDistributionSubRequestParent(String id, String method) {
    super(id, "PaymentDistribution", method);
  }
}
