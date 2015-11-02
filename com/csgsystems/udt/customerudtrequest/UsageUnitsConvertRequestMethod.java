/*
 * Generated code DO NOT EDIT
 * Generated file: UsageUnitsConvertRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageUnitsConvertRequestMethod implements UdtMethod {
  private String method = null;
  private UsageUnitsConvertRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageUnitsConvertCreate method */
  public static final UsageUnitsConvertRequestMethod USAGE_UNITS_CONVERT_CREATE = new UsageUnitsConvertRequestMethod("UsageUnitsConvertCreate");
  /** Variable representing the UsageUnitsConvertFind method */
  public static final UsageUnitsConvertRequestMethod USAGE_UNITS_CONVERT_FIND = new UsageUnitsConvertRequestMethod("UsageUnitsConvertFind");
  /** Variable representing the UsageUnitsConvertGet method */
  public static final UsageUnitsConvertRequestMethod USAGE_UNITS_CONVERT_GET = new UsageUnitsConvertRequestMethod("UsageUnitsConvertGet");
  /** Variable representing the UsageUnitsConvertUpdate method */
  public static final UsageUnitsConvertRequestMethod USAGE_UNITS_CONVERT_UPDATE = new UsageUnitsConvertRequestMethod("UsageUnitsConvertUpdate");
}
