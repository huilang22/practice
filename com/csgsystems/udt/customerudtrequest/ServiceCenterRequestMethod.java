/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceCenterRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceCenterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceCenterCreate method */
  public static final ServiceCenterRequestMethod SERVICE_CENTER_CREATE = new ServiceCenterRequestMethod("ServiceCenterCreate");
  /** Variable representing the ServiceCenterDelete method */
  public static final ServiceCenterRequestMethod SERVICE_CENTER_DELETE = new ServiceCenterRequestMethod("ServiceCenterDelete");
  /** Variable representing the ServiceCenterFind method */
  public static final ServiceCenterRequestMethod SERVICE_CENTER_FIND = new ServiceCenterRequestMethod("ServiceCenterFind");
  /** Variable representing the ServiceCenterGet method */
  public static final ServiceCenterRequestMethod SERVICE_CENTER_GET = new ServiceCenterRequestMethod("ServiceCenterGet");
  /** Variable representing the ServiceCenterUpdate method */
  public static final ServiceCenterRequestMethod SERVICE_CENTER_UPDATE = new ServiceCenterRequestMethod("ServiceCenterUpdate");
}
