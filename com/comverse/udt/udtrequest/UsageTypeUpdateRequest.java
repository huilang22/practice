/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUpdateRequest.java
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
 * Class used to create a UsageTypeUpdateRequest Udt Request
 *
 */

public class UsageTypeUpdateRequest extends UsageTypeSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeUpdateRequest
 * @param id Unique request name
 * @param UTUpdIn UsageTypeObjectData for UsageTypeUpdateRequest
 *
 */
@JsonCreator
  public UsageTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageType")UsageTypeObjectData UTUpdIn) {
    super(id, "UsageTypeUpdate");
    if (UTUpdIn != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(UTUpdIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }

/**
 *
 * Retrieves the UsageTypeObjectData that results from the UsageTypeUpdateRequest call
 * @return UsageTypeObjectData resulting from udt call
 *
 */

  public UsageTypeObjectData getOutput() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
}
