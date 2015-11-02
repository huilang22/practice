/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowCreateNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowCreateNoOpRequest Udt Request/Response
 *
 */
public class WorkflowCreateNoOpRequest extends WorkflowSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowCreateNoOpRequest(String id, WorkflowObjectData noOpIn) {
    super(id, "WorkflowCreateNoOpRequest");
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
