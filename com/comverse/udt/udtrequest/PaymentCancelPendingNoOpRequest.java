/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCancelPendingNoOpRequest.java
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
 * NoOp class used to simulate a PaymentCancelPendingNoOpRequest Udt Request/Response
 *
 */
public class PaymentCancelPendingNoOpRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a   PaymentCancelPendingNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentCancelPendingNoOpRequest(String id, PaymentTransObjectData noOpIn) {
    super(id, "PaymentCancelPendingNoOpRequest");
    if (noOpIn != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(noOpIn, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }
/**
 *
 * Retrieves the PaymentTransObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
