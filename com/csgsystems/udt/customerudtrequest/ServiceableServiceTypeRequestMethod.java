/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableServiceTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceableServiceTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceableServiceTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceableServiceTypeFind method */
  public static final ServiceableServiceTypeRequestMethod SERVICEABLE_SERVICE_TYPE_FIND = new ServiceableServiceTypeRequestMethod("ServiceableServiceTypeFind");
}
