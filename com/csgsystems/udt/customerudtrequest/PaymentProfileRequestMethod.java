/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentProfileRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PaymentProfileRequestMethod implements UdtMethod {
  private String method = null;
  private PaymentProfileRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PaymentProfileCreate method */
  public static final PaymentProfileRequestMethod PAYMENT_PROFILE_CREATE = new PaymentProfileRequestMethod("PaymentProfileCreate");
  /** Variable representing the PaymentProfileDelete method */
  public static final PaymentProfileRequestMethod PAYMENT_PROFILE_DELETE = new PaymentProfileRequestMethod("PaymentProfileDelete");
  /** Variable representing the PaymentProfileFind method */
  public static final PaymentProfileRequestMethod PAYMENT_PROFILE_FIND = new PaymentProfileRequestMethod("PaymentProfileFind");
  /** Variable representing the PaymentProfileGet method */
  public static final PaymentProfileRequestMethod PAYMENT_PROFILE_GET = new PaymentProfileRequestMethod("PaymentProfileGet");
  /** Variable representing the PaymentProfileUpdate method */
  public static final PaymentProfileRequestMethod PAYMENT_PROFILE_UPDATE = new PaymentProfileRequestMethod("PaymentProfileUpdate");
}
