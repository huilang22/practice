/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountBalanceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedAccountBalanceRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedAccountBalanceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedAccountBalanceDisconnect method */
  public static final OrderedAccountBalanceRequestMethod ORDERED_ACCOUNT_BALANCE_DISCONNECT = new OrderedAccountBalanceRequestMethod("OrderedAccountBalanceDisconnect");
}
