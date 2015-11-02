/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpMemberRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeoAreaSvcGrpMemberRequestMethod implements UdtMethod {
  private String method = null;
  private GeoAreaSvcGrpMemberRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaSvcGrpMemberCreate method */
  public static final GeoAreaSvcGrpMemberRequestMethod GEO_AREA_SVC_GRP_MEMBER_CREATE = new GeoAreaSvcGrpMemberRequestMethod("GeoAreaSvcGrpMemberCreate");
  /** Variable representing the GeoAreaSvcGrpMemberDelete method */
  public static final GeoAreaSvcGrpMemberRequestMethod GEO_AREA_SVC_GRP_MEMBER_DELETE = new GeoAreaSvcGrpMemberRequestMethod("GeoAreaSvcGrpMemberDelete");
  /** Variable representing the GeoAreaSvcGrpMemberFind method */
  public static final GeoAreaSvcGrpMemberRequestMethod GEO_AREA_SVC_GRP_MEMBER_FIND = new GeoAreaSvcGrpMemberRequestMethod("GeoAreaSvcGrpMemberFind");
  /** Variable representing the GeoAreaSvcGrpMemberGet method */
  public static final GeoAreaSvcGrpMemberRequestMethod GEO_AREA_SVC_GRP_MEMBER_GET = new GeoAreaSvcGrpMemberRequestMethod("GeoAreaSvcGrpMemberGet");
  /** Variable representing the GeoAreaSvcGrpMemberUpdate method */
  public static final GeoAreaSvcGrpMemberRequestMethod GEO_AREA_SVC_GRP_MEMBER_UPDATE = new GeoAreaSvcGrpMemberRequestMethod("GeoAreaSvcGrpMemberUpdate");
}
