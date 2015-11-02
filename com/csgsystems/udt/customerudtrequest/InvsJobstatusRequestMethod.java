/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobstatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsJobstatusRequestMethod implements UdtMethod {
  private String method = null;
  private InvsJobstatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsJobstatusFind method */
  public static final InvsJobstatusRequestMethod INVS_JOBSTATUS_FIND = new InvsJobstatusRequestMethod("InvsJobstatusFind");
  /** Variable representing the InvsJobstatusGet method */
  public static final InvsJobstatusRequestMethod INVS_JOBSTATUS_GET = new InvsJobstatusRequestMethod("InvsJobstatusGet");
}
