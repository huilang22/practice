/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StatusReasonRequestMethod implements UdtMethod {
  private String method = null;
  private StatusReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StatusReasonCreate method */
  public static final StatusReasonRequestMethod STATUS_REASON_CREATE = new StatusReasonRequestMethod("StatusReasonCreate");
  /** Variable representing the StatusReasonDelete method */
  public static final StatusReasonRequestMethod STATUS_REASON_DELETE = new StatusReasonRequestMethod("StatusReasonDelete");
  /** Variable representing the StatusReasonFind method */
  public static final StatusReasonRequestMethod STATUS_REASON_FIND = new StatusReasonRequestMethod("StatusReasonFind");
  /** Variable representing the StatusReasonGet method */
  public static final StatusReasonRequestMethod STATUS_REASON_GET = new StatusReasonRequestMethod("StatusReasonGet");
  /** Variable representing the StatusReasonUpdate method */
  public static final StatusReasonRequestMethod STATUS_REASON_UPDATE = new StatusReasonRequestMethod("StatusReasonUpdate");
}
