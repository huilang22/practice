/*
 * Generated code DO NOT EDIT
 * Generated file: RbrUsageTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrUsageTypeRequestMethod implements UdtMethod {
  private String method = null;
  private RbrUsageTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrUsageTypeCreate method */
  public static final RbrUsageTypeRequestMethod RBR_USAGE_TYPE_CREATE = new RbrUsageTypeRequestMethod("RbrUsageTypeCreate");
  /** Variable representing the RbrUsageTypeFind method */
  public static final RbrUsageTypeRequestMethod RBR_USAGE_TYPE_FIND = new RbrUsageTypeRequestMethod("RbrUsageTypeFind");
  /** Variable representing the RbrUsageTypeGet method */
  public static final RbrUsageTypeRequestMethod RBR_USAGE_TYPE_GET = new RbrUsageTypeRequestMethod("RbrUsageTypeGet");
  /** Variable representing the RbrUsageTypeUpdate method */
  public static final RbrUsageTypeRequestMethod RBR_USAGE_TYPE_UPDATE = new RbrUsageTypeRequestMethod("RbrUsageTypeUpdate");
}
