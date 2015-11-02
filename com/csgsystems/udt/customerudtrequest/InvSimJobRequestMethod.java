/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvSimJobRequestMethod implements UdtMethod {
  private String method = null;
  private InvSimJobRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvSimJobCreate method */
  public static final InvSimJobRequestMethod INV_SIM_JOB_CREATE = new InvSimJobRequestMethod("InvSimJobCreate");
  /** Variable representing the InvSimJobFind method */
  public static final InvSimJobRequestMethod INV_SIM_JOB_FIND = new InvSimJobRequestMethod("InvSimJobFind");
  /** Variable representing the InvSimJobGet method */
  public static final InvSimJobRequestMethod INV_SIM_JOB_GET = new InvSimJobRequestMethod("InvSimJobGet");
}
