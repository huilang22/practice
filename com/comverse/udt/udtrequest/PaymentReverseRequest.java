/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentReverseRequest.java
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
 * Class used to create a PaymentReverseRequest Udt Request
 *
 */

public class PaymentReverseRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentReverseRequest
 * @param id Unique request name
 * @param payReverseIn PaymentObjectData for PaymentReverseRequest
 *
 */
@JsonCreator
  public PaymentReverseRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payReverseIn) {
    super(id, "PaymentReverse");
    if (payReverseIn != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payReverseIn, new HashMap(), "Payment").get("Payment"));
    }
  }

/**
 *
 * Retrieves the PaymentObjectData that results from the PaymentReverseRequest call
 * @return PaymentObjectData resulting from udt call
 *
 */

  public PaymentObjectData getOutput() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
}
