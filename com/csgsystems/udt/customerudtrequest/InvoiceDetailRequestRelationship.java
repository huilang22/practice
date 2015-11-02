/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class InvoiceDetailRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private InvoiceDetailRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the InvoiceDetail_Adjustment_Ref relationship */
  public static final InvoiceDetailRequestRelationship INVOICE_DETAIL__ADJUSTMENT__REF = new InvoiceDetailRequestRelationship("InvoiceDetail_Adjustment_Ref");
  /** Variable representing the InvoiceDetail_BalanceLineItem_Ref relationship */
  public static final InvoiceDetailRequestRelationship INVOICE_DETAIL__BALANCE_LINE_ITEM__REF = new InvoiceDetailRequestRelationship("InvoiceDetail_BalanceLineItem_Ref");
  /** Variable representing the InvoiceDetail_BilledUsage_Ref relationship */
  public static final InvoiceDetailRequestRelationship INVOICE_DETAIL__BILLED_USAGE__REF = new InvoiceDetailRequestRelationship("InvoiceDetail_BilledUsage_Ref");
  /** Variable representing the InvoiceDetail_Invoice_Ref relationship */
  public static final InvoiceDetailRequestRelationship INVOICE_DETAIL__INVOICE__REF = new InvoiceDetailRequestRelationship("InvoiceDetail_Invoice_Ref");
}
