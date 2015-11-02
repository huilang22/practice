/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointTextRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsagePointTextRequestMethod implements UdtMethod {
  private String method = null;
  private UsagePointTextRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsagePointTextCreate method */
  public static final UsagePointTextRequestMethod USAGE_POINT_TEXT_CREATE = new UsagePointTextRequestMethod("UsagePointTextCreate");
  /** Variable representing the UsagePointTextFind method */
  public static final UsagePointTextRequestMethod USAGE_POINT_TEXT_FIND = new UsagePointTextRequestMethod("UsagePointTextFind");
  /** Variable representing the UsagePointTextGet method */
  public static final UsagePointTextRequestMethod USAGE_POINT_TEXT_GET = new UsagePointTextRequestMethod("UsagePointTextGet");
  /** Variable representing the UsagePointTextUpdate method */
  public static final UsagePointTextRequestMethod USAGE_POINT_TEXT_UPDATE = new UsagePointTextRequestMethod("UsagePointTextUpdate");
}
