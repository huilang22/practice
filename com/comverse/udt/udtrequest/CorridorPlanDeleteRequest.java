/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanDeleteRequest.java
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
 * Class used to create a CorridorPlanDeleteRequest Udt Request
 *
 */

public class CorridorPlanDeleteRequest extends CorridorPlanSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanDeleteRequest
 * @param id Unique request name
 * @param CPDeleteIn CPObjectKeyData for CorridorPlanDeleteRequest
 *
 */
@JsonCreator
  public CorridorPlanDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlan")CPObjectKeyData CPDeleteIn) {
    super(id, "CorridorPlanDelete");
    if (CPDeleteIn != null) {
      addInput("CorridorPlan", CPObjectKeyHelper.toMap(CPDeleteIn, new HashMap(), "CPObjectKeyData").get("CPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CPObjectData that results from the CorridorPlanDeleteRequest call
 * @return CPObjectData resulting from udt call
 *
 */

  public CPObjectData getOutput() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
}
