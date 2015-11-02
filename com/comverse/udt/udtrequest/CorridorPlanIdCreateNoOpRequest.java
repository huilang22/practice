/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdCreateNoOpRequest.java
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
 * NoOp class used to simulate a CorridorPlanIdCreateNoOpRequest Udt Request/Response
 *
 */
public class CorridorPlanIdCreateNoOpRequest extends CorridorPlanIdSubRequestParent {
/**
 *
 * Constructor to create a   CorridorPlanIdCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorPlanIdCreateNoOpRequest(String id, CPIObjectData noOpIn) {
    super(id, "CorridorPlanIdCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CorridorPlanId", CPIObjectHelper.toMap(noOpIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }
/**
 *
 * Retrieves the CPIObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CPIObjectData getOutput() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
}
