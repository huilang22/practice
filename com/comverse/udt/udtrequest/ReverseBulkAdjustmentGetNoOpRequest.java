/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ReverseBulkAdjustmentGetNoOpRequest.java
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
 * NoOp class used to simulate a ReverseBulkAdjustmentGetNoOpRequest Udt Request/Response
 *
 */
public class ReverseBulkAdjustmentGetNoOpRequest extends ReverseBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   ReverseBulkAdjustmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ReverseBulkAdjustmentGetNoOpRequest(String id, ReverseBulkAdjustmentGetOutputData noOpIn) {
    super(id, "ReverseBulkAdjustmentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ReverseBulkAdjustmentGetOutputData", ReverseBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("ReverseBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Retrieves the ReverseBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ReverseBulkAdjustmentGetOutputData getOutput() {
    return ReverseBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
