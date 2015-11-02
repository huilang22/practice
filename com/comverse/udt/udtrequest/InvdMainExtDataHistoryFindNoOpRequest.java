/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryFindNoOpRequest.java
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
 * NoOp class used to simulate a InvdMainExtDataHistoryFindNoOpRequest Udt Request/Response
 *
 */
public class InvdMainExtDataHistoryFindNoOpRequest extends InvdMainExtDataHistoryRequest {
/**
 *
 * Constructor to create a   InvdMainExtDataHistoryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainExtDataHistoryFindNoOpRequest(String id, InvdMainExtDataHistoryObjectDataList noOpIn) {
    super(id, "InvdMainExtDataHistoryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdMainExtDataHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdMainExtDataHistory", noOpIn);
      }
      addInput("InvdMainExtDataHistory", mapList);
    }
  }
/**
 *
 * Retrieves the InvdMainExtDataHistoryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainExtDataHistoryObjectDataList getOutput() {
    return InvdMainExtDataHistoryObjectHelper.fromMapList(outputMap, "InvdMainExtDataHistoryList");
  }
}
