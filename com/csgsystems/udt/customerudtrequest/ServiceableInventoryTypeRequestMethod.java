/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableInventoryTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceableInventoryTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceableInventoryTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceableInventoryTypeFind method */
  public static final ServiceableInventoryTypeRequestMethod SERVICEABLE_INVENTORY_TYPE_FIND = new ServiceableInventoryTypeRequestMethod("ServiceableInventoryTypeFind");
}
