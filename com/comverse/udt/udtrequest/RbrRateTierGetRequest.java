/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierGetRequest.java
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
 * Class used to create a RbrRateTierGetRequest Udt Request
 *
 */

public class RbrRateTierGetRequest extends RbrRateTierSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTierGetRequest
 * @param id Unique request name
 * @param RbrRteTierGetIn RbrRteTierObjectKeyData for RbrRateTierGetRequest
 *
 */
@JsonCreator
  public RbrRateTierGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTier")RbrRteTierObjectKeyData RbrRteTierGetIn) {
    super(id, "RbrRateTierGet");
    if (RbrRteTierGetIn != null) {
      addInput("RbrRateTier", RbrRteTierObjectKeyHelper.toMap(RbrRteTierGetIn, new HashMap(), "RbrRteTierObjectKeyData").get("RbrRteTierObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrRteTierObjectData that results from the RbrRateTierGetRequest call
 * @return RbrRteTierObjectData resulting from udt call
 *
 */

  public RbrRteTierObjectData getOutput() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
}
