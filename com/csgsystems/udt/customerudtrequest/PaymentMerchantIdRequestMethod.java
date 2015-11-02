/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PaymentMerchantIdRequestMethod implements UdtMethod {
  private String method = null;
  private PaymentMerchantIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PaymentMerchantIdCreate method */
  public static final PaymentMerchantIdRequestMethod PAYMENT_MERCHANT_ID_CREATE = new PaymentMerchantIdRequestMethod("PaymentMerchantIdCreate");
  /** Variable representing the PaymentMerchantIdDelete method */
  public static final PaymentMerchantIdRequestMethod PAYMENT_MERCHANT_ID_DELETE = new PaymentMerchantIdRequestMethod("PaymentMerchantIdDelete");
  /** Variable representing the PaymentMerchantIdFind method */
  public static final PaymentMerchantIdRequestMethod PAYMENT_MERCHANT_ID_FIND = new PaymentMerchantIdRequestMethod("PaymentMerchantIdFind");
  /** Variable representing the PaymentMerchantIdGet method */
  public static final PaymentMerchantIdRequestMethod PAYMENT_MERCHANT_ID_GET = new PaymentMerchantIdRequestMethod("PaymentMerchantIdGet");
  /** Variable representing the PaymentMerchantIdUpdate method */
  public static final PaymentMerchantIdRequestMethod PAYMENT_MERCHANT_ID_UPDATE = new PaymentMerchantIdRequestMethod("PaymentMerchantIdUpdate");
}
