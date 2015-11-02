/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanCreateRequest.java
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
 * Class used to create a DiscountPlanCreateRequest Udt Request
 *
 */

public class DiscountPlanCreateRequest extends DiscountPlanSubRequestParent {
/**
 *
 * Constructor to create a  DiscountPlanCreateRequest
 * @param id Unique request name
 * @param DPCreateIn DPObjectData for DiscountPlanCreateRequest
 *
 */
@JsonCreator
  public DiscountPlanCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountPlan")DPObjectData DPCreateIn) {
    super(id, "DiscountPlanCreate");
    if (DPCreateIn != null) {
      addInput("DiscountPlan", DPObjectHelper.toMap(DPCreateIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }

/**
 *
 * Retrieves the DPObjectData that results from the DiscountPlanCreateRequest call
 * @return DPObjectData resulting from udt call
 *
 */

  public DPObjectData getOutput() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
}
