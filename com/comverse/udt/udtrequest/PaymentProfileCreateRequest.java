/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileCreateRequest.java
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
 * Class used to create a PaymentProfileCreateRequest Udt Request
 *
 */

public class PaymentProfileCreateRequest extends PaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a  PaymentProfileCreateRequest
 * @param id Unique request name
 * @param ppcIn PaymentProfileObjectData for PaymentProfileCreateRequest
 * @param payment_protocol Integer for PaymentProfileCreateRequest
 *
 */
@JsonCreator
  public PaymentProfileCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentProfile")PaymentProfileObjectData ppcIn, @JsonProperty("PaymentProtocol")Integer payment_protocol) {
    super(id, "PaymentProfileCreate");
    if (ppcIn != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(ppcIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
    if (payment_protocol != null) {
      addInput("PaymentProtocol", payment_protocol);
    }
  }

/**
 *
 * Retrieves the PaymentProfileObjectData that results from the PaymentProfileCreateRequest call
 * @return PaymentProfileObjectData resulting from udt call
 *
 */

  public PaymentProfileObjectData getOutput() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
}
