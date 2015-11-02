/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionFindNoOpRequest.java
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
 * NoOp class used to simulate a HistoricalContributionFindNoOpRequest Udt Request/Response
 *
 */
public class HistoricalContributionFindNoOpRequest extends HistoricalContributionRequest {
/**
 *
 * Constructor to create a   HistoricalContributionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HistoricalContributionFindNoOpRequest(String id, HistoricalContributionObjectDataList noOpIn) {
    super(id, "HistoricalContributionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HistoricalContributionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HistoricalContribution", noOpIn);
      }
      addInput("HistoricalContribution", mapList);
    }
  }
/**
 *
 * Retrieves the HistoricalContributionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionObjectDataList getOutput() {
    return HistoricalContributionObjectHelper.fromMapList(outputMap, "HistoricalContributionList");
  }
}
