/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSuspendAllNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestSuspendAllNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestSuspendAllNoOpRequest extends BatchRequestRequest {
/**
 *
 * Constructor to create a   BatchRequestSuspendAllNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestSuspendAllNoOpRequest(String id, BatchRequestObjectDataList noOpIn) {
    super(id, "BatchRequestSuspendAllNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequest", noOpIn);
      }
      addInput("BatchRequest", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectDataList getOutput() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
}
