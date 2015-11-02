/*
 * Generated code DO NOT EDIT
 * Generated file: UsageCreditRateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageCreditRateRequestMethod implements UdtMethod {
  private String method = null;
  private UsageCreditRateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageCreditRateFind method */
  public static final UsageCreditRateRequestMethod USAGE_CREDIT_RATE_FIND = new UsageCreditRateRequestMethod("UsageCreditRateFind");
  /** Variable representing the UsageCreditRateGet method */
  public static final UsageCreditRateRequestMethod USAGE_CREDIT_RATE_GET = new UsageCreditRateRequestMethod("UsageCreditRateGet");
}
