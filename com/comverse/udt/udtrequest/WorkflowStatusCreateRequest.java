/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusCreateRequest.java
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
 * Class used to create a WorkflowStatusCreateRequest Udt Request
 *
 */

public class WorkflowStatusCreateRequest extends WorkflowStatusSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowStatusCreateRequest
 * @param id Unique request name
 * @param WorkflowStatusCreateIn WorkflowStatusObjectData for WorkflowStatusCreateRequest
 *
 */
@JsonCreator
  public WorkflowStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowStatus")WorkflowStatusObjectData WorkflowStatusCreateIn) {
    super(id, "WorkflowStatusCreate");
    if (WorkflowStatusCreateIn != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(WorkflowStatusCreateIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }

/**
 *
 * Retrieves the WorkflowStatusObjectData that results from the WorkflowStatusCreateRequest call
 * @return WorkflowStatusObjectData resulting from udt call
 *
 */

  public WorkflowStatusObjectData getOutput() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
}
