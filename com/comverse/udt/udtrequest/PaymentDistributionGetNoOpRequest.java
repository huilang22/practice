/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionGetNoOpRequest.java
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
 * NoOp class used to simulate a PaymentDistributionGetNoOpRequest Udt Request/Response
 *
 */
public class PaymentDistributionGetNoOpRequest extends PaymentDistributionSubRequestParent {
/**
 *
 * Constructor to create a   PaymentDistributionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentDistributionGetNoOpRequest(String id, PaymentDistributionObjectData noOpIn) {
    super(id, "PaymentDistributionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(noOpIn, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
/**
 *
 * Retrieves the PaymentDistributionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentDistributionObjectData getOutput() {
    return PaymentDistributionObjectHelper.fromMap(outputMap, "PaymentDistribution");
  }
}
