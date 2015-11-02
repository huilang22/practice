/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class PaymentRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private PaymentRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Payment_Account_Ref relationship */
  public static final PaymentRequestRelationship PAYMENT__ACCOUNT__REF = new PaymentRequestRelationship("Payment_Account_Ref");
  /** Variable representing the Payment_AccountBalances_Ref relationship */
  public static final PaymentRequestRelationship PAYMENT__ACCOUNT_BALANCES__REF = new PaymentRequestRelationship("Payment_AccountBalances_Ref");
  /** Variable representing the Payment_Applied_Invoice_Ref relationship */
  public static final PaymentRequestRelationship PAYMENT__APPLIED__INVOICE__REF = new PaymentRequestRelationship("Payment_Applied_Invoice_Ref");
  /** Variable representing the Payment_Invoice_Ref relationship */
  public static final PaymentRequestRelationship PAYMENT__INVOICE__REF = new PaymentRequestRelationship("Payment_Invoice_Ref");
  /** Variable representing the Payment_OrderedAccount_Ref relationship */
  public static final PaymentRequestRelationship PAYMENT__ORDERED_ACCOUNT__REF = new PaymentRequestRelationship("Payment_OrderedAccount_Ref");
  /** Variable representing the Payment_OrderedAccountBalance_Ref relationship */
  public static final PaymentRequestRelationship PAYMENT__ORDERED_ACCOUNT_BALANCE__REF = new PaymentRequestRelationship("Payment_OrderedAccountBalance_Ref");
  /** Variable representing the Payment_PaymentDistribution_Ref relationship */
  public static final PaymentRequestRelationship PAYMENT__PAYMENT_DISTRIBUTION__REF = new PaymentRequestRelationship("Payment_PaymentDistribution_Ref");
}
