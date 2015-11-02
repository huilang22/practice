/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageAmountGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a UnbilledUsageAmountGetNoOpRequest Udt Request/Response
 *
 */
public class UnbilledUsageAmountGetNoOpRequest extends UnbilledUsageSubRequestParent {
/**
 *
 * Constructor to create a   UnbilledUsageAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnbilledUsageAmountGetNoOpRequest(String id, UnbilledUsageAmountObjectData noOpIn) {
    super(id, "UnbilledUsageAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UnbilledUsageAmount", UnbilledUsageAmountObjectHelper.toMap(noOpIn, new HashMap(), "UnbilledUsageAmount").get("UnbilledUsageAmount"));
    }
  }
/**
 *
 * Retrieves the UnbilledUsageAmountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageAmountObjectData getOutput() {
    return UnbilledUsageAmountObjectHelper.fromMap(outputMap, "UnbilledUsageAmount");
  }
}
