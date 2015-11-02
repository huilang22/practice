/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUpdateRequest.java
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
 * Class used to create a RatePeriodUpdateRequest Udt Request
 *
 */

public class RatePeriodUpdateRequest extends RatePeriodSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodUpdateRequest
 * @param id Unique request name
 * @param RPUpdateIn RPObjectData for RatePeriodUpdateRequest
 *
 */
@JsonCreator
  public RatePeriodUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriod")RPObjectData RPUpdateIn) {
    super(id, "RatePeriodUpdate");
    if (RPUpdateIn != null) {
      addInput("RatePeriod", RPObjectHelper.toMap(RPUpdateIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }

/**
 *
 * Retrieves the RPObjectData that results from the RatePeriodUpdateRequest call
 * @return RPObjectData resulting from udt call
 *
 */

  public RPObjectData getOutput() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
}
