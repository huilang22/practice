/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateCreateRequest.java
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
 * Class used to create a RbrRateCreateRequest Udt Request
 *
 */

public class RbrRateCreateRequest extends RbrRateSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateCreateRequest
 * @param id Unique request name
 * @param RbrRateCreateIn RbrRatesObjectData for RbrRateCreateRequest
 *
 */
@JsonCreator
  public RbrRateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRate")RbrRatesObjectData RbrRateCreateIn) {
    super(id, "RbrRateCreate");
    if (RbrRateCreateIn != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(RbrRateCreateIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }

/**
 *
 * Retrieves the RbrRatesObjectData that results from the RbrRateCreateRequest call
 * @return RbrRatesObjectData resulting from udt call
 *
 */

  public RbrRatesObjectData getOutput() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
}
