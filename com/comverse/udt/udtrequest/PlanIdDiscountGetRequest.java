/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountGetRequest.java
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
 * Class used to create a PlanIdDiscountGetRequest Udt Request
 *
 */

public class PlanIdDiscountGetRequest extends PlanIdDiscountSubRequestParent {
/**
 *
 * Constructor to create a  PlanIdDiscountGetRequest
 * @param id Unique request name
 * @param PIDGetIn PIDObjectKeyData for PlanIdDiscountGetRequest
 *
 */
@JsonCreator
  public PlanIdDiscountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdDiscount")PIDObjectKeyData PIDGetIn) {
    super(id, "PlanIdDiscountGet");
    if (PIDGetIn != null) {
      addInput("PlanIdDiscount", PIDObjectKeyHelper.toMap(PIDGetIn, new HashMap(), "PIDObjectKeyData").get("PIDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PIDObjectData that results from the PlanIdDiscountGetRequest call
 * @return PIDObjectData resulting from udt call
 *
 */

  public PIDObjectData getOutput() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
}
