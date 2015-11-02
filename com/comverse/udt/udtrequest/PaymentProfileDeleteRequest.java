/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileDeleteRequest.java
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
 * Class used to create a PaymentProfileDeleteRequest Udt Request
 *
 */

public class PaymentProfileDeleteRequest extends PaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a  PaymentProfileDeleteRequest
 * @param id Unique request name
 * @param ppdIn PaymentProfileObjectKeyData for PaymentProfileDeleteRequest
 * @param profile_status Integer for PaymentProfileDeleteRequest
 * @param payment_protocol3 Integer for PaymentProfileDeleteRequest
 *
 */
@JsonCreator
  public PaymentProfileDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentProfile")PaymentProfileObjectKeyData ppdIn, @JsonProperty("ProfileStatus")Integer profile_status, @JsonProperty("PaymentProtocol3")Integer payment_protocol3) {
    super(id, "PaymentProfileDelete");
    if (ppdIn != null) {
      addInput("PaymentProfile", PaymentProfileObjectKeyHelper.toMap(ppdIn, new HashMap(), "PaymentProfileObjectKeyData").get("PaymentProfileObjectKeyData"));
    }
    if (profile_status != null) {
      addInput("ProfileStatus", profile_status);
    }
    if (payment_protocol3 != null) {
      addInput("PaymentProtocol3", payment_protocol3);
    }
  }

/**
 *
 * Retrieves the PaymentProfileObjectData that results from the PaymentProfileDeleteRequest call
 * @return PaymentProfileObjectData resulting from udt call
 *
 */

  public PaymentProfileObjectData getOutput() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
}
