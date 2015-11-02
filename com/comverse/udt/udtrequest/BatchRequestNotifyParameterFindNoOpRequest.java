/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestNotifyParameterFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestNotifyParameterFindNoOpRequest extends BatchRequestNotifyParameterRequest {
/**
 *
 * Constructor to create a   BatchRequestNotifyParameterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestNotifyParameterFindNoOpRequest(String id, BatchRequestNotifyParameterObjectDataList noOpIn) {
    super(id, "BatchRequestNotifyParameterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestNotifyParameterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestNotifyParameter", noOpIn);
      }
      addInput("BatchRequestNotifyParameter", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestNotifyParameterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyParameterObjectDataList getOutput() {
    return BatchRequestNotifyParameterObjectHelper.fromMapList(outputMap, "BatchRequestNotifyParameterList");
  }
}
