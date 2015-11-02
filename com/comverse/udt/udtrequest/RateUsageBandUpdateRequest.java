/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandUpdateRequest.java
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
 * Class used to create a RateUsageBandUpdateRequest Udt Request
 *
 */

public class RateUsageBandUpdateRequest extends RateUsageBandSubRequestParent {
/**
 *
 * Constructor to create a  RateUsageBandUpdateRequest
 * @param id Unique request name
 * @param RUUpdateIn RateUsageBandObjectData for RateUsageBandUpdateRequest
 * @param RUUpdateFilter RateUsageBandObjectFilter for RateUsageBandUpdateRequest
 * @param RUUpdateGet RateUsageBandObjectData for RateUsageBandUpdateRequest
 *
 */
@JsonCreator
  public RateUsageBandUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageBand")RateUsageBandObjectData RUUpdateIn, @JsonProperty("RUUpdateFilter")RateUsageBandObjectFilter RUUpdateFilter, @JsonProperty("RUUpdateGet")RateUsageBandObjectData RUUpdateGet) {
    super(id, "RateUsageBandUpdate");
    if (RUUpdateIn != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(RUUpdateIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
    if (RUUpdateFilter != null) {
      Integer index =  RUUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RUUpdateFilter", RateUsageBandObjectHelper.toMap(RUUpdateFilter, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
    if (RUUpdateGet != null) {
      addInput("RUUpdateGet", RateUsageBandObjectHelper.toMap(RUUpdateGet, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }

/**
 *
 * Retrieves the RateUsageBandObjectData that results from the RateUsageBandUpdateRequest call
 * @return RateUsageBandObjectData resulting from udt call
 *
 */

  public RateUsageBandObjectData getOutput() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
}
