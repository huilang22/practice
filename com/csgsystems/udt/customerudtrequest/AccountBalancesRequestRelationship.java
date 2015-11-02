/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccountBalancesRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccountBalancesRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the AccountBalances_Account_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__ACCOUNT__REF = new AccountBalancesRequestRelationship("AccountBalances_Account_Ref");
  /** Variable representing the AccountBalances_Item_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__ITEM__REF = new AccountBalancesRequestRelationship("AccountBalances_Item_Ref");
  /** Variable representing the AccountBalances_Nrc_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__NRC__REF = new AccountBalancesRequestRelationship("AccountBalances_Nrc_Ref");
  /** Variable representing the AccountBalances_OpenItemIdMap_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__OPEN_ITEM_ID_MAP__REF = new AccountBalancesRequestRelationship("AccountBalances_OpenItemIdMap_Ref");
  /** Variable representing the AccountBalances_OrderedAccount_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__ORDERED_ACCOUNT__REF = new AccountBalancesRequestRelationship("AccountBalances_OrderedAccount_Ref");
  /** Variable representing the AccountBalances_OrderedNrc_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__ORDERED_NRC__REF = new AccountBalancesRequestRelationship("AccountBalances_OrderedNrc_Ref");
  /** Variable representing the AccountBalances_OrderedProduct_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__ORDERED_PRODUCT__REF = new AccountBalancesRequestRelationship("AccountBalances_OrderedProduct_Ref");
  /** Variable representing the AccountBalances_Payment_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__PAYMENT__REF = new AccountBalancesRequestRelationship("AccountBalances_Payment_Ref");
  /** Variable representing the AccountBalances_Prepayment_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__PREPAYMENT__REF = new AccountBalancesRequestRelationship("AccountBalances_Prepayment_Ref");
  /** Variable representing the AccountBalances_Product_Ref relationship */
  public static final AccountBalancesRequestRelationship ACCOUNT_BALANCES__PRODUCT__REF = new AccountBalancesRequestRelationship("AccountBalances_Product_Ref");
}
