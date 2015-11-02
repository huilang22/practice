/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowGetRequest.java
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
 * Class used to create a WorkflowGetRequest Udt Request
 *
 */

public class WorkflowGetRequest extends WorkflowSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowGetRequest
 * @param id Unique request name
 * @param WorkflowGetIn WorkflowObjectKeyData for WorkflowGetRequest
 *
 */
@JsonCreator
  public WorkflowGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Workflow")WorkflowObjectKeyData WorkflowGetIn) {
    super(id, "WorkflowGet");
    if (WorkflowGetIn != null) {
      addInput("Workflow", WorkflowObjectKeyHelper.toMap(WorkflowGetIn, new HashMap(), "WorkflowObjectKeyData").get("WorkflowObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the WorkflowObjectData that results from the WorkflowGetRequest call
 * @return WorkflowObjectData resulting from udt call
 *
 */

  public WorkflowObjectData getOutput() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
}
