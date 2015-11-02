/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodCreateNoOpRequest.java
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
 * NoOp class used to simulate a RatePeriodCreateNoOpRequest Udt Request/Response
 *
 */
public class RatePeriodCreateNoOpRequest extends RatePeriodSubRequestParent {
/**
 *
 * Constructor to create a   RatePeriodCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatePeriodCreateNoOpRequest(String id, RPObjectData noOpIn) {
    super(id, "RatePeriodCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RatePeriod", RPObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
/**
 *
 * Retrieves the RPObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RPObjectData getOutput() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
}
