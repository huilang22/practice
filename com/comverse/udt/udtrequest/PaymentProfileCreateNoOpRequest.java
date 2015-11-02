/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileCreateNoOpRequest.java
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
 * NoOp class used to simulate a PaymentProfileCreateNoOpRequest Udt Request/Response
 *
 */
public class PaymentProfileCreateNoOpRequest extends PaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a   PaymentProfileCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentProfileCreateNoOpRequest(String id, PaymentProfileObjectData noOpIn) {
    super(id, "PaymentProfileCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(noOpIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
/**
 *
 * Retrieves the PaymentProfileObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentProfileObjectData getOutput() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
}
