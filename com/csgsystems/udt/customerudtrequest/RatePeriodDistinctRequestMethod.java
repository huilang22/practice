/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodDistinctRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RatePeriodDistinctRequestMethod implements UdtMethod {
  private String method = null;
  private RatePeriodDistinctRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RatePeriodDistinctFind method */
  public static final RatePeriodDistinctRequestMethod RATE_PERIOD_DISTINCT_FIND = new RatePeriodDistinctRequestMethod("RatePeriodDistinctFind");
  /** Variable representing the RatePeriodDistinctGet method */
  public static final RatePeriodDistinctRequestMethod RATE_PERIOD_DISTINCT_GET = new RatePeriodDistinctRequestMethod("RatePeriodDistinctGet");
}
