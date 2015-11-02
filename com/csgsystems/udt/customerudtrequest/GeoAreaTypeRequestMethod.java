/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaTypeRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaTypeCreate method */
  public static final GeoAreaTypeRequestMethod GEO_AREA_TYPE_CREATE = new GeoAreaTypeRequestMethod("GeoAreaTypeCreate");
  /** Variable representing the GeoAreaTypeDelete method */
  public static final GeoAreaTypeRequestMethod GEO_AREA_TYPE_DELETE = new GeoAreaTypeRequestMethod("GeoAreaTypeDelete");
  /** Variable representing the GeoAreaTypeFind method */
  public static final GeoAreaTypeRequestMethod GEO_AREA_TYPE_FIND = new GeoAreaTypeRequestMethod("GeoAreaTypeFind");
  /** Variable representing the GeoAreaTypeGet method */
  public static final GeoAreaTypeRequestMethod GEO_AREA_TYPE_GET = new GeoAreaTypeRequestMethod("GeoAreaTypeGet");
  /** Variable representing the GeoAreaTypeUpdate method */
  public static final GeoAreaTypeRequestMethod GEO_AREA_TYPE_UPDATE = new GeoAreaTypeRequestMethod("GeoAreaTypeUpdate");
}
