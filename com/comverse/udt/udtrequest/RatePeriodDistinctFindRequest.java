/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDistinctFindRequest.java
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
 * Class used to create a RatePeriodDistinctFindRequest Udt Request
 *
 */

public class RatePeriodDistinctFindRequest extends RatePeriodDistinctRequest {
/**
 *
 * Constructor to create a  RatePeriodDistinctFindRequest
 * @param id Unique request name
 * @param rpFndIn RatePeriodDistinctObjectFilter for RatePeriodDistinctFindRequest
 *
 */
@JsonCreator
  public RatePeriodDistinctFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriodDistinct")RatePeriodDistinctObjectFilter rpFndIn) {
    super(id, "RatePeriodDistinctFind");
    if (rpFndIn != null) {
      Integer index =  rpFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectHelper.toMap(rpFndIn, new HashMap(), "RatePeriodDistinct").get("RatePeriodDistinct"));
    }
  }

/**
 *
 * Retrieves the RatePeriodDistinctObjectDataList that results from the RatePeriodDistinctFindRequest call
 * @return RatePeriodDistinctObjectDataList resulting from udt call
 *
 */

  public RatePeriodDistinctObjectDataList getOutput() {
    return RatePeriodDistinctObjectHelper.fromMapList(outputMap, "RatePeriodDistinctList");
  }
}
