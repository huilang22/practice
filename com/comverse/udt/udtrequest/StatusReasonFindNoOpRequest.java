/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a StatusReasonFindNoOpRequest Udt Request/Response
 *
 */
public class StatusReasonFindNoOpRequest extends StatusReasonRequest {
/**
 *
 * Constructor to create a   StatusReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusReasonFindNoOpRequest(String id, StatusReasonObjectDataList noOpIn) {
    super(id, "StatusReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = StatusReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatusReason", noOpIn);
      }
      addInput("StatusReason", mapList);
    }
  }
/**
 *
 * Retrieves the StatusReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public StatusReasonObjectDataList getOutput() {
    return StatusReasonObjectHelper.fromMapList(outputMap, "StatusReasonList");
  }
}
