/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitCreateNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrRateLimitCreateNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRateLimitCreateNoOpRequest extends UnitCrRateLimitSubRequestParent {
/**
 *
 * Constructor to create a   UnitCrRateLimitCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRateLimitCreateNoOpRequest(String id, UnitCrRateLimitsObjectData noOpIn) {
    super(id, "UnitCrRateLimitCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }
/**
 *
 * Retrieves the UnitCrRateLimitsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitsObjectData getOutput() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
}
