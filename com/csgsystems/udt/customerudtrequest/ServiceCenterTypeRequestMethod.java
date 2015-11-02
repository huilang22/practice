/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceCenterTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceCenterTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceCenterTypeFind method */
  public static final ServiceCenterTypeRequestMethod SERVICE_CENTER_TYPE_FIND = new ServiceCenterTypeRequestMethod("ServiceCenterTypeFind");
  /** Variable representing the ServiceCenterTypeGet method */
  public static final ServiceCenterTypeRequestMethod SERVICE_CENTER_TYPE_GET = new ServiceCenterTypeRequestMethod("ServiceCenterTypeGet");
}
