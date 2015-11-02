/*
 * Generated code DO NOT EDIT
 * Generated file: CsrAccountSegmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CsrAccountSegmentRequestMethod implements UdtMethod {
  private String method = null;
  private CsrAccountSegmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CsrAccountSegmentCreate method */
  public static final CsrAccountSegmentRequestMethod CSR_ACCOUNT_SEGMENT_CREATE = new CsrAccountSegmentRequestMethod("CsrAccountSegmentCreate");
  /** Variable representing the CsrAccountSegmentDelete method */
  public static final CsrAccountSegmentRequestMethod CSR_ACCOUNT_SEGMENT_DELETE = new CsrAccountSegmentRequestMethod("CsrAccountSegmentDelete");
  /** Variable representing the CsrAccountSegmentFind method */
  public static final CsrAccountSegmentRequestMethod CSR_ACCOUNT_SEGMENT_FIND = new CsrAccountSegmentRequestMethod("CsrAccountSegmentFind");
  /** Variable representing the CsrAccountSegmentGet method */
  public static final CsrAccountSegmentRequestMethod CSR_ACCOUNT_SEGMENT_GET = new CsrAccountSegmentRequestMethod("CsrAccountSegmentGet");
  /** Variable representing the CsrAccountSegmentUpdate method */
  public static final CsrAccountSegmentRequestMethod CSR_ACCOUNT_SEGMENT_UPDATE = new CsrAccountSegmentRequestMethod("CsrAccountSegmentUpdate");
}
