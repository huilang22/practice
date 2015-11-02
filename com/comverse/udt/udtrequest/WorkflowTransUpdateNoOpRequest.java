/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransUpdateNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowTransUpdateNoOpRequest Udt Request/Response
 *
 */
public class WorkflowTransUpdateNoOpRequest extends WorkflowTransSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowTransUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowTransUpdateNoOpRequest(String id, WorkflowTransObjectData noOpIn) {
    super(id, "WorkflowTransUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(noOpIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }
/**
 *
 * Retrieves the WorkflowTransObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowTransObjectData getOutput() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
}
