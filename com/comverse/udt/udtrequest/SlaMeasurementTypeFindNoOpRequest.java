/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a SlaMeasurementTypeFindNoOpRequest Udt Request/Response
 *
 */
public class SlaMeasurementTypeFindNoOpRequest extends SlaMeasurementTypeRequest {
/**
 *
 * Constructor to create a   SlaMeasurementTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SlaMeasurementTypeFindNoOpRequest(String id, SlaMeasurementTypeObjectDataList noOpIn) {
    super(id, "SlaMeasurementTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SlaMeasurementTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SlaMeasurementType", noOpIn);
      }
      addInput("SlaMeasurementType", mapList);
    }
  }
/**
 *
 * Retrieves the SlaMeasurementTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementTypeObjectDataList getOutput() {
    return SlaMeasurementTypeObjectHelper.fromMapList(outputMap, "SlaMeasurementTypeList");
  }
}
