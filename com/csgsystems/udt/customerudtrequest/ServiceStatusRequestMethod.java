/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceStatusRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceStatusFind method */
  public static final ServiceStatusRequestMethod SERVICE_STATUS_FIND = new ServiceStatusRequestMethod("ServiceStatusFind");
  /** Variable representing the ServiceStatusGet method */
  public static final ServiceStatusRequestMethod SERVICE_STATUS_GET = new ServiceStatusRequestMethod("ServiceStatusGet");
}
