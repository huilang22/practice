/*
 * Generated code DO NOT EDIT
 * Generated file: InvHistoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvHistoryRequestMethod implements UdtMethod {
  private String method = null;
  private InvHistoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvHistoryCreate method */
  public static final InvHistoryRequestMethod INV_HISTORY_CREATE = new InvHistoryRequestMethod("InvHistoryCreate");
  /** Variable representing the InvHistoryFind method */
  public static final InvHistoryRequestMethod INV_HISTORY_FIND = new InvHistoryRequestMethod("InvHistoryFind");
}
