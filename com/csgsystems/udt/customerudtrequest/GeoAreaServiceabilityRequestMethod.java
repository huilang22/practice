/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaServiceabilityRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaServiceabilityRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaServiceabilityRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaServiceabilityCreate method */
  public static final GeoAreaServiceabilityRequestMethod GEO_AREA_SERVICEABILITY_CREATE = new GeoAreaServiceabilityRequestMethod("GeoAreaServiceabilityCreate");
  /** Variable representing the GeoAreaServiceabilityDelete method */
  public static final GeoAreaServiceabilityRequestMethod GEO_AREA_SERVICEABILITY_DELETE = new GeoAreaServiceabilityRequestMethod("GeoAreaServiceabilityDelete");
  /** Variable representing the GeoAreaServiceabilityFind method */
  public static final GeoAreaServiceabilityRequestMethod GEO_AREA_SERVICEABILITY_FIND = new GeoAreaServiceabilityRequestMethod("GeoAreaServiceabilityFind");
  /** Variable representing the GeoAreaServiceabilityGet method */
  public static final GeoAreaServiceabilityRequestMethod GEO_AREA_SERVICEABILITY_GET = new GeoAreaServiceabilityRequestMethod("GeoAreaServiceabilityGet");
  /** Variable representing the GeoAreaServiceabilityUpdate method */
  public static final GeoAreaServiceabilityRequestMethod GEO_AREA_SERVICEABILITY_UPDATE = new GeoAreaServiceabilityRequestMethod("GeoAreaServiceabilityUpdate");
}
