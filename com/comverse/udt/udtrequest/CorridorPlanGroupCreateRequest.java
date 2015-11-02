/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupCreateRequest.java
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
 * Class used to create a CorridorPlanGroupCreateRequest Udt Request
 *
 */

public class CorridorPlanGroupCreateRequest extends CorridorPlanGroupSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanGroupCreateRequest
 * @param id Unique request name
 * @param CPGCreateIn CPGObjectData for CorridorPlanGroupCreateRequest
 *
 */
@JsonCreator
  public CorridorPlanGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanGroup")CPGObjectData CPGCreateIn) {
    super(id, "CorridorPlanGroupCreate");
    if (CPGCreateIn != null) {
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(CPGCreateIn, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }

/**
 *
 * Retrieves the CPGObjectData that results from the CorridorPlanGroupCreateRequest call
 * @return CPGObjectData resulting from udt call
 *
 */

  public CPGObjectData getOutput() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
}
