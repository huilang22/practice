/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageTypeGroupRequestMethod implements UdtMethod {
  private String method = null;
  private UsageTypeGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageTypeGroupCreate method */
  public static final UsageTypeGroupRequestMethod USAGE_TYPE_GROUP_CREATE = new UsageTypeGroupRequestMethod("UsageTypeGroupCreate");
  /** Variable representing the UsageTypeGroupFind method */
  public static final UsageTypeGroupRequestMethod USAGE_TYPE_GROUP_FIND = new UsageTypeGroupRequestMethod("UsageTypeGroupFind");
  /** Variable representing the UsageTypeGroupGet method */
  public static final UsageTypeGroupRequestMethod USAGE_TYPE_GROUP_GET = new UsageTypeGroupRequestMethod("UsageTypeGroupGet");
  /** Variable representing the UsageTypeGroupUpdate method */
  public static final UsageTypeGroupRequestMethod USAGE_TYPE_GROUP_UPDATE = new UsageTypeGroupRequestMethod("UsageTypeGroupUpdate");
}
