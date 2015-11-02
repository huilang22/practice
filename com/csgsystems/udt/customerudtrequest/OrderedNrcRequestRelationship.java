/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedNrcRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedNrcRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedNrcRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedNrc_Account_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ACCOUNT__REF = new OrderedNrcRequestRelationship("OrderedNrc_Account_Ref");
  /** Variable representing the OrderedNrc_AccountBalances_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ACCOUNT_BALANCES__REF = new OrderedNrcRequestRelationship("OrderedNrc_AccountBalances_Ref");
  /** Variable representing the OrderedNrc_CustomerContract_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__CUSTOMER_CONTRACT__REF = new OrderedNrcRequestRelationship("OrderedNrc_CustomerContract_Ref");
  /** Variable representing the OrderedNrc_InvElement_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__INV_ELEMENT__REF = new OrderedNrcRequestRelationship("OrderedNrc_InvElement_Ref");
  /** Variable representing the OrderedNrc_Item_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ITEM__REF = new OrderedNrcRequestRelationship("OrderedNrc_Item_Ref");
  /** Variable representing the OrderedNrc_Child relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__CHILD = new OrderedNrcRequestRelationship("OrderedNrc_Child");
  /** Variable representing the OrderedNrc_Parent relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__PARENT = new OrderedNrcRequestRelationship("OrderedNrc_Parent");
  /** Variable representing the OrderedNrc_OrderedAccount_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ORDERED_ACCOUNT__REF = new OrderedNrcRequestRelationship("OrderedNrc_OrderedAccount_Ref");
  /** Variable representing the OrderedNrc_OrderedAccountBalance_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ORDERED_ACCOUNT_BALANCE__REF = new OrderedNrcRequestRelationship("OrderedNrc_OrderedAccountBalance_Ref");
  /** Variable representing the OrderedNrc_OrderedContract_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ORDERED_CONTRACT__REF = new OrderedNrcRequestRelationship("OrderedNrc_OrderedContract_Ref");
  /** Variable representing the OrderedNrc_OrderedInventory_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ORDERED_INVENTORY__REF = new OrderedNrcRequestRelationship("OrderedNrc_OrderedInventory_Ref");
  /** Variable representing the OrderedNrc_OrderedNrc_Child relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ORDERED_NRC__CHILD = new OrderedNrcRequestRelationship("OrderedNrc_OrderedNrc_Child");
  /** Variable representing the OrderedNrc_OrderedNrc_Parent relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ORDERED_NRC__PARENT = new OrderedNrcRequestRelationship("OrderedNrc_OrderedNrc_Parent");
  /** Variable representing the OrderedNrc_OrderedService_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__ORDERED_SERVICE__REF = new OrderedNrcRequestRelationship("OrderedNrc_OrderedService_Ref");
  /** Variable representing the OrderedNrc_RefinancePlan_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__REFINANCE_PLAN__REF = new OrderedNrcRequestRelationship("OrderedNrc_RefinancePlan_Ref");
  /** Variable representing the OrderedNrc_Service_Ref relationship */
  public static final OrderedNrcRequestRelationship ORDERED_NRC__SERVICE__REF = new OrderedNrcRequestRelationship("OrderedNrc_Service_Ref");
}
