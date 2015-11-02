/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupGetRequest.java
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
 * Class used to create a CorridorPlanGroupGetRequest Udt Request
 *
 */

public class CorridorPlanGroupGetRequest extends CorridorPlanGroupSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanGroupGetRequest
 * @param id Unique request name
 * @param CPGGetIn CPGObjectKeyData for CorridorPlanGroupGetRequest
 *
 */
@JsonCreator
  public CorridorPlanGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanGroup")CPGObjectKeyData CPGGetIn) {
    super(id, "CorridorPlanGroupGet");
    if (CPGGetIn != null) {
      addInput("CorridorPlanGroup", CPGObjectKeyHelper.toMap(CPGGetIn, new HashMap(), "CPGObjectKeyData").get("CPGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CPGObjectData that results from the CorridorPlanGroupGetRequest call
 * @return CPGObjectData resulting from udt call
 *
 */

  public CPGObjectData getOutput() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
}
