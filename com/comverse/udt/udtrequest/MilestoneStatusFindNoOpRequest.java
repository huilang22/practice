/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneStatusFindNoOpRequest Udt Request/Response
 *
 */
public class MilestoneStatusFindNoOpRequest extends MilestoneStatusRequest {
/**
 *
 * Constructor to create a   MilestoneStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneStatusFindNoOpRequest(String id, MilestoneStatusObjectDataList noOpIn) {
    super(id, "MilestoneStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MilestoneStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MilestoneStatus", noOpIn);
      }
      addInput("MilestoneStatus", mapList);
    }
  }
/**
 *
 * Retrieves the MilestoneStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneStatusObjectDataList getOutput() {
    return MilestoneStatusObjectHelper.fromMapList(outputMap, "MilestoneStatusList");
  }
}
