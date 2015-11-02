/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CmfStatusRequestMethod implements UdtMethod {
  private String method = null;
  private CmfStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CmfStatusCreate method */
  public static final CmfStatusRequestMethod CMF_STATUS_CREATE = new CmfStatusRequestMethod("CmfStatusCreate");
  /** Variable representing the CmfStatusDelete method */
  public static final CmfStatusRequestMethod CMF_STATUS_DELETE = new CmfStatusRequestMethod("CmfStatusDelete");
  /** Variable representing the CmfStatusFind method */
  public static final CmfStatusRequestMethod CMF_STATUS_FIND = new CmfStatusRequestMethod("CmfStatusFind");
  /** Variable representing the CmfStatusGet method */
  public static final CmfStatusRequestMethod CMF_STATUS_GET = new CmfStatusRequestMethod("CmfStatusGet");
  /** Variable representing the CmfStatusUpdate method */
  public static final CmfStatusRequestMethod CMF_STATUS_UPDATE = new CmfStatusRequestMethod("CmfStatusUpdate");
}
