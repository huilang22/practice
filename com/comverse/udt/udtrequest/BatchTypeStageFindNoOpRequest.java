/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeStageFindNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeStageFindNoOpRequest extends BatchTypeStageRequest {
/**
 *
 * Constructor to create a   BatchTypeStageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeStageFindNoOpRequest(String id, BatchTypeStageObjectDataList noOpIn) {
    super(id, "BatchTypeStageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchTypeStageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchTypeStage", noOpIn);
      }
      addInput("BatchTypeStage", mapList);
    }
  }
/**
 *
 * Retrieves the BatchTypeStageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeStageObjectDataList getOutput() {
    return BatchTypeStageObjectHelper.fromMapList(outputMap, "BatchTypeStageList");
  }
}
