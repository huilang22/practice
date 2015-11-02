/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstFindNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowInstFindNoOpRequest Udt Request/Response
 *
 */
public class WorkflowInstFindNoOpRequest extends WorkflowInstRequest {
/**
 *
 * Constructor to create a   WorkflowInstFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowInstFindNoOpRequest(String id, WorkflowInstObjectDataList noOpIn) {
    super(id, "WorkflowInstFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = WorkflowInstObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("WorkflowInst", noOpIn);
      }
      addInput("WorkflowInst", mapList);
    }
  }
/**
 *
 * Retrieves the WorkflowInstObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowInstObjectDataList getOutput() {
    return WorkflowInstObjectHelper.fromMapList(outputMap, "WorkflowInstList");
  }
}
