/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodUpdateRequest.java
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
 * Class used to create a RbrTimePeriodUpdateRequest Udt Request
 *
 */

public class RbrTimePeriodUpdateRequest extends RbrTimePeriodSubRequestParent {
/**
 *
 * Constructor to create a  RbrTimePeriodUpdateRequest
 * @param id Unique request name
 * @param RbrTmPrdUpdIn RbrTimePeriodObjectData for RbrTimePeriodUpdateRequest
 *
 */
@JsonCreator
  public RbrTimePeriodUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimePeriod")RbrTimePeriodObjectData RbrTmPrdUpdIn) {
    super(id, "RbrTimePeriodUpdate");
    if (RbrTmPrdUpdIn != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(RbrTmPrdUpdIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }

/**
 *
 * Retrieves the RbrTimePeriodObjectData that results from the RbrTimePeriodUpdateRequest call
 * @return RbrTimePeriodObjectData resulting from udt call
 *
 */

  public RbrTimePeriodObjectData getOutput() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
}
