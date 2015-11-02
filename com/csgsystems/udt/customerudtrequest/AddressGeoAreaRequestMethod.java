/*
 * Generated code DO NOT EDIT
 * Generated file: AddressGeoAreaRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AddressGeoAreaRequestMethod implements UdtMethod {
  private String method = null;
  private AddressGeoAreaRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AddressGeoAreaFind method */
  public static final AddressGeoAreaRequestMethod ADDRESS_GEO_AREA_FIND = new AddressGeoAreaRequestMethod("AddressGeoAreaFind");
}
