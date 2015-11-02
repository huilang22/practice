/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcDeleteRequest.java
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
 * Class used to create a RateRcDeleteRequest Udt Request
 *
 */

public class RateRcDeleteRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a  RateRcDeleteRequest
 * @param id Unique request name
 * @param RACDeleteIn RACObjectKeyData for RateRcDeleteRequest
 *
 */
@JsonCreator
  public RateRcDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateRc")RACObjectKeyData RACDeleteIn) {
    super(id, "RateRcDelete");
    if (RACDeleteIn != null) {
      addInput("RateRc", RACObjectKeyHelper.toMap(RACDeleteIn, new HashMap(), "RACObjectKeyData").get("RACObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RACObjectData that results from the RateRcDeleteRequest call
 * @return RACObjectData resulting from udt call
 *
 */

  public RACObjectData getOutput() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
}
