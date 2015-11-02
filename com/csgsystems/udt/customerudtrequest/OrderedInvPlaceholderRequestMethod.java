/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInvPlaceholderRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedInvPlaceholderRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedInvPlaceholderRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedInvPlaceholderAssign method */
  public static final OrderedInvPlaceholderRequestMethod ORDERED_INV_PLACEHOLDER_ASSIGN = new OrderedInvPlaceholderRequestMethod("OrderedInvPlaceholderAssign");
  /** Variable representing the OrderedInvPlaceholderCreate method */
  public static final OrderedInvPlaceholderRequestMethod ORDERED_INV_PLACEHOLDER_CREATE = new OrderedInvPlaceholderRequestMethod("OrderedInvPlaceholderCreate");
}
