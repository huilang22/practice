/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefValidateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PackageComponentDefValidateRequestMethod implements UdtMethod {
  private String method = null;
  private PackageComponentDefValidateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PackageComponentDefValidateCreate method */
  public static final PackageComponentDefValidateRequestMethod PACKAGE_COMPONENT_DEF_VALIDATE_CREATE = new PackageComponentDefValidateRequestMethod("PackageComponentDefValidateCreate");
}
