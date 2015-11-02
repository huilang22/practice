/*
 * Generated code DO NOT EDIT
 * Generated file: LbxPaymentTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LbxPaymentTypeRequestMethod implements UdtMethod {
  private String method = null;
  private LbxPaymentTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LbxPaymentTypeFind method */
  public static final LbxPaymentTypeRequestMethod LBX_PAYMENT_TYPE_FIND = new LbxPaymentTypeRequestMethod("LbxPaymentTypeFind");
  /** Variable representing the LbxPaymentTypeGet method */
  public static final LbxPaymentTypeRequestMethod LBX_PAYMENT_TYPE_GET = new LbxPaymentTypeRequestMethod("LbxPaymentTypeGet");
}
