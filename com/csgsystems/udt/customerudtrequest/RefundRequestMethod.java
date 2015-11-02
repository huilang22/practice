/*
 * Generated code DO NOT EDIT
 * Generated file: RefundRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RefundRequestMethod implements UdtMethod {
  private String method = null;
  private RefundRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RefundApprove method */
  public static final RefundRequestMethod REFUND_APPROVE = new RefundRequestMethod("RefundApprove");
  /** Variable representing the RefundCreate method */
  public static final RefundRequestMethod REFUND_CREATE = new RefundRequestMethod("RefundCreate");
  /** Variable representing the RefundDeny method */
  public static final RefundRequestMethod REFUND_DENY = new RefundRequestMethod("RefundDeny");
  /** Variable representing the RefundFind method */
  public static final RefundRequestMethod REFUND_FIND = new RefundRequestMethod("RefundFind");
  /** Variable representing the RefundGet method */
  public static final RefundRequestMethod REFUND_GET = new RefundRequestMethod("RefundGet");
  /** Variable representing the RefundMarkPaid method */
  public static final RefundRequestMethod REFUND_MARK_PAID = new RefundRequestMethod("RefundMarkPaid");
  /** Variable representing the RefundUpdate method */
  public static final RefundRequestMethod REFUND_UPDATE = new RefundRequestMethod("RefundUpdate");
}
