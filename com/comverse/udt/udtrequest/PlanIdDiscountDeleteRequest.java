/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountDeleteRequest.java
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
 * Class used to create a PlanIdDiscountDeleteRequest Udt Request
 *
 */

public class PlanIdDiscountDeleteRequest extends PlanIdDiscountSubRequestParent {
/**
 *
 * Constructor to create a  PlanIdDiscountDeleteRequest
 * @param id Unique request name
 * @param PIDDeleteIn PIDObjectKeyData for PlanIdDiscountDeleteRequest
 *
 */
@JsonCreator
  public PlanIdDiscountDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdDiscount")PIDObjectKeyData PIDDeleteIn) {
    super(id, "PlanIdDiscountDelete");
    if (PIDDeleteIn != null) {
      addInput("PlanIdDiscount", PIDObjectKeyHelper.toMap(PIDDeleteIn, new HashMap(), "PIDObjectKeyData").get("PIDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PIDObjectData that results from the PlanIdDiscountDeleteRequest call
 * @return PIDObjectData resulting from udt call
 *
 */

  public PIDObjectData getOutput() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
}
