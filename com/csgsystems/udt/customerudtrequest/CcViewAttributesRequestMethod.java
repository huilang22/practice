/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewAttributesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CcViewAttributesRequestMethod implements UdtMethod {
  private String method = null;
  private CcViewAttributesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CcViewAttributesCreate method */
  public static final CcViewAttributesRequestMethod CC_VIEW_ATTRIBUTES_CREATE = new CcViewAttributesRequestMethod("CcViewAttributesCreate");
  /** Variable representing the CcViewAttributesFind method */
  public static final CcViewAttributesRequestMethod CC_VIEW_ATTRIBUTES_FIND = new CcViewAttributesRequestMethod("CcViewAttributesFind");
  /** Variable representing the CcViewAttributesGet method */
  public static final CcViewAttributesRequestMethod CC_VIEW_ATTRIBUTES_GET = new CcViewAttributesRequestMethod("CcViewAttributesGet");
}
