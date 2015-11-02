/*
 * Generated code DO NOT EDIT
 * Generated file: PointRegionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PointRegionRequestMethod implements UdtMethod {
  private String method = null;
  private PointRegionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PointRegionCreate method */
  public static final PointRegionRequestMethod POINT_REGION_CREATE = new PointRegionRequestMethod("PointRegionCreate");
  /** Variable representing the PointRegionDelete method */
  public static final PointRegionRequestMethod POINT_REGION_DELETE = new PointRegionRequestMethod("PointRegionDelete");
  /** Variable representing the PointRegionFind method */
  public static final PointRegionRequestMethod POINT_REGION_FIND = new PointRegionRequestMethod("PointRegionFind");
  /** Variable representing the PointRegionGet method */
  public static final PointRegionRequestMethod POINT_REGION_GET = new PointRegionRequestMethod("PointRegionGet");
  /** Variable representing the PointRegionUpdate method */
  public static final PointRegionRequestMethod POINT_REGION_UPDATE = new PointRegionRequestMethod("PointRegionUpdate");
}
