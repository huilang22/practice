/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanGetNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrPlanGetNoOpRequest Udt Request/Response
 *
 */
public class UnitCrPlanGetNoOpRequest extends UnitCrPlanSubRequestParent {
/**
 *
 * Constructor to create a   UnitCrPlanGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrPlanGetNoOpRequest(String id, UnitCrPlanObjectData noOpIn) {
    super(id, "UnitCrPlanGetNoOpRequest");
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
