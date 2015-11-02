/*
 * Generated code DO NOT EDIT
 * Generated file: ActivityDefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ActivityDefRequestMethod implements UdtMethod {
  private String method = null;
  private ActivityDefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ActivityDefCreate method */
  public static final ActivityDefRequestMethod ACTIVITY_DEF_CREATE = new ActivityDefRequestMethod("ActivityDefCreate");
  /** Variable representing the ActivityDefFind method */
  public static final ActivityDefRequestMethod ACTIVITY_DEF_FIND = new ActivityDefRequestMethod("ActivityDefFind");
  /** Variable representing the ActivityDefGet method */
  public static final ActivityDefRequestMethod ACTIVITY_DEF_GET = new ActivityDefRequestMethod("ActivityDefGet");
  /** Variable representing the ActivityDefUpdate method */
  public static final ActivityDefRequestMethod ACTIVITY_DEF_UPDATE = new ActivityDefRequestMethod("ActivityDefUpdate");
}
