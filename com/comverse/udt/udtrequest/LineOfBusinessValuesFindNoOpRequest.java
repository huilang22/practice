/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesFindNoOpRequest.java
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
 * NoOp class used to simulate a LineOfBusinessValuesFindNoOpRequest Udt Request/Response
 *
 */
public class LineOfBusinessValuesFindNoOpRequest extends LineOfBusinessValuesRequest {
/**
 *
 * Constructor to create a   LineOfBusinessValuesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LineOfBusinessValuesFindNoOpRequest(String id, LineOfBusinessValuesObjectDataList noOpIn) {
    super(id, "LineOfBusinessValuesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LineOfBusinessValuesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LineOfBusinessValues", noOpIn);
      }
      addInput("LineOfBusinessValues", mapList);
    }
  }
/**
 *
 * Retrieves the LineOfBusinessValuesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessValuesObjectDataList getOutput() {
    return LineOfBusinessValuesObjectHelper.fromMapList(outputMap, "LineOfBusinessValuesList");
  }
}
