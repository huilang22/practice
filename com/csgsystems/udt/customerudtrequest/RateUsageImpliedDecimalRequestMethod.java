/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageImpliedDecimalRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateUsageImpliedDecimalRequestMethod implements UdtMethod {
  private String method = null;
  private RateUsageImpliedDecimalRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateUsageImpliedDecimalCreate method */
  public static final RateUsageImpliedDecimalRequestMethod RATE_USAGE_IMPLIED_DECIMAL_CREATE = new RateUsageImpliedDecimalRequestMethod("RateUsageImpliedDecimalCreate");
  /** Variable representing the RateUsageImpliedDecimalDelete method */
  public static final RateUsageImpliedDecimalRequestMethod RATE_USAGE_IMPLIED_DECIMAL_DELETE = new RateUsageImpliedDecimalRequestMethod("RateUsageImpliedDecimalDelete");
  /** Variable representing the RateUsageImpliedDecimalFind method */
  public static final RateUsageImpliedDecimalRequestMethod RATE_USAGE_IMPLIED_DECIMAL_FIND = new RateUsageImpliedDecimalRequestMethod("RateUsageImpliedDecimalFind");
  /** Variable representing the RateUsageImpliedDecimalGet method */
  public static final RateUsageImpliedDecimalRequestMethod RATE_USAGE_IMPLIED_DECIMAL_GET = new RateUsageImpliedDecimalRequestMethod("RateUsageImpliedDecimalGet");
  /** Variable representing the RateUsageImpliedDecimalUpdate method */
  public static final RateUsageImpliedDecimalRequestMethod RATE_USAGE_IMPLIED_DECIMAL_UPDATE = new RateUsageImpliedDecimalRequestMethod("RateUsageImpliedDecimalUpdate");
}
