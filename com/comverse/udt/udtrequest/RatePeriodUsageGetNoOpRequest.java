/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageGetNoOpRequest.java
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
 * NoOp class used to simulate a RatePeriodUsageGetNoOpRequest Udt Request/Response
 *
 */
public class RatePeriodUsageGetNoOpRequest extends RatePeriodUsageSubRequestParent {
/**
 *
 * Constructor to create a   RatePeriodUsageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatePeriodUsageGetNoOpRequest(String id, RatePeriodUsagesObjectData noOpIn) {
    super(id, "RatePeriodUsageGetNoOpRequest");
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
