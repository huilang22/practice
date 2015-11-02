/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountCreateRequest.java
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
 * Class used to create a PlanIdDiscountCreateRequest Udt Request
 *
 */

public class PlanIdDiscountCreateRequest extends PlanIdDiscountSubRequestParent {
/**
 *
 * Constructor to create a  PlanIdDiscountCreateRequest
 * @param id Unique request name
 * @param PIDCreateIn PIDObjectData for PlanIdDiscountCreateRequest
 *
 */
@JsonCreator
  public PlanIdDiscountCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdDiscount")PIDObjectData PIDCreateIn) {
    super(id, "PlanIdDiscountCreate");
    if (PIDCreateIn != null) {
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(PIDCreateIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }

/**
 *
 * Retrieves the PIDObjectData that results from the PlanIdDiscountCreateRequest call
 * @return PIDObjectData resulting from udt call
 *
 */

  public PIDObjectData getOutput() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
}
