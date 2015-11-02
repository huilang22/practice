/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateCorridorUsageUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateCorridorUsageUpdateNoOpRequest extends RateCorridorUsageSubRequestParent {
/**
 *
 * Constructor to create a   RateCorridorUsageUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateCorridorUsageUpdateNoOpRequest(String id, RCUsageObjectData noOpIn) {
    super(id, "RateCorridorUsageUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(noOpIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
/**
 *
 * Retrieves the RCUsageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RCUsageObjectData getOutput() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
}
