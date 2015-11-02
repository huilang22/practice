/*
 * Generated code DO NOT EDIT
 * Generated file: AddressCategoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AddressCategoryRequestMethod implements UdtMethod {
  private String method = null;
  private AddressCategoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AddressCategoryCreate method */
  public static final AddressCategoryRequestMethod ADDRESS_CATEGORY_CREATE = new AddressCategoryRequestMethod("AddressCategoryCreate");
  /** Variable representing the AddressCategoryFind method */
  public static final AddressCategoryRequestMethod ADDRESS_CATEGORY_FIND = new AddressCategoryRequestMethod("AddressCategoryFind");
  /** Variable representing the AddressCategoryGet method */
  public static final AddressCategoryRequestMethod ADDRESS_CATEGORY_GET = new AddressCategoryRequestMethod("AddressCategoryGet");
  /** Variable representing the AddressCategoryUpdate method */
  public static final AddressCategoryRequestMethod ADDRESS_CATEGORY_UPDATE = new AddressCategoryRequestMethod("AddressCategoryUpdate");
}
