/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageCreateRequest.java
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
 * Class used to create a RateCorridorUsageCreateRequest Udt Request
 *
 */

public class RateCorridorUsageCreateRequest extends RateCorridorUsageSubRequestParent {
/**
 *
 * Constructor to create a  RateCorridorUsageCreateRequest
 * @param id Unique request name
 * @param RUCrIn RCUsageObjectData for RateCorridorUsageCreateRequest
 *
 */
@JsonCreator
  public RateCorridorUsageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsage")RCUsageObjectData RUCrIn) {
    super(id, "RateCorridorUsageCreate");
    if (RUCrIn != null) {
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(RUCrIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }

/**
 *
 * Retrieves the RCUsageObjectData that results from the RateCorridorUsageCreateRequest call
 * @return RCUsageObjectData resulting from udt call
 *
 */

  public RCUsageObjectData getOutput() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
}
