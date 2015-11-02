/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentTransRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AxrtPaymentTransRequestMethod implements UdtMethod {
  private String method = null;
  private AxrtPaymentTransRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AxrtPaymentTransCreate method */
  public static final AxrtPaymentTransRequestMethod AXRT_PAYMENT_TRANS_CREATE = new AxrtPaymentTransRequestMethod("AxrtPaymentTransCreate");
  /** Variable representing the AxrtPaymentTransUpdate method */
  public static final AxrtPaymentTransRequestMethod AXRT_PAYMENT_TRANS_UPDATE = new AxrtPaymentTransRequestMethod("AxrtPaymentTransUpdate");
}
