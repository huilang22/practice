/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a JeopardyStatusFindNoOpRequest Udt Request/Response
 *
 */
public class JeopardyStatusFindNoOpRequest extends JeopardyStatusRequest {
/**
 *
 * Constructor to create a   JeopardyStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public JeopardyStatusFindNoOpRequest(String id, JeopardyStatusObjectDataList noOpIn) {
    super(id, "JeopardyStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = JeopardyStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("JeopardyStatus", noOpIn);
      }
      addInput("JeopardyStatus", mapList);
    }
  }
/**
 *
 * Retrieves the JeopardyStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public JeopardyStatusObjectDataList getOutput() {
    return JeopardyStatusObjectHelper.fromMapList(outputMap, "JeopardyStatusList");
  }
}
