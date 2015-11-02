/*
 * Generated code DO NOT EDIT
 * Generated file: NrcGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NrcGroupRequestMethod implements UdtMethod {
  private String method = null;
  private NrcGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NrcGroupFind method */
  public static final NrcGroupRequestMethod NRC_GROUP_FIND = new NrcGroupRequestMethod("NrcGroupFind");
  /** Variable representing the NrcGroupGet method */
  public static final NrcGroupRequestMethod NRC_GROUP_GET = new NrcGroupRequestMethod("NrcGroupGet");
}
