/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneCreateRequest.java
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
 * Class used to create a MilestoneCreateRequest Udt Request
 *
 */

public class MilestoneCreateRequest extends MilestoneSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneCreateRequest
 * @param id Unique request name
 * @param MilestoneCreateIn MilestoneObjectData for MilestoneCreateRequest
 *
 */
@JsonCreator
  public MilestoneCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Milestone")MilestoneObjectData MilestoneCreateIn) {
    super(id, "MilestoneCreate");
    if (MilestoneCreateIn != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(MilestoneCreateIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }

/**
 *
 * Retrieves the MilestoneObjectData that results from the MilestoneCreateRequest call
 * @return MilestoneObjectData resulting from udt call
 *
 */

  public MilestoneObjectData getOutput() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
}
