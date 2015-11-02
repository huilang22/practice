/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerLifetimeIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CustomerLifetimeIdRequestMethod implements UdtMethod {
  private String method = null;
  private CustomerLifetimeIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CustomerLifetimeIdCreate method */
  public static final CustomerLifetimeIdRequestMethod CUSTOMER_LIFETIME_ID_CREATE = new CustomerLifetimeIdRequestMethod("CustomerLifetimeIdCreate");
  /** Variable representing the CustomerLifetimeIdDelete method */
  public static final CustomerLifetimeIdRequestMethod CUSTOMER_LIFETIME_ID_DELETE = new CustomerLifetimeIdRequestMethod("CustomerLifetimeIdDelete");
  /** Variable representing the CustomerLifetimeIdFind method */
  public static final CustomerLifetimeIdRequestMethod CUSTOMER_LIFETIME_ID_FIND = new CustomerLifetimeIdRequestMethod("CustomerLifetimeIdFind");
  /** Variable representing the CustomerLifetimeIdGet method */
  public static final CustomerLifetimeIdRequestMethod CUSTOMER_LIFETIME_ID_GET = new CustomerLifetimeIdRequestMethod("CustomerLifetimeIdGet");
  /** Variable representing the CustomerLifetimeIdUpdate method */
  public static final CustomerLifetimeIdRequestMethod CUSTOMER_LIFETIME_ID_UPDATE = new CustomerLifetimeIdRequestMethod("CustomerLifetimeIdUpdate");
}
