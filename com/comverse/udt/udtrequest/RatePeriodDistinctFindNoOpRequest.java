/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDistinctFindNoOpRequest.java
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
 * NoOp class used to simulate a RatePeriodDistinctFindNoOpRequest Udt Request/Response
 *
 */
public class RatePeriodDistinctFindNoOpRequest extends RatePeriodDistinctRequest {
/**
 *
 * Constructor to create a   RatePeriodDistinctFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatePeriodDistinctFindNoOpRequest(String id, RatePeriodDistinctObjectDataList noOpIn) {
    super(id, "RatePeriodDistinctFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RatePeriodDistinctObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatePeriodDistinct", noOpIn);
      }
      addInput("RatePeriodDistinct", mapList);
    }
  }
/**
 *
 * Retrieves the RatePeriodDistinctObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodDistinctObjectDataList getOutput() {
    return RatePeriodDistinctObjectHelper.fromMapList(outputMap, "RatePeriodDistinctList");
  }
}
