/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageGetRequest.java
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
 * Class used to create a RateCorridorUsageGetRequest Udt Request
 *
 */

public class RateCorridorUsageGetRequest extends RateCorridorUsageSubRequestParent {
/**
 *
 * Constructor to create a  RateCorridorUsageGetRequest
 * @param id Unique request name
 * @param RUGetIn RCUsageObjectKeyData for RateCorridorUsageGetRequest
 *
 */
@JsonCreator
  public RateCorridorUsageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsage")RCUsageObjectKeyData RUGetIn) {
    super(id, "RateCorridorUsageGet");
    if (RUGetIn != null) {
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(RUGetIn, new HashMap(), "RCUsageObjectKeyData").get("RCUsageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RCUsageObjectData that results from the RateCorridorUsageGetRequest call
 * @return RCUsageObjectData resulting from udt call
 *
 */

  public RCUsageObjectData getOutput() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
}
