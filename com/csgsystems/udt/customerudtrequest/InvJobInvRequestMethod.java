/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobInvRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvJobInvRequestMethod implements UdtMethod {
  private String method = null;
  private InvJobInvRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvJobInvFind method */
  public static final InvJobInvRequestMethod INV_JOB_INV_FIND = new InvJobInvRequestMethod("InvJobInvFind");
  /** Variable representing the InvJobInvGet method */
  public static final InvJobInvRequestMethod INV_JOB_INV_GET = new InvJobInvRequestMethod("InvJobInvGet");
}
