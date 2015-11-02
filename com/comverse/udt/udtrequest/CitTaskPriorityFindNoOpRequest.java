/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityFindNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitTaskPriorityFindNoOpRequest Udt Request/Response
 *
 */
public class CitTaskPriorityFindNoOpRequest extends CitTaskPriorityRequest {
/**
 *
 * Constructor to create a   CitTaskPriorityFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskPriorityFindNoOpRequest(String id, CitTaskPriorityObjectDataList noOpIn) {
    super(id, "CitTaskPriorityFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitTaskPriorityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitTaskPriority", noOpIn);
      }
      addInput("CitTaskPriority", mapList);
    }
  }
/**
 *
 * Retrieves the CitTaskPriorityObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskPriorityObjectDataList getOutput() {
    return CitTaskPriorityObjectHelper.fromMapList(outputMap, "CitTaskPriorityList");
  }
}
