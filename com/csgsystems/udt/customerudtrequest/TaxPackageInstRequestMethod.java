/*
 * Generated code DO NOT EDIT
 * Generated file: TaxPackageInstRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TaxPackageInstRequestMethod implements UdtMethod {
  private String method = null;
  private TaxPackageInstRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TaxPackageInstFind method */
  public static final TaxPackageInstRequestMethod TAX_PACKAGE_INST_FIND = new TaxPackageInstRequestMethod("TaxPackageInstFind");
  /** Variable representing the TaxPackageInstGet method */
  public static final TaxPackageInstRequestMethod TAX_PACKAGE_INST_GET = new TaxPackageInstRequestMethod("TaxPackageInstGet");
}
