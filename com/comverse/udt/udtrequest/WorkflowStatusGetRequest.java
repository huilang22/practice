/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusGetRequest.java
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
 * Class used to create a WorkflowStatusGetRequest Udt Request
 *
 */

public class WorkflowStatusGetRequest extends WorkflowStatusSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowStatusGetRequest
 * @param id Unique request name
 * @param WorkflowStatusGetIn WorkflowStatusObjectKeyData for WorkflowStatusGetRequest
 *
 */
@JsonCreator
  public WorkflowStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowStatus")WorkflowStatusObjectKeyData WorkflowStatusGetIn) {
    super(id, "WorkflowStatusGet");
    if (WorkflowStatusGetIn != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectKeyHelper.toMap(WorkflowStatusGetIn, new HashMap(), "WorkflowStatusObjectKeyData").get("WorkflowStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the WorkflowStatusObjectData that results from the WorkflowStatusGetRequest call
 * @return WorkflowStatusObjectData resulting from udt call
 *
 */

  public WorkflowStatusObjectData getOutput() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
}
