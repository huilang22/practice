/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RbrTimePeriodUpdateNoOpRequest Udt Request/Response
 *
 */
public class RbrTimePeriodUpdateNoOpRequest extends RbrTimePeriodSubRequestParent {
/**
 *
 * Constructor to create a   RbrTimePeriodUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrTimePeriodUpdateNoOpRequest(String id, RbrTimePeriodObjectData noOpIn) {
    super(id, "RbrTimePeriodUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(noOpIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }
/**
 *
 * Retrieves the RbrTimePeriodObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTimePeriodObjectData getOutput() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
}
