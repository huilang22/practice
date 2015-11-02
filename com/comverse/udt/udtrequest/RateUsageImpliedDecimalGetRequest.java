/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalGetRequest.java
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
 * Class used to create a RateUsageImpliedDecimalGetRequest Udt Request
 *
 */

public class RateUsageImpliedDecimalGetRequest extends RateUsageImpliedDecimalSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalGetRequest
 * @param id Unique request name
 * @param RUIDGetIn RateUsageImpliedDecimalObjectKeyData for RateUsageImpliedDecimalGetRequest
 *
 */
@JsonCreator
  public RateUsageImpliedDecimalGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageImpliedDecimal")RateUsageImpliedDecimalObjectKeyData RUIDGetIn) {
    super(id, "RateUsageImpliedDecimalGet");
    if (RUIDGetIn != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectKeyHelper.toMap(RUIDGetIn, new HashMap(), "RateUsageImpliedDecimalObjectKeyData").get("RateUsageImpliedDecimalObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateUsageImpliedDecimalObjectData that results from the RateUsageImpliedDecimalGetRequest call
 * @return RateUsageImpliedDecimalObjectData resulting from udt call
 *
 */

  public RateUsageImpliedDecimalObjectData getOutput() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
}
