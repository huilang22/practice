/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StatusReasonMapRequestMethod implements UdtMethod {
  private String method = null;
  private StatusReasonMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StatusReasonMapCreate method */
  public static final StatusReasonMapRequestMethod STATUS_REASON_MAP_CREATE = new StatusReasonMapRequestMethod("StatusReasonMapCreate");
  /** Variable representing the StatusReasonMapFind method */
  public static final StatusReasonMapRequestMethod STATUS_REASON_MAP_FIND = new StatusReasonMapRequestMethod("StatusReasonMapFind");
  /** Variable representing the StatusReasonMapGet method */
  public static final StatusReasonMapRequestMethod STATUS_REASON_MAP_GET = new StatusReasonMapRequestMethod("StatusReasonMapGet");
}
