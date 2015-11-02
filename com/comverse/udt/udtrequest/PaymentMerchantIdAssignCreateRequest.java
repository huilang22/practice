/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignCreateRequest.java
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
 * Class used to create a PaymentMerchantIdAssignCreateRequest Udt Request
 *
 */

public class PaymentMerchantIdAssignCreateRequest extends PaymentMerchantIdAssignSubRequestParent {
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignCreateRequest
 * @param id Unique request name
 * @param PaymentMerchantIdAssignCreateIn PaymentMerchantIdAssignObjectData for PaymentMerchantIdAssignCreateRequest
 *
 */
@JsonCreator
  public PaymentMerchantIdAssignCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentMerchantIdAssign")PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn) {
    super(id, "PaymentMerchantIdAssignCreate");
    if (PaymentMerchantIdAssignCreateIn != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(PaymentMerchantIdAssignCreateIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }

/**
 *
 * Retrieves the PaymentMerchantIdAssignObjectData that results from the PaymentMerchantIdAssignCreateRequest call
 * @return PaymentMerchantIdAssignObjectData resulting from udt call
 *
 */

  public PaymentMerchantIdAssignObjectData getOutput() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
}
