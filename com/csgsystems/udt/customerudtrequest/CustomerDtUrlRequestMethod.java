/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtUrlRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CustomerDtUrlRequestMethod implements UdtMethod {
  private String method = null;
  private CustomerDtUrlRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CustomerDtUrlFind method */
  public static final CustomerDtUrlRequestMethod CUSTOMER_DT_URL_FIND = new CustomerDtUrlRequestMethod("CustomerDtUrlFind");
  /** Variable representing the CustomerDtUrlGet method */
  public static final CustomerDtUrlRequestMethod CUSTOMER_DT_URL_GET = new CustomerDtUrlRequestMethod("CustomerDtUrlGet");
}
