/*
 * Generated code DO NOT EDIT
 * Generated file: LateFeeTypesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LateFeeTypesRequestMethod implements UdtMethod {
  private String method = null;
  private LateFeeTypesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LateFeeTypesFind method */
  public static final LateFeeTypesRequestMethod LATE_FEE_TYPES_FIND = new LateFeeTypesRequestMethod("LateFeeTypesFind");
  /** Variable representing the LateFeeTypesGet method */
  public static final LateFeeTypesRequestMethod LATE_FEE_TYPES_GET = new LateFeeTypesRequestMethod("LateFeeTypesGet");
}
