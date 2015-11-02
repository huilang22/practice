/*
 * Generated code DO NOT EDIT
 * Generated file: AdjTransGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdjTransGroupRequestMethod implements UdtMethod {
  private String method = null;
  private AdjTransGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AdjTransGroupCreate method */
  public static final AdjTransGroupRequestMethod ADJ_TRANS_GROUP_CREATE = new AdjTransGroupRequestMethod("AdjTransGroupCreate");
  /** Variable representing the AdjTransGroupDelete method */
  public static final AdjTransGroupRequestMethod ADJ_TRANS_GROUP_DELETE = new AdjTransGroupRequestMethod("AdjTransGroupDelete");
  /** Variable representing the AdjTransGroupFind method */
  public static final AdjTransGroupRequestMethod ADJ_TRANS_GROUP_FIND = new AdjTransGroupRequestMethod("AdjTransGroupFind");
  /** Variable representing the AdjTransGroupGet method */
  public static final AdjTransGroupRequestMethod ADJ_TRANS_GROUP_GET = new AdjTransGroupRequestMethod("AdjTransGroupGet");
  /** Variable representing the AdjTransGroupUpdate method */
  public static final AdjTransGroupRequestMethod ADJ_TRANS_GROUP_UPDATE = new AdjTransGroupRequestMethod("AdjTransGroupUpdate");
}
