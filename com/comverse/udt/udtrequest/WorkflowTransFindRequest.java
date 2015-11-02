/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransFindRequest.java
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
 * Class used to create a WorkflowTransFindRequest Udt Request
 *
 */

public class WorkflowTransFindRequest extends WorkflowTransRequest {
/**
 *
 * Constructor to create a  WorkflowTransFindRequest
 * @param id Unique request name
 * @param WorkflowTransFindIn WorkflowTransObjectFilter for WorkflowTransFindRequest
 *
 */
@JsonCreator
  public WorkflowTransFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowTrans")WorkflowTransObjectFilter WorkflowTransFindIn) {
    super(id, "WorkflowTransFind");
    if (WorkflowTransFindIn != null) {
      Integer index =  WorkflowTransFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(WorkflowTransFindIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }

/**
 *
 * Retrieves the WorkflowTransObjectDataList that results from the WorkflowTransFindRequest call
 * @return WorkflowTransObjectDataList resulting from udt call
 *
 */

  public WorkflowTransObjectDataList getOutput() {
    return WorkflowTransObjectHelper.fromMapList(outputMap, "WorkflowTransList");
  }
}
