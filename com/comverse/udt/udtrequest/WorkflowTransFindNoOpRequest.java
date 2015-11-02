/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransFindNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowTransFindNoOpRequest Udt Request/Response
 *
 */
public class WorkflowTransFindNoOpRequest extends WorkflowTransRequest {
/**
 *
 * Constructor to create a   WorkflowTransFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowTransFindNoOpRequest(String id, WorkflowTransObjectDataList noOpIn) {
    super(id, "WorkflowTransFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = WorkflowTransObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("WorkflowTrans", noOpIn);
      }
      addInput("WorkflowTrans", mapList);
    }
  }
/**
 *
 * Retrieves the WorkflowTransObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowTransObjectDataList getOutput() {
    return WorkflowTransObjectHelper.fromMapList(outputMap, "WorkflowTransList");
  }
}
