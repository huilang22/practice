/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsFindNoOpRequest.java
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
 * NoOp class used to simulate a HistoricalThresholdsFindNoOpRequest Udt Request/Response
 *
 */
public class HistoricalThresholdsFindNoOpRequest extends HistoricalThresholdsRequest {
/**
 *
 * Constructor to create a   HistoricalThresholdsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HistoricalThresholdsFindNoOpRequest(String id, HistoricalThresholdsObjectDataList noOpIn) {
    super(id, "HistoricalThresholdsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HistoricalThresholdsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HistoricalThresholds", noOpIn);
      }
      addInput("HistoricalThresholds", mapList);
    }
  }
/**
 *
 * Retrieves the HistoricalThresholdsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalThresholdsObjectDataList getOutput() {
    return HistoricalThresholdsObjectHelper.fromMapList(outputMap, "HistoricalThresholdsList");
  }
}
