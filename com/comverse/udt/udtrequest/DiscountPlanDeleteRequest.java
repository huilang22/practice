/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanDeleteRequest.java
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
 * Class used to create a DiscountPlanDeleteRequest Udt Request
 *
 */

public class DiscountPlanDeleteRequest extends DiscountPlanSubRequestParent {
/**
 *
 * Constructor to create a  DiscountPlanDeleteRequest
 * @param id Unique request name
 * @param DPDeleteIn DPObjectKeyData for DiscountPlanDeleteRequest
 *
 */
@JsonCreator
  public DiscountPlanDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountPlan")DPObjectKeyData DPDeleteIn) {
    super(id, "DiscountPlanDelete");
    if (DPDeleteIn != null) {
      addInput("DiscountPlan", DPObjectKeyHelper.toMap(DPDeleteIn, new HashMap(), "DPObjectKeyData").get("DPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DPObjectData that results from the DiscountPlanDeleteRequest call
 * @return DPObjectData resulting from udt call
 *
 */

  public DPObjectData getOutput() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
}
