/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobsubstateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsJobsubstateRequestMethod implements UdtMethod {
  private String method = null;
  private InvsJobsubstateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsJobsubstateFind method */
  public static final InvsJobsubstateRequestMethod INVS_JOBSUBSTATE_FIND = new InvsJobsubstateRequestMethod("InvsJobsubstateFind");
  /** Variable representing the InvsJobsubstateGet method */
  public static final InvsJobsubstateRequestMethod INVS_JOBSUBSTATE_GET = new InvsJobsubstateRequestMethod("InvsJobsubstateGet");
}
