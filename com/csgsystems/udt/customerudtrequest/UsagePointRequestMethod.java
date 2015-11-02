/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsagePointRequestMethod implements UdtMethod {
  private String method = null;
  private UsagePointRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsagePointCreate method */
  public static final UsagePointRequestMethod USAGE_POINT_CREATE = new UsagePointRequestMethod("UsagePointCreate");
  /** Variable representing the UsagePointDelete method */
  public static final UsagePointRequestMethod USAGE_POINT_DELETE = new UsagePointRequestMethod("UsagePointDelete");
  /** Variable representing the UsagePointFind method */
  public static final UsagePointRequestMethod USAGE_POINT_FIND = new UsagePointRequestMethod("UsagePointFind");
  /** Variable representing the UsagePointGet method */
  public static final UsagePointRequestMethod USAGE_POINT_GET = new UsagePointRequestMethod("UsagePointGet");
  /** Variable representing the UsagePointUpdate method */
  public static final UsagePointRequestMethod USAGE_POINT_UPDATE = new UsagePointRequestMethod("UsagePointUpdate");
}
