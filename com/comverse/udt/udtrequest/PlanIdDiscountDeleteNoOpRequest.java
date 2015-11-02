/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountDeleteNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a PlanIdDiscountDeleteNoOpRequest Udt Request/Response
 *
 */
public class PlanIdDiscountDeleteNoOpRequest extends PlanIdDiscountSubRequestParent {
/**
 *
 * Constructor to create a   PlanIdDiscountDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PlanIdDiscountDeleteNoOpRequest(String id, PIDObjectData noOpIn) {
    super(id, "PlanIdDiscountDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(noOpIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }
/**
 *
 * Retrieves the PIDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PIDObjectData getOutput() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
}
