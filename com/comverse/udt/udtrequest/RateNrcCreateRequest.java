/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcCreateRequest.java
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
 * Class used to create a RateNrcCreateRequest Udt Request
 *
 */

public class RateNrcCreateRequest extends RateNrcSubRequestParent {
/**
 *
 * Constructor to create a  RateNrcCreateRequest
 * @param id Unique request name
 * @param rnrcCrIn RateNrcObjectData for RateNrcCreateRequest
 *
 */
@JsonCreator
  public RateNrcCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateNrc")RateNrcObjectData rnrcCrIn) {
    super(id, "RateNrcCreate");
    if (rnrcCrIn != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(rnrcCrIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }

/**
 *
 * Retrieves the RateNrcObjectData that results from the RateNrcCreateRequest call
 * @return RateNrcObjectData resulting from udt call
 *
 */

  public RateNrcObjectData getOutput() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
}
