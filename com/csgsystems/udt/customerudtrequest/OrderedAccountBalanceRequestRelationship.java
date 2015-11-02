/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountBalanceRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedAccountBalanceRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedAccountBalanceRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedAccountBalance_Account_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__ACCOUNT__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_Account_Ref");
  /** Variable representing the OrderedAccountBalance_Item_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__ITEM__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_Item_Ref");
  /** Variable representing the OrderedAccountBalance_Nrc_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__NRC__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_Nrc_Ref");
  /** Variable representing the OrderedAccountBalance_OpenItemIdMap_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__OPEN_ITEM_ID_MAP__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_OpenItemIdMap_Ref");
  /** Variable representing the OrderedAccountBalance_OrderedAccount_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__ORDERED_ACCOUNT__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_OrderedAccount_Ref");
  /** Variable representing the OrderedAccountBalance_OrderedNrc_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__ORDERED_NRC__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_OrderedNrc_Ref");
  /** Variable representing the OrderedAccountBalance_OrderedProduct_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__ORDERED_PRODUCT__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_OrderedProduct_Ref");
  /** Variable representing the OrderedAccountBalance_Payment_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__PAYMENT__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_Payment_Ref");
  /** Variable representing the OrderedAccountBalance_Prepayment_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__PREPAYMENT__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_Prepayment_Ref");
  /** Variable representing the OrderedAccountBalance_Product_Ref relationship */
  public static final OrderedAccountBalanceRequestRelationship ORDERED_ACCOUNT_BALANCE__PRODUCT__REF = new OrderedAccountBalanceRequestRelationship("OrderedAccountBalance_Product_Ref");
}
