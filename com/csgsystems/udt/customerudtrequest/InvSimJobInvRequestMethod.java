/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobInvRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvSimJobInvRequestMethod implements UdtMethod {
  private String method = null;
  private InvSimJobInvRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvSimJobInvFind method */
  public static final InvSimJobInvRequestMethod INV_SIM_JOB_INV_FIND = new InvSimJobInvRequestMethod("InvSimJobInvFind");
  /** Variable representing the InvSimJobInvGet method */
  public static final InvSimJobInvRequestMethod INV_SIM_JOB_INV_GET = new InvSimJobInvRequestMethod("InvSimJobInvGet");
}
