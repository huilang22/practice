/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowGetNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowGetNoOpRequest Udt Request/Response
 *
 */
public class WorkflowGetNoOpRequest extends WorkflowSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowGetNoOpRequest(String id, WorkflowObjectData noOpIn) {
    super(id, "WorkflowGetNoOpRequest");
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
