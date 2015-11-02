/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierUpdateRequest.java
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
 * Class used to create a RbrRateTierUpdateRequest Udt Request
 *
 */

public class RbrRateTierUpdateRequest extends RbrRateTierSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTierUpdateRequest
 * @param id Unique request name
 * @param RbrRteTierUpdateIn RbrRteTierObjectData for RbrRateTierUpdateRequest
 *
 */
@JsonCreator
  public RbrRateTierUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTier")RbrRteTierObjectData RbrRteTierUpdateIn) {
    super(id, "RbrRateTierUpdate");
    if (RbrRteTierUpdateIn != null) {
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(RbrRteTierUpdateIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }

/**
 *
 * Retrieves the RbrRteTierObjectData that results from the RbrRateTierUpdateRequest call
 * @return RbrRteTierObjectData resulting from udt call
 *
 */

  public RbrRteTierObjectData getOutput() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
}
