/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLineRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLineRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLineRefCreate method */
  public static final InvsLineRefRequestMethod INVS_LINE_REF_CREATE = new InvsLineRefRequestMethod("InvsLineRefCreate");
  /** Variable representing the InvsLineRefFind method */
  public static final InvsLineRefRequestMethod INVS_LINE_REF_FIND = new InvsLineRefRequestMethod("InvsLineRefFind");
  /** Variable representing the InvsLineRefGet method */
  public static final InvsLineRefRequestMethod INVS_LINE_REF_GET = new InvsLineRefRequestMethod("InvsLineRefGet");
  /** Variable representing the InvsLineRefUpdate method */
  public static final InvsLineRefRequestMethod INVS_LINE_REF_UPDATE = new InvsLineRefRequestMethod("InvsLineRefUpdate");
}
