/*
 * Generated code DO NOT EDIT
 * Generated file: InvsOperatorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsOperatorRequestMethod implements UdtMethod {
  private String method = null;
  private InvsOperatorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsOperatorCreate method */
  public static final InvsOperatorRequestMethod INVS_OPERATOR_CREATE = new InvsOperatorRequestMethod("InvsOperatorCreate");
  /** Variable representing the InvsOperatorFind method */
  public static final InvsOperatorRequestMethod INVS_OPERATOR_FIND = new InvsOperatorRequestMethod("InvsOperatorFind");
  /** Variable representing the InvsOperatorGet method */
  public static final InvsOperatorRequestMethod INVS_OPERATOR_GET = new InvsOperatorRequestMethod("InvsOperatorGet");
  /** Variable representing the InvsOperatorUpdate method */
  public static final InvsOperatorRequestMethod INVS_OPERATOR_UPDATE = new InvsOperatorRequestMethod("InvsOperatorUpdate");
}
