/*
 * Generated code DO NOT EDIT
 * Generated file: OrderLookupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderLookupRequestMethod implements UdtMethod {
  private String method = null;
  private OrderLookupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderLookupFind method */
  public static final OrderLookupRequestMethod ORDER_LOOKUP_FIND = new OrderLookupRequestMethod("OrderLookupFind");
  /** Variable representing the OrderLookupGet method */
  public static final OrderLookupRequestMethod ORDER_LOOKUP_GET = new OrderLookupRequestMethod("OrderLookupGet");
}
