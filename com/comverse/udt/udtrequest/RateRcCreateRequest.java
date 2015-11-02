/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcCreateRequest.java
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
 * Class used to create a RateRcCreateRequest Udt Request
 *
 */

public class RateRcCreateRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a  RateRcCreateRequest
 * @param id Unique request name
 * @param RACCreateIn RACObjectData for RateRcCreateRequest
 *
 */
@JsonCreator
  public RateRcCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateRc")RACObjectData RACCreateIn) {
    super(id, "RateRcCreate");
    if (RACCreateIn != null) {
      addInput("RateRc", RACObjectHelper.toMap(RACCreateIn, new HashMap(), "RateRc").get("RateRc"));
    }
  }

/**
 *
 * Retrieves the RACObjectData that results from the RateRcCreateRequest call
 * @return RACObjectData resulting from udt call
 *
 */

  public RACObjectData getOutput() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
}
