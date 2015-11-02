/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeDeleteRequest.java
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
 * Class used to create a UsageTypeDeleteRequest Udt Request
 *
 */

public class UsageTypeDeleteRequest extends UsageTypeSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeDeleteRequest
 * @param id Unique request name
 * @param utDeleteIn UsageTypeObjectKeyData for UsageTypeDeleteRequest
 *
 */
@JsonCreator
  public UsageTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageType")UsageTypeObjectKeyData utDeleteIn) {
    super(id, "UsageTypeDelete");
    if (utDeleteIn != null) {
      addInput("UsageType", UsageTypeObjectKeyHelper.toMap(utDeleteIn, new HashMap(), "UsageTypeObjectKeyData").get("UsageTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageTypeObjectData that results from the UsageTypeDeleteRequest call
 * @return UsageTypeObjectData resulting from udt call
 *
 */

  public UsageTypeObjectData getOutput() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
}
