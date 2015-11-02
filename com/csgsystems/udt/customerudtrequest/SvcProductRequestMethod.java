/*
 * Generated code DO NOT EDIT
 * Generated file: SvcProductRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SvcProductRequestMethod implements UdtMethod {
  private String method = null;
  private SvcProductRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SvcProductFind method */
  public static final SvcProductRequestMethod SVC_PRODUCT_FIND = new SvcProductRequestMethod("SvcProductFind");
}
