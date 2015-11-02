/*
 * Generated code DO NOT EDIT
 * Generated file: AccessRegionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccessRegionRequestMethod implements UdtMethod {
  private String method = null;
  private AccessRegionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccessRegionCreate method */
  public static final AccessRegionRequestMethod ACCESS_REGION_CREATE = new AccessRegionRequestMethod("AccessRegionCreate");
  /** Variable representing the AccessRegionFind method */
  public static final AccessRegionRequestMethod ACCESS_REGION_FIND = new AccessRegionRequestMethod("AccessRegionFind");
  /** Variable representing the AccessRegionGet method */
  public static final AccessRegionRequestMethod ACCESS_REGION_GET = new AccessRegionRequestMethod("AccessRegionGet");
  /** Variable representing the AccessRegionUpdate method */
  public static final AccessRegionRequestMethod ACCESS_REGION_UPDATE = new AccessRegionRequestMethod("AccessRegionUpdate");
}
