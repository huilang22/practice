/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalDeleteRequest.java
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
 * Class used to create a RateUsageImpliedDecimalDeleteRequest Udt Request
 *
 */

public class RateUsageImpliedDecimalDeleteRequest extends RateUsageImpliedDecimalRequest {
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalDeleteRequest
 * @param id Unique request name
 * @param RUIDDeleteIn RateUsageImpliedDecimalObjectKeyData for RateUsageImpliedDecimalDeleteRequest
 *
 */
@JsonCreator
  public RateUsageImpliedDecimalDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageImpliedDecimal")RateUsageImpliedDecimalObjectKeyData RUIDDeleteIn) {
    super(id, "RateUsageImpliedDecimalDelete");
    if (RUIDDeleteIn != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectKeyHelper.toMap(RUIDDeleteIn, new HashMap(), "RateUsageImpliedDecimalObjectKeyData").get("RateUsageImpliedDecimalObjectKeyData"));
    }
  }

}
