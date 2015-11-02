/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaSvcGrpRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaSvcGrpRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaSvcGrpCreate method */
  public static final GeoAreaSvcGrpRequestMethod GEO_AREA_SVC_GRP_CREATE = new GeoAreaSvcGrpRequestMethod("GeoAreaSvcGrpCreate");
  /** Variable representing the GeoAreaSvcGrpDelete method */
  public static final GeoAreaSvcGrpRequestMethod GEO_AREA_SVC_GRP_DELETE = new GeoAreaSvcGrpRequestMethod("GeoAreaSvcGrpDelete");
  /** Variable representing the GeoAreaSvcGrpFind method */
  public static final GeoAreaSvcGrpRequestMethod GEO_AREA_SVC_GRP_FIND = new GeoAreaSvcGrpRequestMethod("GeoAreaSvcGrpFind");
  /** Variable representing the GeoAreaSvcGrpGet method */
  public static final GeoAreaSvcGrpRequestMethod GEO_AREA_SVC_GRP_GET = new GeoAreaSvcGrpRequestMethod("GeoAreaSvcGrpGet");
  /** Variable representing the GeoAreaSvcGrpUpdate method */
  public static final GeoAreaSvcGrpRequestMethod GEO_AREA_SVC_GRP_UPDATE = new GeoAreaSvcGrpRequestMethod("GeoAreaSvcGrpUpdate");
}
