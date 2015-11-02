/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BilledUsageBulkAdjustmentUpdateNoOpRequest Udt Request/Response
 *
 */
public class BilledUsageBulkAdjustmentUpdateNoOpRequest extends BilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   BilledUsageBulkAdjustmentUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BilledUsageBulkAdjustmentUpdateNoOpRequest(String id, BatchRequestObjectData noOpIn) {
    super(id, "BilledUsageBulkAdjustmentUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
/**
 *
 * Retrieves the BatchRequestObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
