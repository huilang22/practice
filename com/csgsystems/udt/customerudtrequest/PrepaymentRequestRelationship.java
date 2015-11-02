/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class PrepaymentRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private PrepaymentRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Prepayment_Account_Ref relationship */
  public static final PrepaymentRequestRelationship PREPAYMENT__ACCOUNT__REF = new PrepaymentRequestRelationship("Prepayment_Account_Ref");
  /** Variable representing the Prepayment_AccountBalances_Ref relationship */
  public static final PrepaymentRequestRelationship PREPAYMENT__ACCOUNT_BALANCES__REF = new PrepaymentRequestRelationship("Prepayment_AccountBalances_Ref");
  /** Variable representing the Prepayment_Invoice_Ref relationship */
  public static final PrepaymentRequestRelationship PREPAYMENT__INVOICE__REF = new PrepaymentRequestRelationship("Prepayment_Invoice_Ref");
  /** Variable representing the Prepayment_OrderedAccount_Ref relationship */
  public static final PrepaymentRequestRelationship PREPAYMENT__ORDERED_ACCOUNT__REF = new PrepaymentRequestRelationship("Prepayment_OrderedAccount_Ref");
  /** Variable representing the Prepayment_OrderedAccountBalance_Ref relationship */
  public static final PrepaymentRequestRelationship PREPAYMENT__ORDERED_ACCOUNT_BALANCE__REF = new PrepaymentRequestRelationship("Prepayment_OrderedAccountBalance_Ref");
  /** Variable representing the Prepayment_PrepaymentDistribution_Ref relationship */
  public static final PrepaymentRequestRelationship PREPAYMENT__PREPAYMENT_DISTRIBUTION__REF = new PrepaymentRequestRelationship("Prepayment_PrepaymentDistribution_Ref");
}
