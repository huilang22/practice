/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanCreateRequest.java
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
 * Class used to create a CorridorPlanCreateRequest Udt Request
 *
 */

public class CorridorPlanCreateRequest extends CorridorPlanSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanCreateRequest
 * @param id Unique request name
 * @param CPCreateIn CPObjectData for CorridorPlanCreateRequest
 *
 */
@JsonCreator
  public CorridorPlanCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlan")CPObjectData CPCreateIn) {
    super(id, "CorridorPlanCreate");
    if (CPCreateIn != null) {
      addInput("CorridorPlan", CPObjectHelper.toMap(CPCreateIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }

/**
 *
 * Retrieves the CPObjectData that results from the CorridorPlanCreateRequest call
 * @return CPObjectData resulting from udt call
 *
 */

  public CPObjectData getOutput() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
}
