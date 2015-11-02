/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandDeleteRequest.java
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
 * Class used to create a RateCorridorUsageBandDeleteRequest Udt Request
 *
 */

public class RateCorridorUsageBandDeleteRequest extends RateCorridorUsageBandRequest {
/**
 *
 * Constructor to create a  RateCorridorUsageBandDeleteRequest
 * @param id Unique request name
 * @param RUBODeleteIn RUBOverrideObjectKeyData for RateCorridorUsageBandDeleteRequest
 *
 */
@JsonCreator
  public RateCorridorUsageBandDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsageBand")RUBOverrideObjectKeyData RUBODeleteIn) {
    super(id, "RateCorridorUsageBandDelete");
    if (RUBODeleteIn != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectKeyHelper.toMap(RUBODeleteIn, new HashMap(), "RUBOverrideObjectKeyData").get("RUBOverrideObjectKeyData"));
    }
  }

}
