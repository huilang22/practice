/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtmParamRequestMethod implements UdtMethod {
  private String method = null;
  private CtmParamRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtmParamCreate method */
  public static final CtmParamRequestMethod CTM_PARAM_CREATE = new CtmParamRequestMethod("CtmParamCreate");
  /** Variable representing the CtmParamFind method */
  public static final CtmParamRequestMethod CTM_PARAM_FIND = new CtmParamRequestMethod("CtmParamFind");
  /** Variable representing the CtmParamGet method */
  public static final CtmParamRequestMethod CTM_PARAM_GET = new CtmParamRequestMethod("CtmParamGet");
  /** Variable representing the CtmParamUpdate method */
  public static final CtmParamRequestMethod CTM_PARAM_UPDATE = new CtmParamRequestMethod("CtmParamUpdate");
}
