/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransGetNoOpRequest.java
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
 * NoOp class used to simulate a WorkflowTransGetNoOpRequest Udt Request/Response
 *
 */
public class WorkflowTransGetNoOpRequest extends WorkflowTransSubRequestParent {
/**
 *
 * Constructor to create a   WorkflowTransGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WorkflowTransGetNoOpRequest(String id, WorkflowTransObjectData noOpIn) {
    super(id, "WorkflowTransGetNoOpRequest");
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
