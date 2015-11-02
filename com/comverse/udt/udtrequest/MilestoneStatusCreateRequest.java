/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusCreateRequest.java
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
 * Class used to create a MilestoneStatusCreateRequest Udt Request
 *
 */

public class MilestoneStatusCreateRequest extends MilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneStatusCreateRequest
 * @param id Unique request name
 * @param MilestoneStatusCreateIn MilestoneStatusObjectData for MilestoneStatusCreateRequest
 *
 */
@JsonCreator
  public MilestoneStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneStatus")MilestoneStatusObjectData MilestoneStatusCreateIn) {
    super(id, "MilestoneStatusCreate");
    if (MilestoneStatusCreateIn != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(MilestoneStatusCreateIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }

/**
 *
 * Retrieves the MilestoneStatusObjectData that results from the MilestoneStatusCreateRequest call
 * @return MilestoneStatusObjectData resulting from udt call
 *
 */

  public MilestoneStatusObjectData getOutput() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
}
