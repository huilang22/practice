/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobstateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsJobstateRequestMethod implements UdtMethod {
  private String method = null;
  private InvsJobstateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsJobstateFind method */
  public static final InvsJobstateRequestMethod INVS_JOBSTATE_FIND = new InvsJobstateRequestMethod("InvsJobstateFind");
  /** Variable representing the InvsJobstateGet method */
  public static final InvsJobstateRequestMethod INVS_JOBSTATE_GET = new InvsJobstateRequestMethod("InvsJobstateGet");
}
