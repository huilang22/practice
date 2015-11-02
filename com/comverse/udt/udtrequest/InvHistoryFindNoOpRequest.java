/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvHistoryFindNoOpRequest Udt Request/Response
 *
 */
public class InvHistoryFindNoOpRequest extends InvHistoryRequest {
/**
 *
 * Constructor to create a   InvHistoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvHistoryFindNoOpRequest(String id, InvHistoryObjectDataList noOpIn) {
    super(id, "InvHistoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvHistory", noOpIn);
      }
      addInput("InvHistory", mapList);
    }
  }
/**
 *
 * Retrieves the InvHistoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvHistoryObjectDataList getOutput() {
    return InvHistoryObjectHelper.fromMapList(outputMap, "InvHistoryList");
  }
}
