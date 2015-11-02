/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitDeleteRequest.java
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
 * Class used to create a UnitCrRateLimitDeleteRequest Udt Request
 *
 */

public class UnitCrRateLimitDeleteRequest extends UnitCrRateLimitSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitDeleteRequest
 * @param id Unique request name
 * @param UnitCrRateLimitsDeleteIn UnitCrRateLimitsObjectKeyData for UnitCrRateLimitDeleteRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimit")UnitCrRateLimitsObjectKeyData UnitCrRateLimitsDeleteIn) {
    super(id, "UnitCrRateLimitDelete");
    if (UnitCrRateLimitsDeleteIn != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectKeyHelper.toMap(UnitCrRateLimitsDeleteIn, new HashMap(), "UnitCrRateLimitsObjectKeyData").get("UnitCrRateLimitsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitsObjectData that results from the UnitCrRateLimitDeleteRequest call
 * @return UnitCrRateLimitsObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitsObjectData getOutput() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
}
