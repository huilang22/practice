/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentGetNoOpRequest.java
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
 * NoOp class used to simulate a UnbilledUsageBulkAdjustmentGetNoOpRequest Udt Request/Response
 *
 */
public class UnbilledUsageBulkAdjustmentGetNoOpRequest extends UnbilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   UnbilledUsageBulkAdjustmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnbilledUsageBulkAdjustmentGetNoOpRequest(String id, UnbilledUsageBulkAdjustmentGetOutputData noOpIn) {
    super(id, "UnbilledUsageBulkAdjustmentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UnbilledUsageBulkAdjustmentGetOutputData", UnbilledUsageBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("UnbilledUsageBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Retrieves the UnbilledUsageBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageBulkAdjustmentGetOutputData getOutput() {
    return UnbilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
