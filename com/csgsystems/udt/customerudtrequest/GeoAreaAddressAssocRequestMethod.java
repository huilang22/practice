/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaAddressAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaAddressAssocRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaAddressAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaAddressAssocCreate method */
  public static final GeoAreaAddressAssocRequestMethod GEO_AREA_ADDRESS_ASSOC_CREATE = new GeoAreaAddressAssocRequestMethod("GeoAreaAddressAssocCreate");
  /** Variable representing the GeoAreaAddressAssocFind method */
  public static final GeoAreaAddressAssocRequestMethod GEO_AREA_ADDRESS_ASSOC_FIND = new GeoAreaAddressAssocRequestMethod("GeoAreaAddressAssocFind");
  /** Variable representing the GeoAreaAddressAssocGet method */
  public static final GeoAreaAddressAssocRequestMethod GEO_AREA_ADDRESS_ASSOC_GET = new GeoAreaAddressAssocRequestMethod("GeoAreaAddressAssocGet");
  /** Variable representing the GeoAreaAddressAssocResetAuto method */
  public static final GeoAreaAddressAssocRequestMethod GEO_AREA_ADDRESS_ASSOC_RESET_AUTO = new GeoAreaAddressAssocRequestMethod("GeoAreaAddressAssocResetAuto");
  /** Variable representing the GeoAreaAddressAssocUpdate method */
  public static final GeoAreaAddressAssocRequestMethod GEO_AREA_ADDRESS_ASSOC_UPDATE = new GeoAreaAddressAssocRequestMethod("GeoAreaAddressAssocUpdate");
}
