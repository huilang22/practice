/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PackageComponentMemberRequestMethod implements UdtMethod {
  private String method = null;
  private PackageComponentMemberRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PackageComponentMemberCreate method */
  public static final PackageComponentMemberRequestMethod PACKAGE_COMPONENT_MEMBER_CREATE = new PackageComponentMemberRequestMethod("PackageComponentMemberCreate");
  /** Variable representing the PackageComponentMemberDelete method */
  public static final PackageComponentMemberRequestMethod PACKAGE_COMPONENT_MEMBER_DELETE = new PackageComponentMemberRequestMethod("PackageComponentMemberDelete");
  /** Variable representing the PackageComponentMemberFind method */
  public static final PackageComponentMemberRequestMethod PACKAGE_COMPONENT_MEMBER_FIND = new PackageComponentMemberRequestMethod("PackageComponentMemberFind");
  /** Variable representing the PackageComponentMemberFindPC method */
  public static final PackageComponentMemberRequestMethod PACKAGE_COMPONENT_MEMBER_FIND_P_C = new PackageComponentMemberRequestMethod("PackageComponentMemberFindPC");
  /** Variable representing the PackageComponentMemberGet method */
  public static final PackageComponentMemberRequestMethod PACKAGE_COMPONENT_MEMBER_GET = new PackageComponentMemberRequestMethod("PackageComponentMemberGet");
  /** Variable representing the PackageComponentMemberGetPC method */
  public static final PackageComponentMemberRequestMethod PACKAGE_COMPONENT_MEMBER_GET_P_C = new PackageComponentMemberRequestMethod("PackageComponentMemberGetPC");
  /** Variable representing the PackageComponentMemberUpdate method */
  public static final PackageComponentMemberRequestMethod PACKAGE_COMPONENT_MEMBER_UPDATE = new PackageComponentMemberRequestMethod("PackageComponentMemberUpdate");
}
