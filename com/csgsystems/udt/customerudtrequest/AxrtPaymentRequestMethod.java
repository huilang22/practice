/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AxrtPaymentRequestMethod implements UdtMethod {
  private String method = null;
  private AxrtPaymentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AxrtPaymentUpdate method */
  public static final AxrtPaymentRequestMethod AXRT_PAYMENT_UPDATE = new AxrtPaymentRequestMethod("AxrtPaymentUpdate");
}
