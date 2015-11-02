/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignUpdateRequest.java
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
 * Class used to create a PaymentMerchantIdAssignUpdateRequest Udt Request
 *
 */

public class PaymentMerchantIdAssignUpdateRequest extends PaymentMerchantIdAssignSubRequestParent {
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignUpdateRequest
 * @param id Unique request name
 * @param PaymentMerchantIdAssignUpdateIn PaymentMerchantIdAssignObjectData for PaymentMerchantIdAssignUpdateRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdAssignUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantIdAssign")PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn) {
    super(id, "PaymentMerchantIdAssignUpdate");
    if (PaymentMerchantIdAssignUpdateIn != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(PaymentMerchantIdAssignUpdateIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdAssignObjectData that results from the PaymentMerchantIdAssignUpdateRequest call
 * @return PaymentMerchantIdAssignObjectData resulting from udt call
 *
 */

  public PaymentMerchantIdAssignObjectData getOutput() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
}
