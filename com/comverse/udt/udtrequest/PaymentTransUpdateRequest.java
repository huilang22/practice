/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTransUpdateRequest.java
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
 * Class used to create a PaymentTransUpdateRequest Udt Request
 *
 */

public class PaymentTransUpdateRequest extends PaymentTransSubRequestParent {
/**
 *
 * Constructor to create a  PaymentTransUpdateRequest
 * @param id Unique request name
 * @param PayTransUpdateIn PaymentTransObjectData for PaymentTransUpdateRequest
 *
 */
@JsonCreator
  public PaymentTransUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentTrans")PaymentTransObjectData PayTransUpdateIn) {
    super(id, "PaymentTransUpdate");
    if (PayTransUpdateIn != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(PayTransUpdateIn, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectData that results from the PaymentTransUpdateRequest call
 * @return PaymentTransObjectData resulting from udt call
 *
 */

  public PaymentTransObjectData getOutput() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
