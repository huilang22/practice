/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstUpdateRequest.java
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
 * Class used to create a WorkflowInstUpdateRequest Udt Request
 *
 */

public class WorkflowInstUpdateRequest extends WorkflowInstSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowInstUpdateRequest
 * @param id Unique request name
 * @param WorkflowInstUpdateIn WorkflowInstObjectData for WorkflowInstUpdateRequest
 *
 */
@JsonCreator
  public WorkflowInstUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowInst")WorkflowInstObjectData WorkflowInstUpdateIn) {
    super(id, "WorkflowInstUpdate");
    if (WorkflowInstUpdateIn != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(WorkflowInstUpdateIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }

/**
 *
 * Retrieves the WorkflowInstObjectData that results from the WorkflowInstUpdateRequest call
 * @return WorkflowInstObjectData resulting from udt call
 *
 */

  public WorkflowInstObjectData getOutput() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
}
