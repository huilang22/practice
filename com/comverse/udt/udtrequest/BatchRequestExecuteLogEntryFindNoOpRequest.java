/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestExecuteLogEntryFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestExecuteLogEntryFindNoOpRequest extends BatchRequestExecuteLogEntryRequest {
/**
 *
 * Constructor to create a   BatchRequestExecuteLogEntryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestExecuteLogEntryFindNoOpRequest(String id, BatchRequestExecuteLogEntryObjectDataList noOpIn) {
    super(id, "BatchRequestExecuteLogEntryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestExecuteLogEntryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestExecuteLogEntry", noOpIn);
      }
      addInput("BatchRequestExecuteLogEntry", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestExecuteLogEntryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestExecuteLogEntryObjectDataList getOutput() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestExecuteLogEntryList");
  }
}
