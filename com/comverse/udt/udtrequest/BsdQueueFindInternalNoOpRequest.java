/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueFindInternalNoOpRequest.java
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
 * NoOp class used to simulate a BsdQueueFindInternalNoOpRequest Udt Request/Response
 *
 */
public class BsdQueueFindInternalNoOpRequest extends BsdQueueRequest {
/**
 *
 * Constructor to create a   BsdQueueFindInternalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdQueueFindInternalNoOpRequest(String id, BsdQueueObjectDataList noOpIn) {
    super(id, "BsdQueueFindInternalNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdQueueObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdQueue", noOpIn);
      }
      addInput("BsdQueue", mapList);
    }
  }
/**
 *
 * Retrieves the BsdQueueObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueObjectDataList getOutput() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
}
