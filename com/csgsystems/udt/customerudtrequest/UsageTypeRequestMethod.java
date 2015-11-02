/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageTypeRequestMethod implements UdtMethod {
  private String method = null;
  private UsageTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageTypeBilledFindByInvoice method */
  public static final UsageTypeRequestMethod USAGE_TYPE_BILLED_FIND_BY_INVOICE = new UsageTypeRequestMethod("UsageTypeBilledFindByInvoice");
  /** Variable representing the UsageTypeCreate method */
  public static final UsageTypeRequestMethod USAGE_TYPE_CREATE = new UsageTypeRequestMethod("UsageTypeCreate");
  /** Variable representing the UsageTypeDelete method */
  public static final UsageTypeRequestMethod USAGE_TYPE_DELETE = new UsageTypeRequestMethod("UsageTypeDelete");
  /** Variable representing the UsageTypeFind method */
  public static final UsageTypeRequestMethod USAGE_TYPE_FIND = new UsageTypeRequestMethod("UsageTypeFind");
  /** Variable representing the UsageTypeGet method */
  public static final UsageTypeRequestMethod USAGE_TYPE_GET = new UsageTypeRequestMethod("UsageTypeGet");
  /** Variable representing the UsageTypeUnbilledFindByAccount method */
  public static final UsageTypeRequestMethod USAGE_TYPE_UNBILLED_FIND_BY_ACCOUNT = new UsageTypeRequestMethod("UsageTypeUnbilledFindByAccount");
  /** Variable representing the UsageTypeUpdate method */
  public static final UsageTypeRequestMethod USAGE_TYPE_UPDATE = new UsageTypeRequestMethod("UsageTypeUpdate");
}
