/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowUpdateNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowUpdateNoOpRequest Udt Request/Response
 *
 */
public class WorkflowUpdateNoOpRequest extends WorkflowSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowUpdateNoOpRequest(String id, WorkflowObjectData noOpIn) {
    super(id, "WorkflowUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(noOpIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }
/**
 *
 * Retrieves the WorkflowObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowObjectData getOutput() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
}
