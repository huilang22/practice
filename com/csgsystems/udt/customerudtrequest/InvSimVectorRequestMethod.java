/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimVectorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvSimVectorRequestMethod implements UdtMethod {
  private String method = null;
  private InvSimVectorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvSimVectorCreate method */
  public static final InvSimVectorRequestMethod INV_SIM_VECTOR_CREATE = new InvSimVectorRequestMethod("InvSimVectorCreate");
  /** Variable representing the InvSimVectorDelete method */
  public static final InvSimVectorRequestMethod INV_SIM_VECTOR_DELETE = new InvSimVectorRequestMethod("InvSimVectorDelete");
  /** Variable representing the InvSimVectorDeleteHelper method */
  public static final InvSimVectorRequestMethod INV_SIM_VECTOR_DELETE_HELPER = new InvSimVectorRequestMethod("InvSimVectorDeleteHelper");
}
