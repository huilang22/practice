/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTypeGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NrcTypeGroupRequestMethod implements UdtMethod {
  private String method = null;
  private NrcTypeGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NrcTypeGroupCreate method */
  public static final NrcTypeGroupRequestMethod NRC_TYPE_GROUP_CREATE = new NrcTypeGroupRequestMethod("NrcTypeGroupCreate");
  /** Variable representing the NrcTypeGroupFind method */
  public static final NrcTypeGroupRequestMethod NRC_TYPE_GROUP_FIND = new NrcTypeGroupRequestMethod("NrcTypeGroupFind");
  /** Variable representing the NrcTypeGroupGet method */
  public static final NrcTypeGroupRequestMethod NRC_TYPE_GROUP_GET = new NrcTypeGroupRequestMethod("NrcTypeGroupGet");
  /** Variable representing the NrcTypeGroupUpdate method */
  public static final NrcTypeGroupRequestMethod NRC_TYPE_GROUP_UPDATE = new NrcTypeGroupRequestMethod("NrcTypeGroupUpdate");
}
