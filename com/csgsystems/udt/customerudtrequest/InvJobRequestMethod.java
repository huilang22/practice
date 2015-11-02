/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvJobRequestMethod implements UdtMethod {
  private String method = null;
  private InvJobRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvJobDelete method */
  public static final InvJobRequestMethod INV_JOB_DELETE = new InvJobRequestMethod("InvJobDelete");
  /** Variable representing the InvJobFind method */
  public static final InvJobRequestMethod INV_JOB_FIND = new InvJobRequestMethod("InvJobFind");
  /** Variable representing the InvJobGet method */
  public static final InvJobRequestMethod INV_JOB_GET = new InvJobRequestMethod("InvJobGet");
  /** Variable representing the InvJobSubstateComplete method */
  public static final InvJobRequestMethod INV_JOB_SUBSTATE_COMPLETE = new InvJobRequestMethod("InvJobSubstateComplete");
  /** Variable representing the InvJobUpdate method */
  public static final InvJobRequestMethod INV_JOB_UPDATE = new InvJobRequestMethod("InvJobUpdate");
  /** Variable representing the InvJobUpdateNumber method */
  public static final InvJobRequestMethod INV_JOB_UPDATE_NUMBER = new InvJobRequestMethod("InvJobUpdateNumber");
}
