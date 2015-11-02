/*
 * Generated code DO NOT EDIT
 * Generated file: SupervisorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SupervisorRequestMethod implements UdtMethod {
  private String method = null;
  private SupervisorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SupervisorCreate method */
  public static final SupervisorRequestMethod SUPERVISOR_CREATE = new SupervisorRequestMethod("SupervisorCreate");
  /** Variable representing the SupervisorFind method */
  public static final SupervisorRequestMethod SUPERVISOR_FIND = new SupervisorRequestMethod("SupervisorFind");
  /** Variable representing the SupervisorGet method */
  public static final SupervisorRequestMethod SUPERVISOR_GET = new SupervisorRequestMethod("SupervisorGet");
  /** Variable representing the SupervisorUpdate method */
  public static final SupervisorRequestMethod SUPERVISOR_UPDATE = new SupervisorRequestMethod("SupervisorUpdate");
}
