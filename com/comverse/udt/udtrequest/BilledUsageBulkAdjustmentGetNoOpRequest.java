/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentGetNoOpRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BilledUsageBulkAdjustmentGetNoOpRequest Udt Request/Response
 *
 */
public class BilledUsageBulkAdjustmentGetNoOpRequest extends BilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   BilledUsageBulkAdjustmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BilledUsageBulkAdjustmentGetNoOpRequest(String id, BilledUsageBulkAdjustmentGetOutputData noOpIn) {
    super(id, "BilledUsageBulkAdjustmentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BilledUsageBulkAdjustmentGetOutputData", BilledUsageBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("BilledUsageBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Retrieves the BilledUsageBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageBulkAdjustmentGetOutputData getOutput() {
    return BilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
