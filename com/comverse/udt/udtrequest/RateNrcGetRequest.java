/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcGetRequest.java
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
 * Class used to create a RateNrcGetRequest Udt Request
 *
 */

public class RateNrcGetRequest extends RateNrcSubRequestParent {
/**
 *
 * Constructor to create a  RateNrcGetRequest
 * @param id Unique request name
 * @param rnrcGetIn RateNrcObjectKeyData for RateNrcGetRequest
 *
 */
@JsonCreator
  public RateNrcGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateNrc")RateNrcObjectKeyData rnrcGetIn) {
    super(id, "RateNrcGet");
    if (rnrcGetIn != null) {
      addInput("RateNrc", RateNrcObjectKeyHelper.toMap(rnrcGetIn, new HashMap(), "RateNrcObjectKeyData").get("RateNrcObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateNrcObjectData that results from the RateNrcGetRequest call
 * @return RateNrcObjectData resulting from udt call
 *
 */

  public RateNrcObjectData getOutput() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
}
