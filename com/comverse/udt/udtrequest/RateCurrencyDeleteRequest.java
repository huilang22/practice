/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyDeleteRequest.java
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
 * Class used to create a RateCurrencyDeleteRequest Udt Request
 *
 */

public class RateCurrencyDeleteRequest extends RateCurrencySubRequestParent {
/**
 *
 * Constructor to create a  RateCurrencyDeleteRequest
 * @param id Unique request name
 * @param RCDeleteIn RCObjectKeyData for RateCurrencyDeleteRequest
 *
 */
@JsonCreator
  public RateCurrencyDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCurrency")RCObjectKeyData RCDeleteIn) {
    super(id, "RateCurrencyDelete");
    if (RCDeleteIn != null) {
      addInput("RateCurrency", RCObjectKeyHelper.toMap(RCDeleteIn, new HashMap(), "RCObjectKeyData").get("RCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RCObjectData that results from the RateCurrencyDeleteRequest call
 * @return RCObjectData resulting from udt call
 *
 */

  public RCObjectData getOutput() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
}
