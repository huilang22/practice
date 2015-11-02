/*
 * Generated code DO NOT EDIT
 * Generated file: SvcComponentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SvcComponentRequestMethod implements UdtMethod {
  private String method = null;
  private SvcComponentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SvcComponentFind method */
  public static final SvcComponentRequestMethod SVC_COMPONENT_FIND = new SvcComponentRequestMethod("SvcComponentFind");
}
