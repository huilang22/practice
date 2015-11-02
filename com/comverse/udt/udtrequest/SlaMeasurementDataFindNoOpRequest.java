/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataFindNoOpRequest.java
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
 * NoOp class used to simulate a SlaMeasurementDataFindNoOpRequest Udt Request/Response
 *
 */
public class SlaMeasurementDataFindNoOpRequest extends SlaMeasurementDataRequest {
/**
 *
 * Constructor to create a   SlaMeasurementDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SlaMeasurementDataFindNoOpRequest(String id, SlaMeasurementDataObjectDataList noOpIn) {
    super(id, "SlaMeasurementDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SlaMeasurementDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SlaMeasurementData", noOpIn);
      }
      addInput("SlaMeasurementData", mapList);
    }
  }
/**
 *
 * Retrieves the SlaMeasurementDataObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementDataObjectDataList getOutput() {
    return SlaMeasurementDataObjectHelper.fromMapList(outputMap, "SlaMeasurementDataList");
  }
}
