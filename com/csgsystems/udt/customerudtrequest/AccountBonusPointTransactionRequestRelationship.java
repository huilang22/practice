/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccountBonusPointTransactionRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccountBonusPointTransactionRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the AccountBonusPointTransaction_Account_Ref relationship */
  public static final AccountBonusPointTransactionRequestRelationship ACCOUNT_BONUS_POINT_TRANSACTION__ACCOUNT__REF = new AccountBonusPointTransactionRequestRelationship("AccountBonusPointTransaction_Account_Ref");
  /** Variable representing the AccountBonusPointTransaction_Invoice_Ref relationship */
  public static final AccountBonusPointTransactionRequestRelationship ACCOUNT_BONUS_POINT_TRANSACTION__INVOICE__REF = new AccountBonusPointTransactionRequestRelationship("AccountBonusPointTransaction_Invoice_Ref");
}
