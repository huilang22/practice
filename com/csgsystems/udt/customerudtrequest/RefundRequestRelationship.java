/*
 * Generated code DO NOT EDIT
 * Generated file: RefundRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class RefundRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private RefundRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Refund_Account_Ref relationship */
  public static final RefundRequestRelationship REFUND__ACCOUNT__REF = new RefundRequestRelationship("Refund_Account_Ref");
  /** Variable representing the Refund_Contact_Ref relationship */
  public static final RefundRequestRelationship REFUND__CONTACT__REF = new RefundRequestRelationship("Refund_Contact_Ref");
  /** Variable representing the Refund_OrderedAccount_Ref relationship */
  public static final RefundRequestRelationship REFUND__ORDERED_ACCOUNT__REF = new RefundRequestRelationship("Refund_OrderedAccount_Ref");
}
