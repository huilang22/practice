/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetSuffixRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AddressStreetSuffixRequestMethod implements UdtMethod {
  private String method = null;
  private AddressStreetSuffixRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AddressStreetSuffixCreate method */
  public static final AddressStreetSuffixRequestMethod ADDRESS_STREET_SUFFIX_CREATE = new AddressStreetSuffixRequestMethod("AddressStreetSuffixCreate");
  /** Variable representing the AddressStreetSuffixDelete method */
  public static final AddressStreetSuffixRequestMethod ADDRESS_STREET_SUFFIX_DELETE = new AddressStreetSuffixRequestMethod("AddressStreetSuffixDelete");
  /** Variable representing the AddressStreetSuffixFind method */
  public static final AddressStreetSuffixRequestMethod ADDRESS_STREET_SUFFIX_FIND = new AddressStreetSuffixRequestMethod("AddressStreetSuffixFind");
  /** Variable representing the AddressStreetSuffixGet method */
  public static final AddressStreetSuffixRequestMethod ADDRESS_STREET_SUFFIX_GET = new AddressStreetSuffixRequestMethod("AddressStreetSuffixGet");
  /** Variable representing the AddressStreetSuffixUpdate method */
  public static final AddressStreetSuffixRequestMethod ADDRESS_STREET_SUFFIX_UPDATE = new AddressStreetSuffixRequestMethod("AddressStreetSuffixUpdate");
}
