/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdCreateRequest.java
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
 * Class used to create a CorridorPlanIdCreateRequest Udt Request
 *
 */

public class CorridorPlanIdCreateRequest extends CorridorPlanIdSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanIdCreateRequest
 * @param id Unique request name
 * @param CPICrIn CPIObjectData for CorridorPlanIdCreateRequest
 *
 */
@JsonCreator
  public CorridorPlanIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanId")CPIObjectData CPICrIn) {
    super(id, "CorridorPlanIdCreate");
    if (CPICrIn != null) {
      addInput("CorridorPlanId", CPIObjectHelper.toMap(CPICrIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }

/**
 *
 * Retrieves the CPIObjectData that results from the CorridorPlanIdCreateRequest call
 * @return CPIObjectData resulting from udt call
 *
 */

  public CPIObjectData getOutput() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
}
