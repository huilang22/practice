/*
 * Generated code DO NOT EDIT
 * Generated file: PpvServiceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PpvServiceRequestMethod implements UdtMethod {
  private String method = null;
  private PpvServiceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PpvServiceFind method */
  public static final PpvServiceRequestMethod PPV_SERVICE_FIND = new PpvServiceRequestMethod("PpvServiceFind");
}
