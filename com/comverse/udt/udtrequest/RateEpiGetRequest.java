/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiGetRequest.java
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
 * Class used to create a RateEpiGetRequest Udt Request
 *
 */

public class RateEpiGetRequest extends RateEpiSubRequestParent {
/**
 *
 * Constructor to create a  RateEpiGetRequest
 * @param id Unique request name
 * @param REGetIn RateEpiObjectKeyData for RateEpiGetRequest
 *
 */
@JsonCreator
  public RateEpiGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateEpi")RateEpiObjectKeyData REGetIn) {
    super(id, "RateEpiGet");
    if (REGetIn != null) {
      addInput("RateEpi", RateEpiObjectKeyHelper.toMap(REGetIn, new HashMap(), "RateEpiObjectKeyData").get("RateEpiObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateEpiObjectData that results from the RateEpiGetRequest call
 * @return RateEpiObjectData resulting from udt call
 *
 */

  public RateEpiObjectData getOutput() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
}
