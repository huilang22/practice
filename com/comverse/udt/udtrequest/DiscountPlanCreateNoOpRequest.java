/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanCreateNoOpRequest.java
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
 * NoOp class used to simulate a DiscountPlanCreateNoOpRequest Udt Request/Response
 *
 */
public class DiscountPlanCreateNoOpRequest extends DiscountPlanSubRequestParent {
/**
 *
 * Constructor to create a   DiscountPlanCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountPlanCreateNoOpRequest(String id, DPObjectData noOpIn) {
    super(id, "DiscountPlanCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("DiscountPlan", DPObjectHelper.toMap(noOpIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }
/**
 *
 * Retrieves the DPObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DPObjectData getOutput() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
}
