/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedAccountRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedAccountRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedAccountCreate method */
  public static final OrderedAccountRequestMethod ORDERED_ACCOUNT_CREATE = new OrderedAccountRequestMethod("OrderedAccountCreate");
  /** Variable representing the OrderedAccountDisconnect method */
  public static final OrderedAccountRequestMethod ORDERED_ACCOUNT_DISCONNECT = new OrderedAccountRequestMethod("OrderedAccountDisconnect");
  /** Variable representing the OrderedAccountResumeServices method */
  public static final OrderedAccountRequestMethod ORDERED_ACCOUNT_RESUME_SERVICES = new OrderedAccountRequestMethod("OrderedAccountResumeServices");
  /** Variable representing the OrderedAccountSuspendServices method */
  public static final OrderedAccountRequestMethod ORDERED_ACCOUNT_SUSPEND_SERVICES = new OrderedAccountRequestMethod("OrderedAccountSuspendServices");
}
