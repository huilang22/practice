/*
 * Generated code DO NOT EDIT
 * Generated file: InterimBillRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InterimBillRequestMethod implements UdtMethod {
  private String method = null;
  private InterimBillRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InterimBillCancel method */
  public static final InterimBillRequestMethod INTERIM_BILL_CANCEL = new InterimBillRequestMethod("InterimBillCancel");
  /** Variable representing the InterimBillCreate method */
  public static final InterimBillRequestMethod INTERIM_BILL_CREATE = new InterimBillRequestMethod("InterimBillCreate");
  /** Variable representing the InterimBillFind method */
  public static final InterimBillRequestMethod INTERIM_BILL_FIND = new InterimBillRequestMethod("InterimBillFind");
  /** Variable representing the InterimBillGet method */
  public static final InterimBillRequestMethod INTERIM_BILL_GET = new InterimBillRequestMethod("InterimBillGet");
  /** Variable representing the InterimBillPollHot method */
  public static final InterimBillRequestMethod INTERIM_BILL_POLL_HOT = new InterimBillRequestMethod("InterimBillPollHot");
  /** Variable representing the InterimBillRequestHot method */
  public static final InterimBillRequestMethod INTERIM_BILL_REQUEST_HOT = new InterimBillRequestMethod("InterimBillRequestHot");
  /** Variable representing the InterimBillUpdate method */
  public static final InterimBillRequestMethod INTERIM_BILL_UPDATE = new InterimBillRequestMethod("InterimBillUpdate");
}
