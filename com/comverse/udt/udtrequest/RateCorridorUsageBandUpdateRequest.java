/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandUpdateRequest.java
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
 * Class used to create a RateCorridorUsageBandUpdateRequest Udt Request
 *
 */

public class RateCorridorUsageBandUpdateRequest extends RateCorridorUsageBandSubRequestParent {
/**
 *
 * Constructor to create a  RateCorridorUsageBandUpdateRequest
 * @param id Unique request name
 * @param RUBOUpdateIn RUBOverrideObjectData for RateCorridorUsageBandUpdateRequest
 * @param RUBOUpdateFilter RUBOverrideObjectFilter for RateCorridorUsageBandUpdateRequest
 * @param RUBOUpdateGet RUBOverrideObjectData for RateCorridorUsageBandUpdateRequest
 *
 */
@JsonCreator
  public RateCorridorUsageBandUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsageBand")RUBOverrideObjectData RUBOUpdateIn, @JsonProperty("RUBOUpdateFilter")RUBOverrideObjectFilter RUBOUpdateFilter, @JsonProperty("RUBOUpdateGet")RUBOverrideObjectData RUBOUpdateGet) {
    super(id, "RateCorridorUsageBandUpdate");
    if (RUBOUpdateIn != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(RUBOUpdateIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
    if (RUBOUpdateFilter != null) {
      Integer index =  RUBOUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RUBOUpdateFilter", RUBOverrideObjectHelper.toMap(RUBOUpdateFilter, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
    if (RUBOUpdateGet != null) {
      addInput("RUBOUpdateGet", RUBOverrideObjectHelper.toMap(RUBOUpdateGet, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }

/**
 *
 * Retrieves the RUBOverrideObjectData that results from the RateCorridorUsageBandUpdateRequest call
 * @return RUBOverrideObjectData resulting from udt call
 *
 */

  public RUBOverrideObjectData getOutput() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
}
