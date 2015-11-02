/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalCreateRequest.java
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
 * Class used to create a RateUsageImpliedDecimalCreateRequest Udt Request
 *
 */

public class RateUsageImpliedDecimalCreateRequest extends RateUsageImpliedDecimalSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalCreateRequest
 * @param id Unique request name
 * @param RUIDCrIn RateUsageImpliedDecimalObjectData for RateUsageImpliedDecimalCreateRequest
 *
 */
@JsonCreator
  public RateUsageImpliedDecimalCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageImpliedDecimal")RateUsageImpliedDecimalObjectData RUIDCrIn) {
    super(id, "RateUsageImpliedDecimalCreate");
    if (RUIDCrIn != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(RUIDCrIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }

/**
 *
 * Retrieves the RateUsageImpliedDecimalObjectData that results from the RateUsageImpliedDecimalCreateRequest call
 * @return RateUsageImpliedDecimalObjectData resulting from udt call
 *
 */

  public RateUsageImpliedDecimalObjectData getOutput() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
}
