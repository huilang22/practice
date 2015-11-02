/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitCreateRequest.java
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
 * Class used to create a UsageTypeSplitCreateRequest Udt Request
 *
 */

public class UsageTypeSplitCreateRequest extends UsageTypeSplitSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeSplitCreateRequest
 * @param id Unique request name
 * @param UsageTypeSplitCreateIn UsageTypeSplitObjectData for UsageTypeSplitCreateRequest
 *
 */
@JsonCreator
  public UsageTypeSplitCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeSplit")UsageTypeSplitObjectData UsageTypeSplitCreateIn) {
    super(id, "UsageTypeSplitCreate");
    if (UsageTypeSplitCreateIn != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitCreateIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }

/**
 *
 * Retrieves the UsageTypeSplitObjectData that results from the UsageTypeSplitCreateRequest call
 * @return UsageTypeSplitObjectData resulting from udt call
 *
 */

  public UsageTypeSplitObjectData getOutput() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
}
