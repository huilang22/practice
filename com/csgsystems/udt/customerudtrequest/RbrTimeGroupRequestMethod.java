/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimeGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrTimeGroupRequestMethod implements UdtMethod {
  private String method = null;
  private RbrTimeGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrTimeGroupCreate method */
  public static final RbrTimeGroupRequestMethod RBR_TIME_GROUP_CREATE = new RbrTimeGroupRequestMethod("RbrTimeGroupCreate");
  /** Variable representing the RbrTimeGroupDelete method */
  public static final RbrTimeGroupRequestMethod RBR_TIME_GROUP_DELETE = new RbrTimeGroupRequestMethod("RbrTimeGroupDelete");
  /** Variable representing the RbrTimeGroupFind method */
  public static final RbrTimeGroupRequestMethod RBR_TIME_GROUP_FIND = new RbrTimeGroupRequestMethod("RbrTimeGroupFind");
  /** Variable representing the RbrTimeGroupGet method */
  public static final RbrTimeGroupRequestMethod RBR_TIME_GROUP_GET = new RbrTimeGroupRequestMethod("RbrTimeGroupGet");
  /** Variable representing the RbrTimeGroupUpdate method */
  public static final RbrTimeGroupRequestMethod RBR_TIME_GROUP_UPDATE = new RbrTimeGroupRequestMethod("RbrTimeGroupUpdate");
}
