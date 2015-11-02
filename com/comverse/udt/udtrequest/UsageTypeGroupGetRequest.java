/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupGetRequest.java
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
 * Class used to create a UsageTypeGroupGetRequest Udt Request
 *
 */

public class UsageTypeGroupGetRequest extends UsageTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeGroupGetRequest
 * @param id Unique request name
 * @param UTGGetIn UsageTypeGroupObjectKeyData for UsageTypeGroupGetRequest
 *
 */
@JsonCreator
  public UsageTypeGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeGroup")UsageTypeGroupObjectKeyData UTGGetIn) {
    super(id, "UsageTypeGroupGet");
    if (UTGGetIn != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectKeyHelper.toMap(UTGGetIn, new HashMap(), "UsageTypeGroupObjectKeyData").get("UsageTypeGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageTypeGroupObjectData that results from the UsageTypeGroupGetRequest call
 * @return UsageTypeGroupObjectData resulting from udt call
 *
 */

  public UsageTypeGroupObjectData getOutput() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
}
