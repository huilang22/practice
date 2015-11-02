/*
 * Generated code DO NOT EDIT
 * Generated file: InvsGeographicRegionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsGeographicRegionRequestMethod implements UdtMethod {
  private String method = null;
  private InvsGeographicRegionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsGeographicRegionCreate method */
  public static final InvsGeographicRegionRequestMethod INVS_GEOGRAPHIC_REGION_CREATE = new InvsGeographicRegionRequestMethod("InvsGeographicRegionCreate");
  /** Variable representing the InvsGeographicRegionFind method */
  public static final InvsGeographicRegionRequestMethod INVS_GEOGRAPHIC_REGION_FIND = new InvsGeographicRegionRequestMethod("InvsGeographicRegionFind");
  /** Variable representing the InvsGeographicRegionGet method */
  public static final InvsGeographicRegionRequestMethod INVS_GEOGRAPHIC_REGION_GET = new InvsGeographicRegionRequestMethod("InvsGeographicRegionGet");
  /** Variable representing the InvsGeographicRegionUpdate method */
  public static final InvsGeographicRegionRequestMethod INVS_GEOGRAPHIC_REGION_UPDATE = new InvsGeographicRegionRequestMethod("InvsGeographicRegionUpdate");
}
