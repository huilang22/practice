/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstModifyRequest.java
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
 * Class used to create a MilestoneInstModifyRequest Udt Request
 *
 */

public class MilestoneInstModifyRequest extends MilestoneInstSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstModifyRequest
 * @param id Unique request name
 * @param MilestoneInstModifyIn MilestoneInstObjectData for MilestoneInstModifyRequest
 *
 */
@JsonCreator
  public MilestoneInstModifyRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInst")MilestoneInstObjectData MilestoneInstModifyIn) {
    super(id, "MilestoneInstModify");
    if (MilestoneInstModifyIn != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstModifyIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstObjectData that results from the MilestoneInstModifyRequest call
 * @return MilestoneInstObjectData resulting from udt call
 *
 */

  public MilestoneInstObjectData getOutput() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
}
