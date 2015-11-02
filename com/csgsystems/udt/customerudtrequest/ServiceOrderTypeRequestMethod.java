/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceOrderTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceOrderTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceOrderTypeCreate method */
  public static final ServiceOrderTypeRequestMethod SERVICE_ORDER_TYPE_CREATE = new ServiceOrderTypeRequestMethod("ServiceOrderTypeCreate");
  /** Variable representing the ServiceOrderTypeFind method */
  public static final ServiceOrderTypeRequestMethod SERVICE_ORDER_TYPE_FIND = new ServiceOrderTypeRequestMethod("ServiceOrderTypeFind");
  /** Variable representing the ServiceOrderTypeGet method */
  public static final ServiceOrderTypeRequestMethod SERVICE_ORDER_TYPE_GET = new ServiceOrderTypeRequestMethod("ServiceOrderTypeGet");
  /** Variable representing the ServiceOrderTypeUpdate method */
  public static final ServiceOrderTypeRequestMethod SERVICE_ORDER_TYPE_UPDATE = new ServiceOrderTypeRequestMethod("ServiceOrderTypeUpdate");
}
