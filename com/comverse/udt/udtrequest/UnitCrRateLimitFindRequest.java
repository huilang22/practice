/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitFindRequest.java
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
 * Class used to create a UnitCrRateLimitFindRequest Udt Request
 *
 */

public class UnitCrRateLimitFindRequest extends UnitCrRateLimitRequest {
/**
 *
 * Constructor to create a  UnitCrRateLimitFindRequest
 * @param id Unique request name
 * @param UnitCrRateLimitsFindIn UnitCrRateLimitsObjectFilter for UnitCrRateLimitFindRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimit")UnitCrRateLimitsObjectFilter UnitCrRateLimitsFindIn) {
    super(id, "UnitCrRateLimitFind");
    if (UnitCrRateLimitsFindIn != null) {
      Integer index =  UnitCrRateLimitsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(UnitCrRateLimitsFindIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitsObjectDataList that results from the UnitCrRateLimitFindRequest call
 * @return UnitCrRateLimitsObjectDataList resulting from udt call
 *
 */

  public UnitCrRateLimitsObjectDataList getOutput() {
    return UnitCrRateLimitsObjectHelper.fromMapList(outputMap, "UnitCrRateLimitList");
  }
}
