/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageFindNoOpRequest.java
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
 * NoOp class used to simulate a RateCorridorUsageFindNoOpRequest Udt Request/Response
 *
 */
public class RateCorridorUsageFindNoOpRequest extends RateCorridorUsageRequest {
/**
 *
 * Constructor to create a   RateCorridorUsageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateCorridorUsageFindNoOpRequest(String id, RCUsageObjectDataList noOpIn) {
    super(id, "RateCorridorUsageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RCUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateCorridorUsage", noOpIn);
      }
      addInput("RateCorridorUsage", mapList);
    }
  }
/**
 *
 * Retrieves the RCUsageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RCUsageObjectDataList getOutput() {
    return RCUsageObjectHelper.fromMapList(outputMap, "RateCorridorUsageList");
  }
}
