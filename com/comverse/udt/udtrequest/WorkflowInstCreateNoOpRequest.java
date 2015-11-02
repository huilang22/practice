/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstCreateNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowInstCreateNoOpRequest Udt Request/Response
 *
 */
public class WorkflowInstCreateNoOpRequest extends WorkflowInstSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowInstCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowInstCreateNoOpRequest(String id, WorkflowInstObjectData noOpIn) {
    super(id, "WorkflowInstCreateNoOpRequest");
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
