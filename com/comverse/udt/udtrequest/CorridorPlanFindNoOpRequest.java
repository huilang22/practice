/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanFindNoOpRequest.java
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
 * NoOp class used to simulate a CorridorPlanFindNoOpRequest Udt Request/Response
 *
 */
public class CorridorPlanFindNoOpRequest extends CorridorPlanRequest {
/**
 *
 * Constructor to create a   CorridorPlanFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorPlanFindNoOpRequest(String id, CPObjectDataList noOpIn) {
    super(id, "CorridorPlanFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorPlan", noOpIn);
      }
      addInput("CorridorPlan", mapList);
    }
  }
/**
 *
 * Retrieves the CPObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CPObjectDataList getOutput() {
    return CPObjectHelper.fromMapList(outputMap, "CorridorPlanList");
  }
}
