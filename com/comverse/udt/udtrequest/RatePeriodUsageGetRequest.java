/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageGetRequest.java
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
 * Class used to create a RatePeriodUsageGetRequest Udt Request
 *
 */

public class RatePeriodUsageGetRequest extends RatePeriodUsageSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodUsageGetRequest
 * @param id Unique request name
 * @param RatePeriodUsagesGetIn RatePeriodUsagesObjectKeyData for RatePeriodUsageGetRequest
 *
 */
@JsonCreator
  public RatePeriodUsageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriodUsage")RatePeriodUsagesObjectKeyData RatePeriodUsagesGetIn) {
    super(id, "RatePeriodUsageGet");
    if (RatePeriodUsagesGetIn != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectKeyHelper.toMap(RatePeriodUsagesGetIn, new HashMap(), "RatePeriodUsagesObjectKeyData").get("RatePeriodUsagesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RatePeriodUsagesObjectData that results from the RatePeriodUsageGetRequest call
 * @return RatePeriodUsagesObjectData resulting from udt call
 *
 */

  public RatePeriodUsagesObjectData getOutput() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
}
