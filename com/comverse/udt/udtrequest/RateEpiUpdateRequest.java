/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiUpdateRequest.java
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
 * Class used to create a RateEpiUpdateRequest Udt Request
 *
 */

public class RateEpiUpdateRequest extends RateEpiSubRequestParent {
/**
 *
 * Constructor to create a  RateEpiUpdateRequest
 * @param id Unique request name
 * @param REUpdateIn RateEpiObjectData for RateEpiUpdateRequest
 *
 */
@JsonCreator
  public RateEpiUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateEpi")RateEpiObjectData REUpdateIn) {
    super(id, "RateEpiUpdate");
    if (REUpdateIn != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(REUpdateIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }

/**
 *
 * Retrieves the RateEpiObjectData that results from the RateEpiUpdateRequest call
 * @return RateEpiObjectData resulting from udt call
 *
 */

  public RateEpiObjectData getOutput() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
}
