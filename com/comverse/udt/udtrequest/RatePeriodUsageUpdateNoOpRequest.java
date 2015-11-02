/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RatePeriodUsageUpdateNoOpRequest Udt Request/Response
 *
 */
public class RatePeriodUsageUpdateNoOpRequest extends RatePeriodUsageSubRequestParent {
/**
 *
 * Constructor to create a   RatePeriodUsageUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatePeriodUsageUpdateNoOpRequest(String id, RatePeriodUsagesObjectData noOpIn) {
    super(id, "RatePeriodUsageUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
/**
 *
 * Retrieves the RatePeriodUsagesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodUsagesObjectData getOutput() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
}
