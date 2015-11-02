/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a CorridorPlanGroupFindNoOpRequest Udt Request/Response
 *
 */
public class CorridorPlanGroupFindNoOpRequest extends CorridorPlanGroupRequest {
/**
 *
 * Constructor to create a   CorridorPlanGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorPlanGroupFindNoOpRequest(String id, CPGObjectDataList noOpIn) {
    super(id, "CorridorPlanGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CPGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorPlanGroup", noOpIn);
      }
      addInput("CorridorPlanGroup", mapList);
    }
  }
/**
 *
 * Retrieves the CPGObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CPGObjectDataList getOutput() {
    return CPGObjectHelper.fromMapList(outputMap, "CorridorPlanGroupList");
  }
}
