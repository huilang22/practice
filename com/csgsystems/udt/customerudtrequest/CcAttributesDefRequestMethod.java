/*
 * Generated code DO NOT EDIT
 * Generated file: CcAttributesDefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CcAttributesDefRequestMethod implements UdtMethod {
  private String method = null;
  private CcAttributesDefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CcAttributesDefCreate method */
  public static final CcAttributesDefRequestMethod CC_ATTRIBUTES_DEF_CREATE = new CcAttributesDefRequestMethod("CcAttributesDefCreate");
  /** Variable representing the CcAttributesDefFind method */
  public static final CcAttributesDefRequestMethod CC_ATTRIBUTES_DEF_FIND = new CcAttributesDefRequestMethod("CcAttributesDefFind");
  /** Variable representing the CcAttributesDefGet method */
  public static final CcAttributesDefRequestMethod CC_ATTRIBUTES_DEF_GET = new CcAttributesDefRequestMethod("CcAttributesDefGet");
}
