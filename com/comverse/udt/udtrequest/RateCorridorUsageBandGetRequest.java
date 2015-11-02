/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandGetRequest.java
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
 * Class used to create a RateCorridorUsageBandGetRequest Udt Request
 *
 */

public class RateCorridorUsageBandGetRequest extends RateCorridorUsageBandSubRequestParent {
/**
 *
 * Constructor to create a  RateCorridorUsageBandGetRequest
 * @param id Unique request name
 * @param RUBOGetIn RUBOverrideObjectKeyData for RateCorridorUsageBandGetRequest
 *
 */
@JsonCreator
  public RateCorridorUsageBandGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsageBand")RUBOverrideObjectKeyData RUBOGetIn) {
    super(id, "RateCorridorUsageBandGet");
    if (RUBOGetIn != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectKeyHelper.toMap(RUBOGetIn, new HashMap(), "RUBOverrideObjectKeyData").get("RUBOverrideObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RUBOverrideObjectData that results from the RateCorridorUsageBandGetRequest call
 * @return RUBOverrideObjectData resulting from udt call
 *
 */

  public RUBOverrideObjectData getOutput() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
}
