/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalFindNoOpRequest.java
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
 * NoOp class used to simulate a RateUsageImpliedDecimalFindNoOpRequest Udt Request/Response
 *
 */
public class RateUsageImpliedDecimalFindNoOpRequest extends RateUsageImpliedDecimalRequest {
/**
 *
 * Constructor to create a   RateUsageImpliedDecimalFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUsageImpliedDecimalFindNoOpRequest(String id, RateUsageImpliedDecimalObjectDataList noOpIn) {
    super(id, "RateUsageImpliedDecimalFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateUsageImpliedDecimalObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUsageImpliedDecimal", noOpIn);
      }
      addInput("RateUsageImpliedDecimal", mapList);
    }
  }
/**
 *
 * Retrieves the RateUsageImpliedDecimalObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageImpliedDecimalObjectDataList getOutput() {
    return RateUsageImpliedDecimalObjectHelper.fromMapList(outputMap, "RateUsageImpliedDecimalList");
  }
}
