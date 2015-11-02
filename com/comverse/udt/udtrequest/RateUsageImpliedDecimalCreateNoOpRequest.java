/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalCreateNoOpRequest.java
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
 * NoOp class used to simulate a RateUsageImpliedDecimalCreateNoOpRequest Udt Request/Response
 *
 */
public class RateUsageImpliedDecimalCreateNoOpRequest extends RateUsageImpliedDecimalSubRequestParent {
/**
 *
 * Constructor to create a   RateUsageImpliedDecimalCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUsageImpliedDecimalCreateNoOpRequest(String id, RateUsageImpliedDecimalObjectData noOpIn) {
    super(id, "RateUsageImpliedDecimalCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(noOpIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }
/**
 *
 * Retrieves the RateUsageImpliedDecimalObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageImpliedDecimalObjectData getOutput() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
}
