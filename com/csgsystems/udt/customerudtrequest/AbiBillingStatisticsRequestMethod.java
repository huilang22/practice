/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillingStatisticsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AbiBillingStatisticsRequestMethod implements UdtMethod {
  private String method = null;
  private AbiBillingStatisticsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AbiBillingStatisticsFind method */
  public static final AbiBillingStatisticsRequestMethod ABI_BILLING_STATISTICS_FIND = new AbiBillingStatisticsRequestMethod("AbiBillingStatisticsFind");
  /** Variable representing the AbiBillingStatisticsGet method */
  public static final AbiBillingStatisticsRequestMethod ABI_BILLING_STATISTICS_GET = new AbiBillingStatisticsRequestMethod("AbiBillingStatisticsGet");
  /** Variable representing the AbiBillingStatisticsUpdate method */
  public static final AbiBillingStatisticsRequestMethod ABI_BILLING_STATISTICS_UPDATE = new AbiBillingStatisticsRequestMethod("AbiBillingStatisticsUpdate");
}
