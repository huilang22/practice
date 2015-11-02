/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrCalendarFindNoOpRequest Udt Request/Response
 *
 */
public class RbrCalendarFindNoOpRequest extends RbrCalendarRequest {
/**
 *
 * Constructor to create a   RbrCalendarFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrCalendarFindNoOpRequest(String id, RbrCalendarObjectDataList noOpIn) {
    super(id, "RbrCalendarFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrCalendarObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrCalendar", noOpIn);
      }
      addInput("RbrCalendar", mapList);
    }
  }
/**
 *
 * Retrieves the RbrCalendarObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrCalendarObjectDataList getOutput() {
    return RbrCalendarObjectHelper.fromMapList(outputMap, "RbrCalendarList");
  }
}
