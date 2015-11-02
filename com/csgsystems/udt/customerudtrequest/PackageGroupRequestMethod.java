/*
 * Generated code DO NOT EDIT
 * Generated file: PackageGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PackageGroupRequestMethod implements UdtMethod {
  private String method = null;
  private PackageGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PackageGroupCreate method */
  public static final PackageGroupRequestMethod PACKAGE_GROUP_CREATE = new PackageGroupRequestMethod("PackageGroupCreate");
  /** Variable representing the PackageGroupDelete method */
  public static final PackageGroupRequestMethod PACKAGE_GROUP_DELETE = new PackageGroupRequestMethod("PackageGroupDelete");
  /** Variable representing the PackageGroupFind method */
  public static final PackageGroupRequestMethod PACKAGE_GROUP_FIND = new PackageGroupRequestMethod("PackageGroupFind");
  /** Variable representing the PackageGroupGet method */
  public static final PackageGroupRequestMethod PACKAGE_GROUP_GET = new PackageGroupRequestMethod("PackageGroupGet");
  /** Variable representing the PackageGroupUpdate method */
  public static final PackageGroupRequestMethod PACKAGE_GROUP_UPDATE = new PackageGroupRequestMethod("PackageGroupUpdate");
}
