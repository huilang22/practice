/*
 * Generated code DO NOT EDIT
 * Generated file: CsrRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CsrRequestMethod implements UdtMethod {
  private String method = null;
  private CsrRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CsrFind method */
  public static final CsrRequestMethod CSR_FIND = new CsrRequestMethod("CsrFind");
  /** Variable representing the CsrGet method */
  public static final CsrRequestMethod CSR_GET = new CsrRequestMethod("CsrGet");
  /** Variable representing the CsrGroup method */
  public static final CsrRequestMethod CSR_GROUP = new CsrRequestMethod("CsrGroup");
}
