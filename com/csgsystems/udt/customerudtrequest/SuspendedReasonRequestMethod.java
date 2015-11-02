/*
 * Generated code DO NOT EDIT
 * Generated file: SuspendedReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SuspendedReasonRequestMethod implements UdtMethod {
  private String method = null;
  private SuspendedReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SuspendedReasonFind method */
  public static final SuspendedReasonRequestMethod SUSPENDED_REASON_FIND = new SuspendedReasonRequestMethod("SuspendedReasonFind");
  /** Variable representing the SuspendedReasonGet method */
  public static final SuspendedReasonRequestMethod SUSPENDED_REASON_GET = new SuspendedReasonRequestMethod("SuspendedReasonGet");
}
