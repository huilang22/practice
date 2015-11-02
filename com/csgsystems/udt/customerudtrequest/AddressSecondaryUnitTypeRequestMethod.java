/*
 * Generated code DO NOT EDIT
 * Generated file: AddressSecondaryUnitTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AddressSecondaryUnitTypeRequestMethod implements UdtMethod {
  private String method = null;
  private AddressSecondaryUnitTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AddressSecondaryUnitTypeCreate method */
  public static final AddressSecondaryUnitTypeRequestMethod ADDRESS_SECONDARY_UNIT_TYPE_CREATE = new AddressSecondaryUnitTypeRequestMethod("AddressSecondaryUnitTypeCreate");
  /** Variable representing the AddressSecondaryUnitTypeDelete method */
  public static final AddressSecondaryUnitTypeRequestMethod ADDRESS_SECONDARY_UNIT_TYPE_DELETE = new AddressSecondaryUnitTypeRequestMethod("AddressSecondaryUnitTypeDelete");
  /** Variable representing the AddressSecondaryUnitTypeFind method */
  public static final AddressSecondaryUnitTypeRequestMethod ADDRESS_SECONDARY_UNIT_TYPE_FIND = new AddressSecondaryUnitTypeRequestMethod("AddressSecondaryUnitTypeFind");
  /** Variable representing the AddressSecondaryUnitTypeGet method */
  public static final AddressSecondaryUnitTypeRequestMethod ADDRESS_SECONDARY_UNIT_TYPE_GET = new AddressSecondaryUnitTypeRequestMethod("AddressSecondaryUnitTypeGet");
  /** Variable representing the AddressSecondaryUnitTypeUpdate method */
  public static final AddressSecondaryUnitTypeRequestMethod ADDRESS_SECONDARY_UNIT_TYPE_UPDATE = new AddressSecondaryUnitTypeRequestMethod("AddressSecondaryUnitTypeUpdate");
}
