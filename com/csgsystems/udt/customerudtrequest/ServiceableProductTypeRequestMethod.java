/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableProductTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceableProductTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceableProductTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceableProductTypeFind method */
  public static final ServiceableProductTypeRequestMethod SERVICEABLE_PRODUCT_TYPE_FIND = new ServiceableProductTypeRequestMethod("ServiceableProductTypeFind");
}
