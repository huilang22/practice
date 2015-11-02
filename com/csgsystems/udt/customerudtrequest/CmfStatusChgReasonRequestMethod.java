/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusChgReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CmfStatusChgReasonRequestMethod implements UdtMethod {
  private String method = null;
  private CmfStatusChgReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CmfStatusChgReasonCreate method */
  public static final CmfStatusChgReasonRequestMethod CMF_STATUS_CHG_REASON_CREATE = new CmfStatusChgReasonRequestMethod("CmfStatusChgReasonCreate");
  /** Variable representing the CmfStatusChgReasonDelete method */
  public static final CmfStatusChgReasonRequestMethod CMF_STATUS_CHG_REASON_DELETE = new CmfStatusChgReasonRequestMethod("CmfStatusChgReasonDelete");
  /** Variable representing the CmfStatusChgReasonFind method */
  public static final CmfStatusChgReasonRequestMethod CMF_STATUS_CHG_REASON_FIND = new CmfStatusChgReasonRequestMethod("CmfStatusChgReasonFind");
  /** Variable representing the CmfStatusChgReasonGet method */
  public static final CmfStatusChgReasonRequestMethod CMF_STATUS_CHG_REASON_GET = new CmfStatusChgReasonRequestMethod("CmfStatusChgReasonGet");
  /** Variable representing the CmfStatusChgReasonUpdate method */
  public static final CmfStatusChgReasonRequestMethod CMF_STATUS_CHG_REASON_UPDATE = new CmfStatusChgReasonRequestMethod("CmfStatusChgReasonUpdate");
}
