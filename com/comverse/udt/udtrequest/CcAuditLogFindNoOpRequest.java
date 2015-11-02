/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogFindNoOpRequest.java
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
 * NoOp class used to simulate a CcAuditLogFindNoOpRequest Udt Request/Response
 *
 */
public class CcAuditLogFindNoOpRequest extends CcAuditLogRequest {
/**
 *
 * Constructor to create a   CcAuditLogFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcAuditLogFindNoOpRequest(String id, CcAuditLogObjectDataList noOpIn) {
    super(id, "CcAuditLogFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CcAuditLogObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CcAuditLog", noOpIn);
      }
      addInput("CcAuditLog", mapList);
    }
  }
/**
 *
 * Retrieves the CcAuditLogObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CcAuditLogObjectDataList getOutput() {
    return CcAuditLogObjectHelper.fromMapList(outputMap, "CcAuditLogList");
  }
}
