/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceablePackageTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceablePackageTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceablePackageTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceablePackageTypeFind method */
  public static final ServiceablePackageTypeRequestMethod SERVICEABLE_PACKAGE_TYPE_FIND = new ServiceablePackageTypeRequestMethod("ServiceablePackageTypeFind");
}
