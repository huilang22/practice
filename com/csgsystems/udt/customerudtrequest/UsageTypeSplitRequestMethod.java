/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeSplitRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageTypeSplitRequestMethod implements UdtMethod {
  private String method = null;
  private UsageTypeSplitRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageTypeSplitCreate method */
  public static final UsageTypeSplitRequestMethod USAGE_TYPE_SPLIT_CREATE = new UsageTypeSplitRequestMethod("UsageTypeSplitCreate");
  /** Variable representing the UsageTypeSplitFind method */
  public static final UsageTypeSplitRequestMethod USAGE_TYPE_SPLIT_FIND = new UsageTypeSplitRequestMethod("UsageTypeSplitFind");
  /** Variable representing the UsageTypeSplitGet method */
  public static final UsageTypeSplitRequestMethod USAGE_TYPE_SPLIT_GET = new UsageTypeSplitRequestMethod("UsageTypeSplitGet");
  /** Variable representing the UsageTypeSplitUpdate method */
  public static final UsageTypeSplitRequestMethod USAGE_TYPE_SPLIT_UPDATE = new UsageTypeSplitRequestMethod("UsageTypeSplitUpdate");
}
