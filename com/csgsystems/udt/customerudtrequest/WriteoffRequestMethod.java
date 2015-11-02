/*
 * Generated code DO NOT EDIT
 * Generated file: WriteoffRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class WriteoffRequestMethod implements UdtMethod {
  private String method = null;
  private WriteoffRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the WriteoffFind method */
  public static final WriteoffRequestMethod WRITEOFF_FIND = new WriteoffRequestMethod("WriteoffFind");
  /** Variable representing the WriteoffGet method */
  public static final WriteoffRequestMethod WRITEOFF_GET = new WriteoffRequestMethod("WriteoffGet");
  /** Variable representing the WriteoffRecoveryCreate method */
  public static final WriteoffRequestMethod WRITEOFF_RECOVERY_CREATE = new WriteoffRequestMethod("WriteoffRecoveryCreate");
}
