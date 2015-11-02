/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDistinctGetNoOpRequest.java
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
 * NoOp class used to simulate a RatePeriodDistinctGetNoOpRequest Udt Request/Response
 *
 */
public class RatePeriodDistinctGetNoOpRequest extends RatePeriodDistinctSubRequestParent {
/**
 *
 * Constructor to create a   RatePeriodDistinctGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RatePeriodDistinctGetNoOpRequest(String id, RatePeriodDistinctObjectData noOpIn) {
    super(id, "RatePeriodDistinctGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriodDistinct").get("RatePeriodDistinct"));
    }
  }
/**
 *
 * Retrieves the RatePeriodDistinctObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodDistinctObjectData getOutput() {
    return RatePeriodDistinctObjectHelper.fromMap(outputMap, "RatePeriodDistinct");
  }
}
