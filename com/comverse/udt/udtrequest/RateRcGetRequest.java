/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcGetRequest.java
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
 * Class used to create a RateRcGetRequest Udt Request
 *
 */

public class RateRcGetRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a  RateRcGetRequest
 * @param id Unique request name
 * @param RACGetIn RACObjectKeyData for RateRcGetRequest
 *
 */
@JsonCreator
  public RateRcGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateRc")RACObjectKeyData RACGetIn) {
    super(id, "RateRcGet");
    if (RACGetIn != null) {
      addInput("RateRc", RACObjectKeyHelper.toMap(RACGetIn, new HashMap(), "RACObjectKeyData").get("RACObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RACObjectData that results from the RateRcGetRequest call
 * @return RACObjectData resulting from udt call
 *
 */

  public RACObjectData getOutput() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
}
