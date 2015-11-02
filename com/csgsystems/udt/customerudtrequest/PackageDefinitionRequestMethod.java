/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PackageDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private PackageDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PackageDefinitionCreate method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_CREATE = new PackageDefinitionRequestMethod("PackageDefinitionCreate");
  /** Variable representing the PackageDefinitionDelete method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_DELETE = new PackageDefinitionRequestMethod("PackageDefinitionDelete");
  /** Variable representing the PackageDefinitionFind method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_FIND = new PackageDefinitionRequestMethod("PackageDefinitionFind");
  /** Variable representing the PackageDefinitionFindByAccount method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_FIND_BY_ACCOUNT = new PackageDefinitionRequestMethod("PackageDefinitionFindByAccount");
  /** Variable representing the PackageDefinitionFindByComponentAccount method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_FIND_BY_COMPONENT_ACCOUNT = new PackageDefinitionRequestMethod("PackageDefinitionFindByComponentAccount");
  /** Variable representing the PackageDefinitionFindByComponentService method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_FIND_BY_COMPONENT_SERVICE = new PackageDefinitionRequestMethod("PackageDefinitionFindByComponentService");
  /** Variable representing the PackageDefinitionGet method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_GET = new PackageDefinitionRequestMethod("PackageDefinitionGet");
  /** Variable representing the PackageDefinitionPrice method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_PRICE = new PackageDefinitionRequestMethod("PackageDefinitionPrice");
  /** Variable representing the PackageDefinitionUpdate method */
  public static final PackageDefinitionRequestMethod PACKAGE_DEFINITION_UPDATE = new PackageDefinitionRequestMethod("PackageDefinitionUpdate");
}
