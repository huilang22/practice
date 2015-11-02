/*
 * Generated code DO NOT EDIT
 * Generated file: SvcCmfPackageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SvcCmfPackageRequestMethod implements UdtMethod {
  private String method = null;
  private SvcCmfPackageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SvcCmfPackageFind method */
  public static final SvcCmfPackageRequestMethod SVC_CMF_PACKAGE_FIND = new SvcCmfPackageRequestMethod("SvcCmfPackageFind");
}
