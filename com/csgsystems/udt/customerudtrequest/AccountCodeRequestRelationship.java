/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccountCodeRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccountCodeRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the AccountCode_AccountCodeGroup_Ref relationship */
  public static final AccountCodeRequestRelationship ACCOUNT_CODE__ACCOUNT_CODE_GROUP__REF = new AccountCodeRequestRelationship("AccountCode_AccountCodeGroup_Ref");
}
