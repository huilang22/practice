/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaCreate method */
  public static final GeoAreaRequestMethod GEO_AREA_CREATE = new GeoAreaRequestMethod("GeoAreaCreate");
  /** Variable representing the GeoAreaDelete method */
  public static final GeoAreaRequestMethod GEO_AREA_DELETE = new GeoAreaRequestMethod("GeoAreaDelete");
  /** Variable representing the GeoAreaFind method */
  public static final GeoAreaRequestMethod GEO_AREA_FIND = new GeoAreaRequestMethod("GeoAreaFind");
  /** Variable representing the GeoAreaFindByAddress method */
  public static final GeoAreaRequestMethod GEO_AREA_FIND_BY_ADDRESS = new GeoAreaRequestMethod("GeoAreaFindByAddress");
  /** Variable representing the GeoAreaGet method */
  public static final GeoAreaRequestMethod GEO_AREA_GET = new GeoAreaRequestMethod("GeoAreaGet");
  /** Variable representing the GeoAreaUpdate method */
  public static final GeoAreaRequestMethod GEO_AREA_UPDATE = new GeoAreaRequestMethod("GeoAreaUpdate");
}
