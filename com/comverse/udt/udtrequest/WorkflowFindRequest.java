/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowFindRequest.java
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
 * Class used to create a WorkflowFindRequest Udt Request
 *
 */

public class WorkflowFindRequest extends WorkflowRequest {
/**
 *
 * Constructor to create a  WorkflowFindRequest
 * @param id Unique request name
 * @param WorkflowFindIn WorkflowObjectFilter for WorkflowFindRequest
 *
 */
@JsonCreator
  public WorkflowFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Workflow")WorkflowObjectFilter WorkflowFindIn) {
    super(id, "WorkflowFind");
    if (WorkflowFindIn != null) {
      Integer index =  WorkflowFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Workflow", WorkflowObjectHelper.toMap(WorkflowFindIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }

/**
 *
 * Retrieves the WorkflowObjectDataList that results from the WorkflowFindRequest call
 * @return WorkflowObjectDataList resulting from udt call
 *
 */

  public WorkflowObjectDataList getOutput() {
    return WorkflowObjectHelper.fromMapList(outputMap, "WorkflowList");
  }
}
