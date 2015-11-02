/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a BalanceLineItemAmountGetNoOpRequest Udt Request/Response
 *
 */
public class BalanceLineItemAmountGetNoOpRequest extends BalanceLineItemRequest {
/**
 *
 * Constructor to create a   BalanceLineItemAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceLineItemAmountGetNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "BalanceLineItemAmountGetNoOpRequest");
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
