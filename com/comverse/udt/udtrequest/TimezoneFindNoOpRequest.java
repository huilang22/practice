/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneFindNoOpRequest.java
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
 * NoOp class used to simulate a TimezoneFindNoOpRequest Udt Request/Response
 *
 */
public class TimezoneFindNoOpRequest extends TimezoneRequest {
/**
 *
 * Constructor to create a   TimezoneFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TimezoneFindNoOpRequest(String id, TimezoneObjectDataList noOpIn) {
    super(id, "TimezoneFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TimezoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Timezone", noOpIn);
      }
      addInput("Timezone", mapList);
    }
  }
/**
 *
 * Retrieves the TimezoneObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TimezoneObjectDataList getOutput() {
    return TimezoneObjectHelper.fromMapList(outputMap, "TimezoneList");
  }
}
