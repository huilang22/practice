/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsFindNoOpRequest.java
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
 * NoOp class used to simulate a AbiBillingStatisticsFindNoOpRequest Udt Request/Response
 *
 */
public class AbiBillingStatisticsFindNoOpRequest extends AbiBillingStatisticsRequest {
/**
 *
 * Constructor to create a   AbiBillingStatisticsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiBillingStatisticsFindNoOpRequest(String id, AbiBillingStatisticsObjectDataList noOpIn) {
    super(id, "AbiBillingStatisticsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AbiBillingStatisticsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AbiBillingStatistics", noOpIn);
      }
      addInput("AbiBillingStatistics", mapList);
    }
  }
/**
 *
 * Retrieves the AbiBillingStatisticsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillingStatisticsObjectDataList getOutput() {
    return AbiBillingStatisticsObjectHelper.fromMapList(outputMap, "AbiBillingStatisticsList");
  }
}
