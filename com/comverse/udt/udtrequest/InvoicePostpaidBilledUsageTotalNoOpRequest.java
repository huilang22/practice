/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidBilledUsageTotalNoOpRequest.java
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
 * NoOp class used to simulate a InvoicePostpaidBilledUsageTotalNoOpRequest Udt Request/Response
 *
 */
public class InvoicePostpaidBilledUsageTotalNoOpRequest extends InvoiceRequest {
/**
 *
 * Constructor to create a   InvoicePostpaidBilledUsageTotalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoicePostpaidBilledUsageTotalNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "InvoicePostpaidBilledUsageTotalNoOpRequest");
    if (noOpIn != null) {
      addInput("TotalPostpaidBilledUsage", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("TotalPostpaidBilledUsage");
  }
}
