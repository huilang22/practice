/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentMerchantRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AxrtPaymentMerchantRequestMethod implements UdtMethod {
  private String method = null;
  private AxrtPaymentMerchantRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AxrtPaymentMerchantGet method */
  public static final AxrtPaymentMerchantRequestMethod AXRT_PAYMENT_MERCHANT_GET = new AxrtPaymentMerchantRequestMethod("AxrtPaymentMerchantGet");
}
