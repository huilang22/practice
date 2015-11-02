/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageBandRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateCorridorUsageBandRequestMethod implements UdtMethod {
  private String method = null;
  private RateCorridorUsageBandRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateCorridorUsageBandCreate method */
  public static final RateCorridorUsageBandRequestMethod RATE_CORRIDOR_USAGE_BAND_CREATE = new RateCorridorUsageBandRequestMethod("RateCorridorUsageBandCreate");
  /** Variable representing the RateCorridorUsageBandDelete method */
  public static final RateCorridorUsageBandRequestMethod RATE_CORRIDOR_USAGE_BAND_DELETE = new RateCorridorUsageBandRequestMethod("RateCorridorUsageBandDelete");
  /** Variable representing the RateCorridorUsageBandFind method */
  public static final RateCorridorUsageBandRequestMethod RATE_CORRIDOR_USAGE_BAND_FIND = new RateCorridorUsageBandRequestMethod("RateCorridorUsageBandFind");
  /** Variable representing the RateCorridorUsageBandGet method */
  public static final RateCorridorUsageBandRequestMethod RATE_CORRIDOR_USAGE_BAND_GET = new RateCorridorUsageBandRequestMethod("RateCorridorUsageBandGet");
  /** Variable representing the RateCorridorUsageBandUpdate method */
  public static final RateCorridorUsageBandRequestMethod RATE_CORRIDOR_USAGE_BAND_UPDATE = new RateCorridorUsageBandRequestMethod("RateCorridorUsageBandUpdate");
}
