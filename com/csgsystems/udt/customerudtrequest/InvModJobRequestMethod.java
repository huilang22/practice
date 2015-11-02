/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvModJobRequestMethod implements UdtMethod {
  private String method = null;
  private InvModJobRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvModJobCount method */
  public static final InvModJobRequestMethod INV_MOD_JOB_COUNT = new InvModJobRequestMethod("InvModJobCount");
  /** Variable representing the InvModJobCreate method */
  public static final InvModJobRequestMethod INV_MOD_JOB_CREATE = new InvModJobRequestMethod("InvModJobCreate");
  /** Variable representing the InvModJobFind method */
  public static final InvModJobRequestMethod INV_MOD_JOB_FIND = new InvModJobRequestMethod("InvModJobFind");
  /** Variable representing the InvModJobGet method */
  public static final InvModJobRequestMethod INV_MOD_JOB_GET = new InvModJobRequestMethod("InvModJobGet");
  /** Variable representing the InvModJobVector method */
  public static final InvModJobRequestMethod INV_MOD_JOB_VECTOR = new InvModJobRequestMethod("InvModJobVector");
}
