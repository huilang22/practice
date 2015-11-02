/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageGetRequest.java
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
 * Class used to create a RateUsageGetRequest Udt Request
 *
 */

public class RateUsageGetRequest extends RateUsageSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageGetRequest
 * @param id Unique request name
 * @param RUGetIn RateUsageObjectKeyData for RateUsageGetRequest
 *
 */
@JsonCreator
  public RateUsageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsage")RateUsageObjectKeyData RUGetIn) {
    super(id, "RateUsageGet");
    if (RUGetIn != null) {
      addInput("RateUsage", RateUsageObjectKeyHelper.toMap(RUGetIn, new HashMap(), "RateUsageObjectKeyData").get("RateUsageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateUsageObjectData that results from the RateUsageGetRequest call
 * @return RateUsageObjectData resulting from udt call
 *
 */

  public RateUsageObjectData getOutput() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
}
