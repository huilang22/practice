/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstCreateRequest.java
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
 * Class used to create a MilestoneInstCreateRequest Udt Request
 *
 */

public class MilestoneInstCreateRequest extends MilestoneInstSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstCreateRequest
 * @param id Unique request name
 * @param msiCrIn MilestoneInstObjectData for MilestoneInstCreateRequest
 *
 */
@JsonCreator
  public MilestoneInstCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInst")MilestoneInstObjectData msiCrIn) {
    super(id, "MilestoneInstCreate");
    if (msiCrIn != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(msiCrIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstObjectData that results from the MilestoneInstCreateRequest call
 * @return MilestoneInstObjectData resulting from udt call
 *
 */

  public MilestoneInstObjectData getOutput() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
}
