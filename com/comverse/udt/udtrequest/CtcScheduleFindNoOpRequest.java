/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcScheduleFindNoOpRequest Udt Request/Response
 *
 */
public class CtcScheduleFindNoOpRequest extends CtcScheduleRequest {
/**
 *
 * Constructor to create a   CtcScheduleFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcScheduleFindNoOpRequest(String id, CtcScheduleObjectDataList noOpIn) {
    super(id, "CtcScheduleFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcScheduleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcSchedule", noOpIn);
      }
      addInput("CtcSchedule", mapList);
    }
  }
/**
 *
 * Retrieves the CtcScheduleObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcScheduleObjectDataList getOutput() {
    return CtcScheduleObjectHelper.fromMapList(outputMap, "CtcScheduleList");
  }
}
