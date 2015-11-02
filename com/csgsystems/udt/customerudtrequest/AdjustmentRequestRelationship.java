/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AdjustmentRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AdjustmentRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Adjustment_Source_BalanceLineItem_Ref relationship */
  public static final AdjustmentRequestRelationship ADJUSTMENT__SOURCE__BALANCE_LINE_ITEM__REF = new AdjustmentRequestRelationship("Adjustment_Source_BalanceLineItem_Ref");
  /** Variable representing the Adjustment_Source_BilledUsage_Ref relationship */
  public static final AdjustmentRequestRelationship ADJUSTMENT__SOURCE__BILLED_USAGE__REF = new AdjustmentRequestRelationship("Adjustment_Source_BilledUsage_Ref");
  /** Variable representing the Adjustment_Billed_Invoice_Ref relationship */
  public static final AdjustmentRequestRelationship ADJUSTMENT__BILLED__INVOICE__REF = new AdjustmentRequestRelationship("Adjustment_Billed_Invoice_Ref");
  /** Variable representing the Adjustment_Source_Invoice_Ref relationship */
  public static final AdjustmentRequestRelationship ADJUSTMENT__SOURCE__INVOICE__REF = new AdjustmentRequestRelationship("Adjustment_Source_Invoice_Ref");
  /** Variable representing the Adjustment_Source_InvoiceDetail_Ref relationship */
  public static final AdjustmentRequestRelationship ADJUSTMENT__SOURCE__INVOICE_DETAIL__REF = new AdjustmentRequestRelationship("Adjustment_Source_InvoiceDetail_Ref");
  /** Variable representing the Adjustment_RefinancePlan_Ref relationship */
  public static final AdjustmentRequestRelationship ADJUSTMENT__REFINANCE_PLAN__REF = new AdjustmentRequestRelationship("Adjustment_RefinancePlan_Ref");
  /** Variable representing the Adjustment_Source_UnbilledUsage_Ref relationship */
  public static final AdjustmentRequestRelationship ADJUSTMENT__SOURCE__UNBILLED_USAGE__REF = new AdjustmentRequestRelationship("Adjustment_Source_UnbilledUsage_Ref");
}
