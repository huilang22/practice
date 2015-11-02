/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageUpdateRequest.java
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
 * Class used to create a RatePeriodUsageUpdateRequest Udt Request
 *
 */

public class RatePeriodUsageUpdateRequest extends RatePeriodUsageSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodUsageUpdateRequest
 * @param id Unique request name
 * @param RatePeriodUsageUpdateIn RatePeriodUsagesObjectData for RatePeriodUsageUpdateRequest
 *
 */
@JsonCreator
  public RatePeriodUsageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriodUsage")RatePeriodUsagesObjectData RatePeriodUsageUpdateIn) {
    super(id, "RatePeriodUsageUpdate");
    if (RatePeriodUsageUpdateIn != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(RatePeriodUsageUpdateIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }

/**
 *
 * Retrieves the RatePeriodUsagesObjectData that results from the RatePeriodUsageUpdateRequest call
 * @return RatePeriodUsagesObjectData resulting from udt call
 *
 */

  public RatePeriodUsagesObjectData getOutput() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
}
