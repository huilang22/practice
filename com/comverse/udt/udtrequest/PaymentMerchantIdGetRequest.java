/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdGetRequest.java
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
 * Class used to create a PaymentMerchantIdGetRequest Udt Request
 *
 */

public class PaymentMerchantIdGetRequest extends PaymentMerchantIdSubRequestParent {
/**
 *
 * Constructor to create a  PaymentMerchantIdGetRequest
 * @param id Unique request name
 * @param PaymentMerchantIdgetIn PaymentMerchantIdObjectKeyData for PaymentMerchantIdGetRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantId")PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn) {
    super(id, "PaymentMerchantIdGet");
    if (PaymentMerchantIdgetIn != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectKeyHelper.toMap(PaymentMerchantIdgetIn, new HashMap(), "PaymentMerchantIdObjectKeyData").get("PaymentMerchantIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdObjectData that results from the PaymentMerchantIdGetRequest call
 * @return PaymentMerchantIdObjectData resulting from udt call
 *
 */

  public PaymentMerchantIdObjectData getOutput() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
}
