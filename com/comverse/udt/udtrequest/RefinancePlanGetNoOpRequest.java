/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefinancePlanGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a RefinancePlanGetNoOpRequest Udt Request/Response
 *
 */
public class RefinancePlanGetNoOpRequest extends RefinancePlanSubRequestParent {
/**
 *
 * Constructor to create a   RefinancePlanGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefinancePlanGetNoOpRequest(String id, RefinancePlanObjectData noOpIn) {
    super(id, "RefinancePlanGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RefinancePlan", RefinancePlanObjectHelper.toMap(noOpIn, new HashMap(), "RefinancePlan").get("RefinancePlan"));
    }
  }
/**
 *
 * Retrieves the RefinancePlanObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RefinancePlanObjectData getOutput() {
    return RefinancePlanObjectHelper.fromMap(outputMap, "RefinancePlan");
  }
}
