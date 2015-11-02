/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageCreateRequest.java
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
 * Class used to create a RateUsageCreateRequest Udt Request
 *
 */

public class RateUsageCreateRequest extends RateUsageSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageCreateRequest
 * @param id Unique request name
 * @param RUCrIn RateUsageObjectData for RateUsageCreateRequest
 *
 */
@JsonCreator
  public RateUsageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsage")RateUsageObjectData RUCrIn) {
    super(id, "RateUsageCreate");
    if (RUCrIn != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(RUCrIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }

/**
 *
 * Retrieves the RateUsageObjectData that results from the RateUsageCreateRequest call
 * @return RateUsageObjectData resulting from udt call
 *
 */

  public RateUsageObjectData getOutput() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
}
