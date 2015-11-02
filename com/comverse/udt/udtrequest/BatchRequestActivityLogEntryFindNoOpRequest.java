/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestActivityLogEntryFindNoOpRequest extends BatchRequestActivityLogEntryRequest {
/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryFindNoOpRequest(String id, BatchRequestActivityLogEntryObjectDataList noOpIn) {
    super(id, "BatchRequestActivityLogEntryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestActivityLogEntryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestActivityLogEntry", noOpIn);
      }
      addInput("BatchRequestActivityLogEntry", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestActivityLogEntryObjectDataList getOutput() {
    return BatchRequestActivityLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestActivityLogEntryList");
  }
}
