/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCreatePendingRequest.java
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
 * Class used to create a PaymentCreatePendingRequest Udt Request
 *
 */

public class PaymentCreatePendingRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentCreatePendingRequest
 * @param id Unique request name
 * @param paypendingCreateIn1 PaymentObjectData for PaymentCreatePendingRequest
 *
 */
@JsonCreator
  public PaymentCreatePendingRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectData paypendingCreateIn1) {
    super(id, "PaymentCreatePending");
    if (paypendingCreateIn1 != null) {
      addInput("Payment", PaymentObjectHelper.toMap(paypendingCreateIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectData that results from the PaymentCreatePendingRequest call
 * @return PaymentTransObjectData resulting from udt call
 *
 */

  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
