/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGeoAreaScheduleRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcGeoAreaScheduleRequestMethod implements UdtMethod {
  private String method = null;
  private CtcGeoAreaScheduleRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcGeoAreaScheduleCreate method */
  public static final CtcGeoAreaScheduleRequestMethod CTC_GEO_AREA_SCHEDULE_CREATE = new CtcGeoAreaScheduleRequestMethod("CtcGeoAreaScheduleCreate");
  /** Variable representing the CtcGeoAreaScheduleDelete method */
  public static final CtcGeoAreaScheduleRequestMethod CTC_GEO_AREA_SCHEDULE_DELETE = new CtcGeoAreaScheduleRequestMethod("CtcGeoAreaScheduleDelete");
  /** Variable representing the CtcGeoAreaScheduleFind method */
  public static final CtcGeoAreaScheduleRequestMethod CTC_GEO_AREA_SCHEDULE_FIND = new CtcGeoAreaScheduleRequestMethod("CtcGeoAreaScheduleFind");
  /** Variable representing the CtcGeoAreaScheduleGet method */
  public static final CtcGeoAreaScheduleRequestMethod CTC_GEO_AREA_SCHEDULE_GET = new CtcGeoAreaScheduleRequestMethod("CtcGeoAreaScheduleGet");
}
