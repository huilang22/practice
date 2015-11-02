/*
 * Generated code DO NOT EDIT
 * Generated file: ServProductTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServProductTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServProductTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServProductTypeFind method */
  public static final ServProductTypeRequestMethod SERV_PRODUCT_TYPE_FIND = new ServProductTypeRequestMethod("ServProductTypeFind");
}
