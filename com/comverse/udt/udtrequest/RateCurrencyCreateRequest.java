/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyCreateRequest.java
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
 * Class used to create a RateCurrencyCreateRequest Udt Request
 *
 */

public class RateCurrencyCreateRequest extends RateCurrencySubRequestParent {
/**
 *
 * Constructor to create a  RateCurrencyCreateRequest
 * @param id Unique request name
 * @param RCCreateIn RCObjectData for RateCurrencyCreateRequest
 *
 */
@JsonCreator
  public RateCurrencyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCurrency")RCObjectData RCCreateIn) {
    super(id, "RateCurrencyCreate");
    if (RCCreateIn != null) {
      addInput("RateCurrency", RCObjectHelper.toMap(RCCreateIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }

/**
 *
 * Retrieves the RCObjectData that results from the RateCurrencyCreateRequest call
 * @return RCObjectData resulting from udt call
 *
 */

  public RCObjectData getOutput() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
}
