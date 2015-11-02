/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDistinctGetRequest.java
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
 * Class used to create a RatePeriodDistinctGetRequest Udt Request
 *
 */

public class RatePeriodDistinctGetRequest extends RatePeriodDistinctSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodDistinctGetRequest
 * @param id Unique request name
 * @param rpGetIn RatePeriodDistinctObjectKeyData for RatePeriodDistinctGetRequest
 *
 */
@JsonCreator
  public RatePeriodDistinctGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriodDistinct")RatePeriodDistinctObjectKeyData rpGetIn) {
    super(id, "RatePeriodDistinctGet");
    if (rpGetIn != null) {
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectKeyHelper.toMap(rpGetIn, new HashMap(), "RatePeriodDistinctObjectKeyData").get("RatePeriodDistinctObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RatePeriodDistinctObjectData that results from the RatePeriodDistinctGetRequest call
 * @return RatePeriodDistinctObjectData resulting from udt call
 *
 */

  public RatePeriodDistinctObjectData getOutput() {
    return RatePeriodDistinctObjectHelper.fromMap(outputMap, "RatePeriodDistinct");
  }
}
