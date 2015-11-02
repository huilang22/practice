/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupGetRequest.java
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
 * Class used to create a UsageGroupGetRequest Udt Request
 *
 */

public class UsageGroupGetRequest extends UsageGroupSubRequestParent {
/**
 *
 * Constructor to create a  UsageGroupGetRequest
 * @param id Unique request name
 * @param ugGetIn UsageGroupObjectKeyData for UsageGroupGetRequest
 *
 */
@JsonCreator
  public UsageGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageGroup")UsageGroupObjectKeyData ugGetIn) {
    super(id, "UsageGroupGet");
    if (ugGetIn != null) {
      addInput("UsageGroup", UsageGroupObjectKeyHelper.toMap(ugGetIn, new HashMap(), "UsageGroupObjectKeyData").get("UsageGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageGroupObjectData that results from the UsageGroupGetRequest call
 * @return UsageGroupObjectData resulting from udt call
 *
 */

  public UsageGroupObjectData getOutput() {
    return UsageGroupObjectHelper.fromMap(outputMap, "UsageGroup");
  }
}
