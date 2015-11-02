/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageFindNoOpRequest.java
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
 * NoOp class used to simulate a RatePeriodUsageFindNoOpRequest Udt Request/Response
 *
 */
public class RatePeriodUsageFindNoOpRequest extends RatePeriodUsageRequest {
/**
 *
 * Constructor to create a   RatePeriodUsageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatePeriodUsageFindNoOpRequest(String id, RatePeriodUsagesObjectDataList noOpIn) {
    super(id, "RatePeriodUsageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RatePeriodUsagesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatePeriodUsage", noOpIn);
      }
      addInput("RatePeriodUsage", mapList);
    }
  }
/**
 *
 * Retrieves the RatePeriodUsagesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodUsagesObjectDataList getOutput() {
    return RatePeriodUsagesObjectHelper.fromMapList(outputMap, "RatePeriodUsageList");
  }
}
