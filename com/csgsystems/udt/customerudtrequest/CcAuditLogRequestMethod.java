/*
 * Generated code DO NOT EDIT
 * Generated file: CcAuditLogRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CcAuditLogRequestMethod implements UdtMethod {
  private String method = null;
  private CcAuditLogRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CcAuditLogCreate method */
  public static final CcAuditLogRequestMethod CC_AUDIT_LOG_CREATE = new CcAuditLogRequestMethod("CcAuditLogCreate");
  /** Variable representing the CcAuditLogFind method */
  public static final CcAuditLogRequestMethod CC_AUDIT_LOG_FIND = new CcAuditLogRequestMethod("CcAuditLogFind");
  /** Variable representing the CcAuditLogGet method */
  public static final CcAuditLogRequestMethod CC_AUDIT_LOG_GET = new CcAuditLogRequestMethod("CcAuditLogGet");
}
