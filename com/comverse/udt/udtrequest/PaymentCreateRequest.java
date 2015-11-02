/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCreateRequest.java
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
 * Class used to create a PaymentCreateRequest Udt Request
 *
 */

public class PaymentCreateRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentCreateRequest
 * @param id Unique request name
 * @param payCreateIn1 PaymentObjectData for PaymentCreateRequest
 * @param WaiveEpg Integer for PaymentCreateRequest
 *
 */
@JsonCreator
  public PaymentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payCreateIn1, @JsonProperty("WaiveEpg")Integer WaiveEpg) {
    super(id, "PaymentCreate");
    if (payCreateIn1 != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payCreateIn1, new HashMap(), "Payment").get("Payment"));
    }
    if (WaiveEpg != null) {
      addInput("WaiveEpg", WaiveEpg);
    }
  }

/**
 *
 * Retrieves the PaymentObjectData that results from the PaymentCreateRequest call
 * @return PaymentObjectData resulting from udt call
 *
 */

  public PaymentObjectData getOutput() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
}
