/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsStatusFindNoOpRequest Udt Request/Response
 *
 */
public class InvsStatusFindNoOpRequest extends InvsStatusRequest {
/**
 *
 * Constructor to create a   InvsStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsStatusFindNoOpRequest(String id, InvsStatusObjectDataList noOpIn) {
    super(id, "InvsStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsStatus", noOpIn);
      }
      addInput("InvsStatus", mapList);
    }
  }
/**
 *
 * Retrieves the InvsStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStatusObjectDataList getOutput() {
    return InvsStatusObjectHelper.fromMapList(outputMap, "InvsStatusList");
  }
}
