/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentAmountConvertNoOpRequest.java
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
 * NoOp class used to simulate a PaymentAmountConvertNoOpRequest Udt Request/Response
 *
 */
public class PaymentAmountConvertNoOpRequest extends PaymentRequest {
/**
 *
 * Constructor to create a   PaymentAmountConvertNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentAmountConvertNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "PaymentAmountConvertNoOpRequest");
    if (noOpIn != null) {
      addInput("TransAmount", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("TransAmount");
  }
}
