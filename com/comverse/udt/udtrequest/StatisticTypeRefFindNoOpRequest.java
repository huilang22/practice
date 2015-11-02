/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeRefFindNoOpRequest.java
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
 * NoOp class used to simulate a StatisticTypeRefFindNoOpRequest Udt Request/Response
 *
 */
public class StatisticTypeRefFindNoOpRequest extends StatisticTypeRefRequest {
/**
 *
 * Constructor to create a   StatisticTypeRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatisticTypeRefFindNoOpRequest(String id, StatisticTypeRefObjectDataList noOpIn) {
    super(id, "StatisticTypeRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = StatisticTypeRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatisticTypeRef", noOpIn);
      }
      addInput("StatisticTypeRef", mapList);
    }
  }
/**
 *
 * Retrieves the StatisticTypeRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeRefObjectDataList getOutput() {
    return StatisticTypeRefObjectHelper.fromMapList(outputMap, "StatisticTypeRefList");
  }
}
