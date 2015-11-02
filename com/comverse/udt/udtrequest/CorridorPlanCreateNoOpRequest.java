/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanCreateNoOpRequest.java
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
 * NoOp class used to simulate a CorridorPlanCreateNoOpRequest Udt Request/Response
 *
 */
public class CorridorPlanCreateNoOpRequest extends CorridorPlanSubRequestParent {
/**
 *
 * Constructor to create a   CorridorPlanCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorPlanCreateNoOpRequest(String id, CPObjectData noOpIn) {
    super(id, "CorridorPlanCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CorridorPlan", CPObjectHelper.toMap(noOpIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }
/**
 *
 * Retrieves the CPObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CPObjectData getOutput() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
}
