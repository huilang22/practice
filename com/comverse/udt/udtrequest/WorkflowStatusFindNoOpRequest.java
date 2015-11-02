/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowStatusFindNoOpRequest Udt Request/Response
 *
 */
public class WorkflowStatusFindNoOpRequest extends WorkflowStatusRequest {
/**
 *
 * Constructor to create a   WorkflowStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowStatusFindNoOpRequest(String id, WorkflowStatusObjectDataList noOpIn) {
    super(id, "WorkflowStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = WorkflowStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("WorkflowStatus", noOpIn);
      }
      addInput("WorkflowStatus", mapList);
    }
  }
/**
 *
 * Retrieves the WorkflowStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowStatusObjectDataList getOutput() {
    return WorkflowStatusObjectHelper.fromMapList(outputMap, "WorkflowStatusList");
  }
}
