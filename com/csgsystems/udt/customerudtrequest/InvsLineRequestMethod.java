/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLineRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLineRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLineCreate method */
  public static final InvsLineRequestMethod INVS_LINE_CREATE = new InvsLineRequestMethod("InvsLineCreate");
  /** Variable representing the InvsLineFind method */
  public static final InvsLineRequestMethod INVS_LINE_FIND = new InvsLineRequestMethod("InvsLineFind");
  /** Variable representing the InvsLineGet method */
  public static final InvsLineRequestMethod INVS_LINE_GET = new InvsLineRequestMethod("InvsLineGet");
  /** Variable representing the InvsLineUpdate method */
  public static final InvsLineRequestMethod INVS_LINE_UPDATE = new InvsLineRequestMethod("InvsLineUpdate");
}
