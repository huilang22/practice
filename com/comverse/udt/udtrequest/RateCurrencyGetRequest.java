/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyGetRequest.java
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
 * Class used to create a RateCurrencyGetRequest Udt Request
 *
 */

public class RateCurrencyGetRequest extends RateCurrencySubRequestParent {
/**
 *
 * Constructor to create a  RateCurrencyGetRequest
 * @param id Unique request name
 * @param RCGetIn RCObjectKeyData for RateCurrencyGetRequest
 *
 */
@JsonCreator
  public RateCurrencyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCurrency")RCObjectKeyData RCGetIn) {
    super(id, "RateCurrencyGet");
    if (RCGetIn != null) {
      addInput("RateCurrency", RCObjectKeyHelper.toMap(RCGetIn, new HashMap(), "RCObjectKeyData").get("RCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RCObjectData that results from the RateCurrencyGetRequest call
 * @return RCObjectData resulting from udt call
 *
 */

  public RCObjectData getOutput() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
}
