/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentDistributionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PrepaymentDistributionRequestMethod implements UdtMethod {
  private String method = null;
  private PrepaymentDistributionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PrepaymentDistributionFind method */
  public static final PrepaymentDistributionRequestMethod PREPAYMENT_DISTRIBUTION_FIND = new PrepaymentDistributionRequestMethod("PrepaymentDistributionFind");
  /** Variable representing the PrepaymentDistributionGet method */
  public static final PrepaymentDistributionRequestMethod PREPAYMENT_DISTRIBUTION_GET = new PrepaymentDistributionRequestMethod("PrepaymentDistributionGet");
}
