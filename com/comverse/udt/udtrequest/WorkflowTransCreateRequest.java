/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransCreateRequest.java
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
 * Class used to create a WorkflowTransCreateRequest Udt Request
 *
 */

public class WorkflowTransCreateRequest extends WorkflowTransSubRequestParent {
/**
 *
 * Constructor to create a  WorkflowTransCreateRequest
 * @param id Unique request name
 * @param WorkflowTransCreateIn WorkflowTransObjectData for WorkflowTransCreateRequest
 *
 */
@JsonCreator
  public WorkflowTransCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("WorkflowTrans")WorkflowTransObjectData WorkflowTransCreateIn) {
    super(id, "WorkflowTransCreate");
    if (WorkflowTransCreateIn != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(WorkflowTransCreateIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }

/**
 *
 * Retrieves the WorkflowTransObjectData that results from the WorkflowTransCreateRequest call
 * @return WorkflowTransObjectData resulting from udt call
 *
 */

  public WorkflowTransObjectData getOutput() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
}
