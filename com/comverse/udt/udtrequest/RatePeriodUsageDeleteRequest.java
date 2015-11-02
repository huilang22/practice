/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageDeleteRequest.java
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
 * Class used to create a RatePeriodUsageDeleteRequest Udt Request
 *
 */

public class RatePeriodUsageDeleteRequest extends RatePeriodUsageSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodUsageDeleteRequest
 * @param id Unique request name
 * @param RatePeriodUsagesDeleteIn RatePeriodUsagesObjectKeyData for RatePeriodUsageDeleteRequest
 *
 */
@JsonCreator
  public RatePeriodUsageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriodUsage")RatePeriodUsagesObjectKeyData RatePeriodUsagesDeleteIn) {
    super(id, "RatePeriodUsageDelete");
    if (RatePeriodUsagesDeleteIn != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectKeyHelper.toMap(RatePeriodUsagesDeleteIn, new HashMap(), "RatePeriodUsagesObjectKeyData").get("RatePeriodUsagesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RatePeriodUsagesObjectData that results from the RatePeriodUsageDeleteRequest call
 * @return RatePeriodUsagesObjectData resulting from udt call
 *
 */

  public RatePeriodUsagesObjectData getOutput() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
}
