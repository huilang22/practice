/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileUpdateNoOpRequest.java
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
 * NoOp class used to simulate a PaymentProfileUpdateNoOpRequest Udt Request/Response
 *
 */
public class PaymentProfileUpdateNoOpRequest extends PaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a   PaymentProfileUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentProfileUpdateNoOpRequest(String id, PaymentProfileObjectData noOpIn) {
    super(id, "PaymentProfileUpdateNoOpRequest");
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
