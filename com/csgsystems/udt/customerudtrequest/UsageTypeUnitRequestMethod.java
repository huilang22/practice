/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageTypeUnitRequestMethod implements UdtMethod {
  private String method = null;
  private UsageTypeUnitRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageTypeUnitCreate method */
  public static final UsageTypeUnitRequestMethod USAGE_TYPE_UNIT_CREATE = new UsageTypeUnitRequestMethod("UsageTypeUnitCreate");
  /** Variable representing the UsageTypeUnitFind method */
  public static final UsageTypeUnitRequestMethod USAGE_TYPE_UNIT_FIND = new UsageTypeUnitRequestMethod("UsageTypeUnitFind");
  /** Variable representing the UsageTypeUnitGet method */
  public static final UsageTypeUnitRequestMethod USAGE_TYPE_UNIT_GET = new UsageTypeUnitRequestMethod("UsageTypeUnitGet");
  /** Variable representing the UsageTypeUnitUpdate method */
  public static final UsageTypeUnitRequestMethod USAGE_TYPE_UNIT_UPDATE = new UsageTypeUnitRequestMethod("UsageTypeUnitUpdate");
}
