/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryFindNoOpRequest.java
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
 * NoOp class used to simulate a InvJobHistoryFindNoOpRequest Udt Request/Response
 *
 */
public class InvJobHistoryFindNoOpRequest extends InvJobHistoryRequest {
/**
 *
 * Constructor to create a   InvJobHistoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobHistoryFindNoOpRequest(String id, InvJobHistoryObjectDataList noOpIn) {
    super(id, "InvJobHistoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvJobHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJobHistory", noOpIn);
      }
      addInput("InvJobHistory", mapList);
    }
  }
/**
 *
 * Retrieves the InvJobHistoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobHistoryObjectDataList getOutput() {
    return InvJobHistoryObjectHelper.fromMapList(outputMap, "InvJobHistoryList");
  }
}
