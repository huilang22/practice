/*
 * Generated code DO NOT EDIT
 * Generated file: BillingFrequencyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillingFrequencyRequestMethod implements UdtMethod {
  private String method = null;
  private BillingFrequencyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillingFrequencyCreate method */
  public static final BillingFrequencyRequestMethod BILLING_FREQUENCY_CREATE = new BillingFrequencyRequestMethod("BillingFrequencyCreate");
  /** Variable representing the BillingFrequencyDelete method */
  public static final BillingFrequencyRequestMethod BILLING_FREQUENCY_DELETE = new BillingFrequencyRequestMethod("BillingFrequencyDelete");
  /** Variable representing the BillingFrequencyFind method */
  public static final BillingFrequencyRequestMethod BILLING_FREQUENCY_FIND = new BillingFrequencyRequestMethod("BillingFrequencyFind");
  /** Variable representing the BillingFrequencyGet method */
  public static final BillingFrequencyRequestMethod BILLING_FREQUENCY_GET = new BillingFrequencyRequestMethod("BillingFrequencyGet");
  /** Variable representing the BillingFrequencyUpdate method */
  public static final BillingFrequencyRequestMethod BILLING_FREQUENCY_UPDATE = new BillingFrequencyRequestMethod("BillingFrequencyUpdate");
}
