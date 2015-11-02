/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnitCrRateLimitRequestMethod implements UdtMethod {
  private String method = null;
  private UnitCrRateLimitRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnitCrRateLimitCreate method */
  public static final UnitCrRateLimitRequestMethod UNIT_CR_RATE_LIMIT_CREATE = new UnitCrRateLimitRequestMethod("UnitCrRateLimitCreate");
  /** Variable representing the UnitCrRateLimitDelete method */
  public static final UnitCrRateLimitRequestMethod UNIT_CR_RATE_LIMIT_DELETE = new UnitCrRateLimitRequestMethod("UnitCrRateLimitDelete");
  /** Variable representing the UnitCrRateLimitFind method */
  public static final UnitCrRateLimitRequestMethod UNIT_CR_RATE_LIMIT_FIND = new UnitCrRateLimitRequestMethod("UnitCrRateLimitFind");
  /** Variable representing the UnitCrRateLimitGet method */
  public static final UnitCrRateLimitRequestMethod UNIT_CR_RATE_LIMIT_GET = new UnitCrRateLimitRequestMethod("UnitCrRateLimitGet");
  /** Variable representing the UnitCrRateLimitUpdate method */
  public static final UnitCrRateLimitRequestMethod UNIT_CR_RATE_LIMIT_UPDATE = new UnitCrRateLimitRequestMethod("UnitCrRateLimitUpdate");
}
