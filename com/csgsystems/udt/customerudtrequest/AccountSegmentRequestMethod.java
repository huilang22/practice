/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountSegmentRequestMethod implements UdtMethod {
  private String method = null;
  private AccountSegmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountSegmentCreate method */
  public static final AccountSegmentRequestMethod ACCOUNT_SEGMENT_CREATE = new AccountSegmentRequestMethod("AccountSegmentCreate");
  /** Variable representing the AccountSegmentDelete method */
  public static final AccountSegmentRequestMethod ACCOUNT_SEGMENT_DELETE = new AccountSegmentRequestMethod("AccountSegmentDelete");
  /** Variable representing the AccountSegmentFind method */
  public static final AccountSegmentRequestMethod ACCOUNT_SEGMENT_FIND = new AccountSegmentRequestMethod("AccountSegmentFind");
  /** Variable representing the AccountSegmentGet method */
  public static final AccountSegmentRequestMethod ACCOUNT_SEGMENT_GET = new AccountSegmentRequestMethod("AccountSegmentGet");
  /** Variable representing the AccountSegmentUpdate method */
  public static final AccountSegmentRequestMethod ACCOUNT_SEGMENT_UPDATE = new AccountSegmentRequestMethod("AccountSegmentUpdate");
}
