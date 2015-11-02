/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedCiemRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedCiemRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedCiemRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedCiem_InvElement_Ref relationship */
  public static final OrderedCiemRequestRelationship ORDERED_CIEM__INV_ELEMENT__REF = new OrderedCiemRequestRelationship("OrderedCiem_InvElement_Ref");
  /** Variable representing the OrderedCiem_Item_Ref relationship */
  public static final OrderedCiemRequestRelationship ORDERED_CIEM__ITEM__REF = new OrderedCiemRequestRelationship("OrderedCiem_Item_Ref");
  /** Variable representing the OrderedCiem_OrderedInventory_Ref relationship */
  public static final OrderedCiemRequestRelationship ORDERED_CIEM__ORDERED_INVENTORY__REF = new OrderedCiemRequestRelationship("OrderedCiem_OrderedInventory_Ref");
  /** Variable representing the OrderedCiem_OrderedService_Ref relationship */
  public static final OrderedCiemRequestRelationship ORDERED_CIEM__ORDERED_SERVICE__REF = new OrderedCiemRequestRelationship("OrderedCiem_OrderedService_Ref");
  /** Variable representing the OrderedCiem_Service_Ref relationship */
  public static final OrderedCiemRequestRelationship ORDERED_CIEM__SERVICE__REF = new OrderedCiemRequestRelationship("OrderedCiem_Service_Ref");
}
