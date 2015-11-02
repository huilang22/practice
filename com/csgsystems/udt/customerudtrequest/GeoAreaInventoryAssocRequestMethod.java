/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaInventoryAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaInventoryAssocRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaInventoryAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaInventoryAssocCreate method */
  public static final GeoAreaInventoryAssocRequestMethod GEO_AREA_INVENTORY_ASSOC_CREATE = new GeoAreaInventoryAssocRequestMethod("GeoAreaInventoryAssocCreate");
  /** Variable representing the GeoAreaInventoryAssocFind method */
  public static final GeoAreaInventoryAssocRequestMethod GEO_AREA_INVENTORY_ASSOC_FIND = new GeoAreaInventoryAssocRequestMethod("GeoAreaInventoryAssocFind");
  /** Variable representing the GeoAreaInventoryAssocGet method */
  public static final GeoAreaInventoryAssocRequestMethod GEO_AREA_INVENTORY_ASSOC_GET = new GeoAreaInventoryAssocRequestMethod("GeoAreaInventoryAssocGet");
  /** Variable representing the GeoAreaInventoryAssocResetAuto method */
  public static final GeoAreaInventoryAssocRequestMethod GEO_AREA_INVENTORY_ASSOC_RESET_AUTO = new GeoAreaInventoryAssocRequestMethod("GeoAreaInventoryAssocResetAuto");
  /** Variable representing the GeoAreaInventoryAssocUpdate method */
  public static final GeoAreaInventoryAssocRequestMethod GEO_AREA_INVENTORY_ASSOC_UPDATE = new GeoAreaInventoryAssocRequestMethod("GeoAreaInventoryAssocUpdate");
}
