/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntryFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestErrorLogEntryFindNoOpRequest extends BatchRequestErrorLogEntryRequest {
/**
 *
 * Constructor to create a   BatchRequestErrorLogEntryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntryFindNoOpRequest(String id, BatchRequestErrorLogEntryObjectDataList noOpIn) {
    super(id, "BatchRequestErrorLogEntryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestErrorLogEntryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestErrorLogEntry", noOpIn);
      }
      addInput("BatchRequestErrorLogEntry", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestErrorLogEntryObjectDataList getOutput() {
    return BatchRequestErrorLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestErrorLogEntryList");
  }
}
