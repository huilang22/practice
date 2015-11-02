/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionGetRequest.java
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
 * Class used to create a PaymentDistributionGetRequest Udt Request
 *
 */

public class PaymentDistributionGetRequest extends PaymentDistributionSubRequestParent {
/**
 *
 * Constructor to create a  PaymentDistributionGetRequest
 * @param id Unique request name
 * @param payDistribGetIn PaymentDistributionObjectKeyData for PaymentDistributionGetRequest
 *
 */
@JsonCreator
  public PaymentDistributionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentDistribution")PaymentDistributionObjectKeyData payDistribGetIn) {
    super(id, "PaymentDistributionGet");
    if (payDistribGetIn != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectKeyHelper.toMap(payDistribGetIn, new HashMap(), "PaymentDistributionObjectKeyData").get("PaymentDistributionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentDistributionObjectData that results from the PaymentDistributionGetRequest call
 * @return PaymentDistributionObjectData resulting from udt call
 *
 */

  public PaymentDistributionObjectData getOutput() {
    return PaymentDistributionObjectHelper.fromMap(outputMap, "PaymentDistribution");
  }
}
