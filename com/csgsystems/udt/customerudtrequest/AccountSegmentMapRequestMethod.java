/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountSegmentMapRequestMethod implements UdtMethod {
  private String method = null;
  private AccountSegmentMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountSegmentMapCreate method */
  public static final AccountSegmentMapRequestMethod ACCOUNT_SEGMENT_MAP_CREATE = new AccountSegmentMapRequestMethod("AccountSegmentMapCreate");
  /** Variable representing the AccountSegmentMapDelete method */
  public static final AccountSegmentMapRequestMethod ACCOUNT_SEGMENT_MAP_DELETE = new AccountSegmentMapRequestMethod("AccountSegmentMapDelete");
  /** Variable representing the AccountSegmentMapFind method */
  public static final AccountSegmentMapRequestMethod ACCOUNT_SEGMENT_MAP_FIND = new AccountSegmentMapRequestMethod("AccountSegmentMapFind");
  /** Variable representing the AccountSegmentMapGet method */
  public static final AccountSegmentMapRequestMethod ACCOUNT_SEGMENT_MAP_GET = new AccountSegmentMapRequestMethod("AccountSegmentMapGet");
  /** Variable representing the AccountSegmentMapUpdate method */
  public static final AccountSegmentMapRequestMethod ACCOUNT_SEGMENT_MAP_UPDATE = new AccountSegmentMapRequestMethod("AccountSegmentMapUpdate");
}
