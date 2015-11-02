/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogGetNoOpRequest.java
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
 * NoOp class used to simulate a CcAuditLogGetNoOpRequest Udt Request/Response
 *
 */
public class CcAuditLogGetNoOpRequest extends CcAuditLogSubRequestParent {
/**
 *
 * Constructor to create a   CcAuditLogGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcAuditLogGetNoOpRequest(String id, CcAuditLogObjectData noOpIn) {
    super(id, "CcAuditLogGetNoOpRequest");
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
