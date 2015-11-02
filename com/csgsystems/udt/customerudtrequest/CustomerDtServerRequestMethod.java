/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtServerRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CustomerDtServerRequestMethod implements UdtMethod {
  private String method = null;
  private CustomerDtServerRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CustomerDtServerFind method */
  public static final CustomerDtServerRequestMethod CUSTOMER_DT_SERVER_FIND = new CustomerDtServerRequestMethod("CustomerDtServerFind");
}
