/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageUpdateRequest.java
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
 * Class used to create a RateCorridorUsageUpdateRequest Udt Request
 *
 */

public class RateCorridorUsageUpdateRequest extends RateCorridorUsageSubRequestParent {
/**
 *
 * Constructor to create a  RateCorridorUsageUpdateRequest
 * @param id Unique request name
 * @param RUUpdateIn RCUsageObjectData for RateCorridorUsageUpdateRequest
 *
 */
@JsonCreator
  public RateCorridorUsageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsage")RCUsageObjectData RUUpdateIn) {
    super(id, "RateCorridorUsageUpdate");
    if (RUUpdateIn != null) {
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(RUUpdateIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }

/**
 *
 * Retrieves the RCUsageObjectData that results from the RateCorridorUsageUpdateRequest call
 * @return RCUsageObjectData resulting from udt call
 *
 */

  public RCUsageObjectData getOutput() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
}
