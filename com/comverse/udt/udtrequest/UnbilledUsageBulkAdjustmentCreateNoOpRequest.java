/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentCreateNoOpRequest.java
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
 * NoOp class used to simulate a UnbilledUsageBulkAdjustmentCreateNoOpRequest Udt Request/Response
 *
 */
public class UnbilledUsageBulkAdjustmentCreateNoOpRequest extends UnbilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   UnbilledUsageBulkAdjustmentCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnbilledUsageBulkAdjustmentCreateNoOpRequest(String id, BatchRequestObjectData noOpIn) {
    super(id, "UnbilledUsageBulkAdjustmentCreateNoOpRequest");
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
