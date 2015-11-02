/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiDeleteRequest.java
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
 * Class used to create a RateEpiDeleteRequest Udt Request
 *
 */

public class RateEpiDeleteRequest extends RateEpiSubRequestParent {
/**
 *
 * Constructor to create a  RateEpiDeleteRequest
 * @param id Unique request name
 * @param REDeleteIn RateEpiObjectData for RateEpiDeleteRequest
 *
 */
@JsonCreator
  public RateEpiDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateEpi")RateEpiObjectData REDeleteIn) {
    super(id, "RateEpiDelete");
    if (REDeleteIn != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(REDeleteIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }

/**
 *
 * Retrieves the RateEpiObjectData that results from the RateEpiDeleteRequest call
 * @return RateEpiObjectData resulting from udt call
 *
 */

  public RateEpiObjectData getOutput() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
}
