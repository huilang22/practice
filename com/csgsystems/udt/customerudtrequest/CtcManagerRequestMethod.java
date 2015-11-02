/*
 * Generated code DO NOT EDIT
 * Generated file: CtcManagerRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcManagerRequestMethod implements UdtMethod {
  private String method = null;
  private CtcManagerRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcManagerLoad method */
  public static final CtcManagerRequestMethod CTC_MANAGER_LOAD = new CtcManagerRequestMethod("CtcManagerLoad");
}
