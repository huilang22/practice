/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentFindForUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestSegmentFindForUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestSegmentFindForUpdateNoOpRequest extends BatchRequestSegmentRequest {
/**
 *
 * Constructor to create a   BatchRequestSegmentFindForUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestSegmentFindForUpdateNoOpRequest(String id, BatchRequestSegmentObjectDataList noOpIn) {
    super(id, "BatchRequestSegmentFindForUpdateNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestSegmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestSegment", noOpIn);
      }
      addInput("BatchRequestSegment", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestSegmentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestSegmentObjectDataList getOutput() {
    return BatchRequestSegmentObjectHelper.fromMapList(outputMap, "BatchRequestSegmentList");
  }
}
