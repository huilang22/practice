/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobHistoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvJobHistoryRequestMethod implements UdtMethod {
  private String method = null;
  private InvJobHistoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvJobHistoryDelete method */
  public static final InvJobHistoryRequestMethod INV_JOB_HISTORY_DELETE = new InvJobHistoryRequestMethod("InvJobHistoryDelete");
  /** Variable representing the InvJobHistoryFind method */
  public static final InvJobHistoryRequestMethod INV_JOB_HISTORY_FIND = new InvJobHistoryRequestMethod("InvJobHistoryFind");
  /** Variable representing the InvJobHistoryGet method */
  public static final InvJobHistoryRequestMethod INV_JOB_HISTORY_GET = new InvJobHistoryRequestMethod("InvJobHistoryGet");
}
