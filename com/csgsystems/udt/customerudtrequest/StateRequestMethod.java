/*
 * Generated code DO NOT EDIT
 * Generated file: StateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StateRequestMethod implements UdtMethod {
  private String method = null;
  private StateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StateCreate method */
  public static final StateRequestMethod STATE_CREATE = new StateRequestMethod("StateCreate");
  /** Variable representing the StateDelete method */
  public static final StateRequestMethod STATE_DELETE = new StateRequestMethod("StateDelete");
  /** Variable representing the StateFind method */
  public static final StateRequestMethod STATE_FIND = new StateRequestMethod("StateFind");
  /** Variable representing the StateGet method */
  public static final StateRequestMethod STATE_GET = new StateRequestMethod("StateGet");
  /** Variable representing the StateUpdate method */
  public static final StateRequestMethod STATE_UPDATE = new StateRequestMethod("StateUpdate");
}
