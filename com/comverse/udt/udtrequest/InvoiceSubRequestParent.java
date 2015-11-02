/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceSubRequestParent.java
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
 * Abstract base class for all Invoice related UdtSubRequestParents
 *
 */
public abstract class InvoiceSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountInvoiceInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountBonusPointTransactionSubRequestParent as an InputRequest
 * @param inputRequest AccountBonusPointTransactionSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBonusPointTransactionInvoiceInputRequest(AccountBonusPointTransactionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBonusPointTransaction_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AdjustmentSubRequestParent as an InputRequest
 * @param inputRequest AdjustmentSubRequestParent to add as InputRequest
 *
 */
    public void addAdjustmentBilledInvoiceInputRequest(AdjustmentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Adjustment_Billed_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AdjustmentSubRequestParent as an InputRequest
 * @param inputRequest AdjustmentSubRequestParent to add as InputRequest
 *
 */
    public void addAdjustmentSourceInvoiceInputRequest(AdjustmentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Adjustment_Source_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BalanceLineItemSubRequestParent as an InputRequest
 * @param inputRequest BalanceLineItemSubRequestParent to add as InputRequest
 *
 */
    public void addBalanceLineItemInvoiceInputRequest(BalanceLineItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BalanceLineItem_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BillImageSubRequestParent as an InputRequest
 * @param inputRequest BillImageSubRequestParent to add as InputRequest
 *
 */
    public void addBillImageInvoiceInputRequest(BillImageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BillImage_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BilledUsageSubRequestParent as an InputRequest
 * @param inputRequest BilledUsageSubRequestParent to add as InputRequest
 *
 */
    public void addBilledUsageInvoiceInputRequest(BilledUsageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BilledUsage_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CollectableSubRequestParent as an InputRequest
 * @param inputRequest CollectableSubRequestParent to add as InputRequest
 *
 */
    public void addCollectableInvoiceInputRequest(CollectableSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Collectable_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  EftTransactionSubRequestParent as an InputRequest
 * @param inputRequest EftTransactionSubRequestParent to add as InputRequest
 *
 */
    public void addEftTransactionInvoiceInputRequest(EftTransactionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "EftTransaction_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InterimBillSubRequestParent as an InputRequest
 * @param inputRequest InterimBillSubRequestParent to add as InputRequest
 *
 */
    public void addInterimBillInvoiceInputRequest(InterimBillSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InterimBill_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceDetailSubRequestParent as an InputRequest
 * @param inputRequest InvoiceDetailSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceDetailInvoiceInputRequest(InvoiceDetailSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvoiceDetail_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountInvoiceInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentSubRequestParent as an InputRequest
 * @param inputRequest PaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentAppliedInvoiceInputRequest(PaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Payment_Applied_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentSubRequestParent as an InputRequest
 * @param inputRequest PaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentInvoiceInputRequest(PaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Payment_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentDistributionSubRequestParent as an InputRequest
 * @param inputRequest PaymentDistributionSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentDistributionInvoiceInputRequest(PaymentDistributionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "PaymentDistribution_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentDistributionSubRequestParent as an InputRequest
 * @param inputRequest PaymentDistributionSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentDistributionSourceInvoiceInputRequest(PaymentDistributionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "PaymentDistribution_Source_Invoice_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PrepaymentSubRequestParent as an InputRequest
 * @param inputRequest PrepaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPrepaymentInvoiceInputRequest(PrepaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Prepayment_Invoice_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on InvoiceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvoiceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvoiceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvoiceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInvoiceAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Invoice_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInvoiceAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_Account_Ref");
    }
/**
 *
 * Adds a AccountBonusPointTransactionRequest sub request
 * @param subRequest AccountBonusPointTransactionRequest
 *
 */
    public void addInvoiceAccountBonusPointTransactionSubRequest(AccountBonusPointTransactionRequest subRequest) {
      addSubRequest(subRequest, "Invoice_AccountBonusPointTransaction_Ref");
    }
/**
 *
 * Adds a AccountBonusPointTransactionRequest sub request
 * @param subRequest AccountBonusPointTransactionRequest
 *
 */
    public void addInvoiceAccountBonusPointTransactionSubRequest(AccountBonusPointTransactionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_AccountBonusPointTransaction_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addInvoiceAdjustmentSubRequest(AdjustmentRequest subRequest) {
      addSubRequest(subRequest, "Invoice_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addInvoiceAdjustmentSubRequest(AdjustmentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addInvoiceBilledAdjustmentSubRequest(AdjustmentRequest subRequest) {
      addSubRequest(subRequest, "Invoice_Billed_Adjustment_Ref");
    }
/**
 *
 * Adds a AdjustmentRequest sub request
 * @param subRequest AdjustmentRequest
 *
 */
    public void addInvoiceBilledAdjustmentSubRequest(AdjustmentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_Billed_Adjustment_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addInvoiceBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "Invoice_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addInvoiceBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BillImageRequest sub request
 * @param subRequest BillImageRequest
 *
 */
    public void addInvoiceBillImageSubRequest(BillImageRequest subRequest) {
      addSubRequest(subRequest, "Invoice_BillImage_Ref");
    }
/**
 *
 * Adds a BillImageRequest sub request
 * @param subRequest BillImageRequest
 *
 */
    public void addInvoiceBillImageSubRequest(BillImageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_BillImage_Ref");
    }
/**
 *
 * Adds a BillImagePageRequest sub request
 * @param subRequest BillImagePageRequest
 *
 */
    public void addInvoiceBillImagePageSubRequest(BillImagePageRequest subRequest) {
      addSubRequest(subRequest, "Invoice_BillImagePage_Ref");
    }
/**
 *
 * Adds a BillImagePageRequest sub request
 * @param subRequest BillImagePageRequest
 *
 */
    public void addInvoiceBillImagePageSubRequest(BillImagePageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_BillImagePage_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addInvoiceBilledUsageSubRequest(BilledUsageRequest subRequest) {
      addSubRequest(subRequest, "Invoice_BilledUsage_Ref");
    }
/**
 *
 * Adds a BilledUsageRequest sub request
 * @param subRequest BilledUsageRequest
 *
 */
    public void addInvoiceBilledUsageSubRequest(BilledUsageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_BilledUsage_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addInvoiceCollectableSubRequest(CollectableRequest subRequest) {
      addSubRequest(subRequest, "Invoice_Collectable_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addInvoiceCollectableSubRequest(CollectableSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_Collectable_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addInvoiceEftTransactionSubRequest(EftTransactionRequest subRequest) {
      addSubRequest(subRequest, "Invoice_EftTransaction_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addInvoiceEftTransactionSubRequest(EftTransactionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_EftTransaction_Ref");
    }
/**
 *
 * Adds a InterimBillRequest sub request
 * @param subRequest InterimBillRequest
 *
 */
    public void addInvoiceInterimBillSubRequest(InterimBillRequest subRequest) {
      addSubRequest(subRequest, "Invoice_InterimBill_Ref");
    }
/**
 *
 * Adds a InterimBillRequest sub request
 * @param subRequest InterimBillRequest
 *
 */
    public void addInvoiceInterimBillSubRequest(InterimBillSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_InterimBill_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addInvoiceInvoiceDetailSubRequest(InvoiceDetailRequest subRequest) {
      addSubRequest(subRequest, "Invoice_InvoiceDetail_Ref");
    }
/**
 *
 * Adds a InvoiceDetailRequest sub request
 * @param subRequest InvoiceDetailRequest
 *
 */
    public void addInvoiceInvoiceDetailSubRequest(InvoiceDetailSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_InvoiceDetail_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInvoiceOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Invoice_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInvoiceOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_OrderedAccount_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addInvoicePaymentAppliedSubRequest(PaymentRequest subRequest) {
      addSubRequest(subRequest, "Invoice_Payment_Applied_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addInvoicePaymentAppliedSubRequest(PaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_Payment_Applied_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addInvoicePaymentSubRequest(PaymentRequest subRequest) {
      addSubRequest(subRequest, "Invoice_Payment_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addInvoicePaymentSubRequest(PaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_Payment_Ref");
    }
/**
 *
 * Adds a PaymentDistributionRequest sub request
 * @param subRequest PaymentDistributionRequest
 *
 */
    public void addInvoicePaymentDistributionAppliedSubRequest(PaymentDistributionRequest subRequest) {
      addSubRequest(subRequest, "Invoice_PaymentDistribution_Applied_Ref");
    }
/**
 *
 * Adds a PaymentDistributionRequest sub request
 * @param subRequest PaymentDistributionRequest
 *
 */
    public void addInvoicePaymentDistributionAppliedSubRequest(PaymentDistributionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_PaymentDistribution_Applied_Ref");
    }
/**
 *
 * Adds a PaymentDistributionRequest sub request
 * @param subRequest PaymentDistributionRequest
 *
 */
    public void addInvoicePaymentDistributionSubRequest(PaymentDistributionRequest subRequest) {
      addSubRequest(subRequest, "Invoice_PaymentDistribution_Ref");
    }
/**
 *
 * Adds a PaymentDistributionRequest sub request
 * @param subRequest PaymentDistributionRequest
 *
 */
    public void addInvoicePaymentDistributionSubRequest(PaymentDistributionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_PaymentDistribution_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addInvoicePrepaymentSubRequest(PrepaymentRequest subRequest) {
      addSubRequest(subRequest, "Invoice_Prepayment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addInvoicePrepaymentSubRequest(PrepaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Invoice_Prepayment_Ref");
    }

/**
 *
 * Constructor for InvoiceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvoiceSubRequestParent(String id, String method) {
    super(id, "Invoice", method);
  }
}
