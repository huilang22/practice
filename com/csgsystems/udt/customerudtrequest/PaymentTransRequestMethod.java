/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTransRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PaymentTransRequestMethod implements UdtMethod {
  private String method = null;
  private PaymentTransRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PaymentTransFind method */
  public static final PaymentTransRequestMethod PAYMENT_TRANS_FIND = new PaymentTransRequestMethod("PaymentTransFind");
  /** Variable representing the PaymentTransGet method */
  public static final PaymentTransRequestMethod PAYMENT_TRANS_GET = new PaymentTransRequestMethod("PaymentTransGet");
  /** Variable representing the PaymentTransUpdate method */
  public static final PaymentTransRequestMethod PAYMENT_TRANS_UPDATE = new PaymentTransRequestMethod("PaymentTransUpdate");
}
