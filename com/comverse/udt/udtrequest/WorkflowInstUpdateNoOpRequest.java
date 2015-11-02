/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstUpdateNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowInstUpdateNoOpRequest Udt Request/Response
 *
 */
public class WorkflowInstUpdateNoOpRequest extends WorkflowInstSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowInstUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowInstUpdateNoOpRequest(String id, WorkflowInstObjectData noOpIn) {
    super(id, "WorkflowInstUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(noOpIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }
/**
 *
 * Retrieves the WorkflowInstObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowInstObjectData getOutput() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
}
