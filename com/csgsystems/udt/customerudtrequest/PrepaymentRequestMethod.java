/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PrepaymentRequestMethod implements UdtMethod {
  private String method = null;
  private PrepaymentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PrepaymentCreate method */
  public static final PrepaymentRequestMethod PREPAYMENT_CREATE = new PrepaymentRequestMethod("PrepaymentCreate");
  /** Variable representing the PrepaymentDelete method */
  public static final PrepaymentRequestMethod PREPAYMENT_DELETE = new PrepaymentRequestMethod("PrepaymentDelete");
  /** Variable representing the PrepaymentFind method */
  public static final PrepaymentRequestMethod PREPAYMENT_FIND = new PrepaymentRequestMethod("PrepaymentFind");
  /** Variable representing the PrepaymentGet method */
  public static final PrepaymentRequestMethod PREPAYMENT_GET = new PrepaymentRequestMethod("PrepaymentGet");
  /** Variable representing the PrepaymentGetOld method */
  public static final PrepaymentRequestMethod PREPAYMENT_GET_OLD = new PrepaymentRequestMethod("PrepaymentGetOld");
  /** Variable representing the PrepaymentUpdate method */
  public static final PrepaymentRequestMethod PREPAYMENT_UPDATE = new PrepaymentRequestMethod("PrepaymentUpdate");
}
