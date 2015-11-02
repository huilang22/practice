/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageFindNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestNotifyMessageFindNoOpRequest extends BatchRequestNotifyMessageRequest {
/**
 *
 * Constructor to create a   BatchRequestNotifyMessageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageFindNoOpRequest(String id, BatchRequestNotifyMessageObjectDataList noOpIn) {
    super(id, "BatchRequestNotifyMessageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchRequestNotifyMessageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestNotifyMessage", noOpIn);
      }
      addInput("BatchRequestNotifyMessage", mapList);
    }
  }
/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyMessageObjectDataList getOutput() {
    return BatchRequestNotifyMessageObjectHelper.fromMapList(outputMap, "BatchRequestNotifyMessageList");
  }
}
