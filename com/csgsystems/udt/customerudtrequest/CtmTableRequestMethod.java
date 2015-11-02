/*
 * Generated code DO NOT EDIT
 * Generated file: CtmTableRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtmTableRequestMethod implements UdtMethod {
  private String method = null;
  private CtmTableRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtmTableCreate method */
  public static final CtmTableRequestMethod CTM_TABLE_CREATE = new CtmTableRequestMethod("CtmTableCreate");
  /** Variable representing the CtmTableFind method */
  public static final CtmTableRequestMethod CTM_TABLE_FIND = new CtmTableRequestMethod("CtmTableFind");
  /** Variable representing the CtmTableGet method */
  public static final CtmTableRequestMethod CTM_TABLE_GET = new CtmTableRequestMethod("CtmTableGet");
  /** Variable representing the CtmTableUpdate method */
  public static final CtmTableRequestMethod CTM_TABLE_UPDATE = new CtmTableRequestMethod("CtmTableUpdate");
}
