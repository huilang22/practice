/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowFindNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowFindNoOpRequest Udt Request/Response
 *
 */
public class WorkflowFindNoOpRequest extends WorkflowRequest {
/**
 *
 * Constructor to create a   WorkflowFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowFindNoOpRequest(String id, WorkflowObjectDataList noOpIn) {
    super(id, "WorkflowFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = WorkflowObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Workflow", noOpIn);
      }
      addInput("Workflow", mapList);
    }
  }
/**
 *
 * Retrieves the WorkflowObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowObjectDataList getOutput() {
    return WorkflowObjectHelper.fromMapList(outputMap, "WorkflowList");
  }
}
