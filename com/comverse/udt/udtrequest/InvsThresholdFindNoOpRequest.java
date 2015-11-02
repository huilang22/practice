/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsThresholdFindNoOpRequest Udt Request/Response
 *
 */
public class InvsThresholdFindNoOpRequest extends InvsThresholdRequest {
/**
 *
 * Constructor to create a   InvsThresholdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsThresholdFindNoOpRequest(String id, InvsThresholdObjectDataList noOpIn) {
    super(id, "InvsThresholdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsThresholdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsThreshold", noOpIn);
      }
      addInput("InvsThreshold", mapList);
    }
  }
/**
 *
 * Retrieves the InvsThresholdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsThresholdObjectDataList getOutput() {
    return InvsThresholdObjectHelper.fromMapList(outputMap, "InvsThresholdList");
  }
}
