/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageFindNoOpRequest.java
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
 * NoOp class used to simulate a RateUsageFindNoOpRequest Udt Request/Response
 *
 */
public class RateUsageFindNoOpRequest extends RateUsageRequest {
/**
 *
 * Constructor to create a   RateUsageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUsageFindNoOpRequest(String id, RateUsageObjectDataList noOpIn) {
    super(id, "RateUsageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUsage", noOpIn);
      }
      addInput("RateUsage", mapList);
    }
  }
/**
 *
 * Retrieves the RateUsageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageObjectDataList getOutput() {
    return RateUsageObjectHelper.fromMapList(outputMap, "RateUsageList");
  }
}
