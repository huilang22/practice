/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryUpdateRequest.java
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
 * Class used to create a MilestoneInstHstryUpdateRequest Udt Request
 *
 */

public class MilestoneInstHstryUpdateRequest extends MilestoneInstHstrySubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstHstryUpdateRequest
 * @param id Unique request name
 * @param MilestoneInstHstryUpdateIn MilestoneInstHstryObjectData for MilestoneInstHstryUpdateRequest
 *
 */
@JsonCreator
  public MilestoneInstHstryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInstHstry")MilestoneInstHstryObjectData MilestoneInstHstryUpdateIn) {
    super(id, "MilestoneInstHstryUpdate");
    if (MilestoneInstHstryUpdateIn != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(MilestoneInstHstryUpdateIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstHstryObjectData that results from the MilestoneInstHstryUpdateRequest call
 * @return MilestoneInstHstryObjectData resulting from udt call
 *
 */

  public MilestoneInstHstryObjectData getOutput() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
}
