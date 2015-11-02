/*
 * Generated code DO NOT EDIT
 * Generated file: BoundaryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BoundaryRequestMethod implements UdtMethod {
  private String method = null;
  private BoundaryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BoundaryGet method */
  public static final BoundaryRequestMethod BOUNDARY_GET = new BoundaryRequestMethod("BoundaryGet");
  /** Variable representing the BoundaryListActive method */
  public static final BoundaryRequestMethod BOUNDARY_LIST_ACTIVE = new BoundaryRequestMethod("BoundaryListActive");
}
