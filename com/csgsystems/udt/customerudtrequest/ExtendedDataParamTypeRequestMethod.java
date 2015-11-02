/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExtendedDataParamTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ExtendedDataParamTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExtendedDataParamTypeFind method */
  public static final ExtendedDataParamTypeRequestMethod EXTENDED_DATA_PARAM_TYPE_FIND = new ExtendedDataParamTypeRequestMethod("ExtendedDataParamTypeFind");
}
