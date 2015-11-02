/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateUsageUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateUsageUpdateNoOpRequest extends RateUsageSubRequestParent {
/**
 *
 * Constructor to create a   RateUsageUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUsageUpdateNoOpRequest(String id, RateUsageObjectData noOpIn) {
    super(id, "RateUsageUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(noOpIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
/**
 *
 * Retrieves the RateUsageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageObjectData getOutput() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
}
