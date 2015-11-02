/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitFindNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrRateLimitFindNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRateLimitFindNoOpRequest extends UnitCrRateLimitRequest {
/**
 *
 * Constructor to create a   UnitCrRateLimitFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRateLimitFindNoOpRequest(String id, UnitCrRateLimitsObjectDataList noOpIn) {
    super(id, "UnitCrRateLimitFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UnitCrRateLimitsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrRateLimit", noOpIn);
      }
      addInput("UnitCrRateLimit", mapList);
    }
  }
/**
 *
 * Retrieves the UnitCrRateLimitsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitsObjectDataList getOutput() {
    return UnitCrRateLimitsObjectHelper.fromMapList(outputMap, "UnitCrRateLimitList");
  }
}
