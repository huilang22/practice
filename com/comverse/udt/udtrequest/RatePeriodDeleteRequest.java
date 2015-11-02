/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDeleteRequest.java
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
 * Class used to create a RatePeriodDeleteRequest Udt Request
 *
 */

public class RatePeriodDeleteRequest extends RatePeriodSubRequestParent {
/**
 *
 * Constructor to create a  RatePeriodDeleteRequest
 * @param id Unique request name
 * @param RPDeleteIn RPObjectKeyData for RatePeriodDeleteRequest
 *
 */
@JsonCreator
  public RatePeriodDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriod")RPObjectKeyData RPDeleteIn) {
    super(id, "RatePeriodDelete");
    if (RPDeleteIn != null) {
      addInput("RatePeriod", RPObjectKeyHelper.toMap(RPDeleteIn, new HashMap(), "RPObjectKeyData").get("RPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RPObjectData that results from the RatePeriodDeleteRequest call
 * @return RPObjectData resulting from udt call
 *
 */

  public RPObjectData getOutput() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
}
