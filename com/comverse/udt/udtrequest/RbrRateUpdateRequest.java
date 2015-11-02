/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateUpdateRequest.java
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
 * Class used to create a RbrRateUpdateRequest Udt Request
 *
 */

public class RbrRateUpdateRequest extends RbrRateSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateUpdateRequest
 * @param id Unique request name
 * @param RbrRateUpdateIn RbrRatesObjectData for RbrRateUpdateRequest
 *
 */
@JsonCreator
  public RbrRateUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRate")RbrRatesObjectData RbrRateUpdateIn) {
    super(id, "RbrRateUpdate");
    if (RbrRateUpdateIn != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(RbrRateUpdateIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }

/**
 *
 * Retrieves the RbrRatesObjectData that results from the RbrRateUpdateRequest call
 * @return RbrRatesObjectData resulting from udt call
 *
 */

  public RbrRatesObjectData getOutput() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
}
