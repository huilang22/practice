/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryFindNoOpRequest.java
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

import com.csgsystems.sfq.data.*;

/**
 *
 * NoOp class used to simulate a BsdQueueAutoRetryFindNoOpRequest Udt Request/Response
 *
 */
public class BsdQueueAutoRetryFindNoOpRequest extends BsdQueueAutoRetryRequest {
/**
 *
 * Constructor to create a   BsdQueueAutoRetryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdQueueAutoRetryFindNoOpRequest(String id, BsdQueueAutoRetryObjectDataList noOpIn) {
    super(id, "BsdQueueAutoRetryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdQueueAutoRetryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdQueueAutoRetry", noOpIn);
      }
      addInput("BsdQueueAutoRetry", mapList);
    }
  }
/**
 *
 * Retrieves the BsdQueueAutoRetryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueAutoRetryObjectDataList getOutput() {
    return BsdQueueAutoRetryObjectHelper.fromMapList(outputMap, "BsdQueueAutoRetryList");
  }
}
