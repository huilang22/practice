/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogCreateNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CcAuditLogCreateNoOpRequest Udt Request/Response
 *
 */
public class CcAuditLogCreateNoOpRequest extends CcAuditLogSubRequestParent {
/**
 *
 * Constructor to create a   CcAuditLogCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcAuditLogCreateNoOpRequest(String id, CcAuditLogObjectData noOpIn) {
    super(id, "CcAuditLogCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(noOpIn, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }
/**
 *
 * Retrieves the CcAuditLogObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CcAuditLogObjectData getOutput() {
    return CcAuditLogObjectHelper.fromMap(outputMap, "CcAuditLog");
  }
}
