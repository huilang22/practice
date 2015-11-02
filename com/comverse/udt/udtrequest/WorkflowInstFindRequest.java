/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstFindRequest.java
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
 * Class used to create a WorkflowInstFindRequest Udt Request
 *
 */

public class WorkflowInstFindRequest extends WorkflowInstRequest {
/**
 *
 * Constructor to create a  WorkflowInstFindRequest
 * @param id Unique request name
 * @param WorkflowInstFindIn WorkflowInstObjectFilter for WorkflowInstFindRequest
 *
 */
@JsonCreator
  public WorkflowInstFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowInst")WorkflowInstObjectFilter WorkflowInstFindIn) {
    super(id, "WorkflowInstFind");
    if (WorkflowInstFindIn != null) {
      Integer index =  WorkflowInstFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(WorkflowInstFindIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }

/**
 *
 * Retrieves the WorkflowInstObjectDataList that results from the WorkflowInstFindRequest call
 * @return WorkflowInstObjectDataList resulting from udt call
 *
 */

  public WorkflowInstObjectDataList getOutput() {
    return WorkflowInstObjectHelper.fromMapList(outputMap, "WorkflowInstList");
  }
}
