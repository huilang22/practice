/*
 * Generated code DO NOT EDIT
 * Generated file: StatusTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StatusTypeRequestMethod implements UdtMethod {
  private String method = null;
  private StatusTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StatusTypeCreate method */
  public static final StatusTypeRequestMethod STATUS_TYPE_CREATE = new StatusTypeRequestMethod("StatusTypeCreate");
  /** Variable representing the StatusTypeDelete method */
  public static final StatusTypeRequestMethod STATUS_TYPE_DELETE = new StatusTypeRequestMethod("StatusTypeDelete");
  /** Variable representing the StatusTypeFind method */
  public static final StatusTypeRequestMethod STATUS_TYPE_FIND = new StatusTypeRequestMethod("StatusTypeFind");
  /** Variable representing the StatusTypeGet method */
  public static final StatusTypeRequestMethod STATUS_TYPE_GET = new StatusTypeRequestMethod("StatusTypeGet");
  /** Variable representing the StatusTypeUpdate method */
  public static final StatusTypeRequestMethod STATUS_TYPE_UPDATE = new StatusTypeRequestMethod("StatusTypeUpdate");
}
