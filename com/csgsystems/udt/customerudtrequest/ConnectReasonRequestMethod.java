/*
 * Generated code DO NOT EDIT
 * Generated file: ConnectReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ConnectReasonRequestMethod implements UdtMethod {
  private String method = null;
  private ConnectReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ConnectReasonCreate method */
  public static final ConnectReasonRequestMethod CONNECT_REASON_CREATE = new ConnectReasonRequestMethod("ConnectReasonCreate");
  /** Variable representing the ConnectReasonDelete method */
  public static final ConnectReasonRequestMethod CONNECT_REASON_DELETE = new ConnectReasonRequestMethod("ConnectReasonDelete");
  /** Variable representing the ConnectReasonFind method */
  public static final ConnectReasonRequestMethod CONNECT_REASON_FIND = new ConnectReasonRequestMethod("ConnectReasonFind");
  /** Variable representing the ConnectReasonGet method */
  public static final ConnectReasonRequestMethod CONNECT_REASON_GET = new ConnectReasonRequestMethod("ConnectReasonGet");
  /** Variable representing the ConnectReasonUpdate method */
  public static final ConnectReasonRequestMethod CONNECT_REASON_UPDATE = new ConnectReasonRequestMethod("ConnectReasonUpdate");
}
