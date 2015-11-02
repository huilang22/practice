/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantFindNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestParticipantFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantFindNoOpRequest extends BatchRequestParticipantRequest {
/**
 *
 * Constructor to create a   BatchRequestParticipantFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantFindNoOpRequest(String id, BatchRequestParticipantObjectDataList noOpIn) {
    super(id, "BatchRequestParticipantFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestParticipantObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestParticipant", noOpIn);
      }
      addInput("BatchRequestParticipant", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestParticipantObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantObjectDataList getOutput() {
    return BatchRequestParticipantObjectHelper.fromMapList(outputMap, "BatchRequestParticipantList");
  }
}
