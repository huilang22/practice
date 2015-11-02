/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodFindNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a RatePeriodFindNoOpRequest Udt Request/Response
 *
 */
public class RatePeriodFindNoOpRequest extends RatePeriodRequest {
/**
 *
 * Constructor to create a   RatePeriodFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatePeriodFindNoOpRequest(String id, RPObjectDataList noOpIn) {
    super(id, "RatePeriodFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatePeriod", noOpIn);
      }
      addInput("RatePeriod", mapList);
    }
  }
/**
 *
 * Retrieves the RPObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RPObjectDataList getOutput() {
    return RPObjectHelper.fromMapList(outputMap, "RatePeriodList");
  }
}
