/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUsageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RatePeriodUsageRequestMethod implements UdtMethod {
  private String method = null;
  private RatePeriodUsageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RatePeriodUsageCreate method */
  public static final RatePeriodUsageRequestMethod RATE_PERIOD_USAGE_CREATE = new RatePeriodUsageRequestMethod("RatePeriodUsageCreate");
  /** Variable representing the RatePeriodUsageDelete method */
  public static final RatePeriodUsageRequestMethod RATE_PERIOD_USAGE_DELETE = new RatePeriodUsageRequestMethod("RatePeriodUsageDelete");
  /** Variable representing the RatePeriodUsageFind method */
  public static final RatePeriodUsageRequestMethod RATE_PERIOD_USAGE_FIND = new RatePeriodUsageRequestMethod("RatePeriodUsageFind");
  /** Variable representing the RatePeriodUsageGet method */
  public static final RatePeriodUsageRequestMethod RATE_PERIOD_USAGE_GET = new RatePeriodUsageRequestMethod("RatePeriodUsageGet");
  /** Variable representing the RatePeriodUsageUpdate method */
  public static final RatePeriodUsageRequestMethod RATE_PERIOD_USAGE_UPDATE = new RatePeriodUsageRequestMethod("RatePeriodUsageUpdate");
}
