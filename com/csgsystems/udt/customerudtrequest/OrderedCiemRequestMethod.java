/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedCiemRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedCiemRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedCiemRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedCiemCreate method */
  public static final OrderedCiemRequestMethod ORDERED_CIEM_CREATE = new OrderedCiemRequestMethod("OrderedCiemCreate");
  /** Variable representing the OrderedCiemDisconnect method */
  public static final OrderedCiemRequestMethod ORDERED_CIEM_DISCONNECT = new OrderedCiemRequestMethod("OrderedCiemDisconnect");
  /** Variable representing the OrderedCiemSetCurrent method */
  public static final OrderedCiemRequestMethod ORDERED_CIEM_SET_CURRENT = new OrderedCiemRequestMethod("OrderedCiemSetCurrent");
}
