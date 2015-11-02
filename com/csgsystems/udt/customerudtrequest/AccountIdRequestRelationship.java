/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccountIdRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccountIdRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the AccountId_Account_Ref relationship */
  public static final AccountIdRequestRelationship ACCOUNT_ID__ACCOUNT__REF = new AccountIdRequestRelationship("AccountId_Account_Ref");
  /** Variable representing the AccountId_OrderedAccount_Ref relationship */
  public static final AccountIdRequestRelationship ACCOUNT_ID__ORDERED_ACCOUNT__REF = new AccountIdRequestRelationship("AccountId_OrderedAccount_Ref");
}
