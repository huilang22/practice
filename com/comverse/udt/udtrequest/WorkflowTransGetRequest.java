/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransGetRequest.java
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
 * Class used to create a WorkflowTransGetRequest Udt Request
 *
 */

public class WorkflowTransGetRequest extends WorkflowTransSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowTransGetRequest
 * @param id Unique request name
 * @param WorkflowTransGetIn WorkflowTransObjectKeyData for WorkflowTransGetRequest
 *
 */
@JsonCreator
  public WorkflowTransGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowTrans")WorkflowTransObjectKeyData WorkflowTransGetIn) {
    super(id, "WorkflowTransGet");
    if (WorkflowTransGetIn != null) {
      addInput("WorkflowTrans", WorkflowTransObjectKeyHelper.toMap(WorkflowTransGetIn, new HashMap(), "WorkflowTransObjectKeyData").get("WorkflowTransObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the WorkflowTransObjectData that results from the WorkflowTransGetRequest call
 * @return WorkflowTransObjectData resulting from udt call
 *
 */

  public WorkflowTransObjectData getOutput() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
}
