/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandGetRequest.java
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
 * Class used to create a RateUsageBandGetRequest Udt Request
 *
 */

public class RateUsageBandGetRequest extends RateUsageBandSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageBandGetRequest
 * @param id Unique request name
 * @param RUGetIn RateUsageBandObjectKeyData for RateUsageBandGetRequest
 *
 */
@JsonCreator
  public RateUsageBandGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageBand")RateUsageBandObjectKeyData RUGetIn) {
    super(id, "RateUsageBandGet");
    if (RUGetIn != null) {
      addInput("RateUsageBand", RateUsageBandObjectKeyHelper.toMap(RUGetIn, new HashMap(), "RateUsageBandObjectKeyData").get("RateUsageBandObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateUsageBandObjectData that results from the RateUsageBandGetRequest call
 * @return RateUsageBandObjectData resulting from udt call
 *
 */

  public RateUsageBandObjectData getOutput() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
}
