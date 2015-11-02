/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageBandRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateUsageBandRequestMethod implements UdtMethod {
  private String method = null;
  private RateUsageBandRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateUsageBandCreate method */
  public static final RateUsageBandRequestMethod RATE_USAGE_BAND_CREATE = new RateUsageBandRequestMethod("RateUsageBandCreate");
  /** Variable representing the RateUsageBandDelete method */
  public static final RateUsageBandRequestMethod RATE_USAGE_BAND_DELETE = new RateUsageBandRequestMethod("RateUsageBandDelete");
  /** Variable representing the RateUsageBandFind method */
  public static final RateUsageBandRequestMethod RATE_USAGE_BAND_FIND = new RateUsageBandRequestMethod("RateUsageBandFind");
  /** Variable representing the RateUsageBandGet method */
  public static final RateUsageBandRequestMethod RATE_USAGE_BAND_GET = new RateUsageBandRequestMethod("RateUsageBandGet");
  /** Variable representing the RateUsageBandUpdate method */
  public static final RateUsageBandRequestMethod RATE_USAGE_BAND_UPDATE = new RateUsageBandRequestMethod("RateUsageBandUpdate");
}
