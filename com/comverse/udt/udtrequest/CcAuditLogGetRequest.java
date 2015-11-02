/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogGetRequest.java
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
 * Class used to create a CcAuditLogGetRequest Udt Request
 *
 */

public class CcAuditLogGetRequest extends CcAuditLogSubRequestParent {
/**
 *
 * Constructor to create a  CcAuditLogGetRequest
 * @param id Unique request name
 * @param CALget_In CcAuditLogObjectKeyData for CcAuditLogGetRequest
 *
 */
@JsonCreator
  public CcAuditLogGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcAuditLog")CcAuditLogObjectKeyData CALget_In) {
    super(id, "CcAuditLogGet");
    if (CALget_In != null) {
      addInput("CcAuditLog", CcAuditLogObjectKeyHelper.toMap(CALget_In, new HashMap(), "CcAuditLogObjectKeyData").get("CcAuditLogObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CcAuditLogObjectData that results from the CcAuditLogGetRequest call
 * @return CcAuditLogObjectData resulting from udt call
 *
 */

  public CcAuditLogObjectData getOutput() {
    return CcAuditLogObjectHelper.fromMap(outputMap, "CcAuditLog");
  }
}
