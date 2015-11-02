/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentGetRequest.java
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
 * Class used to create a PaymentGetRequest Udt Request
 *
 */

public class PaymentGetRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentGetRequest
 * @param id Unique request name
 * @param getIn PaymentObjectKeyData for PaymentGetRequest
 *
 */
@JsonCreator
  public PaymentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectKeyData getIn) {
    super(id, "PaymentGet");
    if (getIn != null) {
      addInput("Payment", PaymentObjectKeyHelper.toMap(getIn, new HashMap(), "PaymentObjectKeyData").get("PaymentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentObjectData that results from the PaymentGetRequest call
 * @return PaymentObjectData resulting from udt call
 *
 */

  public PaymentObjectData getOutput() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
}
