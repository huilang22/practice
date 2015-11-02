/*
 * Generated code DO NOT EDIT
 * Generated file: RbrVariableRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrVariableRequestMethod implements UdtMethod {
  private String method = null;
  private RbrVariableRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrVariableCreate method */
  public static final RbrVariableRequestMethod RBR_VARIABLE_CREATE = new RbrVariableRequestMethod("RbrVariableCreate");
  /** Variable representing the RbrVariableDelete method */
  public static final RbrVariableRequestMethod RBR_VARIABLE_DELETE = new RbrVariableRequestMethod("RbrVariableDelete");
  /** Variable representing the RbrVariableFind method */
  public static final RbrVariableRequestMethod RBR_VARIABLE_FIND = new RbrVariableRequestMethod("RbrVariableFind");
  /** Variable representing the RbrVariableGet method */
  public static final RbrVariableRequestMethod RBR_VARIABLE_GET = new RbrVariableRequestMethod("RbrVariableGet");
  /** Variable representing the RbrVariableUpdate method */
  public static final RbrVariableRequestMethod RBR_VARIABLE_UPDATE = new RbrVariableRequestMethod("RbrVariableUpdate");
}
