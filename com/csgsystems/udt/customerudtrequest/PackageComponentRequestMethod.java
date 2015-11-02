/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PackageComponentRequestMethod implements UdtMethod {
  private String method = null;
  private PackageComponentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PackageComponentCreate method */
  public static final PackageComponentRequestMethod PACKAGE_COMPONENT_CREATE = new PackageComponentRequestMethod("PackageComponentCreate");
  /** Variable representing the PackageComponentDelete method */
  public static final PackageComponentRequestMethod PACKAGE_COMPONENT_DELETE = new PackageComponentRequestMethod("PackageComponentDelete");
  /** Variable representing the PackageComponentFind method */
  public static final PackageComponentRequestMethod PACKAGE_COMPONENT_FIND = new PackageComponentRequestMethod("PackageComponentFind");
  /** Variable representing the PackageComponentGet method */
  public static final PackageComponentRequestMethod PACKAGE_COMPONENT_GET = new PackageComponentRequestMethod("PackageComponentGet");
  /** Variable representing the PackageComponentUpdate method */
  public static final PackageComponentRequestMethod PACKAGE_COMPONENT_UPDATE = new PackageComponentRequestMethod("PackageComponentUpdate");
}
