/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdGetRequest.java
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
 * Class used to create a CorridorPlanIdGetRequest Udt Request
 *
 */

public class CorridorPlanIdGetRequest extends CorridorPlanIdSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanIdGetRequest
 * @param id Unique request name
 * @param CPIGetIn CPIObjectKeyData for CorridorPlanIdGetRequest
 *
 */
@JsonCreator
  public CorridorPlanIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanId")CPIObjectKeyData CPIGetIn) {
    super(id, "CorridorPlanIdGet");
    if (CPIGetIn != null) {
      addInput("CorridorPlanId", CPIObjectKeyHelper.toMap(CPIGetIn, new HashMap(), "CPIObjectKeyData").get("CPIObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CPIObjectData that results from the CorridorPlanIdGetRequest call
 * @return CPIObjectData resulting from udt call
 *
 */

  public CPIObjectData getOutput() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
}
