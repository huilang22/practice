/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeCreateRequest.java
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
 * Class used to create a RbrUsageTypeCreateRequest Udt Request
 *
 */

public class RbrUsageTypeCreateRequest extends RbrUsageTypeSubRequestParent {
/**
 *
 * Constructor to create a  RbrUsageTypeCreateRequest
 * @param id Unique request name
 * @param RbrUsgTypeCrIn RbrUsageTypeObjectData for RbrUsageTypeCreateRequest
 *
 */
@JsonCreator
  public RbrUsageTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrUsageType")RbrUsageTypeObjectData RbrUsgTypeCrIn) {
    super(id, "RbrUsageTypeCreate");
    if (RbrUsgTypeCrIn != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(RbrUsgTypeCrIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }

/**
 *
 * Retrieves the RbrUsageTypeObjectData that results from the RbrUsageTypeCreateRequest call
 * @return RbrUsageTypeObjectData resulting from udt call
 *
 */

  public RbrUsageTypeObjectData getOutput() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
}
