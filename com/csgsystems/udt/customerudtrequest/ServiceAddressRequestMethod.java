/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceAddressRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceAddressRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceAddressFind method */
  public static final ServiceAddressRequestMethod SERVICE_ADDRESS_FIND = new ServiceAddressRequestMethod("ServiceAddressFind");
}
