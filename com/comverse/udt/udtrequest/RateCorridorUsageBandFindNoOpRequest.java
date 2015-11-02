/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandFindNoOpRequest.java
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
 * NoOp class used to simulate a RateCorridorUsageBandFindNoOpRequest Udt Request/Response
 *
 */
public class RateCorridorUsageBandFindNoOpRequest extends RateCorridorUsageBandRequest {
/**
 *
 * Constructor to create a   RateCorridorUsageBandFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateCorridorUsageBandFindNoOpRequest(String id, RUBOverrideObjectDataList noOpIn) {
    super(id, "RateCorridorUsageBandFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RUBOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateCorridorUsageBand", noOpIn);
      }
      addInput("RateCorridorUsageBand", mapList);
    }
  }
/**
 *
 * Retrieves the RUBOverrideObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RUBOverrideObjectDataList getOutput() {
    return RUBOverrideObjectHelper.fromMapList(outputMap, "RateCorridorUsageBandList");
  }
}
