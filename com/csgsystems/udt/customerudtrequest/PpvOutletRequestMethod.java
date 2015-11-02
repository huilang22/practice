/*
 * Generated code DO NOT EDIT
 * Generated file: PpvOutletRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PpvOutletRequestMethod implements UdtMethod {
  private String method = null;
  private PpvOutletRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PpvOutletFind method */
  public static final PpvOutletRequestMethod PPV_OUTLET_FIND = new PpvOutletRequestMethod("PpvOutletFind");
}
