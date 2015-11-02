/*
 * Generated code DO NOT EDIT
 * Generated file: ServPackageTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServPackageTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServPackageTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServPackageTypeFind method */
  public static final ServPackageTypeRequestMethod SERV_PACKAGE_TYPE_FIND = new ServPackageTypeRequestMethod("ServPackageTypeFind");
}
