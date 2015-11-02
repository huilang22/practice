/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CorridorPlanGroupDeleteNoOpRequest Udt Request/Response
 *
 */
public class CorridorPlanGroupDeleteNoOpRequest extends CorridorPlanGroupSubRequestParent {
/**
 *
 * Constructor to create a   CorridorPlanGroupDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorPlanGroupDeleteNoOpRequest(String id, CPGObjectData noOpIn) {
    super(id, "CorridorPlanGroupDeleteNoOpRequest");
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
