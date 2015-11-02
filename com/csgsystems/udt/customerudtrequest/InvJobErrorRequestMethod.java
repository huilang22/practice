/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobErrorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvJobErrorRequestMethod implements UdtMethod {
  private String method = null;
  private InvJobErrorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvJobErrorFind method */
  public static final InvJobErrorRequestMethod INV_JOB_ERROR_FIND = new InvJobErrorRequestMethod("InvJobErrorFind");
  /** Variable representing the InvJobErrorGet method */
  public static final InvJobErrorRequestMethod INV_JOB_ERROR_GET = new InvJobErrorRequestMethod("InvJobErrorGet");
  /** Variable representing the InvJobErrorMaxErrorCount method */
  public static final InvJobErrorRequestMethod INV_JOB_ERROR_MAX_ERROR_COUNT = new InvJobErrorRequestMethod("InvJobErrorMaxErrorCount");
}
