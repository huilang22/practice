/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdGetNoOpRequest.java
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
 * NoOp class used to simulate a PaymentMerchantIdGetNoOpRequest Udt Request/Response
 *
 */
public class PaymentMerchantIdGetNoOpRequest extends PaymentMerchantIdSubRequestParent {
/**
 *
 * Constructor to create a   PaymentMerchantIdGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentMerchantIdGetNoOpRequest(String id, PaymentMerchantIdObjectData noOpIn) {
    super(id, "PaymentMerchantIdGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(noOpIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }
/**
 *
 * Retrieves the PaymentMerchantIdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdObjectData getOutput() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
}
