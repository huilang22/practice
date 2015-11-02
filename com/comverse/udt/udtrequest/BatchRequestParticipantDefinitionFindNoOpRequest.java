/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParticipantDefinitionFindNoOpRequest extends BatchRequestParticipantDefinitionRequest {
/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionFindNoOpRequest(String id, BatchRequestParticipantDefinitionObjectDataList noOpIn) {
    super(id, "BatchRequestParticipantDefinitionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestParticipantDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestParticipantDefinition", noOpIn);
      }
      addInput("BatchRequestParticipantDefinition", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantDefinitionObjectDataList getOutput() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestParticipantDefinitionList");
  }
}
