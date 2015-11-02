/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CcAuditLog related UdtRequests
 *
 */

public abstract class CcAuditLogRequest extends UdtRequest {

/**
 *
 * Constructor for CcAuditLogRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CcAuditLogRequest(String id, String method) {
    super(id, "CcAuditLog", method);
  }
}
