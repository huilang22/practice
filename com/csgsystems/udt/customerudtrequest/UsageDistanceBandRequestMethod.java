/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageDistanceBandRequestMethod implements UdtMethod {
  private String method = null;
  private UsageDistanceBandRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageDistanceBandCreate method */
  public static final UsageDistanceBandRequestMethod USAGE_DISTANCE_BAND_CREATE = new UsageDistanceBandRequestMethod("UsageDistanceBandCreate");
  /** Variable representing the UsageDistanceBandDelete method */
  public static final UsageDistanceBandRequestMethod USAGE_DISTANCE_BAND_DELETE = new UsageDistanceBandRequestMethod("UsageDistanceBandDelete");
  /** Variable representing the UsageDistanceBandFind method */
  public static final UsageDistanceBandRequestMethod USAGE_DISTANCE_BAND_FIND = new UsageDistanceBandRequestMethod("UsageDistanceBandFind");
  /** Variable representing the UsageDistanceBandGet method */
  public static final UsageDistanceBandRequestMethod USAGE_DISTANCE_BAND_GET = new UsageDistanceBandRequestMethod("UsageDistanceBandGet");
  /** Variable representing the UsageDistanceBandUpdate method */
  public static final UsageDistanceBandRequestMethod USAGE_DISTANCE_BAND_UPDATE = new UsageDistanceBandRequestMethod("UsageDistanceBandUpdate");
}
