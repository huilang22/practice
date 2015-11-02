/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeGetRequest.java
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
 * Class used to create a PaymentTypeGetRequest Udt Request
 *
 */

public class PaymentTypeGetRequest extends PaymentTypeSubRequestParent {
/**
 *
 * Constructor to create a  PaymentTypeGetRequest
 * @param id Unique request name
 * @param bmfGetIn PaymentTypeObjectKeyData for PaymentTypeGetRequest
 *
 */
@JsonCreator
  public PaymentTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentType")PaymentTypeObjectKeyData bmfGetIn) {
    super(id, "PaymentTypeGet");
    if (bmfGetIn != null) {
      addInput("PaymentType", PaymentTypeObjectKeyHelper.toMap(bmfGetIn, new HashMap(), "PaymentTypeObjectKeyData").get("PaymentTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PaymentTypeObjectData that results from the PaymentTypeGetRequest call
 * @return PaymentTypeObjectData resulting from udt call
 *
 */

  public PaymentTypeObjectData getOutput() {
    return PaymentTypeObjectHelper.fromMap(outputMap, "PaymentType");
  }
}
