/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierCreateRequest.java
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
 * Class used to create a RbrRateTierCreateRequest Udt Request
 *
 */

public class RbrRateTierCreateRequest extends RbrRateTierSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTierCreateRequest
 * @param id Unique request name
 * @param RbrRteTierCreateIn RbrRteTierObjectData for RbrRateTierCreateRequest
 *
 */
@JsonCreator
  public RbrRateTierCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTier")RbrRteTierObjectData RbrRteTierCreateIn) {
    super(id, "RbrRateTierCreate");
    if (RbrRteTierCreateIn != null) {
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(RbrRteTierCreateIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }

/**
 *
 * Retrieves the RbrRteTierObjectData that results from the RbrRateTierCreateRequest call
 * @return RbrRteTierObjectData resulting from udt call
 *
 */

  public RbrRteTierObjectData getOutput() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
}
