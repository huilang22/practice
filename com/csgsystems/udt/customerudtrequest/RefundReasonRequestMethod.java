/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RefundReasonRequestMethod implements UdtMethod {
  private String method = null;
  private RefundReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RefundReasonCreate method */
  public static final RefundReasonRequestMethod REFUND_REASON_CREATE = new RefundReasonRequestMethod("RefundReasonCreate");
  /** Variable representing the RefundReasonDelete method */
  public static final RefundReasonRequestMethod REFUND_REASON_DELETE = new RefundReasonRequestMethod("RefundReasonDelete");
  /** Variable representing the RefundReasonFind method */
  public static final RefundReasonRequestMethod REFUND_REASON_FIND = new RefundReasonRequestMethod("RefundReasonFind");
  /** Variable representing the RefundReasonGet method */
  public static final RefundReasonRequestMethod REFUND_REASON_GET = new RefundReasonRequestMethod("RefundReasonGet");
  /** Variable representing the RefundReasonUpdate method */
  public static final RefundReasonRequestMethod REFUND_REASON_UPDATE = new RefundReasonRequestMethod("RefundReasonUpdate");
}
