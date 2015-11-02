/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class BalanceLineItemRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private BalanceLineItemRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the BalanceLineItem_Adjustment_Ref relationship */
  public static final BalanceLineItemRequestRelationship BALANCE_LINE_ITEM__ADJUSTMENT__REF = new BalanceLineItemRequestRelationship("BalanceLineItem_Adjustment_Ref");
  /** Variable representing the BalanceLineItem_BilledUsage_Ref relationship */
  public static final BalanceLineItemRequestRelationship BALANCE_LINE_ITEM__BILLED_USAGE__REF = new BalanceLineItemRequestRelationship("BalanceLineItem_BilledUsage_Ref");
  /** Variable representing the BalanceLineItem_Collectable_Ref relationship */
  public static final BalanceLineItemRequestRelationship BALANCE_LINE_ITEM__COLLECTABLE__REF = new BalanceLineItemRequestRelationship("BalanceLineItem_Collectable_Ref");
  /** Variable representing the BalanceLineItem_Invoice_Ref relationship */
  public static final BalanceLineItemRequestRelationship BALANCE_LINE_ITEM__INVOICE__REF = new BalanceLineItemRequestRelationship("BalanceLineItem_Invoice_Ref");
  /** Variable representing the BalanceLineItem_InvoiceDetail_Ref relationship */
  public static final BalanceLineItemRequestRelationship BALANCE_LINE_ITEM__INVOICE_DETAIL__REF = new BalanceLineItemRequestRelationship("BalanceLineItem_InvoiceDetail_Ref");
  /** Variable representing the BalanceLineItem_PaymentDistribution_Ref relationship */
  public static final BalanceLineItemRequestRelationship BALANCE_LINE_ITEM__PAYMENT_DISTRIBUTION__REF = new BalanceLineItemRequestRelationship("BalanceLineItem_PaymentDistribution_Ref");
  /** Variable representing the BalanceLineItem_RefinancePlan_Ref relationship */
  public static final BalanceLineItemRequestRelationship BALANCE_LINE_ITEM__REFINANCE_PLAN__REF = new BalanceLineItemRequestRelationship("BalanceLineItem_RefinancePlan_Ref");
}
