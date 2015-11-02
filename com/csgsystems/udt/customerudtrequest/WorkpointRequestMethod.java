/*
 * Generated code DO NOT EDIT
 * Generated file: WorkpointRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class WorkpointRequestMethod implements UdtMethod {
  private String method = null;
  private WorkpointRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the WorkpointUpdate method */
  public static final WorkpointRequestMethod WORKPOINT_UPDATE = new WorkpointRequestMethod("WorkpointUpdate");
}
