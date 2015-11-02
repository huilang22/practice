/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandCreateRequest.java
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
 * Class used to create a RateUsageBandCreateRequest Udt Request
 *
 */

public class RateUsageBandCreateRequest extends RateUsageBandSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageBandCreateRequest
 * @param id Unique request name
 * @param RUCrIn RateUsageBandObjectData for RateUsageBandCreateRequest
 *
 */
@JsonCreator
  public RateUsageBandCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageBand")RateUsageBandObjectData RUCrIn) {
    super(id, "RateUsageBandCreate");
    if (RUCrIn != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(RUCrIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }

/**
 *
 * Retrieves the RateUsageBandObjectData that results from the RateUsageBandCreateRequest call
 * @return RateUsageBandObjectData resulting from udt call
 *
 */

  public RateUsageBandObjectData getOutput() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
}
