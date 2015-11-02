/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdUpdateRequest.java
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
 * Class used to create a CorridorPlanIdUpdateRequest Udt Request
 *
 */

public class CorridorPlanIdUpdateRequest extends CorridorPlanIdSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanIdUpdateRequest
 * @param id Unique request name
 * @param CPIUpdIn CPIObjectData for CorridorPlanIdUpdateRequest
 *
 */
@JsonCreator
  public CorridorPlanIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanId")CPIObjectData CPIUpdIn) {
    super(id, "CorridorPlanIdUpdate");
    if (CPIUpdIn != null) {
      addInput("CorridorPlanId", CPIObjectHelper.toMap(CPIUpdIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }

/**
 *
 * Retrieves the CPIObjectData that results from the CorridorPlanIdUpdateRequest call
 * @return CPIObjectData resulting from udt call
 *
 */

  public CPIObjectData getOutput() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
}
