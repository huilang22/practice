/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandGetNoOpRequest.java
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
 * NoOp class used to simulate a RateUsageBandGetNoOpRequest Udt Request/Response
 *
 */
public class RateUsageBandGetNoOpRequest extends RateUsageBandSubRequestParent {
/**
 *
 * Constructor to create a   RateUsageBandGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUsageBandGetNoOpRequest(String id, RateUsageBandObjectData noOpIn) {
    super(id, "RateUsageBandGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(noOpIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }
/**
 *
 * Retrieves the RateUsageBandObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageBandObjectData getOutput() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
}
