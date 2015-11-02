/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageGetNoOpRequest.java
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
 * NoOp class used to simulate a RateCorridorUsageGetNoOpRequest Udt Request/Response
 *
 */
public class RateCorridorUsageGetNoOpRequest extends RateCorridorUsageSubRequestParent {
/**
 *
 * Constructor to create a   RateCorridorUsageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateCorridorUsageGetNoOpRequest(String id, RCUsageObjectData noOpIn) {
    super(id, "RateCorridorUsageGetNoOpRequest");
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
