/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcUpdateRequest.java
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
 * Class used to create a RateRcUpdateRequest Udt Request
 *
 */

public class RateRcUpdateRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a  RateRcUpdateRequest
 * @param id Unique request name
 * @param RACUpdateIn RACObjectData for RateRcUpdateRequest
 * @param RACUpdateFilter RACObjectFilter for RateRcUpdateRequest
 * @param RACUpdateGet RACObjectData for RateRcUpdateRequest
 *
 */
@JsonCreator
  public RateRcUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateRc")RACObjectData RACUpdateIn, @JsonProperty("RACUpdateFilter")RACObjectFilter RACUpdateFilter, @JsonProperty("RACUpdateGet")RACObjectData RACUpdateGet) {
    super(id, "RateRcUpdate");
    if (RACUpdateIn != null) {
      addInput("RateRc", RACObjectHelper.toMap(RACUpdateIn, new HashMap(), "RateRc").get("RateRc"));
    }
    if (RACUpdateFilter != null) {
      Integer index =  RACUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RACUpdateFilter", RACObjectHelper.toMap(RACUpdateFilter, new HashMap(), "RateRc").get("RateRc"));
    }
    if (RACUpdateGet != null) {
      addInput("RACUpdateGet", RACObjectHelper.toMap(RACUpdateGet, new HashMap(), "RateRc").get("RateRc"));
    }
  }

/**
 *
 * Retrieves the RACObjectData that results from the RateRcUpdateRequest call
 * @return RACObjectData resulting from udt call
 *
 */

  public RACObjectData getOutput() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
}
