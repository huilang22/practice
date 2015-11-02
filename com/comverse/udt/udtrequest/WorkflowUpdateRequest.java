/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowUpdateRequest.java
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
 * Class used to create a WorkflowUpdateRequest Udt Request
 *
 */

public class WorkflowUpdateRequest extends WorkflowSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowUpdateRequest
 * @param id Unique request name
 * @param WorkflowUpdateIn WorkflowObjectData for WorkflowUpdateRequest
 *
 */
@JsonCreator
  public WorkflowUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Workflow")WorkflowObjectData WorkflowUpdateIn) {
    super(id, "WorkflowUpdate");
    if (WorkflowUpdateIn != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(WorkflowUpdateIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }

/**
 *
 * Retrieves the WorkflowObjectData that results from the WorkflowUpdateRequest call
 * @return WorkflowObjectData resulting from udt call
 *
 */

  public WorkflowObjectData getOutput() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
}
