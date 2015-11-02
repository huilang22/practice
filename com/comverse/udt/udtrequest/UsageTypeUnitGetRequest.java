/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitGetRequest.java
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
 * Class used to create a UsageTypeUnitGetRequest Udt Request
 *
 */

public class UsageTypeUnitGetRequest extends UsageTypeUnitSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeUnitGetRequest
 * @param id Unique request name
 * @param UsageTypeUnitGetIn UsageTypeUnitObjectKeyData for UsageTypeUnitGetRequest
 *
 */
@JsonCreator
  public UsageTypeUnitGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeUnit")UsageTypeUnitObjectKeyData UsageTypeUnitGetIn) {
    super(id, "UsageTypeUnitGet");
    if (UsageTypeUnitGetIn != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectKeyHelper.toMap(UsageTypeUnitGetIn, new HashMap(), "UsageTypeUnitObjectKeyData").get("UsageTypeUnitObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageTypeUnitObjectData that results from the UsageTypeUnitGetRequest call
 * @return UsageTypeUnitObjectData resulting from udt call
 *
 */

  public UsageTypeUnitObjectData getOutput() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
}
