/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a LogicalServiceOrderFindNoOpRequest Udt Request/Response
 *
 */
public class LogicalServiceOrderFindNoOpRequest extends LogicalServiceOrderRequest {
/**
 *
 * Constructor to create a   LogicalServiceOrderFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LogicalServiceOrderFindNoOpRequest(String id, LogicalServiceOrderObjectDataList noOpIn) {
    super(id, "LogicalServiceOrderFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LogicalServiceOrderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LogicalServiceOrder", noOpIn);
      }
      addInput("LogicalServiceOrder", mapList);
    }
  }
/**
 *
 * Retrieves the LogicalServiceOrderObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderObjectDataList getOutput() {
    return LogicalServiceOrderObjectHelper.fromMapList(outputMap, "LogicalServiceOrderList");
  }
}
