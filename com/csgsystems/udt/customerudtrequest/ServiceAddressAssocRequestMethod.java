/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceAddressAssocRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceAddressAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceAddressAssocCreate method */
  public static final ServiceAddressAssocRequestMethod SERVICE_ADDRESS_ASSOC_CREATE = new ServiceAddressAssocRequestMethod("ServiceAddressAssocCreate");
  /** Variable representing the ServiceAddressAssocFind method */
  public static final ServiceAddressAssocRequestMethod SERVICE_ADDRESS_ASSOC_FIND = new ServiceAddressAssocRequestMethod("ServiceAddressAssocFind");
  /** Variable representing the ServiceAddressAssocGet method */
  public static final ServiceAddressAssocRequestMethod SERVICE_ADDRESS_ASSOC_GET = new ServiceAddressAssocRequestMethod("ServiceAddressAssocGet");
  /** Variable representing the ServiceAddressAssocUpdate method */
  public static final ServiceAddressAssocRequestMethod SERVICE_ADDRESS_ASSOC_UPDATE = new ServiceAddressAssocRequestMethod("ServiceAddressAssocUpdate");
}
