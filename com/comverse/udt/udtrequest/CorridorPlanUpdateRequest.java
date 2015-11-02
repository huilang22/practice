/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanUpdateRequest.java
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
 * Class used to create a CorridorPlanUpdateRequest Udt Request
 *
 */

public class CorridorPlanUpdateRequest extends CorridorPlanSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanUpdateRequest
 * @param id Unique request name
 * @param CPUpdateIn CPObjectData for CorridorPlanUpdateRequest
 *
 */
@JsonCreator
  public CorridorPlanUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlan")CPObjectData CPUpdateIn) {
    super(id, "CorridorPlanUpdate");
    if (CPUpdateIn != null) {
      addInput("CorridorPlan", CPObjectHelper.toMap(CPUpdateIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }

/**
 *
 * Retrieves the CPObjectData that results from the CorridorPlanUpdateRequest call
 * @return CPObjectData resulting from udt call
 *
 */

  public CPObjectData getOutput() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
}
