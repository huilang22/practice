/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCreditRequest.java
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
 * Class used to create a PaymentCreditRequest Udt Request
 *
 */

public class PaymentCreditRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentCreditRequest
 * @param id Unique request name
 * @param payCreditIn1 PaymentObjectData for PaymentCreditRequest
 * @param _payment_Trans PaymentTransObjectData for PaymentCreditRequest
 *
 */
@JsonCreator
  public PaymentCreditRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payCreditIn1, @JsonProperty("PaymentTrans")PaymentTransObjectData _payment_Trans) {
    super(id, "PaymentCredit");
    if (payCreditIn1 != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payCreditIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
    if (_payment_Trans != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(_payment_Trans, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectData that results from the PaymentCreditRequest call
 * @return PaymentTransObjectData resulting from udt call
 *
 */

  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
