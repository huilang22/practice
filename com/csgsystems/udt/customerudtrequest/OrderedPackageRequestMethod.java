/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPackageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedPackageRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedPackageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedPackageCreate method */
  public static final OrderedPackageRequestMethod ORDERED_PACKAGE_CREATE = new OrderedPackageRequestMethod("OrderedPackageCreate");
  /** Variable representing the OrderedPackageDisconnect method */
  public static final OrderedPackageRequestMethod ORDERED_PACKAGE_DISCONNECT = new OrderedPackageRequestMethod("OrderedPackageDisconnect");
}
