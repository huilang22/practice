/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneUpdateRequest.java
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
 * Class used to create a MilestoneUpdateRequest Udt Request
 *
 */

public class MilestoneUpdateRequest extends MilestoneSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneUpdateRequest
 * @param id Unique request name
 * @param MilestoneUpdateIn MilestoneObjectData for MilestoneUpdateRequest
 *
 */
@JsonCreator
  public MilestoneUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Milestone")MilestoneObjectData MilestoneUpdateIn) {
    super(id, "MilestoneUpdate");
    if (MilestoneUpdateIn != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(MilestoneUpdateIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }

/**
 *
 * Retrieves the MilestoneObjectData that results from the MilestoneUpdateRequest call
 * @return MilestoneObjectData resulting from udt call
 *
 */

  public MilestoneObjectData getOutput() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
}
