/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a ValidMilestoneStatusFindNoOpRequest Udt Request/Response
 *
 */
public class ValidMilestoneStatusFindNoOpRequest extends ValidMilestoneStatusRequest {
/**
 *
 * Constructor to create a   ValidMilestoneStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ValidMilestoneStatusFindNoOpRequest(String id, ValidMilestoneStatusObjectDataList noOpIn) {
    super(id, "ValidMilestoneStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ValidMilestoneStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ValidMilestoneStatus", noOpIn);
      }
      addInput("ValidMilestoneStatus", mapList);
    }
  }
/**
 *
 * Retrieves the ValidMilestoneStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ValidMilestoneStatusObjectDataList getOutput() {
    return ValidMilestoneStatusObjectHelper.fromMapList(outputMap, "ValidMilestoneStatusList");
  }
}
