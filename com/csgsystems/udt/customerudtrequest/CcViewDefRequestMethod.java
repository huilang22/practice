/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewDefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CcViewDefRequestMethod implements UdtMethod {
  private String method = null;
  private CcViewDefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CcViewDefCreate method */
  public static final CcViewDefRequestMethod CC_VIEW_DEF_CREATE = new CcViewDefRequestMethod("CcViewDefCreate");
  /** Variable representing the CcViewDefFind method */
  public static final CcViewDefRequestMethod CC_VIEW_DEF_FIND = new CcViewDefRequestMethod("CcViewDefFind");
  /** Variable representing the CcViewDefGet method */
  public static final CcViewDefRequestMethod CC_VIEW_DEF_GET = new CcViewDefRequestMethod("CcViewDefGet");
}
