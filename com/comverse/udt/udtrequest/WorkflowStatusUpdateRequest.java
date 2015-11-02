/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusUpdateRequest.java
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
 * Class used to create a WorkflowStatusUpdateRequest Udt Request
 *
 */

public class WorkflowStatusUpdateRequest extends WorkflowStatusSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowStatusUpdateRequest
 * @param id Unique request name
 * @param WorkflowStatusUpdateIn WorkflowStatusObjectData for WorkflowStatusUpdateRequest
 *
 */
@JsonCreator
  public WorkflowStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowStatus")WorkflowStatusObjectData WorkflowStatusUpdateIn) {
    super(id, "WorkflowStatusUpdate");
    if (WorkflowStatusUpdateIn != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(WorkflowStatusUpdateIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }

/**
 *
 * Retrieves the WorkflowStatusObjectData that results from the WorkflowStatusUpdateRequest call
 * @return WorkflowStatusObjectData resulting from udt call
 *
 */

  public WorkflowStatusObjectData getOutput() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
}
