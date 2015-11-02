/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileGetRequest.java
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
 * Class used to create a PaymentProfileGetRequest Udt Request
 *
 */

public class PaymentProfileGetRequest extends PaymentProfileSubRequestParent {
/**
 *
 * Constructor to create a  PaymentProfileGetRequest
 * @param id Unique request name
 * @param ppgIn PaymentProfileObjectKeyData for PaymentProfileGetRequest
 *
 */
@JsonCreator
  public PaymentProfileGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentProfile")PaymentProfileObjectKeyData ppgIn) {
    super(id, "PaymentProfileGet");
    if (ppgIn != null) {
      addInput("PaymentProfile", PaymentProfileObjectKeyHelper.toMap(ppgIn, new HashMap(), "PaymentProfileObjectKeyData").get("PaymentProfileObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentProfileObjectData that results from the PaymentProfileGetRequest call
 * @return PaymentProfileObjectData resulting from udt call
 *
 */

  public PaymentProfileObjectData getOutput() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
}
