/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupCreateRequest.java
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
 * Class used to create a UsageTypeGroupCreateRequest Udt Request
 *
 */

public class UsageTypeGroupCreateRequest extends UsageTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeGroupCreateRequest
 * @param id Unique request name
 * @param UTGCrIn UsageTypeGroupObjectData for UsageTypeGroupCreateRequest
 *
 */
@JsonCreator
  public UsageTypeGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeGroup")UsageTypeGroupObjectData UTGCrIn) {
    super(id, "UsageTypeGroupCreate");
    if (UTGCrIn != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(UTGCrIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }

/**
 *
 * Retrieves the UsageTypeGroupObjectData that results from the UsageTypeGroupCreateRequest call
 * @return UsageTypeGroupObjectData resulting from udt call
 *
 */

  public UsageTypeGroupObjectData getOutput() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
}
