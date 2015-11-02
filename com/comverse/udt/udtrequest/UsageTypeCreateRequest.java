/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeCreateRequest.java
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
 * Class used to create a UsageTypeCreateRequest Udt Request
 *
 */

public class UsageTypeCreateRequest extends UsageTypeSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeCreateRequest
 * @param id Unique request name
 * @param UTCrIn UsageTypeObjectData for UsageTypeCreateRequest
 *
 */
@JsonCreator
  public UsageTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageType")UsageTypeObjectData UTCrIn) {
    super(id, "UsageTypeCreate");
    if (UTCrIn != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(UTCrIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }

/**
 *
 * Retrieves the UsageTypeObjectData that results from the UsageTypeCreateRequest call
 * @return UsageTypeObjectData resulting from udt call
 *
 */

  public UsageTypeObjectData getOutput() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
}
