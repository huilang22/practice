/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindSummaryCountNoOpRequest.java
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
 * NoOp class used to simulate a UnbilledUsageFindSummaryCountNoOpRequest Udt Request/Response
 *
 */
public class UnbilledUsageFindSummaryCountNoOpRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a   UnbilledUsageFindSummaryCountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnbilledUsageFindSummaryCountNoOpRequest(String id, Integer noOpIn) {
    super(id, "UnbilledUsageFindSummaryCountNoOpRequest");
    if (noOpIn != null) {
      addInput("TotalCount", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
