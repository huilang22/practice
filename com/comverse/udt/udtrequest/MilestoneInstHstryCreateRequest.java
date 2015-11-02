/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryCreateRequest.java
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
 * Class used to create a MilestoneInstHstryCreateRequest Udt Request
 *
 */

public class MilestoneInstHstryCreateRequest extends MilestoneInstHstrySubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstHstryCreateRequest
 * @param id Unique request name
 * @param msihCrIn MilestoneInstHstryObjectData for MilestoneInstHstryCreateRequest
 *
 */
@JsonCreator
  public MilestoneInstHstryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInstHstry")MilestoneInstHstryObjectData msihCrIn) {
    super(id, "MilestoneInstHstryCreate");
    if (msihCrIn != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(msihCrIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstHstryObjectData that results from the MilestoneInstHstryCreateRequest call
 * @return MilestoneInstHstryObjectData resulting from udt call
 *
 */

  public MilestoneInstHstryObjectData getOutput() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
}
