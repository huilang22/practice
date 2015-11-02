/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogFindRequest.java
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
 * Class used to create a CcAuditLogFindRequest Udt Request
 *
 */

public class CcAuditLogFindRequest extends CcAuditLogRequest {
/**
 *
 * Constructor to create a  CcAuditLogFindRequest
 * @param id Unique request name
 * @param CALfind_In CcAuditLogObjectFilter for CcAuditLogFindRequest
 *
 */
@JsonCreator
  public CcAuditLogFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcAuditLog")CcAuditLogObjectFilter CALfind_In) {
    super(id, "CcAuditLogFind");
    if (CALfind_In != null) {
      Integer index =  CALfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(CALfind_In, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }

/**
 *
 * Retrieves the CcAuditLogObjectDataList that results from the CcAuditLogFindRequest call
 * @return CcAuditLogObjectDataList resulting from udt call
 *
 */

  public CcAuditLogObjectDataList getOutput() {
    return CcAuditLogObjectHelper.fromMapList(outputMap, "CcAuditLogList");
  }
}
