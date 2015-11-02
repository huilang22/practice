/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefUpdateRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ActivityDefUpdateRequest Udt Request
 *
 */

public class ActivityDefUpdateRequest extends ActivityDefSubRequestParent {
/**
 *
 * Constructor to create a  ActivityDefUpdateRequest
 * @param id Unique request name
 * @param ActivityDefUpdateIn ActivityDefObjectData for ActivityDefUpdateRequest
 *
 */
@JsonCreator
  public ActivityDefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ActivityDef")ActivityDefObjectData ActivityDefUpdateIn) {
    super(id, "ActivityDefUpdate");
    if (ActivityDefUpdateIn != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(ActivityDefUpdateIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }

/**
 *
 * Retrieves the ActivityDefObjectData that results from the ActivityDefUpdateRequest call
 * @return ActivityDefObjectData resulting from udt call
 *
 */

  public ActivityDefObjectData getOutput() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
}
