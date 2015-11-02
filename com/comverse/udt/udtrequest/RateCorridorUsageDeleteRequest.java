/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageDeleteRequest.java
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
 * Class used to create a RateCorridorUsageDeleteRequest Udt Request
 *
 */

public class RateCorridorUsageDeleteRequest extends RateCorridorUsageRequest {
/**
 *
 * Constructor to create a  RateCorridorUsageDeleteRequest
 * @param id Unique request name
 * @param RUDeleteIn RCUsageObjectKeyData for RateCorridorUsageDeleteRequest
 *
 */
@JsonCreator
  public RateCorridorUsageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsage")RCUsageObjectKeyData RUDeleteIn) {
    super(id, "RateCorridorUsageDelete");
    if (RUDeleteIn != null) {
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(RUDeleteIn, new HashMap(), "RCUsageObjectKeyData").get("RCUsageObjectKeyData"));
    }
  }

}
