/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodCreateRequest.java
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
 * Class used to create a RatePeriodCreateRequest Udt Request
 *
 */

public class RatePeriodCreateRequest extends RatePeriodSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodCreateRequest
 * @param id Unique request name
 * @param RPCreateIn RPObjectData for RatePeriodCreateRequest
 *
 */
@JsonCreator
  public RatePeriodCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriod")RPObjectData RPCreateIn) {
    super(id, "RatePeriodCreate");
    if (RPCreateIn != null) {
      addInput("RatePeriod", RPObjectHelper.toMap(RPCreateIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }

/**
 *
 * Retrieves the RPObjectData that results from the RatePeriodCreateRequest call
 * @return RPObjectData resulting from udt call
 *
 */

  public RPObjectData getOutput() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
}
