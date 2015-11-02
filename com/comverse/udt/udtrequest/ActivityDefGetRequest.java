/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefGetRequest.java
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
 * Class used to create a ActivityDefGetRequest Udt Request
 *
 */

public class ActivityDefGetRequest extends ActivityDefSubRequestParent {
/**
 *
 * Constructor to create a  ActivityDefGetRequest
 * @param id Unique request name
 * @param ActivityDefGetIn ActivityDefObjectKeyData for ActivityDefGetRequest
 *
 */
@JsonCreator
  public ActivityDefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ActivityDef")ActivityDefObjectKeyData ActivityDefGetIn) {
    super(id, "ActivityDefGet");
    if (ActivityDefGetIn != null) {
      addInput("ActivityDef", ActivityDefObjectKeyHelper.toMap(ActivityDefGetIn, new HashMap(), "ActivityDefObjectKeyData").get("ActivityDefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ActivityDefObjectData that results from the ActivityDefGetRequest call
 * @return ActivityDefObjectData resulting from udt call
 *
 */

  public ActivityDefObjectData getOutput() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
}
