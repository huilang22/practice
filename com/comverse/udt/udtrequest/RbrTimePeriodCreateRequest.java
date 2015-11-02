/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodCreateRequest.java
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
 * Class used to create a RbrTimePeriodCreateRequest Udt Request
 *
 */

public class RbrTimePeriodCreateRequest extends RbrTimePeriodSubRequestParent {
/**
 *
 * Constructor to create a  RbrTimePeriodCreateRequest
 * @param id Unique request name
 * @param RbrTmPrdCrIn RbrTimePeriodObjectData for RbrTimePeriodCreateRequest
 *
 */
@JsonCreator
  public RbrTimePeriodCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimePeriod")RbrTimePeriodObjectData RbrTmPrdCrIn) {
    super(id, "RbrTimePeriodCreate");
    if (RbrTmPrdCrIn != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(RbrTmPrdCrIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }

/**
 *
 * Retrieves the RbrTimePeriodObjectData that results from the RbrTimePeriodCreateRequest call
 * @return RbrTimePeriodObjectData resulting from udt call
 *
 */

  public RbrTimePeriodObjectData getOutput() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
}
