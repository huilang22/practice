/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RatePeriodRequestMethod implements UdtMethod {
  private String method = null;
  private RatePeriodRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RatePeriodCreate method */
  public static final RatePeriodRequestMethod RATE_PERIOD_CREATE = new RatePeriodRequestMethod("RatePeriodCreate");
  /** Variable representing the RatePeriodDelete method */
  public static final RatePeriodRequestMethod RATE_PERIOD_DELETE = new RatePeriodRequestMethod("RatePeriodDelete");
  /** Variable representing the RatePeriodFind method */
  public static final RatePeriodRequestMethod RATE_PERIOD_FIND = new RatePeriodRequestMethod("RatePeriodFind");
  /** Variable representing the RatePeriodGet method */
  public static final RatePeriodRequestMethod RATE_PERIOD_GET = new RatePeriodRequestMethod("RatePeriodGet");
  /** Variable representing the RatePeriodUpdate method */
  public static final RatePeriodRequestMethod RATE_PERIOD_UPDATE = new RatePeriodRequestMethod("RatePeriodUpdate");
}
