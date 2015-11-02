/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusFindRequest.java
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
 * Class used to create a WorkflowStatusFindRequest Udt Request
 *
 */

public class WorkflowStatusFindRequest extends WorkflowStatusRequest {
/**
 *
 * Constructor to create a  WorkflowStatusFindRequest
 * @param id Unique request name
 * @param WorkflowStatusFindIn WorkflowStatusObjectFilter for WorkflowStatusFindRequest
 *
 */
@JsonCreator
  public WorkflowStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowStatus")WorkflowStatusObjectFilter WorkflowStatusFindIn) {
    super(id, "WorkflowStatusFind");
    if (WorkflowStatusFindIn != null) {
      Integer index =  WorkflowStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(WorkflowStatusFindIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }

/**
 *
 * Retrieves the WorkflowStatusObjectDataList that results from the WorkflowStatusFindRequest call
 * @return WorkflowStatusObjectDataList resulting from udt call
 *
 */

  public WorkflowStatusObjectDataList getOutput() {
    return WorkflowStatusObjectHelper.fromMapList(outputMap, "WorkflowStatusList");
  }
}
