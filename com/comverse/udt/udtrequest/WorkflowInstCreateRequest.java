/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstCreateRequest.java
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
 * Class used to create a WorkflowInstCreateRequest Udt Request
 *
 */

public class WorkflowInstCreateRequest extends WorkflowInstSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowInstCreateRequest
 * @param id Unique request name
 * @param wfiCrIn WorkflowInstObjectData for WorkflowInstCreateRequest
 *
 */
@JsonCreator
  public WorkflowInstCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowInst")WorkflowInstObjectData wfiCrIn) {
    super(id, "WorkflowInstCreate");
    if (wfiCrIn != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(wfiCrIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }

/**
 *
 * Retrieves the WorkflowInstObjectData that results from the WorkflowInstCreateRequest call
 * @return WorkflowInstObjectData resulting from udt call
 *
 */

  public WorkflowInstObjectData getOutput() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
}
