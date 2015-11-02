/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetDirectionalRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AddressStreetDirectionalRequestMethod implements UdtMethod {
  private String method = null;
  private AddressStreetDirectionalRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AddressStreetDirectionalCreate method */
  public static final AddressStreetDirectionalRequestMethod ADDRESS_STREET_DIRECTIONAL_CREATE = new AddressStreetDirectionalRequestMethod("AddressStreetDirectionalCreate");
  /** Variable representing the AddressStreetDirectionalDelete method */
  public static final AddressStreetDirectionalRequestMethod ADDRESS_STREET_DIRECTIONAL_DELETE = new AddressStreetDirectionalRequestMethod("AddressStreetDirectionalDelete");
  /** Variable representing the AddressStreetDirectionalFind method */
  public static final AddressStreetDirectionalRequestMethod ADDRESS_STREET_DIRECTIONAL_FIND = new AddressStreetDirectionalRequestMethod("AddressStreetDirectionalFind");
  /** Variable representing the AddressStreetDirectionalGet method */
  public static final AddressStreetDirectionalRequestMethod ADDRESS_STREET_DIRECTIONAL_GET = new AddressStreetDirectionalRequestMethod("AddressStreetDirectionalGet");
  /** Variable representing the AddressStreetDirectionalUpdate method */
  public static final AddressStreetDirectionalRequestMethod ADDRESS_STREET_DIRECTIONAL_UPDATE = new AddressStreetDirectionalRequestMethod("AddressStreetDirectionalUpdate");
}
