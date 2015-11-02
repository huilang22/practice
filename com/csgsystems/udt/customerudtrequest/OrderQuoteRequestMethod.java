/*
 * Generated code DO NOT EDIT
 * Generated file: OrderQuoteRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderQuoteRequestMethod implements UdtMethod {
  private String method = null;
  private OrderQuoteRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderQuoteQuotePrice method */
  public static final OrderQuoteRequestMethod ORDER_QUOTE_QUOTE_PRICE = new OrderQuoteRequestMethod("OrderQuoteQuotePrice");
}
