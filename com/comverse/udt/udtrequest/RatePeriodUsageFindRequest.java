/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageFindRequest.java
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
 * Class used to create a RatePeriodUsageFindRequest Udt Request
 *
 */

public class RatePeriodUsageFindRequest extends RatePeriodUsageRequest {
/**
 *
 * Constructor to create a  RatePeriodUsageFindRequest
 * @param id Unique request name
 * @param RatePeriodUsagesFindIn RatePeriodUsagesObjectFilter for RatePeriodUsageFindRequest
 *
 */
@JsonCreator
  public RatePeriodUsageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriodUsage")RatePeriodUsagesObjectFilter RatePeriodUsagesFindIn) {
    super(id, "RatePeriodUsageFind");
    if (RatePeriodUsagesFindIn != null) {
      Integer index =  RatePeriodUsagesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(RatePeriodUsagesFindIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }

/**
 *
 * Retrieves the RatePeriodUsagesObjectDataList that results from the RatePeriodUsageFindRequest call
 * @return RatePeriodUsagesObjectDataList resulting from udt call
 *
 */

  public RatePeriodUsagesObjectDataList getOutput() {
    return RatePeriodUsagesObjectHelper.fromMapList(outputMap, "RatePeriodUsageList");
  }
}
