/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageCreateRequest.java
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
 * Class used to create a RatePeriodUsageCreateRequest Udt Request
 *
 */

public class RatePeriodUsageCreateRequest extends RatePeriodUsageSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodUsageCreateRequest
 * @param id Unique request name
 * @param RatePeriodUsageCreateIn RatePeriodUsagesObjectData for RatePeriodUsageCreateRequest
 *
 */
@JsonCreator
  public RatePeriodUsageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriodUsage")RatePeriodUsagesObjectData RatePeriodUsageCreateIn) {
    super(id, "RatePeriodUsageCreate");
    if (RatePeriodUsageCreateIn != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(RatePeriodUsageCreateIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }

/**
 *
 * Retrieves the RatePeriodUsagesObjectData that results from the RatePeriodUsageCreateRequest call
 * @return RatePeriodUsagesObjectData resulting from udt call
 *
 */

  public RatePeriodUsagesObjectData getOutput() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
}
