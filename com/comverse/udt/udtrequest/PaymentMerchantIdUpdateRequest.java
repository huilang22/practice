/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdUpdateRequest.java
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
 * Class used to create a PaymentMerchantIdUpdateRequest Udt Request
 *
 */

public class PaymentMerchantIdUpdateRequest extends PaymentMerchantIdSubRequestParent {
/**
 *
 * Constructor to create a  PaymentMerchantIdUpdateRequest
 * @param id Unique request name
 * @param PaymentMerchantIdUpdateIn PaymentMerchantIdObjectData for PaymentMerchantIdUpdateRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantId")PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn) {
    super(id, "PaymentMerchantIdUpdate");
    if (PaymentMerchantIdUpdateIn != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(PaymentMerchantIdUpdateIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdObjectData that results from the PaymentMerchantIdUpdateRequest call
 * @return PaymentMerchantIdObjectData resulting from udt call
 *
 */

  public PaymentMerchantIdObjectData getOutput() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
}
