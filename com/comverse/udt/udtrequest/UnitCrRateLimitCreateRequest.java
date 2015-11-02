/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitCreateRequest.java
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
 * Class used to create a UnitCrRateLimitCreateRequest Udt Request
 *
 */

public class UnitCrRateLimitCreateRequest extends UnitCrRateLimitSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitCreateRequest
 * @param id Unique request name
 * @param UnitCrRateLimitCreateIn UnitCrRateLimitsObjectData for UnitCrRateLimitCreateRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimit")UnitCrRateLimitsObjectData UnitCrRateLimitCreateIn) {
    super(id, "UnitCrRateLimitCreate");
    if (UnitCrRateLimitCreateIn != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(UnitCrRateLimitCreateIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitsObjectData that results from the UnitCrRateLimitCreateRequest call
 * @return UnitCrRateLimitsObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitsObjectData getOutput() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
}
