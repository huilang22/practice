/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDeleteRequest.java
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
 * Class used to create a PaymentDeleteRequest Udt Request
 *
 */

public class PaymentDeleteRequest extends PaymentRequest {
/**
 *
 * Constructor to create a  PaymentDeleteRequest
 * @param id Unique request name
 * @param payDeleteIn PaymentObjectKeyData for PaymentDeleteRequest
 *
 */
@JsonCreator
  public PaymentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectKeyData payDeleteIn) {
    super(id, "PaymentDelete");
    if (payDeleteIn != null) {
      addInput("Payment", PaymentObjectKeyHelper.toMap(payDeleteIn, new HashMap(), "PaymentObjectKeyData").get("PaymentObjectKeyData"));
    }
  }

}
