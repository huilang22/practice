/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchStatusFindNoOpRequest Udt Request/Response
 *
 */
public class BatchStatusFindNoOpRequest extends BatchStatusRequest {
/**
 *
 * Constructor to create a   BatchStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchStatusFindNoOpRequest(String id, BatchStatusObjectDataList noOpIn) {
    super(id, "BatchStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchStatus", noOpIn);
      }
      addInput("BatchStatus", mapList);
    }
  }
/**
 *
 * Retrieves the BatchStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchStatusObjectDataList getOutput() {
    return BatchStatusObjectHelper.fromMapList(outputMap, "BatchStatusList");
  }
}
