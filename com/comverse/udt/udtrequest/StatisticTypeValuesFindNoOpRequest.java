/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesFindNoOpRequest.java
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
 * NoOp class used to simulate a StatisticTypeValuesFindNoOpRequest Udt Request/Response
 *
 */
public class StatisticTypeValuesFindNoOpRequest extends StatisticTypeValuesRequest {
/**
 *
 * Constructor to create a   StatisticTypeValuesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatisticTypeValuesFindNoOpRequest(String id, StatisticTypeValuesObjectDataList noOpIn) {
    super(id, "StatisticTypeValuesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = StatisticTypeValuesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatisticTypeValues", noOpIn);
      }
      addInput("StatisticTypeValues", mapList);
    }
  }
/**
 *
 * Retrieves the StatisticTypeValuesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeValuesObjectDataList getOutput() {
    return StatisticTypeValuesObjectHelper.fromMapList(outputMap, "StatisticTypeValuesList");
  }
}
