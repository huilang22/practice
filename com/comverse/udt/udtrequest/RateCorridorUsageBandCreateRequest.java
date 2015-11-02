/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RateCorridorUsageBandCreateRequest Udt Request
 *
 */

public class RateCorridorUsageBandCreateRequest extends RateCorridorUsageBandSubRequestParent {
/**
 *
 * Constructor to create a  RateCorridorUsageBandCreateRequest
 * @param id Unique request name
 * @param RUBOCrIn RUBOverrideObjectData for RateCorridorUsageBandCreateRequest
 *
 */
@JsonCreator
  public RateCorridorUsageBandCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsageBand")RUBOverrideObjectData RUBOCrIn) {
    super(id, "RateCorridorUsageBandCreate");
    if (RUBOCrIn != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(RUBOCrIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }

/**
 *
 * Retrieves the RUBOverrideObjectData that results from the RateCorridorUsageBandCreateRequest call
 * @return RUBOverrideObjectData resulting from udt call
 *
 */

  public RUBOverrideObjectData getOutput() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
}
