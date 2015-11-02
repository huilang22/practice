/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryFindNoOpRequest.java
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
 * NoOp class used to simulate a InvdMainHistoryFindNoOpRequest Udt Request/Response
 *
 */
public class InvdMainHistoryFindNoOpRequest extends InvdMainHistoryRequest {
/**
 *
 * Constructor to create a   InvdMainHistoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainHistoryFindNoOpRequest(String id, InvdMainHistoryObjectDataList noOpIn) {
    super(id, "InvdMainHistoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdMainHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdMainHistory", noOpIn);
      }
      addInput("InvdMainHistory", mapList);
    }
  }
/**
 *
 * Retrieves the InvdMainHistoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainHistoryObjectDataList getOutput() {
    return InvdMainHistoryObjectHelper.fromMapList(outputMap, "InvdMainHistoryList");
  }
}
