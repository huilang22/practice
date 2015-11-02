/*
 * Generated code DO NOT EDIT
 * Generated file: UnappliedPaymentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnappliedPaymentRequestMethod implements UdtMethod {
  private String method = null;
  private UnappliedPaymentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnappliedPaymentFind method */
  public static final UnappliedPaymentRequestMethod UNAPPLIED_PAYMENT_FIND = new UnappliedPaymentRequestMethod("UnappliedPaymentFind");
  /** Variable representing the UnappliedPaymentGet method */
  public static final UnappliedPaymentRequestMethod UNAPPLIED_PAYMENT_GET = new UnappliedPaymentRequestMethod("UnappliedPaymentGet");
  /** Variable representing the UnappliedPaymentUpdate method */
  public static final UnappliedPaymentRequestMethod UNAPPLIED_PAYMENT_UPDATE = new UnappliedPaymentRequestMethod("UnappliedPaymentUpdate");
}
