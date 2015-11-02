/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierDeleteRequest.java
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
 * Class used to create a RbrRateTierDeleteRequest Udt Request
 *
 */

public class RbrRateTierDeleteRequest extends RbrRateTierSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTierDeleteRequest
 * @param id Unique request name
 * @param RbrRteTierDeleteIn RbrRteTierObjectKeyData for RbrRateTierDeleteRequest
 *
 */
@JsonCreator
  public RbrRateTierDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTier")RbrRteTierObjectKeyData RbrRteTierDeleteIn) {
    super(id, "RbrRateTierDelete");
    if (RbrRteTierDeleteIn != null) {
      addInput("RbrRateTier", RbrRteTierObjectKeyHelper.toMap(RbrRteTierDeleteIn, new HashMap(), "RbrRteTierObjectKeyData").get("RbrRteTierObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrRteTierObjectData that results from the RbrRateTierDeleteRequest call
 * @return RbrRteTierObjectData resulting from udt call
 *
 */

  public RbrRteTierObjectData getOutput() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
}
