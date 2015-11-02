/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceProviderRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceProviderRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceProviderRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceProviderCreate method */
  public static final ServiceProviderRequestMethod SERVICE_PROVIDER_CREATE = new ServiceProviderRequestMethod("ServiceProviderCreate");
  /** Variable representing the ServiceProviderFind method */
  public static final ServiceProviderRequestMethod SERVICE_PROVIDER_FIND = new ServiceProviderRequestMethod("ServiceProviderFind");
  /** Variable representing the ServiceProviderGet method */
  public static final ServiceProviderRequestMethod SERVICE_PROVIDER_GET = new ServiceProviderRequestMethod("ServiceProviderGet");
  /** Variable representing the ServiceProviderUpdate method */
  public static final ServiceProviderRequestMethod SERVICE_PROVIDER_UPDATE = new ServiceProviderRequestMethod("ServiceProviderUpdate");
}
