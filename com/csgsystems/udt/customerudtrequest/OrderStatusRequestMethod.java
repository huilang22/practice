/*
 * Generated code DO NOT EDIT
 * Generated file: OrderStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderStatusRequestMethod implements UdtMethod {
  private String method = null;
  private OrderStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderStatusCreate method */
  public static final OrderStatusRequestMethod ORDER_STATUS_CREATE = new OrderStatusRequestMethod("OrderStatusCreate");
  /** Variable representing the OrderStatusFind method */
  public static final OrderStatusRequestMethod ORDER_STATUS_FIND = new OrderStatusRequestMethod("OrderStatusFind");
  /** Variable representing the OrderStatusGet method */
  public static final OrderStatusRequestMethod ORDER_STATUS_GET = new OrderStatusRequestMethod("OrderStatusGet");
  /** Variable representing the OrderStatusUpdate method */
  public static final OrderStatusRequestMethod ORDER_STATUS_UPDATE = new OrderStatusRequestMethod("OrderStatusUpdate");
}
