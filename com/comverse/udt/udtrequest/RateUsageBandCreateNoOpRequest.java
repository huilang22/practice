/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandCreateNoOpRequest.java
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
 * NoOp class used to simulate a RateUsageBandCreateNoOpRequest Udt Request/Response
 *
 */
public class RateUsageBandCreateNoOpRequest extends RateUsageBandSubRequestParent {
/**
 *
 * Constructor to create a   RateUsageBandCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUsageBandCreateNoOpRequest(String id, RateUsageBandObjectData noOpIn) {
    super(id, "RateUsageBandCreateNoOpRequest");
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
