/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentReverseNoOpRequest.java
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
 * NoOp class used to simulate a PaymentReverseNoOpRequest Udt Request/Response
 *
 */
public class PaymentReverseNoOpRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a   PaymentReverseNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentReverseNoOpRequest(String id, PaymentObjectData noOpIn) {
    super(id, "PaymentReverseNoOpRequest");
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
