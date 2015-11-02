/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitKeyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnitCrRateLimitKeyRequestMethod implements UdtMethod {
  private String method = null;
  private UnitCrRateLimitKeyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnitCrRateLimitKeyCreate method */
  public static final UnitCrRateLimitKeyRequestMethod UNIT_CR_RATE_LIMIT_KEY_CREATE = new UnitCrRateLimitKeyRequestMethod("UnitCrRateLimitKeyCreate");
  /** Variable representing the UnitCrRateLimitKeyDelete method */
  public static final UnitCrRateLimitKeyRequestMethod UNIT_CR_RATE_LIMIT_KEY_DELETE = new UnitCrRateLimitKeyRequestMethod("UnitCrRateLimitKeyDelete");
  /** Variable representing the UnitCrRateLimitKeyFind method */
  public static final UnitCrRateLimitKeyRequestMethod UNIT_CR_RATE_LIMIT_KEY_FIND = new UnitCrRateLimitKeyRequestMethod("UnitCrRateLimitKeyFind");
  /** Variable representing the UnitCrRateLimitKeyGet method */
  public static final UnitCrRateLimitKeyRequestMethod UNIT_CR_RATE_LIMIT_KEY_GET = new UnitCrRateLimitKeyRequestMethod("UnitCrRateLimitKeyGet");
  /** Variable representing the UnitCrRateLimitKeyUpdate method */
  public static final UnitCrRateLimitKeyRequestMethod UNIT_CR_RATE_LIMIT_KEY_UPDATE = new UnitCrRateLimitKeyRequestMethod("UnitCrRateLimitKeyUpdate");
}
