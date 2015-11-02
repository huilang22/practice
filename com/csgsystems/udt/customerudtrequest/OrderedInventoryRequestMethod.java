/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInventoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedInventoryRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedInventoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedInventoryAssign method */
  public static final OrderedInventoryRequestMethod ORDERED_INVENTORY_ASSIGN = new OrderedInventoryRequestMethod("OrderedInventoryAssign");
  /** Variable representing the OrderedInventorySwap method */
  public static final OrderedInventoryRequestMethod ORDERED_INVENTORY_SWAP = new OrderedInventoryRequestMethod("OrderedInventorySwap");
  /** Variable representing the OrderedInventoryUnAssign method */
  public static final OrderedInventoryRequestMethod ORDERED_INVENTORY_UN_ASSIGN = new OrderedInventoryRequestMethod("OrderedInventoryUnAssign");
}
