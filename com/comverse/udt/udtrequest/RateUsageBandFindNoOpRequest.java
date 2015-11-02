/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandFindNoOpRequest.java
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
 * NoOp class used to simulate a RateUsageBandFindNoOpRequest Udt Request/Response
 *
 */
public class RateUsageBandFindNoOpRequest extends RateUsageBandRequest {
/**
 *
 * Constructor to create a   RateUsageBandFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUsageBandFindNoOpRequest(String id, RateUsageBandObjectDataList noOpIn) {
    super(id, "RateUsageBandFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateUsageBandObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUsageBand", noOpIn);
      }
      addInput("RateUsageBand", mapList);
    }
  }
/**
 *
 * Retrieves the RateUsageBandObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageBandObjectDataList getOutput() {
    return RateUsageBandObjectHelper.fromMapList(outputMap, "RateUsageBandList");
  }
}
