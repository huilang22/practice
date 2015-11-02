/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageFindRequest.java
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
 * Class used to create a RateCorridorUsageFindRequest Udt Request
 *
 */

public class RateCorridorUsageFindRequest extends RateCorridorUsageRequest {
/**
 *
 * Constructor to create a  RateCorridorUsageFindRequest
 * @param id Unique request name
 * @param RUFindIn RCUsageObjectFilter for RateCorridorUsageFindRequest
 *
 */
@JsonCreator
  public RateCorridorUsageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsage")RCUsageObjectFilter RUFindIn) {
    super(id, "RateCorridorUsageFind");
    if (RUFindIn != null) {
      Integer index =  RUFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(RUFindIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }

/**
 *
 * Retrieves the RCUsageObjectDataList that results from the RateCorridorUsageFindRequest call
 * @return RCUsageObjectDataList resulting from udt call
 *
 */

  public RCUsageObjectDataList getOutput() {
    return RCUsageObjectHelper.fromMapList(outputMap, "RateCorridorUsageList");
  }
}
