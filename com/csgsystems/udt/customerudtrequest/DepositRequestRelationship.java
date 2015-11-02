/*
 * Generated code DO NOT EDIT
 * Generated file: DepositRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class DepositRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private DepositRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Deposit_Account_Ref relationship */
  public static final DepositRequestRelationship DEPOSIT__ACCOUNT__REF = new DepositRequestRelationship("Deposit_Account_Ref");
  /** Variable representing the Deposit_OrderedAccount_Ref relationship */
  public static final DepositRequestRelationship DEPOSIT__ORDERED_ACCOUNT__REF = new DepositRequestRelationship("Deposit_OrderedAccount_Ref");
}
