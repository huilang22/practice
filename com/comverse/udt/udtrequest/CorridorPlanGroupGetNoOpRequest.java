/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a CorridorPlanGroupGetNoOpRequest Udt Request/Response
 *
 */
public class CorridorPlanGroupGetNoOpRequest extends CorridorPlanGroupSubRequestParent {
/**
 *
 * Constructor to create a   CorridorPlanGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorPlanGroupGetNoOpRequest(String id, CPGObjectData noOpIn) {
    super(id, "CorridorPlanGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(noOpIn, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }
/**
 *
 * Retrieves the CPGObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CPGObjectData getOutput() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
}
