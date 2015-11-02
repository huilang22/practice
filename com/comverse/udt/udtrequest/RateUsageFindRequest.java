/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageFindRequest.java
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
 * Class used to create a RateUsageFindRequest Udt Request
 *
 */

public class RateUsageFindRequest extends RateUsageRequest {
/**
 *
 * Constructor to create a  RateUsageFindRequest
 * @param id Unique request name
 * @param RUFindIn RateUsageObjectFilter for RateUsageFindRequest
 *
 */
@JsonCreator
  public RateUsageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsage")RateUsageObjectFilter RUFindIn) {
    super(id, "RateUsageFind");
    if (RUFindIn != null) {
      Integer index =  RUFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUsage", RateUsageObjectHelper.toMap(RUFindIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }

/**
 *
 * Retrieves the RateUsageObjectDataList that results from the RateUsageFindRequest call
 * @return RateUsageObjectDataList resulting from udt call
 *
 */

  public RateUsageObjectDataList getOutput() {
    return RateUsageObjectHelper.fromMapList(outputMap, "RateUsageList");
  }
}
