/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitUpdateRequest.java
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
 * Class used to create a UnitCrRateLimitUpdateRequest Udt Request
 *
 */

public class UnitCrRateLimitUpdateRequest extends UnitCrRateLimitSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitUpdateRequest
 * @param id Unique request name
 * @param UnitCrRateLimitUpdateIn UnitCrRateLimitsObjectData for UnitCrRateLimitUpdateRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimit")UnitCrRateLimitsObjectData UnitCrRateLimitUpdateIn) {
    super(id, "UnitCrRateLimitUpdate");
    if (UnitCrRateLimitUpdateIn != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(UnitCrRateLimitUpdateIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitsObjectData that results from the UnitCrRateLimitUpdateRequest call
 * @return UnitCrRateLimitsObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitsObjectData getOutput() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
}
