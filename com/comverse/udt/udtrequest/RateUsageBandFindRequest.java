/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandFindRequest.java
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
 * Class used to create a RateUsageBandFindRequest Udt Request
 *
 */

public class RateUsageBandFindRequest extends RateUsageBandRequest {
/**
 *
 * Constructor to create a  RateUsageBandFindRequest
 * @param id Unique request name
 * @param RUFindIn RateUsageBandObjectFilter for RateUsageBandFindRequest
 *
 */
@JsonCreator
  public RateUsageBandFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageBand")RateUsageBandObjectFilter RUFindIn) {
    super(id, "RateUsageBandFind");
    if (RUFindIn != null) {
      Integer index =  RUFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(RUFindIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }

/**
 *
 * Retrieves the RateUsageBandObjectDataList that results from the RateUsageBandFindRequest call
 * @return RateUsageBandObjectDataList resulting from udt call
 *
 */

  public RateUsageBandObjectDataList getOutput() {
    return RateUsageBandObjectHelper.fromMapList(outputMap, "RateUsageBandList");
  }
}
