/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitCreateRequest.java
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
 * Class used to create a UsageTypeUnitCreateRequest Udt Request
 *
 */

public class UsageTypeUnitCreateRequest extends UsageTypeUnitSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeUnitCreateRequest
 * @param id Unique request name
 * @param UsageTypeUnitCreateIn UsageTypeUnitObjectData for UsageTypeUnitCreateRequest
 *
 */
@JsonCreator
  public UsageTypeUnitCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeUnit")UsageTypeUnitObjectData UsageTypeUnitCreateIn) {
    super(id, "UsageTypeUnitCreate");
    if (UsageTypeUnitCreateIn != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitCreateIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }

/**
 *
 * Retrieves the UsageTypeUnitObjectData that results from the UsageTypeUnitCreateRequest call
 * @return UsageTypeUnitObjectData resulting from udt call
 *
 */

  public UsageTypeUnitObjectData getOutput() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
}
