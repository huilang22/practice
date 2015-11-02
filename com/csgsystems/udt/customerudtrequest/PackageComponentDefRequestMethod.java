/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PackageComponentDefRequestMethod implements UdtMethod {
  private String method = null;
  private PackageComponentDefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PackageComponentDefFind method */
  public static final PackageComponentDefRequestMethod PACKAGE_COMPONENT_DEF_FIND = new PackageComponentDefRequestMethod("PackageComponentDefFind");
  /** Variable representing the PackageComponentDefFindByAccount method */
  public static final PackageComponentDefRequestMethod PACKAGE_COMPONENT_DEF_FIND_BY_ACCOUNT = new PackageComponentDefRequestMethod("PackageComponentDefFindByAccount");
  /** Variable representing the PackageComponentDefFindByService method */
  public static final PackageComponentDefRequestMethod PACKAGE_COMPONENT_DEF_FIND_BY_SERVICE = new PackageComponentDefRequestMethod("PackageComponentDefFindByService");
  /** Variable representing the PackageComponentDefGet method */
  public static final PackageComponentDefRequestMethod PACKAGE_COMPONENT_DEF_GET = new PackageComponentDefRequestMethod("PackageComponentDefGet");
}
