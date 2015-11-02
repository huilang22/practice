/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPpvRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedPpvRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedPpvRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedPpvCreate method */
  public static final OrderedPpvRequestMethod ORDERED_PPV_CREATE = new OrderedPpvRequestMethod("OrderedPpvCreate");
  /** Variable representing the OrderedPpvCreateValidate method */
  public static final OrderedPpvRequestMethod ORDERED_PPV_CREATE_VALIDATE = new OrderedPpvRequestMethod("OrderedPpvCreateValidate");
}
