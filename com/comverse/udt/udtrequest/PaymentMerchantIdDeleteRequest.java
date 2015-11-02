/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdDeleteRequest.java
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
 * Class used to create a PaymentMerchantIdDeleteRequest Udt Request
 *
 */

public class PaymentMerchantIdDeleteRequest extends PaymentMerchantIdSubRequestParent {
/**
 *
 * Constructor to create a  PaymentMerchantIdDeleteRequest
 * @param id Unique request name
 * @param PaymentMerchantIdDeleteIn PaymentMerchantIdObjectKeyData for PaymentMerchantIdDeleteRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantId")PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn) {
    super(id, "PaymentMerchantIdDelete");
    if (PaymentMerchantIdDeleteIn != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectKeyHelper.toMap(PaymentMerchantIdDeleteIn, new HashMap(), "PaymentMerchantIdObjectKeyData").get("PaymentMerchantIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdObjectData that results from the PaymentMerchantIdDeleteRequest call
 * @return PaymentMerchantIdObjectData resulting from udt call
 *
 */

  public PaymentMerchantIdObjectData getOutput() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
}
