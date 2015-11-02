/*
 * Generated code DO NOT EDIT
 * Generated file: AccountHqContractRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccountHqContractRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccountHqContractRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the AccountHqContract_Account_Ref relationship */
  public static final AccountHqContractRequestRelationship ACCOUNT_HQ_CONTRACT__ACCOUNT__REF = new AccountHqContractRequestRelationship("AccountHqContract_Account_Ref");
  /** Variable representing the AccountHqContract_CustomerContract_Ref relationship */
  public static final AccountHqContractRequestRelationship ACCOUNT_HQ_CONTRACT__CUSTOMER_CONTRACT__REF = new AccountHqContractRequestRelationship("AccountHqContract_CustomerContract_Ref");
  /** Variable representing the AccountHqContract_OrderedAccount_Ref relationship */
  public static final AccountHqContractRequestRelationship ACCOUNT_HQ_CONTRACT__ORDERED_ACCOUNT__REF = new AccountHqContractRequestRelationship("AccountHqContract_OrderedAccount_Ref");
  /** Variable representing the AccountHqContract_OrderedContract_Ref relationship */
  public static final AccountHqContractRequestRelationship ACCOUNT_HQ_CONTRACT__ORDERED_CONTRACT__REF = new AccountHqContractRequestRelationship("AccountHqContract_OrderedContract_Ref");
}
