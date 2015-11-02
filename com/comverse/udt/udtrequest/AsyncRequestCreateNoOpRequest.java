/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AsyncRequestCreateNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a AsyncRequestCreateNoOpRequest Udt Request/Response
 *
 */
public class AsyncRequestCreateNoOpRequest extends AsyncRequestRequest {
/**
 *
 * Constructor to create a   AsyncRequestCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AsyncRequestCreateNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "AsyncRequestCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchId", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("BatchId");
  }
}
