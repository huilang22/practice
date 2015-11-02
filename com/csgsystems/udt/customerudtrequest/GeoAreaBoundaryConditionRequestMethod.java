/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryConditionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaBoundaryConditionRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaBoundaryConditionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaBoundaryConditionCreate method */
  public static final GeoAreaBoundaryConditionRequestMethod GEO_AREA_BOUNDARY_CONDITION_CREATE = new GeoAreaBoundaryConditionRequestMethod("GeoAreaBoundaryConditionCreate");
  /** Variable representing the GeoAreaBoundaryConditionDelete method */
  public static final GeoAreaBoundaryConditionRequestMethod GEO_AREA_BOUNDARY_CONDITION_DELETE = new GeoAreaBoundaryConditionRequestMethod("GeoAreaBoundaryConditionDelete");
  /** Variable representing the GeoAreaBoundaryConditionFind method */
  public static final GeoAreaBoundaryConditionRequestMethod GEO_AREA_BOUNDARY_CONDITION_FIND = new GeoAreaBoundaryConditionRequestMethod("GeoAreaBoundaryConditionFind");
  /** Variable representing the GeoAreaBoundaryConditionGet method */
  public static final GeoAreaBoundaryConditionRequestMethod GEO_AREA_BOUNDARY_CONDITION_GET = new GeoAreaBoundaryConditionRequestMethod("GeoAreaBoundaryConditionGet");
  /** Variable representing the GeoAreaBoundaryConditionUpdate method */
  public static final GeoAreaBoundaryConditionRequestMethod GEO_AREA_BOUNDARY_CONDITION_UPDATE = new GeoAreaBoundaryConditionRequestMethod("GeoAreaBoundaryConditionUpdate");
}
