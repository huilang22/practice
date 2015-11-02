/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusUpdateRequest.java
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
 * Class used to create a MilestoneStatusUpdateRequest Udt Request
 *
 */

public class MilestoneStatusUpdateRequest extends MilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneStatusUpdateRequest
 * @param id Unique request name
 * @param MilestoneStatusUpdateIn MilestoneStatusObjectData for MilestoneStatusUpdateRequest
 *
 */
@JsonCreator
  public MilestoneStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneStatus")MilestoneStatusObjectData MilestoneStatusUpdateIn) {
    super(id, "MilestoneStatusUpdate");
    if (MilestoneStatusUpdateIn != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(MilestoneStatusUpdateIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }

/**
 *
 * Retrieves the MilestoneStatusObjectData that results from the MilestoneStatusUpdateRequest call
 * @return MilestoneStatusObjectData resulting from udt call
 *
 */

  public MilestoneStatusObjectData getOutput() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
}
