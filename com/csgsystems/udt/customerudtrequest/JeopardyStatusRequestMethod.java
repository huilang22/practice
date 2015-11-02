/*
 * Generated code DO NOT EDIT
 * Generated file: JeopardyStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class JeopardyStatusRequestMethod implements UdtMethod {
  private String method = null;
  private JeopardyStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the JeopardyStatusCreate method */
  public static final JeopardyStatusRequestMethod JEOPARDY_STATUS_CREATE = new JeopardyStatusRequestMethod("JeopardyStatusCreate");
  /** Variable representing the JeopardyStatusFind method */
  public static final JeopardyStatusRequestMethod JEOPARDY_STATUS_FIND = new JeopardyStatusRequestMethod("JeopardyStatusFind");
  /** Variable representing the JeopardyStatusGet method */
  public static final JeopardyStatusRequestMethod JEOPARDY_STATUS_GET = new JeopardyStatusRequestMethod("JeopardyStatusGet");
  /** Variable representing the JeopardyStatusUpdate method */
  public static final JeopardyStatusRequestMethod JEOPARDY_STATUS_UPDATE = new JeopardyStatusRequestMethod("JeopardyStatusUpdate");
}
