/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalUpdateRequest.java
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
 * Class used to create a RateUsageImpliedDecimalUpdateRequest Udt Request
 *
 */

public class RateUsageImpliedDecimalUpdateRequest extends RateUsageImpliedDecimalSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalUpdateRequest
 * @param id Unique request name
 * @param RUIDUpdateIn RateUsageImpliedDecimalObjectData for RateUsageImpliedDecimalUpdateRequest
 *
 */
@JsonCreator
  public RateUsageImpliedDecimalUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageImpliedDecimal")RateUsageImpliedDecimalObjectData RUIDUpdateIn) {
    super(id, "RateUsageImpliedDecimalUpdate");
    if (RUIDUpdateIn != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(RUIDUpdateIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }

/**
 *
 * Retrieves the RateUsageImpliedDecimalObjectData that results from the RateUsageImpliedDecimalUpdateRequest call
 * @return RateUsageImpliedDecimalObjectData resulting from udt call
 *
 */

  public RateUsageImpliedDecimalObjectData getOutput() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
}
