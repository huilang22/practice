/*
 * Generated code DO NOT EDIT
 * Generated file: RtPaymentResponseRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RtPaymentResponseRequestMethod implements UdtMethod {
  private String method = null;
  private RtPaymentResponseRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RtPaymentResponseFind method */
  public static final RtPaymentResponseRequestMethod RT_PAYMENT_RESPONSE_FIND = new RtPaymentResponseRequestMethod("RtPaymentResponseFind");
  /** Variable representing the RtPaymentResponseGet method */
  public static final RtPaymentResponseRequestMethod RT_PAYMENT_RESPONSE_GET = new RtPaymentResponseRequestMethod("RtPaymentResponseGet");
}
