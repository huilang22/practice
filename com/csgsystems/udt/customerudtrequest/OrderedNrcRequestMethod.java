/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedNrcRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedNrcRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedNrcRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedNrcCreate method */
  public static final OrderedNrcRequestMethod ORDERED_NRC_CREATE = new OrderedNrcRequestMethod("OrderedNrcCreate");
  /** Variable representing the OrderedNrcDelete method */
  public static final OrderedNrcRequestMethod ORDERED_NRC_DELETE = new OrderedNrcRequestMethod("OrderedNrcDelete");
  /** Variable representing the OrderedNrcUpdate method */
  public static final OrderedNrcRequestMethod ORDERED_NRC_UPDATE = new OrderedNrcRequestMethod("OrderedNrcUpdate");
}
