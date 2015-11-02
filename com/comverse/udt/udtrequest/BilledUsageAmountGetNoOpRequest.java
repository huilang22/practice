/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a BilledUsageAmountGetNoOpRequest Udt Request/Response
 *
 */
public class BilledUsageAmountGetNoOpRequest extends BilledUsageSubRequestParent {
/**
 *
 * Constructor to create a   BilledUsageAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BilledUsageAmountGetNoOpRequest(String id, BilledUsageAmountObjectData noOpIn) {
    super(id, "BilledUsageAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BilledUsageAmount", BilledUsageAmountObjectHelper.toMap(noOpIn, new HashMap(), "BilledUsageAmount").get("BilledUsageAmount"));
    }
  }
/**
 *
 * Retrieves the BilledUsageAmountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageAmountObjectData getOutput() {
    return BilledUsageAmountObjectHelper.fromMap(outputMap, "BilledUsageAmount");
  }
}
