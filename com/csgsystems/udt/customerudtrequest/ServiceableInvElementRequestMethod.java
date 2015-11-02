/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableInvElementRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceableInvElementRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceableInvElementRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceableInvElementFind method */
  public static final ServiceableInvElementRequestMethod SERVICEABLE_INV_ELEMENT_FIND = new ServiceableInvElementRequestMethod("ServiceableInvElementFind");
}
