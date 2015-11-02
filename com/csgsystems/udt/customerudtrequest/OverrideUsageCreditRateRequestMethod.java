/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideUsageCreditRateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OverrideUsageCreditRateRequestMethod implements UdtMethod {
  private String method = null;
  private OverrideUsageCreditRateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OverrideUsageCreditRateCreate method */
  public static final OverrideUsageCreditRateRequestMethod OVERRIDE_USAGE_CREDIT_RATE_CREATE = new OverrideUsageCreditRateRequestMethod("OverrideUsageCreditRateCreate");
  /** Variable representing the OverrideUsageCreditRateFind method */
  public static final OverrideUsageCreditRateRequestMethod OVERRIDE_USAGE_CREDIT_RATE_FIND = new OverrideUsageCreditRateRequestMethod("OverrideUsageCreditRateFind");
  /** Variable representing the OverrideUsageCreditRateGet method */
  public static final OverrideUsageCreditRateRequestMethod OVERRIDE_USAGE_CREDIT_RATE_GET = new OverrideUsageCreditRateRequestMethod("OverrideUsageCreditRateGet");
  /** Variable representing the OverrideUsageCreditRateUpdate method */
  public static final OverrideUsageCreditRateRequestMethod OVERRIDE_USAGE_CREDIT_RATE_UPDATE = new OverrideUsageCreditRateRequestMethod("OverrideUsageCreditRateUpdate");
}
