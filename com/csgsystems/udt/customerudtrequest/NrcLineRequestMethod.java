/*
 * Generated code DO NOT EDIT
 * Generated file: NrcLineRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NrcLineRequestMethod implements UdtMethod {
  private String method = null;
  private NrcLineRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NrcLineCreate method */
  public static final NrcLineRequestMethod NRC_LINE_CREATE = new NrcLineRequestMethod("NrcLineCreate");
  /** Variable representing the NrcLineDelete method */
  public static final NrcLineRequestMethod NRC_LINE_DELETE = new NrcLineRequestMethod("NrcLineDelete");
  /** Variable representing the NrcLineFind method */
  public static final NrcLineRequestMethod NRC_LINE_FIND = new NrcLineRequestMethod("NrcLineFind");
  /** Variable representing the NrcLineGet method */
  public static final NrcLineRequestMethod NRC_LINE_GET = new NrcLineRequestMethod("NrcLineGet");
  /** Variable representing the NrcLineUpdate method */
  public static final NrcLineRequestMethod NRC_LINE_UPDATE = new NrcLineRequestMethod("NrcLineUpdate");
}
