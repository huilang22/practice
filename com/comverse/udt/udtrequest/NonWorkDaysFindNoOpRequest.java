/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a NonWorkDaysFindNoOpRequest Udt Request/Response
 *
 */
public class NonWorkDaysFindNoOpRequest extends NonWorkDaysRequest {
/**
 *
 * Constructor to create a   NonWorkDaysFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NonWorkDaysFindNoOpRequest(String id, NonWorkDaysObjectDataList noOpIn) {
    super(id, "NonWorkDaysFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NonWorkDaysObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NonWorkDays", noOpIn);
      }
      addInput("NonWorkDays", mapList);
    }
  }
/**
 *
 * Retrieves the NonWorkDaysObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NonWorkDaysObjectDataList getOutput() {
    return NonWorkDaysObjectHelper.fromMapList(outputMap, "NonWorkDaysList");
  }
}
