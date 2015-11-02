/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDistributionRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class PaymentDistributionRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private PaymentDistributionRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the PaymentDistribution_BalanceLineItem_Ref relationship */
  public static final PaymentDistributionRequestRelationship PAYMENT_DISTRIBUTION__BALANCE_LINE_ITEM__REF = new PaymentDistributionRequestRelationship("PaymentDistribution_BalanceLineItem_Ref");
  /** Variable representing the PaymentDistribution_Source_BalanceLineItem_Ref relationship */
  public static final PaymentDistributionRequestRelationship PAYMENT_DISTRIBUTION__SOURCE__BALANCE_LINE_ITEM__REF = new PaymentDistributionRequestRelationship("PaymentDistribution_Source_BalanceLineItem_Ref");
  /** Variable representing the PaymentDistribution_Invoice_Ref relationship */
  public static final PaymentDistributionRequestRelationship PAYMENT_DISTRIBUTION__INVOICE__REF = new PaymentDistributionRequestRelationship("PaymentDistribution_Invoice_Ref");
  /** Variable representing the PaymentDistribution_Source_Invoice_Ref relationship */
  public static final PaymentDistributionRequestRelationship PAYMENT_DISTRIBUTION__SOURCE__INVOICE__REF = new PaymentDistributionRequestRelationship("PaymentDistribution_Source_Invoice_Ref");
  /** Variable representing the PaymentDistribution_Payment_Ref relationship */
  public static final PaymentDistributionRequestRelationship PAYMENT_DISTRIBUTION__PAYMENT__REF = new PaymentDistributionRequestRelationship("PaymentDistribution_Payment_Ref");
}
