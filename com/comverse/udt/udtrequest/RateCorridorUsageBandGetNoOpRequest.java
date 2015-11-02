/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandGetNoOpRequest.java
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
 * NoOp class used to simulate a RateCorridorUsageBandGetNoOpRequest Udt Request/Response
 *
 */
public class RateCorridorUsageBandGetNoOpRequest extends RateCorridorUsageBandSubRequestParent {
/**
 *
 * Constructor to create a   RateCorridorUsageBandGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateCorridorUsageBandGetNoOpRequest(String id, RUBOverrideObjectData noOpIn) {
    super(id, "RateCorridorUsageBandGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(noOpIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }
/**
 *
 * Retrieves the RUBOverrideObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RUBOverrideObjectData getOutput() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
}
