/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentUpdateRequest.java
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
 * Class used to create a PaymentUpdateRequest Udt Request
 *
 */

public class PaymentUpdateRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentUpdateRequest
 * @param id Unique request name
 * @param payUpdateIn1 PaymentObjectData for PaymentUpdateRequest
 * @param _WaiveEpg Integer for PaymentUpdateRequest
 *
 */
@JsonCreator
  public PaymentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData payUpdateIn1, @JsonProperty("WaiveEpg")Integer _WaiveEpg) {
    super(id, "PaymentUpdate");
    if (payUpdateIn1 != null) {
      addInput("Payment", PaymentObjectHelper.toMap(payUpdateIn1, new HashMap(), "Payment").get("Payment"));
    }
    if (_WaiveEpg != null) {
      addInput("WaiveEpg", _WaiveEpg);
    }
  }

/**
 *
 * Retrieves the PaymentObjectData that results from the PaymentUpdateRequest call
 * @return PaymentObjectData resulting from udt call
 *
 */

  public PaymentObjectData getOutput() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
}
