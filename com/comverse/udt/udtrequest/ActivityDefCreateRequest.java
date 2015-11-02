/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefCreateRequest.java
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
 * Class used to create a ActivityDefCreateRequest Udt Request
 *
 */

public class ActivityDefCreateRequest extends ActivityDefSubRequestParent {
/**
 *
 * Constructor to create a  ActivityDefCreateRequest
 * @param id Unique request name
 * @param ActivityDefCreateIn ActivityDefObjectData for ActivityDefCreateRequest
 *
 */
@JsonCreator
  public ActivityDefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ActivityDef")ActivityDefObjectData ActivityDefCreateIn) {
    super(id, "ActivityDefCreate");
    if (ActivityDefCreateIn != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(ActivityDefCreateIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }

/**
 *
 * Retrieves the ActivityDefObjectData that results from the ActivityDefCreateRequest call
 * @return ActivityDefObjectData resulting from udt call
 *
 */

  public ActivityDefObjectData getOutput() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
}
