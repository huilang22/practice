/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableComponentTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceableComponentTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceableComponentTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceableComponentTypeFind method */
  public static final ServiceableComponentTypeRequestMethod SERVICEABLE_COMPONENT_TYPE_FIND = new ServiceableComponentTypeRequestMethod("ServiceableComponentTypeFind");
}
