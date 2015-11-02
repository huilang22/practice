/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountUpdateRequest.java
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
 * Class used to create a PlanIdDiscountUpdateRequest Udt Request
 *
 */

public class PlanIdDiscountUpdateRequest extends PlanIdDiscountSubRequestParent {
/**
 *
 * Constructor to create a  PlanIdDiscountUpdateRequest
 * @param id Unique request name
 * @param PIDUpdateIn PIDObjectData for PlanIdDiscountUpdateRequest
 *
 */
@JsonCreator
  public PlanIdDiscountUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdDiscount")PIDObjectData PIDUpdateIn) {
    super(id, "PlanIdDiscountUpdate");
    if (PIDUpdateIn != null) {
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(PIDUpdateIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }

/**
 *
 * Retrieves the PIDObjectData that results from the PlanIdDiscountUpdateRequest call
 * @return PIDObjectData resulting from udt call
 *
 */

  public PIDObjectData getOutput() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
}
