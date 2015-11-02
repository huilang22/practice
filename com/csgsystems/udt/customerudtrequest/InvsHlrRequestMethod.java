/*
 * Generated code DO NOT EDIT
 * Generated file: InvsHlrRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsHlrRequestMethod implements UdtMethod {
  private String method = null;
  private InvsHlrRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsHlrCreate method */
  public static final InvsHlrRequestMethod INVS_HLR_CREATE = new InvsHlrRequestMethod("InvsHlrCreate");
  /** Variable representing the InvsHlrFind method */
  public static final InvsHlrRequestMethod INVS_HLR_FIND = new InvsHlrRequestMethod("InvsHlrFind");
  /** Variable representing the InvsHlrGet method */
  public static final InvsHlrRequestMethod INVS_HLR_GET = new InvsHlrRequestMethod("InvsHlrGet");
  /** Variable representing the InvsHlrUpdate method */
  public static final InvsHlrRequestMethod INVS_HLR_UPDATE = new InvsHlrRequestMethod("InvsHlrUpdate");
}
