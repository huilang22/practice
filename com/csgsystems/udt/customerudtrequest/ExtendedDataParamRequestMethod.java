/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExtendedDataParamRequestMethod implements UdtMethod {
  private String method = null;
  private ExtendedDataParamRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExtendedDataParamCreate method */
  public static final ExtendedDataParamRequestMethod EXTENDED_DATA_PARAM_CREATE = new ExtendedDataParamRequestMethod("ExtendedDataParamCreate");
  /** Variable representing the ExtendedDataParamDelete method */
  public static final ExtendedDataParamRequestMethod EXTENDED_DATA_PARAM_DELETE = new ExtendedDataParamRequestMethod("ExtendedDataParamDelete");
  /** Variable representing the ExtendedDataParamFind method */
  public static final ExtendedDataParamRequestMethod EXTENDED_DATA_PARAM_FIND = new ExtendedDataParamRequestMethod("ExtendedDataParamFind");
  /** Variable representing the ExtendedDataParamGet method */
  public static final ExtendedDataParamRequestMethod EXTENDED_DATA_PARAM_GET = new ExtendedDataParamRequestMethod("ExtendedDataParamGet");
  /** Variable representing the ExtendedDataParamUpdate method */
  public static final ExtendedDataParamRequestMethod EXTENDED_DATA_PARAM_UPDATE = new ExtendedDataParamRequestMethod("ExtendedDataParamUpdate");
}
