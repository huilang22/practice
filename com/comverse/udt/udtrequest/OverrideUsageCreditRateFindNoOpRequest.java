/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a OverrideUsageCreditRateFindNoOpRequest Udt Request/Response
 *
 */
public class OverrideUsageCreditRateFindNoOpRequest extends OverrideUsageCreditRateRequest {
/**
 *
 * Constructor to create a   OverrideUsageCreditRateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OverrideUsageCreditRateFindNoOpRequest(String id, RUCOverrideObjectDataList noOpIn) {
    super(id, "OverrideUsageCreditRateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RUCOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OverrideUsageCreditRate", noOpIn);
      }
      addInput("OverrideUsageCreditRate", mapList);
    }
  }
/**
 *
 * Retrieves the RUCOverrideObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RUCOverrideObjectDataList getOutput() {
    return RUCOverrideObjectHelper.fromMapList(outputMap, "OverrideUsageCreditRateList");
  }
}
