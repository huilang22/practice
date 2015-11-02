/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateDeleteRequest.java
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
 * Class used to create a RbrRateDeleteRequest Udt Request
 *
 */

public class RbrRateDeleteRequest extends RbrRateSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateDeleteRequest
 * @param id Unique request name
 * @param RbrRatesDeleteIn RbrRatesObjectKeyData for RbrRateDeleteRequest
 *
 */
@JsonCreator
  public RbrRateDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRate")RbrRatesObjectKeyData RbrRatesDeleteIn) {
    super(id, "RbrRateDelete");
    if (RbrRatesDeleteIn != null) {
      addInput("RbrRate", RbrRatesObjectKeyHelper.toMap(RbrRatesDeleteIn, new HashMap(), "RbrRatesObjectKeyData").get("RbrRatesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrRatesObjectData that results from the RbrRateDeleteRequest call
 * @return RbrRatesObjectData resulting from udt call
 *
 */

  public RbrRatesObjectData getOutput() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
}
