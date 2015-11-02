/*
 * Generated code DO NOT EDIT
 * Generated file: UsageGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageGroupRequestMethod implements UdtMethod {
  private String method = null;
  private UsageGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageGroupFind method */
  public static final UsageGroupRequestMethod USAGE_GROUP_FIND = new UsageGroupRequestMethod("UsageGroupFind");
  /** Variable representing the UsageGroupGet method */
  public static final UsageGroupRequestMethod USAGE_GROUP_GET = new UsageGroupRequestMethod("UsageGroupGet");
}
