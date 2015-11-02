/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupDeleteRequest.java
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
 * Class used to create a CorridorPlanGroupDeleteRequest Udt Request
 *
 */

public class CorridorPlanGroupDeleteRequest extends CorridorPlanGroupSubRequestParent {
/**
 *
 * Constructor to create a  CorridorPlanGroupDeleteRequest
 * @param id Unique request name
 * @param CPGDeleteIn CPGObjectKeyData for CorridorPlanGroupDeleteRequest
 *
 */
@JsonCreator
  public CorridorPlanGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanGroup")CPGObjectKeyData CPGDeleteIn) {
    super(id, "CorridorPlanGroupDelete");
    if (CPGDeleteIn != null) {
      addInput("CorridorPlanGroup", CPGObjectKeyHelper.toMap(CPGDeleteIn, new HashMap(), "CPGObjectKeyData").get("CPGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CPGObjectData that results from the CorridorPlanGroupDeleteRequest call
 * @return CPGObjectData resulting from udt call
 *
 */

  public CPGObjectData getOutput() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
}
