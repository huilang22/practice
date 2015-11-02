/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateGetRequest.java
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
 * Class used to create a RbrRateGetRequest Udt Request
 *
 */

public class RbrRateGetRequest extends RbrRateSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateGetRequest
 * @param id Unique request name
 * @param RbrRatesGetIn RbrRatesObjectKeyData for RbrRateGetRequest
 *
 */
@JsonCreator
  public RbrRateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRate")RbrRatesObjectKeyData RbrRatesGetIn) {
    super(id, "RbrRateGet");
    if (RbrRatesGetIn != null) {
      addInput("RbrRate", RbrRatesObjectKeyHelper.toMap(RbrRatesGetIn, new HashMap(), "RbrRatesObjectKeyData").get("RbrRatesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrRatesObjectData that results from the RbrRateGetRequest call
 * @return RbrRatesObjectData resulting from udt call
 *
 */

  public RbrRatesObjectData getOutput() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
}
