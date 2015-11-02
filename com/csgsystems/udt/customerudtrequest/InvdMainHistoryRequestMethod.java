/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainHistoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvdMainHistoryRequestMethod implements UdtMethod {
  private String method = null;
  private InvdMainHistoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvdMainHistoryCreate method */
  public static final InvdMainHistoryRequestMethod INVD_MAIN_HISTORY_CREATE = new InvdMainHistoryRequestMethod("InvdMainHistoryCreate");
  /** Variable representing the InvdMainHistoryDelete method */
  public static final InvdMainHistoryRequestMethod INVD_MAIN_HISTORY_DELETE = new InvdMainHistoryRequestMethod("InvdMainHistoryDelete");
  /** Variable representing the InvdMainHistoryFind method */
  public static final InvdMainHistoryRequestMethod INVD_MAIN_HISTORY_FIND = new InvdMainHistoryRequestMethod("InvdMainHistoryFind");
  /** Variable representing the InvdMainHistoryGet method */
  public static final InvdMainHistoryRequestMethod INVD_MAIN_HISTORY_GET = new InvdMainHistoryRequestMethod("InvdMainHistoryGet");
  /** Variable representing the InvdMainHistoryUpdate method */
  public static final InvdMainHistoryRequestMethod INVD_MAIN_HISTORY_UPDATE = new InvdMainHistoryRequestMethod("InvdMainHistoryUpdate");
}
