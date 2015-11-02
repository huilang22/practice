/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusCreateNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowStatusCreateNoOpRequest Udt Request/Response
 *
 */
public class WorkflowStatusCreateNoOpRequest extends WorkflowStatusSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowStatusCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowStatusCreateNoOpRequest(String id, WorkflowStatusObjectData noOpIn) {
    super(id, "WorkflowStatusCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(noOpIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }
/**
 *
 * Retrieves the WorkflowStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowStatusObjectData getOutput() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
}
