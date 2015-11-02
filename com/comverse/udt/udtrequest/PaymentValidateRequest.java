/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentValidateRequest.java
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
 * Class used to create a PaymentValidateRequest Udt Request
 *
 */

public class PaymentValidateRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentValidateRequest
 * @param id Unique request name
 * @param payValidateIn1 PaymentObjectData for PaymentValidateRequest
 *
 */
@JsonCreator
  public PaymentValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payValidateIn1) {
    super(id, "PaymentValidate");
    if (payValidateIn1 != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payValidateIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectData that results from the PaymentValidateRequest call
 * @return PaymentTransObjectData resulting from udt call
 *
 */

  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
