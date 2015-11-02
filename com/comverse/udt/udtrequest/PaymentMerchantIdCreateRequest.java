/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdCreateRequest.java
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
 * Class used to create a PaymentMerchantIdCreateRequest Udt Request
 *
 */

public class PaymentMerchantIdCreateRequest extends PaymentMerchantIdSubRequestParent {
/**
 *
 * Constructor to create a  PaymentMerchantIdCreateRequest
 * @param id Unique request name
 * @param PaymentMerchantIdCreateIn PaymentMerchantIdObjectData for PaymentMerchantIdCreateRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantId")PaymentMerchantIdObjectData PaymentMerchantIdCreateIn) {
    super(id, "PaymentMerchantIdCreate");
    if (PaymentMerchantIdCreateIn != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(PaymentMerchantIdCreateIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdObjectData that results from the PaymentMerchantIdCreateRequest call
 * @return PaymentMerchantIdObjectData resulting from udt call
 *
 */

  public PaymentMerchantIdObjectData getOutput() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
}
