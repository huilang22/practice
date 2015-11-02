/*
 * Generated code DO NOT EDIT
 * Generated file: AddressTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AddressTypeRequestMethod implements UdtMethod {
  private String method = null;
  private AddressTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AddressTypeCreate method */
  public static final AddressTypeRequestMethod ADDRESS_TYPE_CREATE = new AddressTypeRequestMethod("AddressTypeCreate");
  /** Variable representing the AddressTypeFind method */
  public static final AddressTypeRequestMethod ADDRESS_TYPE_FIND = new AddressTypeRequestMethod("AddressTypeFind");
  /** Variable representing the AddressTypeGet method */
  public static final AddressTypeRequestMethod ADDRESS_TYPE_GET = new AddressTypeRequestMethod("AddressTypeGet");
  /** Variable representing the AddressTypeUpdate method */
  public static final AddressTypeRequestMethod ADDRESS_TYPE_UPDATE = new AddressTypeRequestMethod("AddressTypeUpdate");
}
