/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGroupRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccountCodeGroupRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccountCodeGroupRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the AccountCodeGroup_Account_Ref relationship */
  public static final AccountCodeGroupRequestRelationship ACCOUNT_CODE_GROUP__ACCOUNT__REF = new AccountCodeGroupRequestRelationship("AccountCodeGroup_Account_Ref");
  /** Variable representing the AccountCodeGroup_AccountCode_Ref relationship */
  public static final AccountCodeGroupRequestRelationship ACCOUNT_CODE_GROUP__ACCOUNT_CODE__REF = new AccountCodeGroupRequestRelationship("AccountCodeGroup_AccountCode_Ref");
  /** Variable representing the AccountCodeGroup_Child relationship */
  public static final AccountCodeGroupRequestRelationship ACCOUNT_CODE_GROUP__CHILD = new AccountCodeGroupRequestRelationship("AccountCodeGroup_Child");
  /** Variable representing the AccountCodeGroup_Parent relationship */
  public static final AccountCodeGroupRequestRelationship ACCOUNT_CODE_GROUP__PARENT = new AccountCodeGroupRequestRelationship("AccountCodeGroup_Parent");
  /** Variable representing the AccountCodeGroup_OrderedAccount_Ref relationship */
  public static final AccountCodeGroupRequestRelationship ACCOUNT_CODE_GROUP__ORDERED_ACCOUNT__REF = new AccountCodeGroupRequestRelationship("AccountCodeGroup_OrderedAccount_Ref");
}
