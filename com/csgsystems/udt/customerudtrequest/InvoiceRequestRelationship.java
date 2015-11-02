/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class InvoiceRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private InvoiceRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Invoice_Account_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__ACCOUNT__REF = new InvoiceRequestRelationship("Invoice_Account_Ref");
  /** Variable representing the Invoice_AccountBonusPointTransaction_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__ACCOUNT_BONUS_POINT_TRANSACTION__REF = new InvoiceRequestRelationship("Invoice_AccountBonusPointTransaction_Ref");
  /** Variable representing the Invoice_Adjustment_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__ADJUSTMENT__REF = new InvoiceRequestRelationship("Invoice_Adjustment_Ref");
  /** Variable representing the Invoice_Billed_Adjustment_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__BILLED__ADJUSTMENT__REF = new InvoiceRequestRelationship("Invoice_Billed_Adjustment_Ref");
  /** Variable representing the Invoice_BalanceLineItem_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__BALANCE_LINE_ITEM__REF = new InvoiceRequestRelationship("Invoice_BalanceLineItem_Ref");
  /** Variable representing the Invoice_BillImage_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__BILL_IMAGE__REF = new InvoiceRequestRelationship("Invoice_BillImage_Ref");
  /** Variable representing the Invoice_BillImagePage_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__BILL_IMAGE_PAGE__REF = new InvoiceRequestRelationship("Invoice_BillImagePage_Ref");
  /** Variable representing the Invoice_BilledUsage_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__BILLED_USAGE__REF = new InvoiceRequestRelationship("Invoice_BilledUsage_Ref");
  /** Variable representing the Invoice_Collectable_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__COLLECTABLE__REF = new InvoiceRequestRelationship("Invoice_Collectable_Ref");
  /** Variable representing the Invoice_EftTransaction_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__EFT_TRANSACTION__REF = new InvoiceRequestRelationship("Invoice_EftTransaction_Ref");
  /** Variable representing the Invoice_InterimBill_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__INTERIM_BILL__REF = new InvoiceRequestRelationship("Invoice_InterimBill_Ref");
  /** Variable representing the Invoice_InvoiceDetail_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__INVOICE_DETAIL__REF = new InvoiceRequestRelationship("Invoice_InvoiceDetail_Ref");
  /** Variable representing the Invoice_OrderedAccount_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__ORDERED_ACCOUNT__REF = new InvoiceRequestRelationship("Invoice_OrderedAccount_Ref");
  /** Variable representing the Invoice_Payment_Applied_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__PAYMENT__APPLIED__REF = new InvoiceRequestRelationship("Invoice_Payment_Applied_Ref");
  /** Variable representing the Invoice_Payment_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__PAYMENT__REF = new InvoiceRequestRelationship("Invoice_Payment_Ref");
  /** Variable representing the Invoice_PaymentDistribution_Applied_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__PAYMENT_DISTRIBUTION__APPLIED__REF = new InvoiceRequestRelationship("Invoice_PaymentDistribution_Applied_Ref");
  /** Variable representing the Invoice_PaymentDistribution_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__PAYMENT_DISTRIBUTION__REF = new InvoiceRequestRelationship("Invoice_PaymentDistribution_Ref");
  /** Variable representing the Invoice_Prepayment_Ref relationship */
  public static final InvoiceRequestRelationship INVOICE__PREPAYMENT__REF = new InvoiceRequestRelationship("Invoice_Prepayment_Ref");
}
