/*
 * Generated code DO NOT EDIT
 * Generated file: StatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StatusRequestMethod implements UdtMethod {
  private String method = null;
  private StatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StatusCreate method */
  public static final StatusRequestMethod STATUS_CREATE = new StatusRequestMethod("StatusCreate");
  /** Variable representing the StatusDelete method */
  public static final StatusRequestMethod STATUS_DELETE = new StatusRequestMethod("StatusDelete");
  /** Variable representing the StatusFind method */
  public static final StatusRequestMethod STATUS_FIND = new StatusRequestMethod("StatusFind");
  /** Variable representing the StatusGet method */
  public static final StatusRequestMethod STATUS_GET = new StatusRequestMethod("StatusGet");
  /** Variable representing the StatusUpdate method */
  public static final StatusRequestMethod STATUS_UPDATE = new StatusRequestMethod("StatusUpdate");
}
