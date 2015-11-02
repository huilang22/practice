/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdAssignRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PaymentMerchantIdAssignRequestMethod implements UdtMethod {
  private String method = null;
  private PaymentMerchantIdAssignRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PaymentMerchantIdAssignCreate method */
  public static final PaymentMerchantIdAssignRequestMethod PAYMENT_MERCHANT_ID_ASSIGN_CREATE = new PaymentMerchantIdAssignRequestMethod("PaymentMerchantIdAssignCreate");
  /** Variable representing the PaymentMerchantIdAssignFind method */
  public static final PaymentMerchantIdAssignRequestMethod PAYMENT_MERCHANT_ID_ASSIGN_FIND = new PaymentMerchantIdAssignRequestMethod("PaymentMerchantIdAssignFind");
  /** Variable representing the PaymentMerchantIdAssignGet method */
  public static final PaymentMerchantIdAssignRequestMethod PAYMENT_MERCHANT_ID_ASSIGN_GET = new PaymentMerchantIdAssignRequestMethod("PaymentMerchantIdAssignGet");
  /** Variable representing the PaymentMerchantIdAssignUpdate method */
  public static final PaymentMerchantIdAssignRequestMethod PAYMENT_MERCHANT_ID_ASSIGN_UPDATE = new PaymentMerchantIdAssignRequestMethod("PaymentMerchantIdAssignUpdate");
}
