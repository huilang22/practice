/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDebitAssumedRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PaymentDebitAssumedRequest Udt Request
 *
 */

public class PaymentDebitAssumedRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentDebitAssumedRequest
 * @param id Unique request name
 * @param payDebitAssumedIn1 PaymentObjectData for PaymentDebitAssumedRequest
 *
 */
@JsonCreator
  public PaymentDebitAssumedRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payDebitAssumedIn1) {
    super(id, "PaymentDebitAssumed");
    if (payDebitAssumedIn1 != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payDebitAssumedIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectData that results from the PaymentDebitAssumedRequest call
 * @return PaymentTransObjectData resulting from udt call
 *
 */

  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
