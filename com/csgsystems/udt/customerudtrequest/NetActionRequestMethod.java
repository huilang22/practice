/*
 * Generated code DO NOT EDIT
 * Generated file: NetActionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NetActionRequestMethod implements UdtMethod {
  private String method = null;
  private NetActionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NetActionFind method */
  public static final NetActionRequestMethod NET_ACTION_FIND = new NetActionRequestMethod("NetActionFind");
  /** Variable representing the NetActionGet method */
  public static final NetActionRequestMethod NET_ACTION_GET = new NetActionRequestMethod("NetActionGet");
}
