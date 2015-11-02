/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrTimePeriodCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrTimePeriodCreateNoOpRequest extends RbrTimePeriodSubRequestParent {
/**
 *
 * Constructor to create a   RbrTimePeriodCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrTimePeriodCreateNoOpRequest(String id, RbrTimePeriodObjectData noOpIn) {
    super(id, "RbrTimePeriodCreateNoOpRequest");
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
