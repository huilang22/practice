/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceDetailAmountGetNoOpRequest Udt Request/Response
 *
 */
public class InvoiceDetailAmountGetNoOpRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a   InvoiceDetailAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceDetailAmountGetNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "InvoiceDetailAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AdjustmentEligibleAmount", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("AdjustmentEligibleAmount");
  }
}
