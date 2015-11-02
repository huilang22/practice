/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaBoundaryRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaBoundaryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaBoundaryCreate method */
  public static final GeoAreaBoundaryRequestMethod GEO_AREA_BOUNDARY_CREATE = new GeoAreaBoundaryRequestMethod("GeoAreaBoundaryCreate");
  /** Variable representing the GeoAreaBoundaryDelete method */
  public static final GeoAreaBoundaryRequestMethod GEO_AREA_BOUNDARY_DELETE = new GeoAreaBoundaryRequestMethod("GeoAreaBoundaryDelete");
  /** Variable representing the GeoAreaBoundaryFind method */
  public static final GeoAreaBoundaryRequestMethod GEO_AREA_BOUNDARY_FIND = new GeoAreaBoundaryRequestMethod("GeoAreaBoundaryFind");
  /** Variable representing the GeoAreaBoundaryGet method */
  public static final GeoAreaBoundaryRequestMethod GEO_AREA_BOUNDARY_GET = new GeoAreaBoundaryRequestMethod("GeoAreaBoundaryGet");
  /** Variable representing the GeoAreaBoundaryUpdate method */
  public static final GeoAreaBoundaryRequestMethod GEO_AREA_BOUNDARY_UPDATE = new GeoAreaBoundaryRequestMethod("GeoAreaBoundaryUpdate");
}
