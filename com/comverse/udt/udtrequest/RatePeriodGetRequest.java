/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodGetRequest.java
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
 * Class used to create a RatePeriodGetRequest Udt Request
 *
 */

public class RatePeriodGetRequest extends RatePeriodSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodGetRequest
 * @param id Unique request name
 * @param RPGetIn RPObjectKeyData for RatePeriodGetRequest
 *
 */
@JsonCreator
  public RatePeriodGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriod")RPObjectKeyData RPGetIn) {
    super(id, "RatePeriodGet");
    if (RPGetIn != null) {
      addInput("RatePeriod", RPObjectKeyHelper.toMap(RPGetIn, new HashMap(), "RPObjectKeyData").get("RPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RPObjectData that results from the RatePeriodGetRequest call
 * @return RPObjectData resulting from udt call
 *
 */

  public RPObjectData getOutput() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
}
