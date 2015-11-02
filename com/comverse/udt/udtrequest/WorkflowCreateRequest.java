/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowCreateRequest.java
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
 * Class used to create a WorkflowCreateRequest Udt Request
 *
 */

public class WorkflowCreateRequest extends WorkflowSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowCreateRequest
 * @param id Unique request name
 * @param WorkflowCreateIn WorkflowObjectData for WorkflowCreateRequest
 *
 */
@JsonCreator
  public WorkflowCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Workflow")WorkflowObjectData WorkflowCreateIn) {
    super(id, "WorkflowCreate");
    if (WorkflowCreateIn != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(WorkflowCreateIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }

/**
 *
 * Retrieves the WorkflowObjectData that results from the WorkflowCreateRequest call
 * @return WorkflowObjectData resulting from udt call
 *
 */

  public WorkflowObjectData getOutput() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
}
