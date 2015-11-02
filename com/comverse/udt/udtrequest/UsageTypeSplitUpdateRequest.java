/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitUpdateRequest.java
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
 * Class used to create a UsageTypeSplitUpdateRequest Udt Request
 *
 */

public class UsageTypeSplitUpdateRequest extends UsageTypeSplitSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeSplitUpdateRequest
 * @param id Unique request name
 * @param UsageTypeSplitUpdateIn UsageTypeSplitObjectData for UsageTypeSplitUpdateRequest
 * @param UsageTypeSplitUpdateFilter UsageTypeSplitObjectFilter for UsageTypeSplitUpdateRequest
 * @param UsageTypeSplitUpdateGet UsageTypeSplitObjectData for UsageTypeSplitUpdateRequest
 *
 */
@JsonCreator
  public UsageTypeSplitUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeSplit")UsageTypeSplitObjectData UsageTypeSplitUpdateIn, @JsonProperty("UsageTypeSplitUpdateFilter")UsageTypeSplitObjectFilter UsageTypeSplitUpdateFilter, @JsonProperty("UsageTypeSplitUpdateGet")UsageTypeSplitObjectData UsageTypeSplitUpdateGet) {
    super(id, "UsageTypeSplitUpdate");
    if (UsageTypeSplitUpdateIn != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitUpdateIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
    if (UsageTypeSplitUpdateFilter != null) {
      Integer index =  UsageTypeSplitUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeSplitUpdateFilter", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitUpdateFilter, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
    if (UsageTypeSplitUpdateGet != null) {
      addInput("UsageTypeSplitUpdateGet", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitUpdateGet, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }

/**
 *
 * Retrieves the UsageTypeSplitObjectData that results from the UsageTypeSplitUpdateRequest call
 * @return UsageTypeSplitObjectData resulting from udt call
 *
 */

  public UsageTypeSplitObjectData getOutput() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
}
