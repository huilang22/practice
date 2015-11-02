/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcUpdateRequest.java
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
 * Class used to create a RateNrcUpdateRequest Udt Request
 *
 */

public class RateNrcUpdateRequest extends RateNrcSubRequestParent {
/**
 *
 * Constructor to create a  RateNrcUpdateRequest
 * @param id Unique request name
 * @param rnrcUpdateIn RateNrcObjectData for RateNrcUpdateRequest
 * @param rnrcUpdateFilter RateNrcObjectFilter for RateNrcUpdateRequest
 * @param rnrcUpdateGet RateNrcObjectData for RateNrcUpdateRequest
 *
 */
@JsonCreator
  public RateNrcUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateNrc")RateNrcObjectData rnrcUpdateIn, @JsonProperty("RnrcUpdateFilter")RateNrcObjectFilter rnrcUpdateFilter, @JsonProperty("RnrcUpdateGet")RateNrcObjectData rnrcUpdateGet) {
    super(id, "RateNrcUpdate");
    if (rnrcUpdateIn != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(rnrcUpdateIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
    if (rnrcUpdateFilter != null) {
      Integer index =  rnrcUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RnrcUpdateFilter", RateNrcObjectHelper.toMap(rnrcUpdateFilter, new HashMap(), "RateNrc").get("RateNrc"));
    }
    if (rnrcUpdateGet != null) {
      addInput("RnrcUpdateGet", RateNrcObjectHelper.toMap(rnrcUpdateGet, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }

/**
 *
 * Retrieves the RateNrcObjectData that results from the RateNrcUpdateRequest call
 * @return RateNrcObjectData resulting from udt call
 *
 */

  public RateNrcObjectData getOutput() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
}
