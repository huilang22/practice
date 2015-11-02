/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentProfileRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AxrtPaymentProfileRequestMethod implements UdtMethod {
  private String method = null;
  private AxrtPaymentProfileRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AxrtPaymentProfileCreate method */
  public static final AxrtPaymentProfileRequestMethod AXRT_PAYMENT_PROFILE_CREATE = new AxrtPaymentProfileRequestMethod("AxrtPaymentProfileCreate");
  /** Variable representing the AxrtPaymentProfileDelete method */
  public static final AxrtPaymentProfileRequestMethod AXRT_PAYMENT_PROFILE_DELETE = new AxrtPaymentProfileRequestMethod("AxrtPaymentProfileDelete");
  /** Variable representing the AxrtPaymentProfileFind method */
  public static final AxrtPaymentProfileRequestMethod AXRT_PAYMENT_PROFILE_FIND = new AxrtPaymentProfileRequestMethod("AxrtPaymentProfileFind");
  /** Variable representing the AxrtPaymentProfileUpdate method */
  public static final AxrtPaymentProfileRequestMethod AXRT_PAYMENT_PROFILE_UPDATE = new AxrtPaymentProfileRequestMethod("AxrtPaymentProfileUpdate");
}
