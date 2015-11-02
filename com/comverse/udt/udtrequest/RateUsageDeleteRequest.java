/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageDeleteRequest.java
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
 * Class used to create a RateUsageDeleteRequest Udt Request
 *
 */

public class RateUsageDeleteRequest extends RateUsageRequest {
/**
 *
 * Constructor to create a  RateUsageDeleteRequest
 * @param id Unique request name
 * @param RUDeleteIn RateUsageObjectKeyData for RateUsageDeleteRequest
 *
 */
@JsonCreator
  public RateUsageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsage")RateUsageObjectKeyData RUDeleteIn) {
    super(id, "RateUsageDelete");
    if (RUDeleteIn != null) {
      addInput("RateUsage", RateUsageObjectKeyHelper.toMap(RUDeleteIn, new HashMap(), "RateUsageObjectKeyData").get("RateUsageObjectKeyData"));
    }
  }

}
