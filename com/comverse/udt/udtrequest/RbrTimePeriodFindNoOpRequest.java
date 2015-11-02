/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrTimePeriodFindNoOpRequest Udt Request/Response
 *
 */
public class RbrTimePeriodFindNoOpRequest extends RbrTimePeriodRequest {
/**
 *
 * Constructor to create a   RbrTimePeriodFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrTimePeriodFindNoOpRequest(String id, RbrTimePeriodObjectDataList noOpIn) {
    super(id, "RbrTimePeriodFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrTimePeriodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrTimePeriod", noOpIn);
      }
      addInput("RbrTimePeriod", mapList);
    }
  }
/**
 *
 * Retrieves the RbrTimePeriodObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTimePeriodObjectDataList getOutput() {
    return RbrTimePeriodObjectHelper.fromMapList(outputMap, "RbrTimePeriodList");
  }
}
