/*
 * Generated code DO NOT EDIT
 * Generated file: CtmDataRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtmDataRequestMethod implements UdtMethod {
  private String method = null;
  private CtmDataRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtmDataCreate method */
  public static final CtmDataRequestMethod CTM_DATA_CREATE = new CtmDataRequestMethod("CtmDataCreate");
  /** Variable representing the CtmDataDelete method */
  public static final CtmDataRequestMethod CTM_DATA_DELETE = new CtmDataRequestMethod("CtmDataDelete");
  /** Variable representing the CtmDataFind method */
  public static final CtmDataRequestMethod CTM_DATA_FIND = new CtmDataRequestMethod("CtmDataFind");
  /** Variable representing the CtmDataGet method */
  public static final CtmDataRequestMethod CTM_DATA_GET = new CtmDataRequestMethod("CtmDataGet");
  /** Variable representing the CtmDataUpdate method */
  public static final CtmDataRequestMethod CTM_DATA_UPDATE = new CtmDataRequestMethod("CtmDataUpdate");
}
