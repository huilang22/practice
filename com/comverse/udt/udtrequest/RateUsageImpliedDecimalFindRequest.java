/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalFindRequest.java
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
 * Class used to create a RateUsageImpliedDecimalFindRequest Udt Request
 *
 */

public class RateUsageImpliedDecimalFindRequest extends RateUsageImpliedDecimalRequest {
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalFindRequest
 * @param id Unique request name
 * @param RUIDFindIn RateUsageImpliedDecimalObjectFilter for RateUsageImpliedDecimalFindRequest
 *
 */
@JsonCreator
  public RateUsageImpliedDecimalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUsageImpliedDecimal")RateUsageImpliedDecimalObjectFilter RUIDFindIn) {
    super(id, "RateUsageImpliedDecimalFind");
    if (RUIDFindIn != null) {
      Integer index =  RUIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(RUIDFindIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }

/**
 *
 * Retrieves the RateUsageImpliedDecimalObjectDataList that results from the RateUsageImpliedDecimalFindRequest call
 * @return RateUsageImpliedDecimalObjectDataList resulting from udt call
 *
 */

  public RateUsageImpliedDecimalObjectDataList getOutput() {
    return RateUsageImpliedDecimalObjectHelper.fromMapList(outputMap, "RateUsageImpliedDecimalList");
  }
}
