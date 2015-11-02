/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitGetRequest.java
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
 * Class used to create a UnitCrRateLimitGetRequest Udt Request
 *
 */

public class UnitCrRateLimitGetRequest extends UnitCrRateLimitSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitGetRequest
 * @param id Unique request name
 * @param UnitCrRateLimitsGetIn UnitCrRateLimitsObjectKeyData for UnitCrRateLimitGetRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimit")UnitCrRateLimitsObjectKeyData UnitCrRateLimitsGetIn) {
    super(id, "UnitCrRateLimitGet");
    if (UnitCrRateLimitsGetIn != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectKeyHelper.toMap(UnitCrRateLimitsGetIn, new HashMap(), "UnitCrRateLimitsObjectKeyData").get("UnitCrRateLimitsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitsObjectData that results from the UnitCrRateLimitGetRequest call
 * @return UnitCrRateLimitsObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitsObjectData getOutput() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
}
