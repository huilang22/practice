/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxFindNoOpRequest.java
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
 * NoOp class used to simulate a HistoricalContributionTaxFindNoOpRequest Udt Request/Response
 *
 */
public class HistoricalContributionTaxFindNoOpRequest extends HistoricalContributionTaxRequest {
/**
 *
 * Constructor to create a   HistoricalContributionTaxFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HistoricalContributionTaxFindNoOpRequest(String id, HistoricalContributionTaxObjectDataList noOpIn) {
    super(id, "HistoricalContributionTaxFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HistoricalContributionTaxObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HistoricalContributionTax", noOpIn);
      }
      addInput("HistoricalContributionTax", mapList);
    }
  }
/**
 *
 * Retrieves the HistoricalContributionTaxObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionTaxObjectDataList getOutput() {
    return HistoricalContributionTaxObjectHelper.fromMapList(outputMap, "HistoricalContributionTaxList");
  }
}
