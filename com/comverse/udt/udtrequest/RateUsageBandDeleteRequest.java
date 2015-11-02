/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandDeleteRequest.java
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
 * Class used to create a RateUsageBandDeleteRequest Udt Request
 *
 */

public class RateUsageBandDeleteRequest extends RateUsageBandRequest {
/**
 *
 * Constructor to create a  RateUsageBandDeleteRequest
 * @param id Unique request name
 * @param RUDeleteIn RateUsageBandObjectKeyData for RateUsageBandDeleteRequest
 *
 */
@JsonCreator
  public RateUsageBandDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageBand")RateUsageBandObjectKeyData RUDeleteIn) {
    super(id, "RateUsageBandDelete");
    if (RUDeleteIn != null) {
      addInput("RateUsageBand", RateUsageBandObjectKeyHelper.toMap(RUDeleteIn, new HashMap(), "RateUsageBandObjectKeyData").get("RateUsageBandObjectKeyData"));
    }
  }

}
