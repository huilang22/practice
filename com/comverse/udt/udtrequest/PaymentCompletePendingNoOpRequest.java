/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCompletePendingNoOpRequest.java
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
 * NoOp class used to simulate a PaymentCompletePendingNoOpRequest Udt Request/Response
 *
 */
public class PaymentCompletePendingNoOpRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a   PaymentCompletePendingNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentCompletePendingNoOpRequest(String id, PaymentObjectData noOpIn) {
    super(id, "PaymentCompletePendingNoOpRequest");
    if (noOpIn != null) {
      addInput("Payment", PaymentObjectHelper.toMap(noOpIn, new HashMap(), "Payment").get("Payment"));
    }
  }
/**
 *
 * Retrieves the PaymentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentObjectData getOutput() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
}
