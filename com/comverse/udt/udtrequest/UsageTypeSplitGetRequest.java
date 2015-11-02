/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitGetRequest.java
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
 * Class used to create a UsageTypeSplitGetRequest Udt Request
 *
 */

public class UsageTypeSplitGetRequest extends UsageTypeSplitSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeSplitGetRequest
 * @param id Unique request name
 * @param UsageTypeSplitGetIn UsageTypeSplitObjectKeyData for UsageTypeSplitGetRequest
 *
 */
@JsonCreator
  public UsageTypeSplitGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeSplit")UsageTypeSplitObjectKeyData UsageTypeSplitGetIn) {
    super(id, "UsageTypeSplitGet");
    if (UsageTypeSplitGetIn != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectKeyHelper.toMap(UsageTypeSplitGetIn, new HashMap(), "UsageTypeSplitObjectKeyData").get("UsageTypeSplitObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageTypeSplitObjectData that results from the UsageTypeSplitGetRequest call
 * @return UsageTypeSplitObjectData resulting from udt call
 *
 */

  public UsageTypeSplitObjectData getOutput() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
}
