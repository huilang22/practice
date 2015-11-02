/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcGeoAreaScheduleFindNoOpRequest Udt Request/Response
 *
 */
public class CtcGeoAreaScheduleFindNoOpRequest extends CtcGeoAreaScheduleRequest {
/**
 *
 * Constructor to create a   CtcGeoAreaScheduleFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcGeoAreaScheduleFindNoOpRequest(String id, CtcGeoAreaScheduleObjectDataList noOpIn) {
    super(id, "CtcGeoAreaScheduleFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcGeoAreaScheduleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcGeoAreaSchedule", noOpIn);
      }
      addInput("CtcGeoAreaSchedule", mapList);
    }
  }
/**
 *
 * Retrieves the CtcGeoAreaScheduleObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGeoAreaScheduleObjectDataList getOutput() {
    return CtcGeoAreaScheduleObjectHelper.fromMapList(outputMap, "CtcGeoAreaScheduleList");
  }
}
