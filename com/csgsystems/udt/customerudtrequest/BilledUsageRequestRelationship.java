/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class BilledUsageRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private BilledUsageRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the BilledUsage_Adjustment_Ref relationship */
  public static final BilledUsageRequestRelationship BILLED_USAGE__ADJUSTMENT__REF = new BilledUsageRequestRelationship("BilledUsage_Adjustment_Ref");
  /** Variable representing the BilledUsage_BalanceLineItem_Ref relationship */
  public static final BilledUsageRequestRelationship BILLED_USAGE__BALANCE_LINE_ITEM__REF = new BilledUsageRequestRelationship("BilledUsage_BalanceLineItem_Ref");
  /** Variable representing the BilledUsage_Invoice_Ref relationship */
  public static final BilledUsageRequestRelationship BILLED_USAGE__INVOICE__REF = new BilledUsageRequestRelationship("BilledUsage_Invoice_Ref");
  /** Variable representing the BilledUsage_InvoiceDetail_Ref relationship */
  public static final BilledUsageRequestRelationship BILLED_USAGE__INVOICE_DETAIL__REF = new BilledUsageRequestRelationship("BilledUsage_InvoiceDetail_Ref");
}
