/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTransGetRequest.java
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
 * Class used to create a PaymentTransGetRequest Udt Request
 *
 */

public class PaymentTransGetRequest extends PaymentTransSubRequestParent {
/**
 *
 * Constructor to create a  PaymentTransGetRequest
 * @param id Unique request name
 * @param PayTransGetIn PaymentTransObjectKeyData for PaymentTransGetRequest
 *
 */
@JsonCreator
  public PaymentTransGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentTrans")PaymentTransObjectKeyData PayTransGetIn) {
    super(id, "PaymentTransGet");
    if (PayTransGetIn != null) {
      addInput("PaymentTrans", PaymentTransObjectKeyHelper.toMap(PayTransGetIn, new HashMap(), "PaymentTransObjectKeyData").get("PaymentTransObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectData that results from the PaymentTransGetRequest call
 * @return PaymentTransObjectData resulting from udt call
 *
 */

  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
