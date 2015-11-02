/*
 * Generated code DO NOT EDIT
 * Generated file: OrderRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Order_Account_Ref relationship */
  public static final OrderRequestRelationship ORDER__ACCOUNT__REF = new OrderRequestRelationship("Order_Account_Ref");
  /** Variable representing the Order_Order_Ref relationship */
  public static final OrderRequestRelationship ORDER__ORDER__REF = new OrderRequestRelationship("Order_Order_Ref");
  /** Variable representing the Order_OrderedAccount_Ref relationship */
  public static final OrderRequestRelationship ORDER__ORDERED_ACCOUNT__REF = new OrderRequestRelationship("Order_OrderedAccount_Ref");
  /** Variable representing the Order_ServiceOrder_Ref relationship */
  public static final OrderRequestRelationship ORDER__SERVICE_ORDER__REF = new OrderRequestRelationship("Order_ServiceOrder_Ref");
}
