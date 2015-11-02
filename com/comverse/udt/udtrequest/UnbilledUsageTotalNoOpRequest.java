/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageTotalNoOpRequest.java
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
 * NoOp class used to simulate a UnbilledUsageTotalNoOpRequest Udt Request/Response
 *
 */
public class UnbilledUsageTotalNoOpRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a   UnbilledUsageTotalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnbilledUsageTotalNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "UnbilledUsageTotalNoOpRequest");
    if (noOpIn != null) {
      addInput("Total", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Total");
  }
}
