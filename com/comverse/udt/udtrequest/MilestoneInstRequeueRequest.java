/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstRequeueRequest.java
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
 * Class used to create a MilestoneInstRequeueRequest Udt Request
 *
 */

public class MilestoneInstRequeueRequest extends MilestoneInstSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstRequeueRequest
 * @param id Unique request name
 * @param MilestoneInstRequeueIn MilestoneInstObjectData for MilestoneInstRequeueRequest
 *
 */
@JsonCreator
  public MilestoneInstRequeueRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInst")MilestoneInstObjectData MilestoneInstRequeueIn) {
    super(id, "MilestoneInstRequeue");
    if (MilestoneInstRequeueIn != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstRequeueIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstObjectData that results from the MilestoneInstRequeueRequest call
 * @return MilestoneInstObjectData resulting from udt call
 *
 */

  public MilestoneInstObjectData getOutput() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
}
