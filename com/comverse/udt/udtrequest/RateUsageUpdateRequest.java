/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageUpdateRequest.java
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
 * Class used to create a RateUsageUpdateRequest Udt Request
 *
 */

public class RateUsageUpdateRequest extends RateUsageSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageUpdateRequest
 * @param id Unique request name
 * @param RUUpdateIn RateUsageObjectData for RateUsageUpdateRequest
 *
 */
@JsonCreator
  public RateUsageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsage")RateUsageObjectData RUUpdateIn) {
    super(id, "RateUsageUpdate");
    if (RUUpdateIn != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(RUUpdateIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }

/**
 *
 * Retrieves the RateUsageObjectData that results from the RateUsageUpdateRequest call
 * @return RateUsageObjectData resulting from udt call
 *
 */

  public RateUsageObjectData getOutput() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
}
