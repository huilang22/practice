/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogCreateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CcAuditLogCreateRequest Udt Request
 *
 */

public class CcAuditLogCreateRequest extends CcAuditLogSubRequestParent {
/**
 *
 * Constructor to create a  CcAuditLogCreateRequest
 * @param id Unique request name
 * @param CALcreate_In CcAuditLogObjectData for CcAuditLogCreateRequest
 *
 */
@JsonCreator
  public CcAuditLogCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcAuditLog")CcAuditLogObjectData CALcreate_In) {
    super(id, "CcAuditLogCreate");
    if (CALcreate_In != null) {
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(CALcreate_In, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }

/**
 *
 * Retrieves the CcAuditLogObjectData that results from the CcAuditLogCreateRequest call
 * @return CcAuditLogObjectData resulting from udt call
 *
 */

  public CcAuditLogObjectData getOutput() {
    return CcAuditLogObjectHelper.fromMap(outputMap, "CcAuditLog");
  }
}
