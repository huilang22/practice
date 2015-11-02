/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtmParamTypeRequestMethod implements UdtMethod {
  private String method = null;
  private CtmParamTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtmParamTypeCreate method */
  public static final CtmParamTypeRequestMethod CTM_PARAM_TYPE_CREATE = new CtmParamTypeRequestMethod("CtmParamTypeCreate");
  /** Variable representing the CtmParamTypeFind method */
  public static final CtmParamTypeRequestMethod CTM_PARAM_TYPE_FIND = new CtmParamTypeRequestMethod("CtmParamTypeFind");
  /** Variable representing the CtmParamTypeGet method */
  public static final CtmParamTypeRequestMethod CTM_PARAM_TYPE_GET = new CtmParamTypeRequestMethod("CtmParamTypeGet");
  /** Variable representing the CtmParamTypeUpdate method */
  public static final CtmParamTypeRequestMethod CTM_PARAM_TYPE_UPDATE = new CtmParamTypeRequestMethod("CtmParamTypeUpdate");
}
