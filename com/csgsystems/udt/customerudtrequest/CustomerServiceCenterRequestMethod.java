/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerServiceCenterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CustomerServiceCenterRequestMethod implements UdtMethod {
  private String method = null;
  private CustomerServiceCenterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CustomerServiceCenterCreate method */
  public static final CustomerServiceCenterRequestMethod CUSTOMER_SERVICE_CENTER_CREATE = new CustomerServiceCenterRequestMethod("CustomerServiceCenterCreate");
  /** Variable representing the CustomerServiceCenterFind method */
  public static final CustomerServiceCenterRequestMethod CUSTOMER_SERVICE_CENTER_FIND = new CustomerServiceCenterRequestMethod("CustomerServiceCenterFind");
  /** Variable representing the CustomerServiceCenterGet method */
  public static final CustomerServiceCenterRequestMethod CUSTOMER_SERVICE_CENTER_GET = new CustomerServiceCenterRequestMethod("CustomerServiceCenterGet");
  /** Variable representing the CustomerServiceCenterUpdate method */
  public static final CustomerServiceCenterRequestMethod CUSTOMER_SERVICE_CENTER_UPDATE = new CustomerServiceCenterRequestMethod("CustomerServiceCenterUpdate");
}
