/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstGetRequest.java
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
 * Class used to create a WorkflowInstGetRequest Udt Request
 *
 */

public class WorkflowInstGetRequest extends WorkflowInstSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowInstGetRequest
 * @param id Unique request name
 * @param WorkflowInstGetIn WorkflowInstObjectKeyData for WorkflowInstGetRequest
 *
 */
@JsonCreator
  public WorkflowInstGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowInst")WorkflowInstObjectKeyData WorkflowInstGetIn) {
    super(id, "WorkflowInstGet");
    if (WorkflowInstGetIn != null) {
      addInput("WorkflowInst", WorkflowInstObjectKeyHelper.toMap(WorkflowInstGetIn, new HashMap(), "WorkflowInstObjectKeyData").get("WorkflowInstObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the WorkflowInstObjectData that results from the WorkflowInstGetRequest call
 * @return WorkflowInstObjectData resulting from udt call
 *
 */

  public WorkflowInstObjectData getOutput() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
}
