/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodGetRequest.java
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
 * Class used to create a RbrTimePeriodGetRequest Udt Request
 *
 */

public class RbrTimePeriodGetRequest extends RbrTimePeriodSubRequestParent {
/**
 *
 * Constructor to create a  RbrTimePeriodGetRequest
 * @param id Unique request name
 * @param RbrTmPrdGetIn RbrTimePeriodObjectKeyData for RbrTimePeriodGetRequest
 *
 */
@JsonCreator
  public RbrTimePeriodGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimePeriod")RbrTimePeriodObjectKeyData RbrTmPrdGetIn) {
    super(id, "RbrTimePeriodGet");
    if (RbrTmPrdGetIn != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectKeyHelper.toMap(RbrTmPrdGetIn, new HashMap(), "RbrTimePeriodObjectKeyData").get("RbrTimePeriodObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrTimePeriodObjectData that results from the RbrTimePeriodGetRequest call
 * @return RbrTimePeriodObjectData resulting from udt call
 *
 */

  public RbrTimePeriodObjectData getOutput() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
}
