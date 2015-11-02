/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileUpdateRequest.java
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
 * Class used to create a PaymentProfileUpdateRequest Udt Request
 *
 */

public class PaymentProfileUpdateRequest extends PaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a  PaymentProfileUpdateRequest
 * @param id Unique request name
 * @param ppuIn PaymentProfileObjectData for PaymentProfileUpdateRequest
 * @param payment_protocol2 Integer for PaymentProfileUpdateRequest
 *
 */
@JsonCreator
  public PaymentProfileUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentProfile")PaymentProfileObjectData ppuIn, @JsonProperty("PaymentProtocol2")Integer payment_protocol2) {
    super(id, "PaymentProfileUpdate");
    if (ppuIn != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(ppuIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
    if (payment_protocol2 != null) {
      addInput("PaymentProtocol2", payment_protocol2);
    }
  }

/**
 *
 * Retrieves the PaymentProfileObjectData that results from the PaymentProfileUpdateRequest call
 * @return PaymentProfileObjectData resulting from udt call
 *
 */

  public PaymentProfileObjectData getOutput() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
}
