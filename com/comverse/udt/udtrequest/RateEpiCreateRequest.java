/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiCreateRequest.java
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
 * Class used to create a RateEpiCreateRequest Udt Request
 *
 */

public class RateEpiCreateRequest extends RateEpiSubRequestParent {
/**
 *
 * Constructor to create a  RateEpiCreateRequest
 * @param id Unique request name
 * @param RECreateIn RateEpiObjectData for RateEpiCreateRequest
 *
 */
@JsonCreator
  public RateEpiCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateEpi")RateEpiObjectData RECreateIn) {
    super(id, "RateEpiCreate");
    if (RECreateIn != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(RECreateIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }

/**
 *
 * Retrieves the RateEpiObjectData that results from the RateEpiCreateRequest call
 * @return RateEpiObjectData resulting from udt call
 *
 */

  public RateEpiObjectData getOutput() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
}
