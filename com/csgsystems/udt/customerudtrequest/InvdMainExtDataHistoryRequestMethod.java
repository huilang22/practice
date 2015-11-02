/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtDataHistoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvdMainExtDataHistoryRequestMethod implements UdtMethod {
  private String method = null;
  private InvdMainExtDataHistoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvdMainExtDataHistoryCreate method */
  public static final InvdMainExtDataHistoryRequestMethod INVD_MAIN_EXT_DATA_HISTORY_CREATE = new InvdMainExtDataHistoryRequestMethod("InvdMainExtDataHistoryCreate");
  /** Variable representing the InvdMainExtDataHistoryDelete method */
  public static final InvdMainExtDataHistoryRequestMethod INVD_MAIN_EXT_DATA_HISTORY_DELETE = new InvdMainExtDataHistoryRequestMethod("InvdMainExtDataHistoryDelete");
  /** Variable representing the InvdMainExtDataHistoryFind method */
  public static final InvdMainExtDataHistoryRequestMethod INVD_MAIN_EXT_DATA_HISTORY_FIND = new InvdMainExtDataHistoryRequestMethod("InvdMainExtDataHistoryFind");
  /** Variable representing the InvdMainExtDataHistoryGet method */
  public static final InvdMainExtDataHistoryRequestMethod INVD_MAIN_EXT_DATA_HISTORY_GET = new InvdMainExtDataHistoryRequestMethod("InvdMainExtDataHistoryGet");
  /** Variable representing the InvdMainExtDataHistoryUpdate method */
  public static final InvdMainExtDataHistoryRequestMethod INVD_MAIN_EXT_DATA_HISTORY_UPDATE = new InvdMainExtDataHistoryRequestMethod("InvdMainExtDataHistoryUpdate");
}
