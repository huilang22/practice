/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignGetRequest.java
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
 * Class used to create a PaymentMerchantIdAssignGetRequest Udt Request
 *
 */

public class PaymentMerchantIdAssignGetRequest extends PaymentMerchantIdAssignSubRequestParent {
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignGetRequest
 * @param id Unique request name
 * @param PaymentMerchantIdAssigngetIn PaymentMerchantIdAssignObjectKeyData for PaymentMerchantIdAssignGetRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdAssignGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantIdAssign")PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn) {
    super(id, "PaymentMerchantIdAssignGet");
    if (PaymentMerchantIdAssigngetIn != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectKeyHelper.toMap(PaymentMerchantIdAssigngetIn, new HashMap(), "PaymentMerchantIdAssignObjectKeyData").get("PaymentMerchantIdAssignObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdAssignObjectData that results from the PaymentMerchantIdAssignGetRequest call
 * @return PaymentMerchantIdAssignObjectData resulting from udt call
 *
 */

  public PaymentMerchantIdAssignObjectData getOutput() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
}
