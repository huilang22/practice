/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PaymentTypeRequestMethod implements UdtMethod {
  private String method = null;
  private PaymentTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PaymentTypeFind method */
  public static final PaymentTypeRequestMethod PAYMENT_TYPE_FIND = new PaymentTypeRequestMethod("PaymentTypeFind");
  /** Variable representing the PaymentTypeGet method */
  public static final PaymentTypeRequestMethod PAYMENT_TYPE_GET = new PaymentTypeRequestMethod("PaymentTypeGet");
}
