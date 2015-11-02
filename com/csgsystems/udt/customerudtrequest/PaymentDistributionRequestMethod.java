/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDistributionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PaymentDistributionRequestMethod implements UdtMethod {
  private String method = null;
  private PaymentDistributionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PaymentDistributionFind method */
  public static final PaymentDistributionRequestMethod PAYMENT_DISTRIBUTION_FIND = new PaymentDistributionRequestMethod("PaymentDistributionFind");
  /** Variable representing the PaymentDistributionFindCount method */
  public static final PaymentDistributionRequestMethod PAYMENT_DISTRIBUTION_FIND_COUNT = new PaymentDistributionRequestMethod("PaymentDistributionFindCount");
  /** Variable representing the PaymentDistributionGet method */
  public static final PaymentDistributionRequestMethod PAYMENT_DISTRIBUTION_GET = new PaymentDistributionRequestMethod("PaymentDistributionGet");
  /** Variable representing the PaymentDistributionSummaryFind method */
  public static final PaymentDistributionRequestMethod PAYMENT_DISTRIBUTION_SUMMARY_FIND = new PaymentDistributionRequestMethod("PaymentDistributionSummaryFind");
  /** Variable representing the PaymentDistributionSuspenseFind method */
  public static final PaymentDistributionRequestMethod PAYMENT_DISTRIBUTION_SUSPENSE_FIND = new PaymentDistributionRequestMethod("PaymentDistributionSuspenseFind");
  /** Variable representing the PaymentDistributionSuspenseFindCount method */
  public static final PaymentDistributionRequestMethod PAYMENT_DISTRIBUTION_SUSPENSE_FIND_COUNT = new PaymentDistributionRequestMethod("PaymentDistributionSuspenseFindCount");
}
