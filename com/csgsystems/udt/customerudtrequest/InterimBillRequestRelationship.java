/*
 * Generated code DO NOT EDIT
 * Generated file: InterimBillRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class InterimBillRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private InterimBillRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the InterimBill_Account_Ref relationship */
  public static final InterimBillRequestRelationship INTERIM_BILL__ACCOUNT__REF = new InterimBillRequestRelationship("InterimBill_Account_Ref");
  /** Variable representing the InterimBill_Invoice_Ref relationship */
  public static final InterimBillRequestRelationship INTERIM_BILL__INVOICE__REF = new InterimBillRequestRelationship("InterimBill_Invoice_Ref");
  /** Variable representing the InterimBill_OrderedAccount_Ref relationship */
  public static final InterimBillRequestRelationship INTERIM_BILL__ORDERED_ACCOUNT__REF = new InterimBillRequestRelationship("InterimBill_OrderedAccount_Ref");
}
