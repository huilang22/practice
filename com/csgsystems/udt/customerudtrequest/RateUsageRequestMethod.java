/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateUsageRequestMethod implements UdtMethod {
  private String method = null;
  private RateUsageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateUsageCreate method */
  public static final RateUsageRequestMethod RATE_USAGE_CREATE = new RateUsageRequestMethod("RateUsageCreate");
  /** Variable representing the RateUsageDelete method */
  public static final RateUsageRequestMethod RATE_USAGE_DELETE = new RateUsageRequestMethod("RateUsageDelete");
  /** Variable representing the RateUsageFind method */
  public static final RateUsageRequestMethod RATE_USAGE_FIND = new RateUsageRequestMethod("RateUsageFind");
  /** Variable representing the RateUsageGet method */
  public static final RateUsageRequestMethod RATE_USAGE_GET = new RateUsageRequestMethod("RateUsageGet");
  /** Variable representing the RateUsageUpdate method */
  public static final RateUsageRequestMethod RATE_USAGE_UPDATE = new RateUsageRequestMethod("RateUsageUpdate");
}
