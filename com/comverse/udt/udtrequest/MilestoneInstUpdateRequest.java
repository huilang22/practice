/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstUpdateRequest.java
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
 * Class used to create a MilestoneInstUpdateRequest Udt Request
 *
 */

public class MilestoneInstUpdateRequest extends MilestoneInstSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstUpdateRequest
 * @param id Unique request name
 * @param MilestoneInstUpdateIn MilestoneInstObjectData for MilestoneInstUpdateRequest
 *
 */
@JsonCreator
  public MilestoneInstUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInst")MilestoneInstObjectData MilestoneInstUpdateIn) {
    super(id, "MilestoneInstUpdate");
    if (MilestoneInstUpdateIn != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstUpdateIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstObjectData that results from the MilestoneInstUpdateRequest call
 * @return MilestoneInstObjectData resulting from udt call
 *
 */

  public MilestoneInstObjectData getOutput() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
}
