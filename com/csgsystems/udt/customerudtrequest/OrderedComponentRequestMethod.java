/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedComponentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedComponentRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedComponentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedComponentCreate method */
  public static final OrderedComponentRequestMethod ORDERED_COMPONENT_CREATE = new OrderedComponentRequestMethod("OrderedComponentCreate");
  /** Variable representing the OrderedComponentDisconnect method */
  public static final OrderedComponentRequestMethod ORDERED_COMPONENT_DISCONNECT = new OrderedComponentRequestMethod("OrderedComponentDisconnect");
}
