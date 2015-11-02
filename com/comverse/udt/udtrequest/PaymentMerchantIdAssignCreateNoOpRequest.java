/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignCreateNoOpRequest.java
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
 * NoOp class used to simulate a PaymentMerchantIdAssignCreateNoOpRequest Udt Request/Response
 *
 */
public class PaymentMerchantIdAssignCreateNoOpRequest extends PaymentMerchantIdAssignSubRequestParent {
/**
 *
 * Constructor to create a   PaymentMerchantIdAssignCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentMerchantIdAssignCreateNoOpRequest(String id, PaymentMerchantIdAssignObjectData noOpIn) {
    super(id, "PaymentMerchantIdAssignCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(noOpIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }
/**
 *
 * Retrieves the PaymentMerchantIdAssignObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdAssignObjectData getOutput() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
}
