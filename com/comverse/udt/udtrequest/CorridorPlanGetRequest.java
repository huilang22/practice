/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGetRequest.java
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
 * Class used to create a CorridorPlanGetRequest Udt Request
 *
 */

public class CorridorPlanGetRequest extends CorridorPlanSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanGetRequest
 * @param id Unique request name
 * @param CPGetIn CPObjectKeyData for CorridorPlanGetRequest
 *
 */
@JsonCreator
  public CorridorPlanGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlan")CPObjectKeyData CPGetIn) {
    super(id, "CorridorPlanGet");
    if (CPGetIn != null) {
      addInput("CorridorPlan", CPObjectKeyHelper.toMap(CPGetIn, new HashMap(), "CPObjectKeyData").get("CPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CPObjectData that results from the CorridorPlanGetRequest call
 * @return CPObjectData resulting from udt call
 *
 */

  public CPObjectData getOutput() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
}
