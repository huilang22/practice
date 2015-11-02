/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyUpdateRequest.java
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
 * Class used to create a RateCurrencyUpdateRequest Udt Request
 *
 */

public class RateCurrencyUpdateRequest extends RateCurrencySubRequestParent {
/**
 *
 * Constructor to create a  RateCurrencyUpdateRequest
 * @param id Unique request name
 * @param RCUpdateIn RCObjectData for RateCurrencyUpdateRequest
 *
 */
@JsonCreator
  public RateCurrencyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCurrency")RCObjectData RCUpdateIn) {
    super(id, "RateCurrencyUpdate");
    if (RCUpdateIn != null) {
      addInput("RateCurrency", RCObjectHelper.toMap(RCUpdateIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }

/**
 *
 * Retrieves the RCObjectData that results from the RateCurrencyUpdateRequest call
 * @return RCObjectData resulting from udt call
 *
 */

  public RCObjectData getOutput() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
}
