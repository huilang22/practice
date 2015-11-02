/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedProductRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedProductRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedProductRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedProductCreate method */
  public static final OrderedProductRequestMethod ORDERED_PRODUCT_CREATE = new OrderedProductRequestMethod("OrderedProductCreate");
  /** Variable representing the OrderedProductDisconnect method */
  public static final OrderedProductRequestMethod ORDERED_PRODUCT_DISCONNECT = new OrderedProductRequestMethod("OrderedProductDisconnect");
  /** Variable representing the OrderedProductUpdate method */
  public static final OrderedProductRequestMethod ORDERED_PRODUCT_UPDATE = new OrderedProductRequestMethod("OrderedProductUpdate");
}
