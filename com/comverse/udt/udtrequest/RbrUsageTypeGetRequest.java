/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeGetRequest.java
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
 * Class used to create a RbrUsageTypeGetRequest Udt Request
 *
 */

public class RbrUsageTypeGetRequest extends RbrUsageTypeSubRequestParent {
/**
 *
 * Constructor to create a  RbrUsageTypeGetRequest
 * @param id Unique request name
 * @param RbrUsgTypeGetIn RbrUsageTypeObjectKeyData for RbrUsageTypeGetRequest
 *
 */
@JsonCreator
  public RbrUsageTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrUsageType")RbrUsageTypeObjectKeyData RbrUsgTypeGetIn) {
    super(id, "RbrUsageTypeGet");
    if (RbrUsgTypeGetIn != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectKeyHelper.toMap(RbrUsgTypeGetIn, new HashMap(), "RbrUsageTypeObjectKeyData").get("RbrUsageTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrUsageTypeObjectData that results from the RbrUsageTypeGetRequest call
 * @return RbrUsageTypeObjectData resulting from udt call
 *
 */

  public RbrUsageTypeObjectData getOutput() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
}
