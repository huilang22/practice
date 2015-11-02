/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeUpdateRequest.java
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
 * Class used to create a RbrUsageTypeUpdateRequest Udt Request
 *
 */

public class RbrUsageTypeUpdateRequest extends RbrUsageTypeSubRequestParent {
/**
 *
 * Constructor to create a  RbrUsageTypeUpdateRequest
 * @param id Unique request name
 * @param RbrUsgTypeUpdIn RbrUsageTypeObjectData for RbrUsageTypeUpdateRequest
 *
 */
@JsonCreator
  public RbrUsageTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrUsageType")RbrUsageTypeObjectData RbrUsgTypeUpdIn) {
    super(id, "RbrUsageTypeUpdate");
    if (RbrUsgTypeUpdIn != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(RbrUsgTypeUpdIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }

/**
 *
 * Retrieves the RbrUsageTypeObjectData that results from the RbrUsageTypeUpdateRequest call
 * @return RbrUsageTypeObjectData resulting from udt call
 *
 */

  public RbrUsageTypeObjectData getOutput() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
}
