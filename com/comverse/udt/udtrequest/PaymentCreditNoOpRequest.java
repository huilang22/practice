/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCreditNoOpRequest.java
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
 * NoOp class used to simulate a PaymentCreditNoOpRequest Udt Request/Response
 *
 */
public class PaymentCreditNoOpRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a   PaymentCreditNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentCreditNoOpRequest(String id, PaymentTransObjectData noOpIn) {
    super(id, "PaymentCreditNoOpRequest");
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
