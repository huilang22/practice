/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a WorkflowTransUpdateRequest Udt Request
 *
 */

public class WorkflowTransUpdateRequest extends WorkflowTransSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowTransUpdateRequest
 * @param id Unique request name
 * @param WorkflowTransUpdateIn WorkflowTransObjectData for WorkflowTransUpdateRequest
 *
 */
@JsonCreator
  public WorkflowTransUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowTrans")WorkflowTransObjectData WorkflowTransUpdateIn) {
    super(id, "WorkflowTransUpdate");
    if (WorkflowTransUpdateIn != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(WorkflowTransUpdateIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }

/**
 *
 * Retrieves the WorkflowTransObjectData that results from the WorkflowTransUpdateRequest call
 * @return WorkflowTransObjectData resulting from udt call
 *
 */

  public WorkflowTransObjectData getOutput() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
}
