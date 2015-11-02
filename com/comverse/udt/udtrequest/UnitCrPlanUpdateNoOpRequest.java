/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrPlanUpdateNoOpRequest Udt Request/Response
 *
 */
public class UnitCrPlanUpdateNoOpRequest extends UnitCrPlanSubRequestParent {
/**
 *
 * Constructor to create a   UnitCrPlanUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrPlanUpdateNoOpRequest(String id, UnitCrPlanObjectData noOpIn) {
    super(id, "UnitCrPlanUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }
/**
 *
 * Retrieves the UnitCrPlanObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrPlanObjectData getOutput() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
}
