/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateCorridorUsageRequestMethod implements UdtMethod {
  private String method = null;
  private RateCorridorUsageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateCorridorUsageCreate method */
  public static final RateCorridorUsageRequestMethod RATE_CORRIDOR_USAGE_CREATE = new RateCorridorUsageRequestMethod("RateCorridorUsageCreate");
  /** Variable representing the RateCorridorUsageDelete method */
  public static final RateCorridorUsageRequestMethod RATE_CORRIDOR_USAGE_DELETE = new RateCorridorUsageRequestMethod("RateCorridorUsageDelete");
  /** Variable representing the RateCorridorUsageFind method */
  public static final RateCorridorUsageRequestMethod RATE_CORRIDOR_USAGE_FIND = new RateCorridorUsageRequestMethod("RateCorridorUsageFind");
  /** Variable representing the RateCorridorUsageGet method */
  public static final RateCorridorUsageRequestMethod RATE_CORRIDOR_USAGE_GET = new RateCorridorUsageRequestMethod("RateCorridorUsageGet");
  /** Variable representing the RateCorridorUsageUpdate method */
  public static final RateCorridorUsageRequestMethod RATE_CORRIDOR_USAGE_UPDATE = new RateCorridorUsageRequestMethod("RateCorridorUsageUpdate");
}
