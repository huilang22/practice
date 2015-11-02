/*
 * Generated code DO NOT EDIT
 * Generated file: CmfPackageOverridesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CmfPackageOverridesRequestMethod implements UdtMethod {
  private String method = null;
  private CmfPackageOverridesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CmfPackageOverridesCreate method */
  public static final CmfPackageOverridesRequestMethod CMF_PACKAGE_OVERRIDES_CREATE = new CmfPackageOverridesRequestMethod("CmfPackageOverridesCreate");
  /** Variable representing the CmfPackageOverridesDelete method */
  public static final CmfPackageOverridesRequestMethod CMF_PACKAGE_OVERRIDES_DELETE = new CmfPackageOverridesRequestMethod("CmfPackageOverridesDelete");
  /** Variable representing the CmfPackageOverridesFind method */
  public static final CmfPackageOverridesRequestMethod CMF_PACKAGE_OVERRIDES_FIND = new CmfPackageOverridesRequestMethod("CmfPackageOverridesFind");
  /** Variable representing the CmfPackageOverridesGet method */
  public static final CmfPackageOverridesRequestMethod CMF_PACKAGE_OVERRIDES_GET = new CmfPackageOverridesRequestMethod("CmfPackageOverridesGet");
  /** Variable representing the CmfPackageOverridesUpdate method */
  public static final CmfPackageOverridesRequestMethod CMF_PACKAGE_OVERRIDES_UPDATE = new CmfPackageOverridesRequestMethod("CmfPackageOverridesUpdate");
}
